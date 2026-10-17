package us6;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.freelancer.impl.ui.invoice.screen.payment_schedule.InvoicePaymentScheduleScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class p2 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InvoicePaymentScheduleScreenContract$InputData f282663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g2 f282664b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f282665c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f282666g;

    public p2(g2 g2Var, h2 h2Var, ViewController viewController, InvoicePaymentScheduleScreenContract$InputData invoicePaymentScheduleScreenContract$InputData) {
        this.f282664b = g2Var;
        this.f282663a = invoicePaymentScheduleScreenContract$InputData;
        this.f282665c = e4m.b.b(e4m.c.a(viewController));
        int i = 29;
        this.d = e4m.b.b(new q0(g2Var, this, 2, i));
        this.e = e4m.b.b(new q0(g2Var, this, 1, i));
        this.f = e4m.b.b(new q0(g2Var, this, 0, i));
        this.f282666g = e4m.b.b(new q0(g2Var, this, 3, i));
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
