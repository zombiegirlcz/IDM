package qgk;

import com.google.common.collect.ImmutableSet;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_billing_picker.PlanBillingPickerContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class i2 implements qhk.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qhk.d f246029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PlanBillingPickerContract$InputData f246030b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i0 f246031c;
    public final i2 d = this;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f246032g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f246033h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f246034j;
    public final e4m.e k;

    public i2(i0 i0Var, qhk.d dVar, PlanBillingPickerContract$InputData planBillingPickerContract$InputData) {
        this.f246031c = i0Var;
        this.f246029a = dVar;
        this.f246030b = planBillingPickerContract$InputData;
        int i = 10;
        this.e = e4m.b.b(new p1(i0Var, this, 2, i));
        this.f = e4m.b.b(new p1(i0Var, this, 3, i));
        this.f246032g = e4m.b.b(new p1(i0Var, this, 4, i));
        this.f246033h = e4m.b.b(new p1(i0Var, this, 1, i));
        this.i = e4m.b.b(new p1(i0Var, this, 0, i));
        this.f246034j = e4m.b.b(new p1(i0Var, this, 5, i));
        this.k = e4m.b.b(new p1(i0Var, this, 6, i));
    }

    @Override // qhk.b
    public final phk.h e() {
        return (phk.h) this.k.get();
    }

    @Override // xki.e
    public final Set f() {
        ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(2);
        builderBuilderWithExpectedSize.addAll((Iterable) this.i.get());
        return j6.a.g(this.f246034j, builderBuilderWithExpectedSize);
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }

    @Override // qhk.b
    public final alk.a l() {
        return new j2(this.f246031c, this.d);
    }
}
