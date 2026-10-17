package us6;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.freelancer.impl.ui.invoice.create.flow.InvoiceCreateFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class h2 implements xki.c, xx6.a, cy6.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InvoiceCreateFlowContract$InputData f282566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g2 f282567b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h2 f282568c = this;
    public final e4m.e d = e4m.b.b(new ufh.e(this, 22));

    public h2(g2 g2Var, InvoiceCreateFlowContract$InputData invoiceCreateFlowContract$InputData) {
        this.f282567b = g2Var;
        this.f282566a = invoiceCreateFlowContract$InputData;
    }

    @Override // cy6.a
    public final c3 b() {
        return new c3(this.f282567b, this.f282568c, 1);
    }

    @Override // xx6.a
    public final a3 c() {
        return new a3(this.f282567b, this.f282568c, 1);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }

    public final kx6.e j() {
        g2 g2Var = this.f282567b;
        gr6.i iVarA = g2Var.f282553b.a();
        vc.s.j(iVarA);
        et6.b1 b1Var = (et6.b1) g2Var.f282552a.f282682h0.get();
        vc.s.j(b1Var);
        return new kx6.e(iVarA, b1Var);
    }
}
