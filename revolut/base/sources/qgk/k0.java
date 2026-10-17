package qgk;

import com.google.common.collect.ImmutableSet;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_gift_sending.PlanGiftSendingFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class k0 implements qhk.c, xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PlanGiftSendingFlowContract$InputData f246076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i0 f246077b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k0 f246078c = this;
    public final e4m.e d;
    public final e4m.e e;

    public k0(i0 i0Var, PlanGiftSendingFlowContract$InputData planGiftSendingFlowContract$InputData) {
        this.f246077b = i0Var;
        this.f246076a = planGiftSendingFlowContract$InputData;
        int i = 11;
        this.d = e4m.b.b(new m(i0Var, this, 0, i));
        this.e = e4m.b.b(new m(i0Var, this, 1, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.d.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }

    @Override // qhk.c
    public final qhk.a l() {
        return new f2(this.f246077b, this.f246078c);
    }
}
