package com.revolut.camerakit.vision_framework.generated;

/* JADX INFO: loaded from: classes16.dex */
public final class FaceValidatorResult {
    final HeadRotationResult headRotation;
    final Quality quality;

    public FaceValidatorResult(Quality quality, HeadRotationResult headRotationResult) {
        this.quality = quality;
        this.headRotation = headRotationResult;
    }

    public boolean equals(Object obj2) {
        if (!(obj2 instanceof FaceValidatorResult)) {
            return false;
        }
        FaceValidatorResult faceValidatorResult = (FaceValidatorResult) obj2;
        return this.quality.equals(faceValidatorResult.quality) && this.headRotation.equals(faceValidatorResult.headRotation);
    }

    public HeadRotationResult getHeadRotation() {
        return this.headRotation;
    }

    public Quality getQuality() {
        return this.quality;
    }

    public int hashCode() {
        return this.headRotation.hashCode() + ((this.quality.hashCode() + 527) * 31);
    }

    public String toString() {
        return "FaceValidatorResult{quality=" + this.quality + ",headRotation=" + this.headRotation + "}";
    }
}
