package ot1;

import com.revolut.feature.apm.core.models.transfers.payments.ApmQuote;
import com.revolut.feature.transfer.models.transfer.TransferTrustData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ApmQuote f229395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TransferTrustData f229396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e7l.c f229397c;

    public c(ApmQuote apmQuote, TransferTrustData trustData, e7l.c cVar) {
        Intrinsics.checkNotNullParameter(trustData, "trustData");
        this.f229395a = apmQuote;
        this.f229396b = trustData;
        this.f229397c = cVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f229395a, cVar.f229395a) && Intrinsics.f(this.f229396b, cVar.f229396b) && Intrinsics.f(this.f229397c, cVar.f229397c);
    }

    public final int hashCode() {
        ApmQuote apmQuote = this.f229395a;
        int iHashCode = (this.f229396b.hashCode() + ((apmQuote == null ? 0 : apmQuote.hashCode()) * 31)) * 31;
        e7l.c cVar = this.f229397c;
        return iHashCode + (cVar != null ? cVar.hashCode() : 0);
    }
}
