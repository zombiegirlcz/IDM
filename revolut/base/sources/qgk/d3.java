package qgk;

import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.value_offer_reminder.PlanValueOfferReminderScreenContract$InputData;

/* JADX INFO: loaded from: classes11.dex */
public final class d3 implements bok.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i0 f245924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewController f245925b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public PlanValueOfferReminderScreenContract$InputData f245926c;

    public d3(i0 i0Var) {
        this.f245924a = i0Var;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        this.f245925b = viewController;
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        vc.s.h(this.f245925b, ViewController.class);
        vc.s.h(this.f245926c, PlanValueOfferReminderScreenContract$InputData.class);
        return new c3(this.f245924a, this.f245926c);
    }

    @Override // bok.a
    public final bok.a n0(PlanValueOfferReminderScreenContract$InputData planValueOfferReminderScreenContract$InputData) {
        planValueOfferReminderScreenContract$InputData.getClass();
        this.f245926c = planValueOfferReminderScreenContract$InputData;
        return this;
    }
}
