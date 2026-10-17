package m00;

import android.graphics.Rect;
import android.graphics.RectF;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RectF f201030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rect f201031b;

    public a(Rect maskCropRect, RectF normalizedMaskRect) {
        Intrinsics.checkNotNullParameter(normalizedMaskRect, "normalizedMaskRect");
        Intrinsics.checkNotNullParameter(maskCropRect, "maskCropRect");
        this.f201030a = normalizedMaskRect;
        this.f201031b = maskCropRect;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f201030a, aVar.f201030a) && Intrinsics.f(this.f201031b, aVar.f201031b);
    }

    public final int hashCode() {
        return this.f201031b.hashCode() + (this.f201030a.hashCode() * 31);
    }
}
