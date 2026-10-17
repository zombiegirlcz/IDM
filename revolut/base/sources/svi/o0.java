package svi;

import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class o0 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f265957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n0 f265958b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y f265959c;

    public o0(List passPricePerPlan, n0 priceQuotePerPassengers, y passType) {
        Intrinsics.checkNotNullParameter(passPricePerPlan, "passPricePerPlan");
        Intrinsics.checkNotNullParameter(priceQuotePerPassengers, "priceQuotePerPassengers");
        Intrinsics.checkNotNullParameter(passType, "passType");
        this.f265957a = passPricePerPlan;
        this.f265958b = priceQuotePerPassengers;
        this.f265959c = passType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj2;
        return Intrinsics.f(this.f265957a, o0Var.f265957a) && Intrinsics.f(this.f265958b, o0Var.f265958b) && this.f265959c == o0Var.f265959c;
    }

    public final int hashCode() {
        return this.f265959c.hashCode() + ((this.f265958b.hashCode() + (this.f265957a.hashCode() * 31)) * 31);
    }
}
