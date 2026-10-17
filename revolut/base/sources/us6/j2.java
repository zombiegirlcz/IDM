package us6;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.freelancer.impl.ui.invoice.screen.customer_list.InvoiceCustomerListScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class j2 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InvoiceCustomerListScreenContract$InputData f282592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f282593b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f282594c;
    public final e4m.e d;

    public j2(g2 g2Var, h2 h2Var, InvoiceCustomerListScreenContract$InputData invoiceCustomerListScreenContract$InputData) {
        this.f282592a = invoiceCustomerListScreenContract$InputData;
        int i = 26;
        this.f282593b = e4m.b.b(new q0(g2Var, this, 1, i));
        this.f282594c = e4m.b.b(new q0(g2Var, this, 2, i));
        this.d = e4m.b.b(new q0(g2Var, this, 0, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
