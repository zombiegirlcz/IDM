package cp4;

import com.google.gson.reflect.TypeToken;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class n0 implements xx4.b, xx4.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f107835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f107836b;

    public n0(String facilityId) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        this.f107835a = facilityId;
        this.f107836b = j6.a.q("credit_card_statement_deferral_availability_", facilityId);
    }

    @Override // xx4.c
    public final TypeToken e() {
        return new TypeToken<yn4.f0>() { // from class: com.revolut.feature.credit.card.impl.repositories.CreditCardCacheKey$StatementDeferralAvailability$storageCacheType$1
        };
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n0) && Intrinsics.f(this.f107835a, ((n0) obj2).f107835a);
    }

    @Override // ne0.a
    public final String getKey() {
        return this.f107836b;
    }

    public final int hashCode() {
        return this.f107835a.hashCode();
    }
}
