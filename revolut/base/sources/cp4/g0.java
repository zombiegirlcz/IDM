package cp4;

import com.google.gson.reflect.TypeToken;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class g0 implements xx4.b, xx4.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f107803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f107804b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f107805c;

    public g0(String facilityId, String planId) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(planId, "planId");
        this.f107803a = facilityId;
        this.f107804b = planId;
        this.f107805c = j6.a.q("credit_card_pre_purchase_plan_details_", planId);
    }

    @Override // xx4.c
    public final TypeToken e() {
        return new TypeToken<yn4.e0>() { // from class: com.revolut.feature.credit.card.impl.repositories.CreditCardCacheKey$PrePurchasePlanDetails$storageCacheType$1
        };
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj2;
        return Intrinsics.f(this.f107803a, g0Var.f107803a) && Intrinsics.f(this.f107804b, g0Var.f107804b);
    }

    @Override // ne0.a
    public final String getKey() {
        return this.f107805c;
    }

    public final int hashCode() {
        return this.f107804b.hashCode() + (this.f107803a.hashCode() * 31);
    }
}
