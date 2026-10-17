package mha;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class f extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f205448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BigDecimal f205449b;

    public f(String pricingPlanId, BigDecimal discountPercentage) {
        Intrinsics.checkNotNullParameter(pricingPlanId, "pricingPlanId");
        Intrinsics.checkNotNullParameter(discountPercentage, "discountPercentage");
        this.f205448a = pricingPlanId;
        this.f205449b = discountPercentage;
    }

    @Override // mha.h
    public final String a() {
        return this.f205448a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f205448a, fVar.f205448a) && Intrinsics.f(this.f205449b, fVar.f205449b);
    }

    public final int hashCode() {
        return this.f205449b.hashCode() + (this.f205448a.hashCode() * 31);
    }
}
