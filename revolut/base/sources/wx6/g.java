package wx6;

import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoice;
import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoiceSettings;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FreelancerInvoice f300758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FreelancerInvoiceSettings f300759b;

    public g(FreelancerInvoice freelancerInvoice, FreelancerInvoiceSettings invoiceSettings) {
        Intrinsics.checkNotNullParameter(invoiceSettings, "invoiceSettings");
        this.f300758a = freelancerInvoice;
        this.f300759b = invoiceSettings;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f300758a, gVar.f300758a) && Intrinsics.f(this.f300759b, gVar.f300759b);
    }

    public final int hashCode() {
        FreelancerInvoice freelancerInvoice = this.f300758a;
        return this.f300759b.hashCode() + ((freelancerInvoice == null ? 0 : freelancerInvoice.hashCode()) * 31);
    }
}
