package qgk;

import com.google.common.collect.ImmutableSet;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.screen.PlanHubV2ScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class m0 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nkd.b f246126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mkd.g f246127b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PlanHubV2ScreenContract$InputData f246128c;
    public final i0 d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f246129g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f246130h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f246131j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f246132l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f246133m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f246134n;

    public m0(i0 i0Var, l0 l0Var, nkd.b bVar, mkd.g gVar, PlanHubV2ScreenContract$InputData planHubV2ScreenContract$InputData) {
        this.d = i0Var;
        this.f246126a = bVar;
        this.f246127b = gVar;
        this.f246128c = planHubV2ScreenContract$InputData;
        this.e = e4m.b.b(new m(i0Var, this, 2, 12));
        this.f = e4m.b.b(new m(i0Var, this, 1, 12));
        this.f246129g = e4m.b.b(new m(i0Var, this, 0, 12));
        this.f246130h = e4m.b.b(new m(i0Var, this, 4, 12));
        this.i = e4m.b.b(new m(i0Var, this, 3, 12));
        this.f246131j = e4m.b.b(new m(i0Var, this, 5, 12));
        this.k = e4m.b.b(new m(i0Var, this, 6, 12));
        this.f246132l = e4m.b.b(new m(i0Var, this, 7, 12));
        this.f246133m = e4m.b.b(new m(i0Var, this, 9, 12));
        this.f246134n = e4m.b.b(new m(i0Var, this, 8, 12));
    }

    public final dnk.l b() {
        return new dnk.l(this.d.e.g(), 0);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.i.get(), (yji.n) this.f246131j.get(), (yji.n) this.k.get(), (yji.n) this.f246132l.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f246129g.get());
    }
}
