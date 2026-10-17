package bsf;

import com.revolut.feature.transfer.core.models.FundingSource;
import h30.l;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class d implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f18197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi0.b f18198b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FundingSource f18199c;
    public final rtf.c d;
    public final zm3.a e;

    public d(long j2, xi0.b targetCurrency, FundingSource fundingSource, rtf.c cVar, zm3.a contact) {
        Intrinsics.checkNotNullParameter(targetCurrency, "targetCurrency");
        Intrinsics.checkNotNullParameter(fundingSource, "fundingSource");
        Intrinsics.checkNotNullParameter(contact, "contact");
        this.f18197a = j2;
        this.f18198b = targetCurrency;
        this.f18199c = fundingSource;
        this.d = cVar;
        this.e = contact;
    }

    @Override // bsf.e
    public final FundingSource a() {
        return this.f18199c;
    }

    @Override // bsf.e
    public final xi0.b b() {
        return this.f18198b;
    }

    @Override // bsf.e
    public final rtf.c c() {
        return this.d;
    }

    @Override // bsf.e
    public final long d() {
        return this.f18197a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f18197a == dVar.f18197a && Intrinsics.f(this.f18198b, dVar.f18198b) && Intrinsics.f(this.f18199c, dVar.f18199c) && Intrinsics.f(this.d, dVar.d) && Intrinsics.f(this.e, dVar.e);
    }

    public final int hashCode() {
        int iHashCode = (this.f18199c.hashCode() + l.j(this.f18198b, Long.hashCode(this.f18197a) * 31, 31)) * 31;
        rtf.c cVar = this.d;
        return this.e.hashCode() + ((iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31);
    }
}
