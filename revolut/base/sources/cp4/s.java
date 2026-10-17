package cp4;

import com.google.gson.reflect.TypeToken;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class s implements xx4.b, xx4.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f107854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f107855b;

    public s(String facilityId) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        this.f107854a = facilityId;
        this.f107855b = j6.a.q("credit_card_forbearance_agreement_", facilityId);
    }

    @Override // xx4.c
    public final TypeToken e() {
        return new TypeToken<xo4.i>() { // from class: com.revolut.feature.credit.card.impl.repositories.CreditCardCacheKey$ForbearanceAgreements$storageCacheType$1
        };
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof s) && Intrinsics.f(this.f107854a, ((s) obj2).f107854a);
    }

    @Override // ne0.a
    public final String getKey() {
        return this.f107855b;
    }

    public final int hashCode() {
        return this.f107854a.hashCode();
    }
}
