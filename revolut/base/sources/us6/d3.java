package us6;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.freelancer.impl.ui.invoice.screen.payment_methods.InvoicePaymentMethodsScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class d3 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f282495a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InvoicePaymentMethodsScreenContract$InputData f282496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f282497c;
    public final e4m.e d;
    public final e4m.e e;

    public d3(g2 g2Var, h2 h2Var, InvoicePaymentMethodsScreenContract$InputData invoicePaymentMethodsScreenContract$InputData) {
        this.f282496b = invoicePaymentMethodsScreenContract$InputData;
        int i = 4;
        this.f282497c = e4m.b.b(new r2(g2Var, this, 1, i));
        this.d = e4m.b.b(new r2(g2Var, this, 0, i));
        this.e = e4m.b.b(new r2(g2Var, this, 2, i));
    }

    @Override // xki.e
    public final Set f() {
        switch (this.f282495a) {
        }
        return ImmutableSet.of((yji.n) this.d.get());
    }

    @Override // xki.e
    public final Set g() {
        switch (this.f282495a) {
        }
        return ImmutableSet.of();
    }

    public d3(g2 g2Var, u2 u2Var, InvoicePaymentMethodsScreenContract$InputData invoicePaymentMethodsScreenContract$InputData) {
        this.f282496b = invoicePaymentMethodsScreenContract$InputData;
        int i = 3;
        this.f282497c = e4m.b.b(new r2(g2Var, this, 1, i));
        this.d = e4m.b.b(new r2(g2Var, this, 0, i));
        this.e = e4m.b.b(new r2(g2Var, this, 2, i));
    }
}
