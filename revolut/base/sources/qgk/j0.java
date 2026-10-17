package qgk;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_gift.PlanGiftBenefitsScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class j0 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PlanGiftBenefitsScreenContract$InputData f246062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i0 f246063b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f246064c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f246065g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f246066h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f246067j;

    public j0(i0 i0Var, kik.c cVar, ViewController viewController, PlanGiftBenefitsScreenContract$InputData planGiftBenefitsScreenContract$InputData) {
        this.f246063b = i0Var;
        this.f246062a = planGiftBenefitsScreenContract$InputData;
        this.f246064c = e4m.b.b(e4m.c.a(viewController));
        int i = 10;
        this.d = e4m.b.b(new m(i0Var, this, 2, i));
        this.e = e4m.b.b(new m(i0Var, this, 1, i));
        this.f = e4m.b.b(new m(i0Var, this, 0, i));
        this.f246065g = e4m.b.b(new m(i0Var, this, 4, i));
        this.f246066h = e4m.b.b(new m(i0Var, this, 3, i));
        this.i = e4m.b.b(new m(i0Var, this, 6, i));
        this.f246067j = e4m.b.b(new m(i0Var, this, 5, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f246066h.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f.get());
    }
}
