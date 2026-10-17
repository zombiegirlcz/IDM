package fz6;

import com.revolut.feature.shared.invoices.api.domain.model.InvoiceTemplate;
import com.revolut.feature.shared.invoices.api.domain.model.InvoiceTemplateOverride;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements aii.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InvoiceTemplate f139115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InvoiceTemplateOverride f139116b;

    public i(InvoiceTemplate template, InvoiceTemplateOverride invoiceTemplateOverride) {
        Intrinsics.checkNotNullParameter(template, "template");
        this.f139115a = template;
        this.f139116b = invoiceTemplateOverride;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f139115a, iVar.f139115a) && Intrinsics.f(this.f139116b, iVar.f139116b);
    }

    public final int hashCode() {
        int iHashCode = this.f139115a.hashCode() * 31;
        InvoiceTemplateOverride invoiceTemplateOverride = this.f139116b;
        return iHashCode + (invoiceTemplateOverride == null ? 0 : invoiceTemplateOverride.hashCode());
    }
}
