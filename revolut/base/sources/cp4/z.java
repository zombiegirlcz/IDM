package cp4;

import com.google.gson.reflect.TypeToken;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class z implements xx4.b, xx4.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f107871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f107872b;

    public z(String facilityId) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        this.f107871a = facilityId;
        this.f107872b = j6.a.q("credit_card_instalment_availability_", facilityId);
    }

    @Override // xx4.c
    public final TypeToken e() {
        return new TypeToken<yn4.s>() { // from class: com.revolut.feature.credit.card.impl.repositories.CreditCardCacheKey$InstalmentAvailability$storageCacheType$1
        };
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof z) && Intrinsics.f(this.f107871a, ((z) obj2).f107871a);
    }

    @Override // ne0.a
    public final String getKey() {
        return this.f107872b;
    }

    public final int hashCode() {
        return this.f107871a.hashCode();
    }
}
