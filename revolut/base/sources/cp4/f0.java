package cp4;

import com.google.gson.reflect.TypeToken;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class f0 implements xx4.b, xx4.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f107798a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f107799b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f107800c;

    public f0(String facilityId, String planId) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(planId, "planId");
        this.f107798a = facilityId;
        this.f107799b = planId;
        this.f107800c = j6.a.q("credit_card_instalment_plan_details_", planId);
    }

    @Override // xx4.c
    public final TypeToken e() {
        return new TypeToken<yn4.z>() { // from class: com.revolut.feature.credit.card.impl.repositories.CreditCardCacheKey$PostPurchaseInstalmentPlanDetails$storageCacheType$1
        };
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj2;
        return Intrinsics.f(this.f107798a, f0Var.f107798a) && Intrinsics.f(this.f107799b, f0Var.f107799b);
    }

    @Override // ne0.a
    public final String getKey() {
        return this.f107800c;
    }

    public final int hashCode() {
        return this.f107799b.hashCode() + (this.f107798a.hashCode() * 31);
    }
}
