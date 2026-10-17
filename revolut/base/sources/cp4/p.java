package cp4;

import com.google.gson.reflect.TypeToken;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class p implements xx4.b, xx4.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f107841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f107842b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f107843c;

    public p(String facilityId, String feature) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(feature, "feature");
        this.f107841a = facilityId;
        this.f107842b = feature;
        this.f107843c = a0.d.s("credit_card_", facilityId, "_feature_config_", feature);
    }

    @Override // xx4.c
    public final TypeToken e() {
        return new TypeToken<on4.k>() { // from class: com.revolut.feature.credit.card.impl.repositories.CreditCardCacheKey$FeatureConfig$storageCacheType$1
        };
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f107841a, pVar.f107841a) && Intrinsics.f(this.f107842b, pVar.f107842b);
    }

    @Override // ne0.a
    public final String getKey() {
        return this.f107843c;
    }

    public final int hashCode() {
        return this.f107842b.hashCode() + (this.f107841a.hashCode() * 31);
    }
}
