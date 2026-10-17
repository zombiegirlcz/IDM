package aw0;

import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class w8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x8 f10591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Drawable f10592b;

    public w8(x8 palette, Drawable drawable) {
        Intrinsics.checkNotNullParameter(palette, "palette");
        this.f10591a = palette;
        this.f10592b = drawable;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w8)) {
            return false;
        }
        w8 w8Var = (w8) obj2;
        return Intrinsics.f(this.f10591a, w8Var.f10591a) && Intrinsics.f(this.f10592b, w8Var.f10592b);
    }

    public final int hashCode() {
        int iHashCode = this.f10591a.hashCode() * 31;
        Drawable drawable = this.f10592b;
        return iHashCode + (drawable == null ? 0 : drawable.hashCode());
    }
}
