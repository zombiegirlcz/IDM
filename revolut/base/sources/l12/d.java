package l12;

import com.revolut.feature.apm.core.models.transfers.payments.ApmQuote;
import h30.l;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f191419a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f191420b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xi0.b f191421c;
    public final xi0.b d;
    public final ApmQuote e;
    public final hrf.f f;

    public d(long j2, long j3, xi0.b targetCurrency, xi0.b sourceCurrency, ApmQuote apmQuote, hrf.f direction) {
        Intrinsics.checkNotNullParameter(targetCurrency, "targetCurrency");
        Intrinsics.checkNotNullParameter(sourceCurrency, "sourceCurrency");
        Intrinsics.checkNotNullParameter(direction, "direction");
        this.f191419a = j2;
        this.f191420b = j3;
        this.f191421c = targetCurrency;
        this.d = sourceCurrency;
        this.e = apmQuote;
        this.f = direction;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f191419a == dVar.f191419a && this.f191420b == dVar.f191420b && Intrinsics.f(this.f191421c, dVar.f191421c) && Intrinsics.f(this.d, dVar.d) && Intrinsics.f(this.e, dVar.e) && this.f == dVar.f;
    }

    public final int hashCode() {
        int iJ = l.j(this.d, l.j(this.f191421c, a0.d.c(Long.hashCode(this.f191419a) * 31, 31, this.f191420b), 31), 31);
        ApmQuote apmQuote = this.e;
        return this.f.hashCode() + ((iJ + (apmQuote == null ? 0 : apmQuote.hashCode())) * 31);
    }
}
