package qgk;

import com.google.common.collect.ImmutableSet;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_downgrade.PlanDowngradeFlowContract$InputData;
import java.util.Collection;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class e0 implements vhk.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PlanDowngradeFlowContract$InputData f245933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i0 f245934b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e0 f245935c = this;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public e0(i0 i0Var, PlanDowngradeFlowContract$InputData planDowngradeFlowContract$InputData) {
        this.f245934b = i0Var;
        this.f245933a = planDowngradeFlowContract$InputData;
        this.d = e4m.b.b(new d0(i0Var, this, 1));
        this.e = e4m.b.b(new d0(i0Var, this, 0));
        this.f = e4m.b.b(new d0(i0Var, this, 2));
    }

    @Override // hlk.b
    public final r2 b() {
        return new r2(this.f245934b, this.f245935c, 0);
    }

    @Override // klk.b
    public final t2 c() {
        return new t2(this.f245934b, this.f245935c, 3);
    }

    @Override // xki.e
    public final Set f() {
        bmk.b planDowngradeOfferControllerModelExtension = (bmk.b) this.e.get();
        vhk.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(planDowngradeOfferControllerModelExtension, "planDowngradeOfferControllerModelExtension");
        Set setB = zhm.y0.b(planDowngradeOfferControllerModelExtension);
        vc.s.k(setB);
        return ImmutableSet.copyOf((Collection) setB);
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }

    @Override // nlk.c
    public final nlk.a q() {
        return new x2(this.f245934b, this.f245935c, 1);
    }
}
