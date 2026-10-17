package rz;

import android.graphics.Rect;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rect f258440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f258441b;

    public b(Rect faceRect, float f) {
        Intrinsics.checkNotNullParameter(faceRect, "faceRect");
        this.f258440a = faceRect;
        this.f258441b = f;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f258440a, bVar.f258440a) && Float.compare(this.f258441b, bVar.f258441b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f258441b) + (this.f258440a.hashCode() * 31);
    }
}
