package cp4;

import com.google.gson.reflect.TypeToken;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class m0 implements xx4.b, xx4.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f107829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f107830b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f107831c;

    public m0(String facilityId, String cycleId) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(cycleId, "cycleId");
        this.f107829a = facilityId;
        this.f107830b = cycleId;
        this.f107831c = a0.d.s("credit_card_breakdown_", facilityId, "_", cycleId);
    }

    @Override // xx4.c
    public final TypeToken e() {
        return new TypeToken<xo4.y>() { // from class: com.revolut.feature.credit.card.impl.repositories.CreditCardCacheKey$StatementBreakdown$storageCacheType$1
        };
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj2;
        return Intrinsics.f(this.f107829a, m0Var.f107829a) && Intrinsics.f(this.f107830b, m0Var.f107830b);
    }

    @Override // ne0.a
    public final String getKey() {
        return this.f107831c;
    }

    public final int hashCode() {
        return this.f107830b.hashCode() + (this.f107829a.hashCode() * 31);
    }
}
