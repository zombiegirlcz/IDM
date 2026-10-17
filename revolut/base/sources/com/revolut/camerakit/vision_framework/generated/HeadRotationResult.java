package com.revolut.camerakit.vision_framework.generated;

import com.google.android.gms.internal.mlkit_vision_face.a;

/* JADX INFO: loaded from: classes16.dex */
public final class HeadRotationResult {
    final EulerAngles angles;
    final boolean isValid;
    final boolean pitchValid;
    final boolean rollValid;
    final boolean yawValid;

    public HeadRotationResult(EulerAngles eulerAngles, boolean z, boolean z3, boolean z4, boolean z6) {
        this.angles = eulerAngles;
        this.isValid = z;
        this.rollValid = z3;
        this.yawValid = z4;
        this.pitchValid = z6;
    }

    public boolean equals(Object obj2) {
        if (!(obj2 instanceof HeadRotationResult)) {
            return false;
        }
        HeadRotationResult headRotationResult = (HeadRotationResult) obj2;
        return this.angles.equals(headRotationResult.angles) && this.isValid == headRotationResult.isValid && this.rollValid == headRotationResult.rollValid && this.yawValid == headRotationResult.yawValid && this.pitchValid == headRotationResult.pitchValid;
    }

    public EulerAngles getAngles() {
        return this.angles;
    }

    public boolean getIsValid() {
        return this.isValid;
    }

    public boolean getPitchValid() {
        return this.pitchValid;
    }

    public boolean getRollValid() {
        return this.rollValid;
    }

    public boolean getYawValid() {
        return this.yawValid;
    }

    public int hashCode() {
        return ((((((((this.angles.hashCode() + 527) * 31) + (this.isValid ? 1 : 0)) * 31) + (this.rollValid ? 1 : 0)) * 31) + (this.yawValid ? 1 : 0)) * 31) + (this.pitchValid ? 1 : 0);
    }

    public String toString() {
        StringBuilder sb6 = new StringBuilder("HeadRotationResult{angles=");
        sb6.append(this.angles);
        sb6.append(",isValid=");
        sb6.append(this.isValid);
        sb6.append(",rollValid=");
        sb6.append(this.rollValid);
        sb6.append(",yawValid=");
        sb6.append(this.yawValid);
        sb6.append(",pitchValid=");
        return a.t(sb6, this.pitchValid, "}");
    }
}
