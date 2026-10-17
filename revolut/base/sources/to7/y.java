package to7;

import kl7.s0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f272552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f272553b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s0 f272554c;
    public final int d;

    public y(String make, String model, s0 fuelType, int i) {
        Intrinsics.checkNotNullParameter(make, "make");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(fuelType, "fuelType");
        this.f272552a = make;
        this.f272553b = model;
        this.f272554c = fuelType;
        this.d = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y)) {
            return false;
        }
        y yVar = (y) obj2;
        return Intrinsics.f(this.f272552a, yVar.f272552a) && Intrinsics.f(this.f272553b, yVar.f272553b) && this.f272554c == yVar.f272554c && this.d == yVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + ((this.f272554c.hashCode() + p.a.c(this.f272552a.hashCode() * 31, 31, this.f272553b)) * 31);
    }
}
