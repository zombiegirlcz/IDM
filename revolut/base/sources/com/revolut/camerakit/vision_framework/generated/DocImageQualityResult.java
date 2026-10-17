package com.revolut.camerakit.vision_framework.generated;

/* JADX INFO: loaded from: classes16.dex */
public final class DocImageQualityResult {
    final QualityCheck blur;
    final QualityCheck bright;
    final QualityCheck dark;
    final QualityCheck glare;

    public DocImageQualityResult(QualityCheck qualityCheck, QualityCheck qualityCheck2, QualityCheck qualityCheck3, QualityCheck qualityCheck4) {
        this.blur = qualityCheck;
        this.dark = qualityCheck2;
        this.bright = qualityCheck3;
        this.glare = qualityCheck4;
    }

    public QualityCheck getBlur() {
        return this.blur;
    }

    public QualityCheck getBright() {
        return this.bright;
    }

    public QualityCheck getDark() {
        return this.dark;
    }

    public QualityCheck getGlare() {
        return this.glare;
    }

    public String toString() {
        return "DocImageQualityResult{blur=" + this.blur + ",dark=" + this.dark + ",bright=" + this.bright + ",glare=" + this.glare + "}";
    }
}
