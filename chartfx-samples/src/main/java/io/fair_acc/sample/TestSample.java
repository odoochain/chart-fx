package io.fair_acc.sample;

import fxsampler.SampleBase;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class TestSample extends SampleBase {
    @Override
    public String getSampleName() {
        return "ChartFx test sample";
    }

    @Override
    public String getProjectVersion() {
        return "11.3.0";
    }

    @Override
    public Node getPanel(final Stage stage) {
        System.out.println("loading sample");
        return new Label("asdf");
    }

    @Override
    public String getJavaDocURL() {
        return "";
    }

    @Override
    public String getControlStylesheetURL() {
        return null;
    }

    @Override
    public String getSampleSourceURL() {
        return "";
    }
}
