package wr1;

import com.revolut.feature.apm.core.models.transfers.payments.ApmQuote;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class j implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ApmQuote f299494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n9l.a f299495b;

    public j(ApmQuote apmQuote, n9l.a exchangeRate) {
        Intrinsics.checkNotNullParameter(exchangeRate, "exchangeRate");
        this.f299494a = apmQuote;
        this.f299495b = exchangeRate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f299494a, jVar.f299494a) && Intrinsics.f(this.f299495b, jVar.f299495b);
    }

    public final int hashCode() {
        ApmQuote apmQuote = this.f299494a;
        return this.f299495b.hashCode() + ((apmQuote == null ? 0 : apmQuote.hashCode()) * 31);
    }
}
