package qgk;

import com.google.common.collect.ImmutableSet;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_selection.switch_to_individual.SwitchToIndividualPromptControllerModelExtension;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class e2 implements khk.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jhk.c f245939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i0 f245940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z f245941c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f245942g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f245943h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f245944j;
    public final e4m.e k;

    public e2(i0 i0Var, z zVar, jhk.c cVar) {
        this.f245940b = i0Var;
        this.f245941c = zVar;
        this.f245939a = cVar;
        int i = 8;
        this.d = e4m.b.b(new p1(i0Var, this, 0, i));
        this.e = e4m.b.b(new p1(i0Var, this, 1, i));
        this.f = e4m.b.b(new p1(i0Var, this, 2, i));
        this.f245942g = e4m.b.b(new p1(i0Var, this, 3, i));
        this.f245943h = e4m.b.b(new p1(i0Var, this, 4, i));
        this.i = e4m.b.b(new p1(i0Var, this, 5, i));
        this.f245944j = e4m.g.a(new p1(i0Var, this, 7, i));
        this.k = e4m.b.b(new p1(i0Var, this, 6, i));
    }

    @Override // khk.a
    public final jhk.b e() {
        return (jhk.b) this.k.get();
    }

    @Override // xki.e
    public final Set f() {
        ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(2);
        builderBuilderWithExpectedSize.addAll((Iterable) this.f245941c.f246348j.get());
        builderBuilderWithExpectedSize.addAll((Iterable) khk.d.a((phk.k) this.d.get(), (bgk.a) this.e.get(), (SwitchToIndividualPromptControllerModelExtension) this.f.get(), (wmk.b) this.f245942g.get(), (aok.a) this.f245943h.get(), (wfk.a) this.i.get()));
        return builderBuilderWithExpectedSize.build();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
