package t9d;

import aii.e;
import com.revolut.feature.shared.invoices.api.ui.contract.InvoiceTemplatePreviewContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InvoiceTemplatePreviewContract$InputData f268980a;

    public c(InvoiceTemplatePreviewContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f268980a = inputData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f268980a, ((c) obj2).f268980a);
    }

    public final int hashCode() {
        return this.f268980a.f86421a.hashCode();
    }
}
