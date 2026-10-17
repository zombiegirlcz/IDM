package cp4;

import com.google.gson.reflect.TypeToken;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class x implements xx4.b, xx4.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f107866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f107867b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f107868c;

    public x(String facilityId, String sectionId) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(sectionId, "sectionId");
        this.f107866a = facilityId;
        this.f107867b = sectionId;
        this.f107868c = j6.a.s("credit_card_", facilityId, "_", sectionId, "_info_section_details_content");
    }

    @Override // xx4.c
    public final TypeToken e() {
        return new TypeToken<xn4.a>() { // from class: com.revolut.feature.credit.card.impl.repositories.CreditCardCacheKey$InfoSectionDetailsContent$storageCacheType$1
        };
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x)) {
            return false;
        }
        x xVar = (x) obj2;
        return Intrinsics.f(this.f107866a, xVar.f107866a) && Intrinsics.f(this.f107867b, xVar.f107867b);
    }

    @Override // ne0.a
    public final String getKey() {
        return this.f107868c;
    }

    public final int hashCode() {
        return this.f107867b.hashCode() + (this.f107866a.hashCode() * 31);
    }
}
