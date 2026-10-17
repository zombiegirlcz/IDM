package cs1;

import com.revolut.feature.apm.core.models.transfers.payments.ApmQuoteCharges;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class f implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ApmQuoteCharges f108435a;

    public f(ApmQuoteCharges apmQuoteCharges) {
        this.f108435a = apmQuoteCharges;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f108435a, ((f) obj2).f108435a);
    }

    public final int hashCode() {
        ApmQuoteCharges apmQuoteCharges = this.f108435a;
        if (apmQuoteCharges == null) {
            return 0;
        }
        return apmQuoteCharges.hashCode();
    }
}
