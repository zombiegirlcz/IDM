package hof;

import com.revolut.shared.feature.market_data.models.domain.models.ChargeBreakdown;
import kotlin.jvm.internal.Intrinsics;
import qv0.i;
import tof.a3;

/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a3 f154278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final thf.a f154279b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f154280c;
    public final dj0.d d;
    public final ChargeBreakdown e;
    public final i f;

    public a(a3 transaction, thf.a status, boolean z, dj0.d dVar, ChargeBreakdown chargeBreakdown, i iVar) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(status, "status");
        this.f154278a = transaction;
        this.f154279b = status;
        this.f154280c = z;
        this.d = dVar;
        this.e = chargeBreakdown;
        this.f = iVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f154278a.equals(aVar.f154278a) && this.f154279b.equals(aVar.f154279b) && this.f154280c == aVar.f154280c && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e) && Intrinsics.f(this.f, aVar.f);
    }

    public final int hashCode() {
        int iC = j6.a.c(j6.a.c((this.f154279b.hashCode() + (this.f154278a.hashCode() * 961)) * 31, 31, this.f154280c), 31, false);
        dj0.d dVar = this.d;
        int iHashCode = (iC + (dVar == null ? 0 : dVar.hashCode())) * 31;
        ChargeBreakdown chargeBreakdown = this.e;
        int iHashCode2 = (iHashCode + (chargeBreakdown == null ? 0 : chargeBreakdown.hashCode())) * 31;
        i iVar = this.f;
        return iHashCode2 + (iVar != null ? iVar.hashCode() : 0);
    }
}
