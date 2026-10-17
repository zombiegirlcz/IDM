package bsf;

import com.revolut.feature.push_to_card.api.data.CardOwner;
import com.revolut.feature.transfer.core.models.FundingSource;
import h30.l;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f18194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi0.b f18195b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FundingSource f18196c;
    public final rtf.c d;
    public final CardOwner e;

    public c(long j2, xi0.b targetCurrency, FundingSource fundingSource, rtf.c cVar, CardOwner cardOwner) {
        Intrinsics.checkNotNullParameter(targetCurrency, "targetCurrency");
        Intrinsics.checkNotNullParameter(fundingSource, "fundingSource");
        Intrinsics.checkNotNullParameter(cardOwner, "cardOwner");
        this.f18194a = j2;
        this.f18195b = targetCurrency;
        this.f18196c = fundingSource;
        this.d = cVar;
        this.e = cardOwner;
    }

    @Override // bsf.e
    public final FundingSource a() {
        return this.f18196c;
    }

    @Override // bsf.e
    public final xi0.b b() {
        return this.f18195b;
    }

    @Override // bsf.e
    public final rtf.c c() {
        return this.d;
    }

    @Override // bsf.e
    public final long d() {
        return this.f18194a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f18194a == cVar.f18194a && Intrinsics.f(this.f18195b, cVar.f18195b) && Intrinsics.f(this.f18196c, cVar.f18196c) && Intrinsics.f(this.d, cVar.d) && Intrinsics.f(this.e, cVar.e);
    }

    public final int hashCode() {
        int iHashCode = (this.f18196c.hashCode() + l.j(this.f18195b, Long.hashCode(this.f18194a) * 31, 31)) * 31;
        rtf.c cVar = this.d;
        return this.e.hashCode() + ((iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31);
    }
}
