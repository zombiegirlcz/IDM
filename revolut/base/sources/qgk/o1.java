package qgk;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.be_driven.dialog.PricingPlanBottomSheetBEDrivenScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class o1 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nkd.b f246174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mkd.g f246175b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PricingPlanBottomSheetBEDrivenScreenContract$InputData f246176c;
    public final ViewController d;
    public final i0 e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f246177g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f246178h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f246179j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f246180l;

    public o1(i0 i0Var, ViewController viewController, PricingPlanBottomSheetBEDrivenScreenContract$InputData pricingPlanBottomSheetBEDrivenScreenContract$InputData, nkd.b bVar, mkd.g gVar) {
        this.e = i0Var;
        this.f246174a = bVar;
        this.f246175b = gVar;
        this.f246176c = pricingPlanBottomSheetBEDrivenScreenContract$InputData;
        this.d = viewController;
        int i = 29;
        this.f = e4m.b.b(new m(i0Var, this, 1, i));
        this.f246177g = e4m.b.b(new m(i0Var, this, 0, i));
        this.f246178h = e4m.b.b(new m(i0Var, this, 2, i));
        this.i = e4m.b.b(new m(i0Var, this, 4, i));
        this.f246179j = e4m.b.b(new m(i0Var, this, 6, i));
        this.k = e4m.b.b(new m(i0Var, this, 5, i));
        this.f246180l = e4m.b.b(new m(i0Var, this, 3, i));
    }

    public final dnk.l b() {
        return new dnk.l(this.e.e.g(), 0);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f246177g.get(), (yji.n) this.f246178h.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
