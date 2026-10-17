package ip0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class nm0 implements qv0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f165535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mm0 f165536b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f165537c;
    public final boolean d;
    public final mm0 e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f165538g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f165539h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f165540j;

    public nm0(boolean z, mm0 startPointPayload, boolean z3, boolean z4, mm0 endPointPayload, boolean z6, boolean z11, boolean z12, boolean z29, boolean z31) {
        Intrinsics.checkNotNullParameter(startPointPayload, "startPointPayload");
        Intrinsics.checkNotNullParameter(endPointPayload, "endPointPayload");
        this.f165535a = z;
        this.f165536b = startPointPayload;
        this.f165537c = z3;
        this.d = z4;
        this.e = endPointPayload;
        this.f = z6;
        this.f165538g = z11;
        this.f165539h = z12;
        this.i = z29;
        this.f165540j = z31;
    }

    @Override // qv0.b
    public final boolean a() {
        return this.f165540j;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof nm0)) {
            return false;
        }
        nm0 nm0Var = (nm0) obj2;
        return this.f165535a == nm0Var.f165535a && Intrinsics.f(this.f165536b, nm0Var.f165536b) && this.f165537c == nm0Var.f165537c && this.d == nm0Var.d && Intrinsics.f(this.e, nm0Var.e) && this.f == nm0Var.f && this.f165538g == nm0Var.f165538g && this.f165539h == nm0Var.f165539h && this.i == nm0Var.i && this.f165540j == nm0Var.f165540j;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f165540j) + j6.a.c(j6.a.c(j6.a.c(j6.a.c((this.e.hashCode() + j6.a.c(j6.a.c((this.f165536b.hashCode() + (Boolean.hashCode(this.f165535a) * 31)) * 31, 31, this.f165537c), 31, this.d)) * 31, 31, this.f), 31, this.f165538g), 31, this.f165539h), 31, this.i);
    }
}
