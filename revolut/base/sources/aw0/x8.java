package aw0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class x8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v1 f10609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10610b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f10611c;
    public final r8 d;
    public final int e;
    public final int f;

    public x8(v1 colorScheme, int i, int i2, q8 q8Var, int i3, int i5) {
        Intrinsics.checkNotNullParameter(colorScheme, "colorScheme");
        this.f10609a = colorScheme;
        this.f10610b = i;
        this.f10611c = i2;
        this.d = q8Var;
        this.e = i3;
        this.f = i5;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x8)) {
            return false;
        }
        x8 x8Var = (x8) obj2;
        return this.f10609a == x8Var.f10609a && this.f10610b == x8Var.f10610b && this.f10611c == x8Var.f10611c && Intrinsics.f(this.d, x8Var.d) && this.e == x8Var.e && this.f == x8Var.f;
    }

    public final int hashCode() {
        int iB = j6.a.b(this.f10611c, j6.a.b(this.f10610b, this.f10609a.hashCode() * 31, 31), 31);
        r8 r8Var = this.d;
        return Integer.hashCode(this.f) + j6.a.b(this.e, (iB + (r8Var == null ? 0 : r8Var.hashCode())) * 31, 31);
    }
}
