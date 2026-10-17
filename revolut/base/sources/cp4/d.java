package cp4;

import com.google.gson.reflect.TypeToken;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class d implements xx4.b, xx4.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f107787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f107788b;

    public d(String facilityId) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        this.f107787a = facilityId;
        this.f107788b = j6.a.q("credit_card_additional_cardholder_details_", facilityId);
    }

    @Override // xx4.c
    public final TypeToken e() {
        return new TypeToken<xo4.e>() { // from class: com.revolut.feature.credit.card.impl.repositories.CreditCardCacheKey$AdditionalCardholderDetailsKey$storageCacheType$1
        };
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f107787a, ((d) obj2).f107787a);
    }

    @Override // ne0.a
    public final String getKey() {
        return this.f107788b;
    }

    public final int hashCode() {
        return this.f107787a.hashCode();
    }
}
