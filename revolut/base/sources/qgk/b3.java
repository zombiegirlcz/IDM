package qgk;

import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.value_offer_reminder.PlanValueOfferReminderScreenContract$InputData;

/* JADX INFO: loaded from: classes11.dex */
public final class b3 implements bok.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i0 f245894a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p0 f245895b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f245896c;
    public PlanValueOfferReminderScreenContract$InputData d;

    public b3(i0 i0Var, p0 p0Var) {
        this.f245894a = i0Var;
        this.f245895b = p0Var;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        this.f245896c = viewController;
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        vc.s.h(this.f245896c, ViewController.class);
        vc.s.h(this.d, PlanValueOfferReminderScreenContract$InputData.class);
        return new c3(this.f245894a, this.f245895b, this.d);
    }

    @Override // bok.a
    public final bok.a n0(PlanValueOfferReminderScreenContract$InputData planValueOfferReminderScreenContract$InputData) {
        planValueOfferReminderScreenContract$InputData.getClass();
        this.d = planValueOfferReminderScreenContract$InputData;
        return this;
    }
}
