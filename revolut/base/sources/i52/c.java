package i52;

import com.revolut.feature.apm.core.models.transfers.payments.ApmQuote;
import com.revolut.feature.transfer.models.transfer.TransferTrustData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ApmQuote f158551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TransferTrustData f158552b;

    public c(ApmQuote apmQuote, TransferTrustData trustData) {
        Intrinsics.checkNotNullParameter(trustData, "trustData");
        this.f158551a = apmQuote;
        this.f158552b = trustData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f158551a, cVar.f158551a) && Intrinsics.f(this.f158552b, cVar.f158552b);
    }

    public final int hashCode() {
        ApmQuote apmQuote = this.f158551a;
        return this.f158552b.hashCode() + ((apmQuote == null ? 0 : apmQuote.hashCode()) * 31);
    }
}
