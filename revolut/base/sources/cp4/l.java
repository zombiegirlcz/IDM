package cp4;

import com.google.gson.reflect.TypeToken;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class l implements xx4.b, xx4.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f107822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f107823b;

    public l(String countryCode) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        this.f107822a = countryCode;
        this.f107823b = j6.a.q("credit_card_debit_to_instalment_availability_", countryCode);
    }

    @Override // xx4.c
    public final TypeToken e() {
        return new TypeToken<yn4.b>() { // from class: com.revolut.feature.credit.card.impl.repositories.CreditCardCacheKey$DebitToInstalmentAvailability$storageCacheType$1
        };
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f107822a, ((l) obj2).f107822a);
    }

    @Override // ne0.a
    public final String getKey() {
        return this.f107823b;
    }

    public final int hashCode() {
        return this.f107822a.hashCode();
    }
}
