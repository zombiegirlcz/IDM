package l0k;

import com.google.common.collect.ImmutableSet;
import com.revolut.retail.feature.marketnews.impl.flows.wealthnewsoverview.WealthNewsOverviewFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class i implements rji.a, i1k.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WealthNewsOverviewFlowContract$InputData f191296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f191297b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f191298c = this;
    public final e4m.e d;
    public final e4m.e e;

    public i(c cVar, WealthNewsOverviewFlowContract$InputData wealthNewsOverviewFlowContract$InputData) {
        this.f191297b = cVar;
        this.f191296a = wealthNewsOverviewFlowContract$InputData;
        int i = 18;
        this.d = e4m.b.b(new kr9.m(cVar, this, 0, i));
        this.e = e4m.b.b(new kr9.m(cVar, this, 1, i));
    }

    @Override // i1k.a
    public final j b() {
        return new j(this.f191297b, this.f191298c, 0);
    }

    public final ImmutableSet c() {
        c cVar = this.f191297b;
        m51.a aVar = cVar.f191266m;
        return ImmutableSet.of((c1k.b) new c1k.a(new zjh.f(((n51.a) aVar).b()), new i4b.f(cVar.f191262g.E()), new b1k.a()), new c1k.b(new zjh.j(((n51.a) aVar).b()), new b1k.b()));
    }

    @Override // dki.t
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // dki.q
    public final Set g() {
        return ImmutableSet.of();
    }
}
