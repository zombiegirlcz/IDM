package to7;

import kl7.s0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f272531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f272532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s0 f272533c;

    public h0(String make, String model, s0 fuelType) {
        Intrinsics.checkNotNullParameter(make, "make");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(fuelType, "fuelType");
        this.f272531a = make;
        this.f272532b = model;
        this.f272533c = fuelType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj2;
        return Intrinsics.f(this.f272531a, h0Var.f272531a) && Intrinsics.f(this.f272532b, h0Var.f272532b) && this.f272533c == h0Var.f272533c;
    }

    public final int hashCode() {
        return this.f272533c.hashCode() + p.a.c(this.f272531a.hashCode() * 31, 31, this.f272532b);
    }
}
