package aw0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class w6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f10589c;
    public final float d;
    public final float e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final v6 f10590g;

    public w6(int i, int i2, int i3, float f, float f4, boolean z, v6 dashSize) {
        Intrinsics.checkNotNullParameter(dashSize, "dashSize");
        this.f10587a = i;
        this.f10588b = i2;
        this.f10589c = i3;
        this.d = f;
        this.e = f4;
        this.f = z;
        this.f10590g = dashSize;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w6)) {
            return false;
        }
        w6 w6Var = (w6) obj2;
        return this.f10587a == w6Var.f10587a && this.f10588b == w6Var.f10588b && this.f10589c == w6Var.f10589c && Float.compare(this.d, w6Var.d) == 0 && Float.compare(this.e, w6Var.e) == 0 && this.f == w6Var.f && this.f10590g == w6Var.f10590g;
    }

    public final int hashCode() {
        return this.f10590g.hashCode() + j6.a.c(m72.b.b(this.e, m72.b.b(this.d, j6.a.b(this.f10589c, j6.a.b(this.f10588b, Integer.hashCode(this.f10587a) * 31, 31), 31), 31), 31), 31, this.f);
    }

    public /* synthetic */ w6(int i, int i2, int i3, float f, float f4, boolean z, int i5) {
        this(i, (i5 & 2) != 0 ? 0 : i2, (i5 & 4) != 0 ? 0 : i3, f, f4, z, v6.NORMAL);
    }
}
