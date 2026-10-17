package com.revolut.camerakit.vision_framework.generated;

/* JADX INFO: loaded from: classes16.dex */
public final class DocClassifierResult {
    final DocClassifierConfidence confidence;
    final DocClassifierPrediction prediction;

    public DocClassifierResult(DocClassifierPrediction docClassifierPrediction, DocClassifierConfidence docClassifierConfidence) {
        this.prediction = docClassifierPrediction;
        this.confidence = docClassifierConfidence;
    }

    public DocClassifierConfidence getConfidence() {
        return this.confidence;
    }

    public DocClassifierPrediction getPrediction() {
        return this.prediction;
    }

    public String toString() {
        return "DocClassifierResult{prediction=" + this.prediction + ",confidence=" + this.confidence + "}";
    }
}
