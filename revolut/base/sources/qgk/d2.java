package qgk;

import com.google.common.collect.ImmutableSet;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_selection.switch_to_individual.SwitchToIndividualPromptControllerModelExtension;
import java.util.Collection;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class d2 implements khk.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jhk.c f245918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i0 f245919b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f245920c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f245921g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f245922h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f245923j;

    public d2(i0 i0Var, g1 g1Var, jhk.c cVar) {
        this.f245919b = i0Var;
        this.f245918a = cVar;
        int i = 7;
        this.f245920c = e4m.b.b(new p1(i0Var, this, 0, i));
        this.d = e4m.b.b(new p1(i0Var, this, 1, i));
        this.e = e4m.b.b(new p1(i0Var, this, 2, i));
        this.f = e4m.b.b(new p1(i0Var, this, 3, i));
        this.f245921g = e4m.b.b(new p1(i0Var, this, 4, i));
        this.f245922h = e4m.b.b(new p1(i0Var, this, 5, i));
        this.i = e4m.g.a(new p1(i0Var, this, 7, i));
        this.f245923j = e4m.b.b(new p1(i0Var, this, 6, i));
    }

    @Override // khk.a
    public final jhk.b e() {
        return (jhk.b) this.f245923j.get();
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.copyOf((Collection) khk.d.a((phk.k) this.f245920c.get(), (bgk.a) this.d.get(), (SwitchToIndividualPromptControllerModelExtension) this.e.get(), (wmk.b) this.f.get(), (aok.a) this.f245921g.get(), (wfk.a) this.f245922h.get()));
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
