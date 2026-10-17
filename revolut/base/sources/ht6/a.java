package ht6;

import hha.d;
import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BigDecimal f155326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f155327b;

    public a(BigDecimal cashbackPercentage, d pricingPlan) {
        Intrinsics.checkNotNullParameter(cashbackPercentage, "cashbackPercentage");
        Intrinsics.checkNotNullParameter(pricingPlan, "pricingPlan");
        this.f155326a = cashbackPercentage;
        this.f155327b = pricingPlan;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f155326a, aVar.f155326a) && Intrinsics.f(this.f155327b, aVar.f155327b);
    }

    public final int hashCode() {
        return this.f155327b.hashCode() + (this.f155326a.hashCode() * 31);
    }
}
