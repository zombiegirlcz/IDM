package jy6;

import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoice;
import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoiceSettings;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FreelancerInvoice f179332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FreelancerInvoiceSettings f179333b;

    public g(FreelancerInvoice freelancerInvoice, FreelancerInvoiceSettings invoiceSettings) {
        Intrinsics.checkNotNullParameter(invoiceSettings, "invoiceSettings");
        this.f179332a = freelancerInvoice;
        this.f179333b = invoiceSettings;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f179332a, gVar.f179332a) && Intrinsics.f(this.f179333b, gVar.f179333b);
    }

    public final int hashCode() {
        FreelancerInvoice freelancerInvoice = this.f179332a;
        return this.f179333b.hashCode() + ((freelancerInvoice == null ? 0 : freelancerInvoice.hashCode()) * 31);
    }
}
