package z9h;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.wealth.impl.ui.flows.add_money.composite.CompositeAddMoneyFlowContract$Input;
import java.util.Set;
import z0g.k0;

/* JADX INFO: loaded from: classes9.dex */
public final class b implements xki.c, zbh.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CompositeAddMoneyFlowContract$Input f320388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ozg.a f320389b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f320390c;
    public final b d = this;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f320391g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f320392h;
    public final e4m.e i;

    public b(d dVar, CompositeAddMoneyFlowContract$Input compositeAddMoneyFlowContract$Input, ozg.a aVar) {
        this.f320390c = dVar;
        this.f320388a = compositeAddMoneyFlowContract$Input;
        this.f320389b = aVar;
        int i = 14;
        this.e = e4m.b.b(new k0(dVar, this, 1, i));
        this.f = e4m.b.b(new k0(dVar, this, 2, i));
        this.f320391g = e4m.b.b(new k0(dVar, this, 0, i));
        this.f320392h = e4m.b.b(new k0(dVar, this, 3, i));
        this.i = e4m.b.b(new k0(dVar, this, 4, i));
    }

    @Override // zbh.c
    public final m b() {
        return new m(this.f320390c, this.d, 0);
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
