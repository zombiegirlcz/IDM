package qgk;

import com.google.common.collect.ImmutableSet;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.be_driven.PricingPlanBEDrivenScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class n1 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nkd.b f246159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mkd.g f246160b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PricingPlanBEDrivenScreenContract$InputData f246161c;
    public final i0 d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f246162g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f246163h;
    public final e4m.e i;

    public n1(i0 i0Var, PricingPlanBEDrivenScreenContract$InputData pricingPlanBEDrivenScreenContract$InputData, nkd.b bVar, mkd.g gVar) {
        this.d = i0Var;
        this.f246159a = bVar;
        this.f246160b = gVar;
        this.f246161c = pricingPlanBEDrivenScreenContract$InputData;
        this.e = e4m.b.b(new m(i0Var, this, 1, 28));
        this.f = e4m.b.b(new m(i0Var, this, 0, 28));
        this.f246162g = e4m.b.b(new m(i0Var, this, 2, 28));
        this.f246163h = e4m.b.b(new m(i0Var, this, 4, 28));
        this.i = e4m.b.b(new m(i0Var, this, 3, 28));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f.get(), (yji.n) this.f246162g.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
