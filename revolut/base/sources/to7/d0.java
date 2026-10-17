package to7;

import kl7.m2;
import kl7.s0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f272520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f272521b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s0 f272522c;
    public final int d;
    public final m2 e;

    public d0(String make, String model, s0 fuelType, int i, m2 transmission) {
        Intrinsics.checkNotNullParameter(make, "make");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(fuelType, "fuelType");
        Intrinsics.checkNotNullParameter(transmission, "transmission");
        this.f272520a = make;
        this.f272521b = model;
        this.f272522c = fuelType;
        this.d = i;
        this.e = transmission;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj2;
        return Intrinsics.f(this.f272520a, d0Var.f272520a) && Intrinsics.f(this.f272521b, d0Var.f272521b) && this.f272522c == d0Var.f272522c && this.d == d0Var.d && this.e == d0Var.e;
    }

    public final int hashCode() {
        return this.e.hashCode() + j6.a.b(this.d, (this.f272522c.hashCode() + p.a.c(this.f272520a.hashCode() * 31, 31, this.f272521b)) * 31, 31);
    }
}
