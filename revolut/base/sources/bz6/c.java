package bz6;

import aii.r;
import com.revolut.feature.shared.invoices.api.domain.model.InvoiceTemplate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InvoiceTemplate f19930a;

    public c(InvoiceTemplate template) {
        Intrinsics.checkNotNullParameter(template, "template");
        this.f19930a = template;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f19930a, ((c) obj2).f19930a);
    }

    public final int hashCode() {
        return this.f19930a.hashCode();
    }
}
