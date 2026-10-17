package qgk;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.feedback.PlanCancelFeedbackScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class v implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PlanCancelFeedbackScreenContract$InputData f246280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i0 f246281b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x f246282c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f246283g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f246284h;

    public v(i0 i0Var, x xVar, ViewController viewController, PlanCancelFeedbackScreenContract$InputData planCancelFeedbackScreenContract$InputData) {
        this.f246281b = i0Var;
        this.f246282c = xVar;
        this.f246280a = planCancelFeedbackScreenContract$InputData;
        this.d = e4m.b.b(e4m.c.a(viewController));
        int i = 4;
        this.e = e4m.b.b(new m(i0Var, this, 1, i));
        this.f = e4m.b.b(new m(i0Var, this, 0, i));
        this.f246283g = e4m.b.b(new m(i0Var, this, 3, i));
        this.f246284h = e4m.b.b(new m(i0Var, this, 2, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f246282c.f246318m.get(), (yji.d) this.f.get());
    }
}
