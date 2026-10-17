package cp4;

import com.google.gson.reflect.TypeToken;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class q implements xx4.b, xx4.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f107847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f107848b;

    public q(String facilityId) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        this.f107847a = facilityId;
        this.f107848b = j6.a.q("credit_card_features_", facilityId);
    }

    @Override // xx4.c
    public final TypeToken e() {
        return new TypeToken<List<? extends on4.b>>() { // from class: com.revolut.feature.credit.card.impl.repositories.CreditCardCacheKey$Features$storageCacheType$1
        };
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof q) && Intrinsics.f(this.f107847a, ((q) obj2).f107847a);
    }

    @Override // ne0.a
    public final String getKey() {
        return this.f107848b;
    }

    public final int hashCode() {
        return this.f107847a.hashCode();
    }
}
