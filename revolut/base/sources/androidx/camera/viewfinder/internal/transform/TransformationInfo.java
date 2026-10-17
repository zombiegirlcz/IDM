package androidx.camera.viewfinder.internal.transform;

import android.graphics.Rect;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes15.dex */
public abstract class TransformationInfo {
    @NonNull
    public static TransformationInfo of(@NonNull Rect rect, int i, int i2) {
        return new AutoValue_TransformationInfo(rect, i, i2);
    }

    @NonNull
    public abstract Rect getCropRect();

    public abstract int getRotationDegrees();

    public abstract int getTargetRotation();
}
