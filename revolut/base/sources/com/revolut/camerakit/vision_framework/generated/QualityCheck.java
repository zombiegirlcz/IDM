package com.revolut.camerakit.vision_framework.generated;

import ehe.n;

/* JADX INFO: loaded from: classes16.dex */
public final class QualityCheck {
    final float confidence;
    final boolean valid;

    public QualityCheck(boolean z, float f) {
        this.valid = z;
        this.confidence = f;
    }

    public boolean equals(Object obj2) {
        if (!(obj2 instanceof QualityCheck)) {
            return false;
        }
        QualityCheck qualityCheck = (QualityCheck) obj2;
        return this.valid == qualityCheck.valid && this.confidence == qualityCheck.confidence;
    }

    public float getConfidence() {
        return this.confidence;
    }

    public boolean getValid() {
        return this.valid;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.confidence) + ((527 + (this.valid ? 1 : 0)) * 31);
    }

    public String toString() {
        StringBuilder sb6 = new StringBuilder("QualityCheck{valid=");
        sb6.append(this.valid);
        sb6.append(",confidence=");
        return n.t(this.confidence, "}", sb6);
    }
}
