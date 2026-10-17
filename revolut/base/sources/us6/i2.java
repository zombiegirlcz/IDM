package us6;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.freelancer.impl.ui.invoice.create.screen.InvoiceCreateScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class i2 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InvoiceCreateScreenContract$InputData f282580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g2 f282581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f282582c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f282583g;

    public i2(g2 g2Var, h2 h2Var, InvoiceCreateScreenContract$InputData invoiceCreateScreenContract$InputData) {
        this.f282581b = g2Var;
        this.f282580a = invoiceCreateScreenContract$InputData;
        this.f282582c = e4m.b.b(new r7d.w(g2Var, h2Var, this, 2, 17));
        int i = 17;
        this.d = e4m.b.b(new r7d.w(g2Var, h2Var, this, 1, i));
        this.e = e4m.b.b(new r7d.w(g2Var, h2Var, this, 0, i));
        this.f = e4m.b.b(new r7d.w(g2Var, h2Var, this, 3, i));
        this.f282583g = e4m.b.b(new r7d.w(g2Var, h2Var, this, 4, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.e.get());
    }
}
