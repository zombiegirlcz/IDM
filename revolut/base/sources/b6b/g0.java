package b6b;

import com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.value_reminder.CobrandedCardsValueReminderScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes6.dex */
public final class g0 implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f12595b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f12596c;
    public CobrandedCardsValueReminderScreenContract$InputData d;
    public final Object e;

    public /* synthetic */ g0(o oVar, Object obj2, int i) {
        this.f12594a = i;
        this.f12595b = oVar;
        this.e = obj2;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f12594a) {
            case 0:
                this.f12596c = viewController;
                break;
            default:
                this.f12596c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f12594a) {
            case 0:
                vc.s.h(this.f12596c, ViewController.class);
                vc.s.h(this.d, CobrandedCardsValueReminderScreenContract$InputData.class);
                return new h0(this.f12595b, (y) this.e, this.d);
            default:
                vc.s.h(this.f12596c, ViewController.class);
                vc.s.h(this.d, CobrandedCardsValueReminderScreenContract$InputData.class);
                return new i0(this.f12595b, (w) this.e, this.d);
        }
    }
}
