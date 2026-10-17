package cp4;

import com.google.gson.reflect.TypeToken;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class k0 implements xx4.b, xx4.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f107820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f107821b;

    public k0(String facilityId) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        this.f107820a = facilityId;
        this.f107821b = j6.a.q("credit_card_security_deposit_", facilityId);
    }

    @Override // xx4.c
    public final TypeToken e() {
        return new TypeToken<xo4.n>() { // from class: com.revolut.feature.credit.card.impl.repositories.CreditCardCacheKey$SecurityDeposit$storageCacheType$1
        };
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k0) && Intrinsics.f(this.f107820a, ((k0) obj2).f107820a);
    }

    @Override // ne0.a
    public final String getKey() {
        return this.f107821b;
    }

    public final int hashCode() {
        return this.f107820a.hashCode();
    }
}
