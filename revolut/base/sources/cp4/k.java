package cp4;

import com.google.gson.reflect.TypeToken;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class k implements xx4.b, xx4.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f107818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f107819b;

    public k(String facilityId) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        this.f107818a = facilityId;
        this.f107819b = j6.a.q("credit_card_credit_limit_decrease_pre_offer_", facilityId);
    }

    @Override // xx4.c
    public final TypeToken e() {
        return new TypeToken<mn4.b>() { // from class: com.revolut.feature.credit.card.impl.repositories.CreditCardCacheKey$CreditLimitDecreasePreOffer$storageCacheType$1
        };
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f107818a, ((k) obj2).f107818a);
    }

    @Override // ne0.a
    public final String getKey() {
        return this.f107819b;
    }

    public final int hashCode() {
        return this.f107818a.hashCode();
    }
}
