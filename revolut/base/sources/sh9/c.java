package sh9;

import a0.d;
import com.revolut.feature.apm.core.models.transfers.payments.ApmQuote;
import h30.l;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f263444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f263445b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xi0.b f263446c;
    public final xi0.b d;
    public final ApmQuote e;
    public final b f;

    public c(long j2, long j3, xi0.b targetCurrency, xi0.b sourceCurrency, ApmQuote apmQuote, b bVar) {
        Intrinsics.checkNotNullParameter(targetCurrency, "targetCurrency");
        Intrinsics.checkNotNullParameter(sourceCurrency, "sourceCurrency");
        this.f263444a = j2;
        this.f263445b = j3;
        this.f263446c = targetCurrency;
        this.d = sourceCurrency;
        this.e = apmQuote;
        this.f = bVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f263444a == cVar.f263444a && this.f263445b == cVar.f263445b && Intrinsics.f(this.f263446c, cVar.f263446c) && Intrinsics.f(this.d, cVar.d) && Intrinsics.f(this.e, cVar.e) && Intrinsics.f(this.f, cVar.f);
    }

    public final int hashCode() {
        int iJ = l.j(this.d, l.j(this.f263446c, d.c(Long.hashCode(this.f263444a) * 31, 31, this.f263445b), 31), 31);
        ApmQuote apmQuote = this.e;
        int iHashCode = (iJ + (apmQuote == null ? 0 : apmQuote.hashCode())) * 31;
        b bVar = this.f;
        return iHashCode + (bVar != null ? bVar.hashCode() : 0);
    }
}
