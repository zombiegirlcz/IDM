package qgk;

import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_offer_reminder.PlanDowngradeOfferReminderScreenContract$InputData;

/* JADX INFO: loaded from: classes11.dex */
public final class q2 implements xmk.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i0 f246206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewController f246207b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public PlanDowngradeOfferReminderScreenContract$InputData f246208c;

    public q2(i0 i0Var) {
        this.f246206a = i0Var;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        this.f246207b = viewController;
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        vc.s.h(this.f246207b, ViewController.class);
        vc.s.h(this.f246208c, PlanDowngradeOfferReminderScreenContract$InputData.class);
        return new m2(this.f246206a, this.f246208c);
    }

    @Override // xmk.a
    public final xmk.a e(PlanDowngradeOfferReminderScreenContract$InputData planDowngradeOfferReminderScreenContract$InputData) {
        planDowngradeOfferReminderScreenContract$InputData.getClass();
        this.f246208c = planDowngradeOfferReminderScreenContract$InputData;
        return this;
    }
}
