package com.olegych.scastie.client

import App._

import japgolly.scalajs.react._, vdom.all._

object EmbeddedMenu {
  def apply(state: State, backend: Backend) = component((state, backend))

  private val component =
    ReactComponentB[(State, Backend)]("RunButton").render_P {
      case (state, backend) =>
        div(`class` := "embedded-menu")(
          RunButton(state, backend),
          ClearButton(state, backend)
        )
    }.build
}
