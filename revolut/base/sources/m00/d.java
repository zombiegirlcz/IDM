package m00;

import android.graphics.Rect;
import android.graphics.RectF;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float[] f201034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RectF f201035b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rect f201036c;

    public d(float[] detectionResult, RectF maskRect, Rect maskCropRect) {
        Intrinsics.checkNotNullParameter(detectionResult, "detectionResult");
        Intrinsics.checkNotNullParameter(maskRect, "maskRect");
        Intrinsics.checkNotNullParameter(maskCropRect, "maskCropRect");
        this.f201034a = detectionResult;
        this.f201035b = maskRect;
        this.f201036c = maskCropRect;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f201034a, dVar.f201034a) && Intrinsics.f(this.f201035b, dVar.f201035b) && Intrinsics.f(this.f201036c, dVar.f201036c);
    }

    public final int hashCode() {
        return this.f201036c.hashCode() + ((this.f201035b.hashCode() + (Arrays.hashCode(this.f201034a) * 31)) * 31);
    }
}
