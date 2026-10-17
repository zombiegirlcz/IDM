package cp4;

import com.google.gson.reflect.TypeToken;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class a0 implements xx4.b, xx4.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f107777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f107778b;

    public a0(String facilityId) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        this.f107777a = facilityId;
        this.f107778b = j6.a.q("credit_card_instalment_plans_", facilityId);
    }

    @Override // xx4.c
    public final TypeToken e() {
        return new TypeToken<List<? extends xo4.u>>() { // from class: com.revolut.feature.credit.card.impl.repositories.CreditCardCacheKey$InstalmentPlans$storageCacheType$1
        };
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a0) && Intrinsics.f(this.f107777a, ((a0) obj2).f107777a);
    }

    @Override // ne0.a
    public final String getKey() {
        return this.f107778b;
    }

    public final int hashCode() {
        return this.f107777a.hashCode();
    }
}
