package bsf;

import com.revolut.feature.transfer.core.models.FundingSource;
import h30.l;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f18191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi0.b f18192b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FundingSource f18193c;
    public final rtf.c d;
    public final f5j.a e;

    public b(long j2, xi0.b targetCurrency, FundingSource fundingSource, rtf.c cVar, f5j.a beneficiary) {
        Intrinsics.checkNotNullParameter(targetCurrency, "targetCurrency");
        Intrinsics.checkNotNullParameter(fundingSource, "fundingSource");
        Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
        this.f18191a = j2;
        this.f18192b = targetCurrency;
        this.f18193c = fundingSource;
        this.d = cVar;
        this.e = beneficiary;
    }

    @Override // bsf.e
    public final FundingSource a() {
        return this.f18193c;
    }

    @Override // bsf.e
    public final xi0.b b() {
        return this.f18192b;
    }

    @Override // bsf.e
    public final rtf.c c() {
        return this.d;
    }

    @Override // bsf.e
    public final long d() {
        return this.f18191a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f18191a == bVar.f18191a && Intrinsics.f(this.f18192b, bVar.f18192b) && Intrinsics.f(this.f18193c, bVar.f18193c) && Intrinsics.f(this.d, bVar.d) && Intrinsics.f(this.e, bVar.e);
    }

    public final int hashCode() {
        int iHashCode = (this.f18193c.hashCode() + l.j(this.f18192b, Long.hashCode(this.f18191a) * 31, 31)) * 31;
        rtf.c cVar = this.d;
        return this.e.hashCode() + ((iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31);
    }
}
