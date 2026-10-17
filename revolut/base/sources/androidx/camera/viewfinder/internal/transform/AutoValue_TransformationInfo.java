package androidx.camera.viewfinder.internal.transform;

import android.graphics.Rect;
import androidx.annotation.NonNull;
import j6.a;

/* JADX INFO: loaded from: classes15.dex */
final class AutoValue_TransformationInfo extends TransformationInfo {
    private final Rect cropRect;
    private final int rotationDegrees;
    private final int targetRotation;

    public AutoValue_TransformationInfo(Rect rect, int i, int i2) {
        if (rect == null) {
            throw new NullPointerException("Null cropRect");
        }
        this.cropRect = rect;
        this.rotationDegrees = i;
        this.targetRotation = i2;
    }

    public boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if (obj2 instanceof TransformationInfo) {
            TransformationInfo transformationInfo = (TransformationInfo) obj2;
            if (this.cropRect.equals(transformationInfo.getCropRect()) && this.rotationDegrees == transformationInfo.getRotationDegrees() && this.targetRotation == transformationInfo.getTargetRotation()) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.viewfinder.internal.transform.TransformationInfo
    @NonNull
    public Rect getCropRect() {
        return this.cropRect;
    }

    @Override // androidx.camera.viewfinder.internal.transform.TransformationInfo
    public int getRotationDegrees() {
        return this.rotationDegrees;
    }

    @Override // androidx.camera.viewfinder.internal.transform.TransformationInfo
    public int getTargetRotation() {
        return this.targetRotation;
    }

    public int hashCode() {
        return ((((this.cropRect.hashCode() ^ 1000003) * 1000003) ^ this.rotationDegrees) * 1000003) ^ this.targetRotation;
    }

    public String toString() {
        StringBuilder sb6 = new StringBuilder("TransformationInfo{cropRect=");
        sb6.append(this.cropRect);
        sb6.append(", rotationDegrees=");
        sb6.append(this.rotationDegrees);
        sb6.append(", targetRotation=");
        return a.v(sb6, "}", this.targetRotation);
    }
}
