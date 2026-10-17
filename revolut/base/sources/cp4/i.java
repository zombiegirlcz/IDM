package cp4;

import com.google.gson.reflect.TypeToken;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class i implements xx4.b, xx4.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f107810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f107811b;

    public i(String facilityId) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        this.f107810a = facilityId;
        this.f107811b = j6.a.q("credit_card_cashback_pockets_", facilityId);
    }

    @Override // xx4.c
    public final TypeToken e() {
        return new TypeToken<List<? extends xo4.h>>() { // from class: com.revolut.feature.credit.card.impl.repositories.CreditCardCacheKey$CashbackPocketsKey$storageCacheType$1
        };
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f107810a, ((i) obj2).f107810a);
    }

    @Override // ne0.a
    public final String getKey() {
        return this.f107811b;
    }

    public final int hashCode() {
        return this.f107810a.hashCode();
    }
}
