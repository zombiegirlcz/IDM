package cp4;

import com.google.gson.reflect.TypeToken;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class j implements xx4.b, xx4.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f107814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f107815b;

    public j(String facilityId) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        this.f107814a = facilityId;
        this.f107815b = j6.a.q("credit_card_credit_limit_history_", facilityId);
    }

    @Override // xx4.c
    public final TypeToken e() {
        return new TypeToken<List<? extends bo4.a>>() { // from class: com.revolut.feature.credit.card.impl.repositories.CreditCardCacheKey$CreditCardLimitHistory$storageCacheType$1
        };
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f107814a, ((j) obj2).f107814a);
    }

    @Override // ne0.a
    public final String getKey() {
        return this.f107815b;
    }

    public final int hashCode() {
        return this.f107814a.hashCode();
    }
}
