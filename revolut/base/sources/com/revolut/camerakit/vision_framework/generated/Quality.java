package com.revolut.camerakit.vision_framework.generated;

/* JADX INFO: loaded from: classes16.dex */
public final class Quality {
    final QualityCheck blur;
    final QualityCheck bright;
    final QualityCheck colorized;
    final QualityCheck dark;
    final QualityCheck darkContour;
    final QualityCheck fraud;
    final QualityCheck glare;
    final QualityCheck leftEye;
    final QualityCheck occluded;
    final QualityCheck rightEye;
    final QualityCheck sunglasses;

    public Quality(QualityCheck qualityCheck, QualityCheck qualityCheck2, QualityCheck qualityCheck3, QualityCheck qualityCheck4, QualityCheck qualityCheck5, QualityCheck qualityCheck6, QualityCheck qualityCheck7, QualityCheck qualityCheck8, QualityCheck qualityCheck9, QualityCheck qualityCheck10, QualityCheck qualityCheck11) {
        this.dark = qualityCheck;
        this.darkContour = qualityCheck2;
        this.bright = qualityCheck3;
        this.blur = qualityCheck4;
        this.glare = qualityCheck5;
        this.colorized = qualityCheck6;
        this.fraud = qualityCheck7;
        this.leftEye = qualityCheck8;
        this.rightEye = qualityCheck9;
        this.occluded = qualityCheck10;
        this.sunglasses = qualityCheck11;
    }

    public boolean equals(Object obj2) {
        if (!(obj2 instanceof Quality)) {
            return false;
        }
        Quality quality = (Quality) obj2;
        return this.dark.equals(quality.dark) && this.darkContour.equals(quality.darkContour) && this.bright.equals(quality.bright) && this.blur.equals(quality.blur) && this.glare.equals(quality.glare) && this.colorized.equals(quality.colorized) && this.fraud.equals(quality.fraud) && this.leftEye.equals(quality.leftEye) && this.rightEye.equals(quality.rightEye) && this.occluded.equals(quality.occluded) && this.sunglasses.equals(quality.sunglasses);
    }

    public QualityCheck getBlur() {
        return this.blur;
    }

    public QualityCheck getBright() {
        return this.bright;
    }

    public QualityCheck getColorized() {
        return this.colorized;
    }

    public QualityCheck getDark() {
        return this.dark;
    }

    public QualityCheck getDarkContour() {
        return this.darkContour;
    }

    public QualityCheck getFraud() {
        return this.fraud;
    }

    public QualityCheck getGlare() {
        return this.glare;
    }

    public QualityCheck getLeftEye() {
        return this.leftEye;
    }

    public QualityCheck getOccluded() {
        return this.occluded;
    }

    public QualityCheck getRightEye() {
        return this.rightEye;
    }

    public QualityCheck getSunglasses() {
        return this.sunglasses;
    }

    public int hashCode() {
        return this.sunglasses.hashCode() + ((this.occluded.hashCode() + ((this.rightEye.hashCode() + ((this.leftEye.hashCode() + ((this.fraud.hashCode() + ((this.colorized.hashCode() + ((this.glare.hashCode() + ((this.blur.hashCode() + ((this.bright.hashCode() + ((this.darkContour.hashCode() + ((this.dark.hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public String toString() {
        return "Quality{dark=" + this.dark + ",darkContour=" + this.darkContour + ",bright=" + this.bright + ",blur=" + this.blur + ",glare=" + this.glare + ",colorized=" + this.colorized + ",fraud=" + this.fraud + ",leftEye=" + this.leftEye + ",rightEye=" + this.rightEye + ",occluded=" + this.occluded + ",sunglasses=" + this.sunglasses + "}";
    }
}
