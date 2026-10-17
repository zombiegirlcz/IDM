package cp4;

import com.google.gson.reflect.TypeToken;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class t implements xx4.b, xx4.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f107856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f107857b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f107858c;

    public t(String facilityId, String balanceDisplay) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(balanceDisplay, "balanceDisplay");
        this.f107856a = facilityId;
        this.f107857b = balanceDisplay;
        this.f107858c = a0.d.s("credit_card_home_header_content_", facilityId, "_", balanceDisplay);
    }

    @Override // xx4.c
    public final TypeToken e() {
        return new TypeToken<vn4.a>() { // from class: com.revolut.feature.credit.card.impl.repositories.CreditCardCacheKey$HomeHeaderContent$storageCacheType$1
        };
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return Intrinsics.f(this.f107856a, tVar.f107856a) && Intrinsics.f(this.f107857b, tVar.f107857b);
    }

    @Override // ne0.a
    public final String getKey() {
        return this.f107858c;
    }

    public final int hashCode() {
        return this.f107857b.hashCode() + (this.f107856a.hashCode() * 31);
    }
}
