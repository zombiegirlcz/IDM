package ms0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class p5 implements t5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w5 f208371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w5 f208372b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w5 f208373c;
    public final n5 d;
    public final boolean e;
    public final o5 f;

    public p5(w5 color, w5 w5Var, w5 w5Var2, n5 linePosition, boolean z, o5 size) {
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(linePosition, "linePosition");
        Intrinsics.checkNotNullParameter(size, "size");
        this.f208371a = color;
        this.f208372b = w5Var;
        this.f208373c = w5Var2;
        this.d = linePosition;
        this.e = z;
        this.f = size;
    }

    @Override // ms0.t5
    public final w5 a() {
        return this.f208372b;
    }

    @Override // ms0.t5
    public final boolean b() {
        return this.e;
    }

    @Override // ms0.t5
    public final w5 c() {
        return this.f208373c;
    }

    @Override // ms0.t5
    public final n5 d() {
        return this.d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p5)) {
            return false;
        }
        p5 p5Var = (p5) obj2;
        return Intrinsics.f(this.f208371a, p5Var.f208371a) && Intrinsics.f(this.f208372b, p5Var.f208372b) && Intrinsics.f(this.f208373c, p5Var.f208373c) && this.d == p5Var.d && this.e == p5Var.e && this.f == p5Var.f;
    }

    @Override // ms0.t5
    public final o5 getSize() {
        return this.f;
    }

    public final int hashCode() {
        int iHashCode = this.f208371a.hashCode() * 31;
        w5 w5Var = this.f208372b;
        int iHashCode2 = (iHashCode + (w5Var == null ? 0 : w5Var.hashCode())) * 31;
        w5 w5Var2 = this.f208373c;
        return this.f.hashCode() + j6.a.c((this.d.hashCode() + ((iHashCode2 + (w5Var2 != null ? w5Var2.hashCode() : 0)) * 31)) * 31, 31, this.e);
    }
}
