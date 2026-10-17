package as1;

import com.revolut.feature.apm.core.models.transfers.payments.ApmQuoteCharges;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class j implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ApmQuoteCharges f8767a;

    public j(ApmQuoteCharges apmQuoteCharges) {
        this.f8767a = apmQuoteCharges;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f8767a, ((j) obj2).f8767a);
    }

    public final int hashCode() {
        ApmQuoteCharges apmQuoteCharges = this.f8767a;
        if (apmQuoteCharges == null) {
            return 0;
        }
        return apmQuoteCharges.hashCode();
    }
}
