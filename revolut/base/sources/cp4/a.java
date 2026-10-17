package cp4;

import com.google.gson.reflect.TypeToken;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class a implements xx4.b, xx4.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f107775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f107776b;

    public a(String facilityId) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        this.f107775a = facilityId;
        this.f107776b = j6.a.q("credit_card_active_cashback_", facilityId);
    }

    @Override // xx4.c
    public final TypeToken e() {
        return new TypeToken<in4.a>() { // from class: com.revolut.feature.credit.card.impl.repositories.CreditCardCacheKey$ActiveCashbackKey$storageCacheType$1
        };
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f107775a, ((a) obj2).f107775a);
    }

    @Override // ne0.a
    public final String getKey() {
        return this.f107776b;
    }

    public final int hashCode() {
        return this.f107775a.hashCode();
    }
}
