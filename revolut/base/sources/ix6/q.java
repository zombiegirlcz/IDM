package ix6;

import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoice;
import com.revolut.feature.shared.invoices.api.domain.model.InvoiceTemplate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FreelancerInvoice f169408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InvoiceTemplate f169409b;

    public q(FreelancerInvoice invoice, InvoiceTemplate invoiceTemplate) {
        Intrinsics.checkNotNullParameter(invoice, "invoice");
        this.f169408a = invoice;
        this.f169409b = invoiceTemplate;
    }

    public static q a(q qVar, FreelancerInvoice invoice, InvoiceTemplate invoiceTemplate, int i) {
        if ((i & 1) != 0) {
            invoice = qVar.f169408a;
        }
        if ((i & 2) != 0) {
            invoiceTemplate = qVar.f169409b;
        }
        Intrinsics.checkNotNullParameter(invoice, "invoice");
        return new q(invoice, invoiceTemplate);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f169408a, qVar.f169408a) && Intrinsics.f(this.f169409b, qVar.f169409b);
    }

    public final int hashCode() {
        int iHashCode = this.f169408a.hashCode() * 31;
        InvoiceTemplate invoiceTemplate = this.f169409b;
        return iHashCode + (invoiceTemplate == null ? 0 : invoiceTemplate.hashCode());
    }
}
