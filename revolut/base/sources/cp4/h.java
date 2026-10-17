package cp4;

import com.google.gson.reflect.TypeToken;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class h implements xx4.b, xx4.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f107806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f107807b;

    public h(String facilityId) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        this.f107806a = facilityId;
        this.f107807b = j6.a.q("credit_card_boletos_", facilityId);
    }

    @Override // xx4.c
    public final TypeToken e() {
        return new TypeToken<List<? extends fn4.a>>() { // from class: com.revolut.feature.credit.card.impl.repositories.CreditCardCacheKey$Boletos$storageCacheType$1
        };
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f107806a, ((h) obj2).f107806a);
    }

    @Override // ne0.a
    public final String getKey() {
        return this.f107807b;
    }

    public final int hashCode() {
        return this.f107806a.hashCode();
    }
}
