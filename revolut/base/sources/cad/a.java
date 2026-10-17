package cad;

import com.revolut.feature.shared.invoices.api.ui.contract.InvoiceLanguageSelectorContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InvoiceLanguageSelectorContract$InputData f22598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f22599b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f22600c;
    public final e4m.e d;

    public a(d dVar, ViewController viewController, InvoiceLanguageSelectorContract$InputData invoiceLanguageSelectorContract$InputData) {
        this.f22598a = invoiceLanguageSelectorContract$InputData;
        this.f22599b = e4m.b.b(e4m.c.a(viewController));
        int i = 28;
        this.f22600c = e4m.b.b(new aq1.e(this, 1, i));
        this.d = e4m.b.b(new aq1.e(this, 0, i));
    }

    @Override // xki.e
    public final Set f() {
        return Collections.EMPTY_SET;
    }

    @Override // xki.e
    public final Set g() {
        return Collections.EMPTY_SET;
    }
}
