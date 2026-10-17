package b6b;

import com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.value_reminder.modal.confirmation.CobrandedCardsDowngradeConfirmationScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes6.dex */
public final class j0 implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f12626b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f12627c;
    public CobrandedCardsDowngradeConfirmationScreenContract$InputData d;
    public final Object e;

    public /* synthetic */ j0(o oVar, Object obj2, int i) {
        this.f12625a = i;
        this.f12626b = oVar;
        this.e = obj2;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f12625a) {
            case 0:
                this.f12627c = viewController;
                break;
            default:
                this.f12627c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f12625a) {
            case 0:
                vc.s.h(this.f12627c, ViewController.class);
                vc.s.h(this.d, CobrandedCardsDowngradeConfirmationScreenContract$InputData.class);
                return new k0(this.f12626b, (y) this.e, this.d);
            default:
                vc.s.h(this.f12627c, ViewController.class);
                vc.s.h(this.d, CobrandedCardsDowngradeConfirmationScreenContract$InputData.class);
                return new l0(this.f12626b, (w) this.e, this.d);
        }
    }
}
