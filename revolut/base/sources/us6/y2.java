package us6;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.freelancer.impl.ui.invoice.templates.flow.InvoiceTemplatesFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class y2 implements xki.c, z07.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InvoiceTemplatesFlowContract$InputData f282815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g2 f282816b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y2 f282817c = this;
    public final e4m.e d = e4m.b.b(new ufh.e(this, 25));

    public y2(g2 g2Var, InvoiceTemplatesFlowContract$InputData invoiceTemplatesFlowContract$InputData) {
        this.f282816b = g2Var;
        this.f282815a = invoiceTemplatesFlowContract$InputData;
    }

    @Override // z07.a
    public final t1 b() {
        return new t1(this.f282816b, this.f282817c, 2);
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
