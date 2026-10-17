package cp4;

import com.google.gson.reflect.TypeToken;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class o0 implements xx4.b, xx4.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f107838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f107839b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f107840c;

    public o0(String facilityId, String planId) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(planId, "planId");
        this.f107838a = facilityId;
        this.f107839b = planId;
        this.f107840c = j6.a.q("credit_card_statement_deferral_plan_details_", planId);
    }

    @Override // xx4.c
    public final TypeToken e() {
        return new TypeToken<yn4.g0>() { // from class: com.revolut.feature.credit.card.impl.repositories.CreditCardCacheKey$StatementDeferralPlanDetails$storageCacheType$1
        };
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj2;
        return Intrinsics.f(this.f107838a, o0Var.f107838a) && Intrinsics.f(this.f107839b, o0Var.f107839b);
    }

    @Override // ne0.a
    public final String getKey() {
        return this.f107840c;
    }

    public final int hashCode() {
        return this.f107839b.hashCode() + (this.f107838a.hashCode() * 31);
    }
}
