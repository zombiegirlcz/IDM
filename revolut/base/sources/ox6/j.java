package ox6;

import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoice;
import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoiceSettings;
import com.revolut.feature.shared.invoices.api.domain.model.InvoiceTemplate;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FreelancerInvoice f230625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FreelancerInvoiceSettings f230626b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f230627c;
    public final FreelancerInvoice d;
    public final InvoiceTemplate e;

    public j(FreelancerInvoice invoice, FreelancerInvoiceSettings settings, List history, FreelancerInvoice freelancerInvoice, InvoiceTemplate invoiceTemplate) {
        Intrinsics.checkNotNullParameter(invoice, "invoice");
        Intrinsics.checkNotNullParameter(settings, "settings");
        Intrinsics.checkNotNullParameter(history, "history");
        this.f230625a = invoice;
        this.f230626b = settings;
        this.f230627c = history;
        this.d = freelancerInvoice;
        this.e = invoiceTemplate;
    }

    public static j a(j jVar, List list, FreelancerInvoice freelancerInvoice, InvoiceTemplate invoiceTemplate, int i) {
        FreelancerInvoice invoice = jVar.f230625a;
        FreelancerInvoiceSettings settings = jVar.f230626b;
        if ((i & 4) != 0) {
            list = jVar.f230627c;
        }
        List history = list;
        if ((i & 8) != 0) {
            freelancerInvoice = jVar.d;
        }
        FreelancerInvoice freelancerInvoice2 = freelancerInvoice;
        if ((i & 16) != 0) {
            invoiceTemplate = jVar.e;
        }
        jVar.getClass();
        Intrinsics.checkNotNullParameter(invoice, "invoice");
        Intrinsics.checkNotNullParameter(settings, "settings");
        Intrinsics.checkNotNullParameter(history, "history");
        return new j(invoice, settings, history, freelancerInvoice2, invoiceTemplate);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f230625a, jVar.f230625a) && Intrinsics.f(this.f230626b, jVar.f230626b) && Intrinsics.f(this.f230627c, jVar.f230627c) && Intrinsics.f(this.d, jVar.d) && Intrinsics.f(this.e, jVar.e);
    }

    public final int hashCode() {
        int iD = p.a.d((this.f230626b.hashCode() + (this.f230625a.hashCode() * 31)) * 31, 31, this.f230627c);
        FreelancerInvoice freelancerInvoice = this.d;
        int iHashCode = (iD + (freelancerInvoice == null ? 0 : freelancerInvoice.hashCode())) * 31;
        InvoiceTemplate invoiceTemplate = this.e;
        return iHashCode + (invoiceTemplate != null ? invoiceTemplate.hashCode() : 0);
    }
}
