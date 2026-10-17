package bh9;

import com.revolut.feature.apm.bills.billers.api.model.Biller;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xo1.g f15269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Biller f15270b;

    public b(xo1.g paymentMethod, Biller biller) {
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        Intrinsics.checkNotNullParameter(biller, "biller");
        this.f15269a = paymentMethod;
        this.f15270b = biller;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f15269a == bVar.f15269a && Intrinsics.f(this.f15270b, bVar.f15270b);
    }

    public final int hashCode() {
        return this.f15270b.hashCode() + (this.f15269a.hashCode() * 31);
    }
}
