package cp4;

import com.google.gson.reflect.TypeToken;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class r implements xx4.b, xx4.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f107852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f107853b;

    public r(String facilityId) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        this.f107852a = facilityId;
        this.f107853b = j6.a.q("credit_card_fee_waiver_progress_", facilityId);
    }

    @Override // xx4.c
    public final TypeToken e() {
        return new TypeToken<un4.a>() { // from class: com.revolut.feature.credit.card.impl.repositories.CreditCardCacheKey$FeeWaiverProgressKey$storageCacheType$1
        };
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof r) && Intrinsics.f(this.f107852a, ((r) obj2).f107852a);
    }

    @Override // ne0.a
    public final String getKey() {
        return this.f107853b;
    }

    public final int hashCode() {
        return this.f107852a.hashCode();
    }
}
