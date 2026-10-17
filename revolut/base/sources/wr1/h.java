package wr1;

import com.revolut.feature.apm.core.models.transfers.payments.ApmQuoteCharges;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class h implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ApmQuoteCharges f299490a;

    public h(ApmQuoteCharges apmQuoteCharges) {
        this.f299490a = apmQuoteCharges;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f299490a, ((h) obj2).f299490a);
    }

    public final int hashCode() {
        ApmQuoteCharges apmQuoteCharges = this.f299490a;
        if (apmQuoteCharges == null) {
            return 0;
        }
        return apmQuoteCharges.hashCode();
    }
}
