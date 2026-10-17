package cp4;

import com.google.gson.reflect.TypeToken;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class i0 implements xx4.b, xx4.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wi0.b f107812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f107813b;

    public i0(wi0.b countryCode) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        this.f107812a = countryCode;
        String lowerCase = countryCode.f297794a.toLowerCase(Locale.ROOT);
        this.f107813b = t61.a.p(lowerCase, "toLowerCase(...)", "credit_card_product_details_", lowerCase);
    }

    public final wi0.b a() {
        return this.f107812a;
    }

    @Override // xx4.c
    public final TypeToken e() {
        return new TypeToken<ko4.a>() { // from class: com.revolut.feature.credit.card.impl.repositories.CreditCardCacheKey$ProductDetails$storageCacheType$1
        };
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i0) && Intrinsics.f(this.f107812a, ((i0) obj2).f107812a);
    }

    @Override // ne0.a
    public final String getKey() {
        return this.f107813b;
    }

    public final int hashCode() {
        return this.f107812a.f297794a.hashCode();
    }
}
