package cp4;

import com.google.gson.reflect.TypeToken;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class u implements xx4.b, xx4.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f107859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f107860b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f107861c;

    public u(String facilityId, String startDate) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        this.f107859a = facilityId;
        this.f107860b = startDate;
        this.f107861c = a0.d.s("credit_card_in_app_statement_", facilityId, "_", startDate);
    }

    @Override // xx4.c
    public final TypeToken e() {
        return new TypeToken<so4.a>() { // from class: com.revolut.feature.credit.card.impl.repositories.CreditCardCacheKey$InAppStatement$storageCacheType$1
        };
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return Intrinsics.f(this.f107859a, uVar.f107859a) && Intrinsics.f(this.f107860b, uVar.f107860b);
    }

    @Override // ne0.a
    public final String getKey() {
        return this.f107861c;
    }

    public final int hashCode() {
        return this.f107860b.hashCode() + (this.f107859a.hashCode() * 31);
    }
}
