package aw0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class x3 implements s3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w3 f10597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w3 f10598b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w3 f10599c;
    public final w3 d;
    public final w3 e;
    public final b4 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f10600g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final z3 f10601h;

    public x3(w3 current, w3 high, w3 average, w3 low, w3 w3Var, b4 fanLegend, boolean z, z3 showMode) {
        Intrinsics.checkNotNullParameter(current, "current");
        Intrinsics.checkNotNullParameter(high, "high");
        Intrinsics.checkNotNullParameter(average, "average");
        Intrinsics.checkNotNullParameter(low, "low");
        Intrinsics.checkNotNullParameter(fanLegend, "fanLegend");
        Intrinsics.checkNotNullParameter(showMode, "showMode");
        this.f10597a = current;
        this.f10598b = high;
        this.f10599c = average;
        this.d = low;
        this.e = w3Var;
        this.f = fanLegend;
        this.f10600g = z;
        this.f10601h = showMode;
    }

    @Override // aw0.s3
    public final boolean a() {
        return this.f10600g;
    }

    @Override // aw0.s3
    public final w3 b() {
        return this.f10598b;
    }

    @Override // aw0.s3
    public final b4 c() {
        return this.f;
    }

    @Override // aw0.s3
    public final w3 d() {
        return this.d;
    }

    @Override // aw0.s3
    public final z3 e() {
        return this.f10601h;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x3)) {
            return false;
        }
        x3 x3Var = (x3) obj2;
        return this.f10597a.equals(x3Var.f10597a) && this.f10598b.equals(x3Var.f10598b) && this.f10599c.equals(x3Var.f10599c) && this.d.equals(x3Var.d) && Intrinsics.f(this.e, x3Var.e) && this.f.equals(x3Var.f) && this.f10600g == x3Var.f10600g && this.f10601h == x3Var.f10601h;
    }

    @Override // aw0.s3
    public final w3 f() {
        return this.e;
    }

    @Override // aw0.s3
    public final w3 g() {
        return this.f10599c;
    }

    @Override // aw0.s3
    public final w3 getCurrent() {
        return this.f10597a;
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + ((this.f10599c.hashCode() + ((this.f10598b.hashCode() + (this.f10597a.hashCode() * 31)) * 31)) * 31)) * 31;
        w3 w3Var = this.e;
        return this.f10601h.hashCode() + j6.a.c((this.f.hashCode() + ((iHashCode + (w3Var == null ? 0 : w3Var.hashCode())) * 31)) * 31, 31, this.f10600g);
    }

    @Override // aw0.s3
    public final long max() {
        long jMax = this.f10597a.f10583a;
        long[] other = {this.f10598b.f10583a, this.f10599c.f10583a, this.d.f10583a};
        Intrinsics.checkNotNullParameter(other, "other");
        for (int i = 0; i < 3; i++) {
            jMax = Math.max(jMax, other[i]);
        }
        w3 w3Var = this.e;
        return w3Var != null ? Math.max(jMax, w3Var.f10583a) : jMax;
    }

    @Override // aw0.s3
    public final long min() {
        long jMin = this.f10597a.f10583a;
        long[] other = {this.f10598b.f10583a, this.f10599c.f10583a, this.d.f10583a};
        Intrinsics.checkNotNullParameter(other, "other");
        for (int i = 0; i < 3; i++) {
            jMin = Math.min(jMin, other[i]);
        }
        w3 w3Var = this.e;
        return w3Var != null ? Math.min(jMin, w3Var.f10583a) : jMin;
    }
}
