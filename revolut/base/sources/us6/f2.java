package us6;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.freelancer.impl.ui.create_sale.invoice.number.FreelancerInvoiceNumberSettingsScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class f2 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FreelancerInvoiceNumberSettingsScreenContract$InputData f282539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f282540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f282541c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f282542g;

    public f2(g2 g2Var, ViewController viewController, FreelancerInvoiceNumberSettingsScreenContract$InputData freelancerInvoiceNumberSettingsScreenContract$InputData) {
        this.f282539a = freelancerInvoiceNumberSettingsScreenContract$InputData;
        this.f282540b = e4m.b.b(e4m.c.a(viewController));
        int i = 24;
        this.f282541c = e4m.b.b(new q0(g2Var, this, 2, i));
        this.d = e4m.b.b(new q0(g2Var, this, 1, i));
        this.e = e4m.b.b(new q0(g2Var, this, 0, i));
        this.f = e4m.b.b(new q0(g2Var, this, 4, i));
        this.f282542g = e4m.b.b(new q0(g2Var, this, 3, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.e.get());
    }
}
