package ix6;

import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoice;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class y implements a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FreelancerInvoice f169417a;

    public y(FreelancerInvoice invoice) {
        Intrinsics.checkNotNullParameter(invoice, "invoice");
        this.f169417a = invoice;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof y) && Intrinsics.f(this.f169417a, ((y) obj2).f169417a);
    }

    public final int hashCode() {
        return this.f169417a.hashCode();
    }
}
