package tt1;

import com.revolut.feature.apm.core.models.transfers.payments.ApmQuote;
import h30.l;
import hrf.f;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f274187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f274188b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xi0.b f274189c;
    public final xi0.b d;
    public final ApmQuote e;
    public final f f;

    public b(long j2, long j3, xi0.b targetCurrency, xi0.b sourceCurrency, ApmQuote apmQuote, f direction) {
        Intrinsics.checkNotNullParameter(targetCurrency, "targetCurrency");
        Intrinsics.checkNotNullParameter(sourceCurrency, "sourceCurrency");
        Intrinsics.checkNotNullParameter(direction, "direction");
        this.f274187a = j2;
        this.f274188b = j3;
        this.f274189c = targetCurrency;
        this.d = sourceCurrency;
        this.e = apmQuote;
        this.f = direction;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f274187a == bVar.f274187a && this.f274188b == bVar.f274188b && Intrinsics.f(this.f274189c, bVar.f274189c) && Intrinsics.f(this.d, bVar.d) && Intrinsics.f(this.e, bVar.e) && this.f == bVar.f;
    }

    public final int hashCode() {
        int iJ = l.j(this.d, l.j(this.f274189c, a0.d.c(Long.hashCode(this.f274187a) * 31, 31, this.f274188b), 31), 31);
        ApmQuote apmQuote = this.e;
        return this.f.hashCode() + ((iJ + (apmQuote == null ? 0 : apmQuote.hashCode())) * 31);
    }
}
