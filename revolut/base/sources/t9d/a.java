package t9d;

import aii.e;
import com.revolut.feature.shared.invoices.api.ui.contract.InvoiceLanguageSelectorContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InvoiceLanguageSelectorContract$InputData f268977a;

    public a(InvoiceLanguageSelectorContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f268977a = inputData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f268977a, ((a) obj2).f268977a);
    }

    public final int hashCode() {
        return this.f268977a.f86420a.hashCode();
    }
}
