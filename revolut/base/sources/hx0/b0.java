package hx0;

import android.graphics.Bitmap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f156299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f156300b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bitmap f156301c;

    public b0(int i, int i2, Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        this.f156299a = i;
        this.f156300b = i2;
        this.f156301c = bitmap;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj2;
        return this.f156299a == b0Var.f156299a && this.f156300b == b0Var.f156300b && Intrinsics.f(this.f156301c, b0Var.f156301c);
    }

    public final int hashCode() {
        return this.f156301c.hashCode() + j6.a.b(this.f156300b, Integer.hashCode(this.f156299a) * 31, 31);
    }
}
