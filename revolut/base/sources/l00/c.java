package l00;

import android.graphics.Rect;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class c implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rect f191138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f191139b;

    public c(Rect maskCropRect, a corners) {
        Intrinsics.checkNotNullParameter(maskCropRect, "maskCropRect");
        Intrinsics.checkNotNullParameter(corners, "corners");
        this.f191138a = maskCropRect;
        this.f191139b = corners;
    }

    @Override // xv.q
    public final boolean d() {
        return true;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f191138a, cVar.f191138a) && Intrinsics.f(this.f191139b, cVar.f191139b);
    }

    public final int hashCode() {
        return this.f191139b.hashCode() + (this.f191138a.hashCode() * 31);
    }
}
