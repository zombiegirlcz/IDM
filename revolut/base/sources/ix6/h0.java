package ix6;

import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoiceItemPayload;
import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoiceUpdateItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FreelancerInvoiceItemPayload f169393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FreelancerInvoiceUpdateItem f169394b;

    public h0(FreelancerInvoiceItemPayload item, FreelancerInvoiceUpdateItem updatePayload) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(updatePayload, "updatePayload");
        this.f169393a = item;
        this.f169394b = updatePayload;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj2;
        return Intrinsics.f(this.f169393a, h0Var.f169393a) && Intrinsics.f(this.f169394b, h0Var.f169394b);
    }

    public final int hashCode() {
        return this.f169394b.hashCode() + (this.f169393a.hashCode() * 31);
    }
}
