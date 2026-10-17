package fo1;

import com.revolut.feature.apm.core.models.transfers.payments.ApmQuote;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class i extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ApmQuote f136758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n9l.a f136759b;

    public i(ApmQuote apmQuote, n9l.a exchangeRate) {
        Intrinsics.checkNotNullParameter(exchangeRate, "exchangeRate");
        this.f136758a = apmQuote;
        this.f136759b = exchangeRate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f136758a, iVar.f136758a) && Intrinsics.f(this.f136759b, iVar.f136759b);
    }

    public final int hashCode() {
        ApmQuote apmQuote = this.f136758a;
        return this.f136759b.hashCode() + ((apmQuote == null ? 0 : apmQuote.hashCode()) * 31);
    }
}
