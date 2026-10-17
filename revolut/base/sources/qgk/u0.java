package qgk;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_page.PlanPageScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class u0 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ScreenContentRecyclerView f246266a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PlanPageScreenContract$InputData f246267b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ViewController f246268c;
    public final i0 d;
    public final v0 e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f246269g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f246270h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f246271j;

    public u0(i0 i0Var, v0 v0Var, ViewController viewController, ScreenContentRecyclerView screenContentRecyclerView, PlanPageScreenContract$InputData planPageScreenContract$InputData) {
        this.d = i0Var;
        this.e = v0Var;
        this.f246266a = screenContentRecyclerView;
        this.f246267b = planPageScreenContract$InputData;
        this.f246268c = viewController;
        int i = 12;
        this.f = e4m.b.b(new ppd.j(i0Var, v0Var, this, 1, i));
        this.f246269g = e4m.b.b(new ppd.j(i0Var, v0Var, this, 0, i));
        this.f246270h = e4m.b.b(new ppd.j(i0Var, v0Var, this, 4, i));
        this.i = e4m.b.b(new ppd.j(i0Var, v0Var, this, 3, i));
        this.f246271j = e4m.b.b(new ppd.j(i0Var, v0Var, this, 2, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f246269g.get());
    }
}
