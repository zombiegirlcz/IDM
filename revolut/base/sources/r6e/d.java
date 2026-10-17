package r6e;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.subaccount.impl.ui.edit.billl.flow.BillsEditFlowContract$InputData;
import com.revolut.kompot.navigable.flow.BaseFlow;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class d implements qji.a, f8e.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BillsEditFlowContract$InputData f251719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f251720b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f251721c = this;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f251722g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f251723h;

    public d(o oVar, BaseFlow baseFlow, BillsEditFlowContract$InputData billsEditFlowContract$InputData) {
        this.f251720b = oVar;
        this.f251719a = billsEditFlowContract$InputData;
        this.d = e4m.b.b(e4m.c.a(baseFlow));
        int i = 11;
        this.e = e4m.b.b(new qy7.f(oVar, this, 2, i));
        this.f = e4m.b.b(new qy7.f(oVar, this, 1, i));
        this.f251722g = e4m.b.b(new qy7.f(oVar, this, 0, i));
        this.f251723h = e4m.b.b(new qy7.f(oVar, this, 3, i));
    }

    @Override // f8e.a
    public final x b() {
        return new x(this.f251720b, this.f251721c, 0);
    }

    @Override // dki.t
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // dki.q
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f251722g.get());
    }
}
