package ql7;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.insurance_car.impl.ui.screen.policy.details.PolicyDetailsScreenContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class b1 implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PolicyDetailsScreenContract$InputData f247240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k0 f247241b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f247242c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f247243g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f247244h;
    public final e4m.e i;

    public b1(k0 k0Var, o oVar, BaseScreen baseScreen, PolicyDetailsScreenContract$InputData policyDetailsScreenContract$InputData) {
        this.f247241b = k0Var;
        this.f247242c = oVar;
        this.f247240a = policyDetailsScreenContract$InputData;
        this.d = e4m.b.b(e4m.c.a(baseScreen));
        int i = 20;
        this.e = e4m.b.b(new l(k0Var, this, 2, i));
        this.f = e4m.b.b(new l(k0Var, this, 1, i));
        this.f247243g = e4m.b.b(new l(k0Var, this, 0, i));
        this.f247244h = e4m.b.b(new l(k0Var, this, 4, i));
        this.i = e4m.b.b(new l(k0Var, this, 3, i));
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f247243g.get());
    }
}
