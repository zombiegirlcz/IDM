package w9d;

import aii.e;
import aii.g;
import aii.u;
import com.revolut.feature.shared.invoices.impl.ui.invoice_preview.InvoicePreviewScreen;
import com.revolut.feature.shared.invoices.impl.ui.invoice_preview.InvoicePreviewScreenContract$InputData;
import com.revolut.feature.shared.invoices.impl.ui.language_selector.InvoiceLanguageSelectorScreen;
import com.revolut.feature.shared.invoices.impl.ui.template_preview.InvoiceTemplatePreviewScreen;
import kotlin.jvm.internal.Intrinsics;
import t9d.b;
import t9d.c;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements ohi.a {
    @Override // nhi.f
    public final g c(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (descriptor instanceof t9d.a) {
            t9d.a aVar = (t9d.a) descriptor;
            return aVar.a(new InvoiceLanguageSelectorScreen(aVar.f268977a));
        }
        if (descriptor instanceof b) {
            b bVar = (b) descriptor;
            return bVar.a(new InvoicePreviewScreen(new InvoicePreviewScreenContract$InputData(bVar.f268978a, bVar.f268979b)));
        }
        if (descriptor instanceof c) {
            c cVar = (c) descriptor;
            return cVar.a(new InvoiceTemplatePreviewScreen(cVar.f268980a));
        }
        super.c(descriptor);
        return null;
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        return null;
    }
}
