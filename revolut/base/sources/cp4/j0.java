package cp4;

import com.google.gson.reflect.TypeToken;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class j0 implements xx4.b, xx4.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f107816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f107817b;

    public j0(String facilityId) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        this.f107816a = facilityId;
        this.f107817b = j6.a.q("credit_card_rates_", facilityId);
    }

    @Override // xx4.c
    public final TypeToken e() {
        return new TypeToken<on4.c>() { // from class: com.revolut.feature.credit.card.impl.repositories.CreditCardCacheKey$Rates$storageCacheType$1
        };
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j0) && Intrinsics.f(this.f107816a, ((j0) obj2).f107816a);
    }

    @Override // ne0.a
    public final String getKey() {
        return this.f107817b;
    }

    public final int hashCode() {
        return this.f107816a.hashCode();
    }
}
