package cp4;

import com.google.gson.reflect.TypeToken;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class g implements xx4.b, xx4.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f107801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f107802b;

    public g(String facilityId) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        this.f107801a = facilityId;
        this.f107802b = j6.a.q("credit_card_boleto_eligibility_", facilityId);
    }

    @Override // xx4.c
    public final TypeToken e() {
        return new TypeToken<fn4.b>() { // from class: com.revolut.feature.credit.card.impl.repositories.CreditCardCacheKey$BoletoEligibility$storageCacheType$1
        };
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f107801a, ((g) obj2).f107801a);
    }

    @Override // ne0.a
    public final String getKey() {
        return this.f107802b;
    }

    public final int hashCode() {
        return this.f107801a.hashCode();
    }
}
