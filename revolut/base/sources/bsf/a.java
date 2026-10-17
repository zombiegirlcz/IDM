package bsf;

import com.revolut.feature.transfer.core.models.FundingSource;
import h30.l;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f18188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi0.b f18189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FundingSource f18190c;
    public final rtf.c d;
    public final wi0.b e;

    public a(long j2, xi0.b targetCurrency, FundingSource fundingSource, rtf.c cVar, wi0.b recipientCountry) {
        Intrinsics.checkNotNullParameter(targetCurrency, "targetCurrency");
        Intrinsics.checkNotNullParameter(fundingSource, "fundingSource");
        Intrinsics.checkNotNullParameter(recipientCountry, "recipientCountry");
        this.f18188a = j2;
        this.f18189b = targetCurrency;
        this.f18190c = fundingSource;
        this.d = cVar;
        this.e = recipientCountry;
    }

    @Override // bsf.e
    public final FundingSource a() {
        return this.f18190c;
    }

    @Override // bsf.e
    public final xi0.b b() {
        return this.f18189b;
    }

    @Override // bsf.e
    public final rtf.c c() {
        return this.d;
    }

    @Override // bsf.e
    public final long d() {
        return this.f18188a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f18188a == aVar.f18188a && Intrinsics.f(this.f18189b, aVar.f18189b) && Intrinsics.f(this.f18190c, aVar.f18190c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e);
    }

    public final int hashCode() {
        int iHashCode = (this.f18190c.hashCode() + l.j(this.f18189b, Long.hashCode(this.f18188a) * 31, 31)) * 31;
        rtf.c cVar = this.d;
        return this.e.f297794a.hashCode() + ((iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31);
    }
}
