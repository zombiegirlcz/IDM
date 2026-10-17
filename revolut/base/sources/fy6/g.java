package fy6;

import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoice;
import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoiceSettings;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FreelancerInvoice f138933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FreelancerInvoiceSettings f138934b;

    public g(FreelancerInvoice invoice, FreelancerInvoiceSettings invoiceSettings) {
        Intrinsics.checkNotNullParameter(invoice, "invoice");
        Intrinsics.checkNotNullParameter(invoiceSettings, "invoiceSettings");
        this.f138933a = invoice;
        this.f138934b = invoiceSettings;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f138933a, gVar.f138933a) && Intrinsics.f(this.f138934b, gVar.f138934b);
    }

    public final int hashCode() {
        return this.f138934b.hashCode() + (this.f138933a.hashCode() * 31);
    }
}
