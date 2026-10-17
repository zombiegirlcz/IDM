package qgk;

import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_offer_reminder.PlanDowngradeOfferReminderScreenContract$InputData;

/* JADX INFO: loaded from: classes11.dex */
public final class l2 implements xmk.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i0 f246104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p0 f246105b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f246106c;
    public PlanDowngradeOfferReminderScreenContract$InputData d;

    public l2(i0 i0Var, p0 p0Var) {
        this.f246104a = i0Var;
        this.f246105b = p0Var;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        this.f246106c = viewController;
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        vc.s.h(this.f246106c, ViewController.class);
        vc.s.h(this.d, PlanDowngradeOfferReminderScreenContract$InputData.class);
        return new m2(this.f246104a, this.f246105b, this.d);
    }

    @Override // xmk.a
    public final xmk.a e(PlanDowngradeOfferReminderScreenContract$InputData planDowngradeOfferReminderScreenContract$InputData) {
        planDowngradeOfferReminderScreenContract$InputData.getClass();
        this.d = planDowngradeOfferReminderScreenContract$InputData;
        return this;
    }
}
