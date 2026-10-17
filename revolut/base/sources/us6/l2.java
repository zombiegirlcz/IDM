package us6;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.freelancer.impl.ui.invoice.details.screen.InvoiceDetailsScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class l2 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InvoiceDetailsScreenContract$InputData f282618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g2 f282619b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f282620c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f282621g;

    public l2(g2 g2Var, k2 k2Var, ViewController viewController, InvoiceDetailsScreenContract$InputData invoiceDetailsScreenContract$InputData) {
        this.f282619b = g2Var;
        this.f282618a = invoiceDetailsScreenContract$InputData;
        this.f282620c = e4m.b.b(e4m.c.a(viewController));
        int i = 27;
        this.d = e4m.b.b(new q0(g2Var, this, 2, i));
        this.e = e4m.b.b(new q0(g2Var, this, 1, i));
        this.f = e4m.b.b(new q0(g2Var, this, 0, i));
        this.f282621g = e4m.b.b(new q0(g2Var, this, 3, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f.get());
    }
}
