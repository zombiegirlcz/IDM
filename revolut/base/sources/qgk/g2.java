package qgk;

import com.google.common.collect.ImmutableSet;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_billing_picker.PlanBillingPickerContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class g2 implements qhk.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qhk.d f245969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PlanBillingPickerContract$InputData f245970b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i0 f245971c;
    public final k0 d;
    public final g2 e = this;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f245972g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f245973h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f245974j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f245975l;

    public g2(i0 i0Var, k0 k0Var, qhk.d dVar, PlanBillingPickerContract$InputData planBillingPickerContract$InputData) {
        this.f245971c = i0Var;
        this.d = k0Var;
        this.f245969a = dVar;
        this.f245970b = planBillingPickerContract$InputData;
        int i = 9;
        this.f = e4m.b.b(new p1(i0Var, this, 2, i));
        this.f245972g = e4m.b.b(new p1(i0Var, this, 3, i));
        this.f245973h = e4m.b.b(new p1(i0Var, this, 4, i));
        this.i = e4m.b.b(new p1(i0Var, this, 1, i));
        this.f245974j = e4m.b.b(new p1(i0Var, this, 0, i));
        this.k = e4m.b.b(new p1(i0Var, this, 5, i));
        this.f245975l = e4m.b.b(new p1(i0Var, this, 6, i));
    }

    @Override // qhk.b
    public final phk.h e() {
        return (phk.h) this.f245975l.get();
    }

    @Override // xki.e
    public final Set f() {
        ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(3);
        builderBuilderWithExpectedSize.add(this.d.d.get());
        builderBuilderWithExpectedSize.addAll((Iterable) this.f245974j.get());
        return j6.a.g(this.k, builderBuilderWithExpectedSize);
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }

    @Override // qhk.b
    public final alk.a l() {
        return new p2(this.f245971c, this.d, this.e);
    }
}
