package cp4;

import com.google.gson.reflect.TypeToken;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class b implements xx4.b, xx4.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f107779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f107780b;

    public b(String facilityId) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        this.f107779a = facilityId;
        this.f107780b = j6.a.q("credit_card_additional_cardholder_account_info_", facilityId);
    }

    @Override // xx4.c
    public final TypeToken e() {
        return new TypeToken<xo4.a>() { // from class: com.revolut.feature.credit.card.impl.repositories.CreditCardCacheKey$AdditionalCardholderAccountInfoKey$storageCacheType$1
        };
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f107779a, ((b) obj2).f107779a);
    }

    @Override // ne0.a
    public final String getKey() {
        return this.f107780b;
    }

    public final int hashCode() {
        return this.f107779a.hashCode();
    }
}
