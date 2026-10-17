package dz6;

import com.revolut.feature.shared.invoices.api.domain.model.InvoiceTemplate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InvoiceTemplate f121245a;

    public i(InvoiceTemplate template) {
        Intrinsics.checkNotNullParameter(template, "template");
        this.f121245a = template;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f121245a, ((i) obj2).f121245a);
    }

    public final int hashCode() {
        return this.f121245a.hashCode();
    }
}
