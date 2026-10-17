package b6b;

import com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.card_selection.CobrandedCardsSelectionScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes6.dex */
public final class z implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f12704b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f12705c;
    public CobrandedCardsSelectionScreenContract$InputData d;
    public final Object e;

    public /* synthetic */ z(o oVar, Object obj2, int i) {
        this.f12703a = i;
        this.f12704b = oVar;
        this.e = obj2;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f12703a) {
            case 0:
                this.f12705c = viewController;
                break;
            default:
                this.f12705c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f12703a) {
            case 0:
                vc.s.h(this.f12705c, ViewController.class);
                vc.s.h(this.d, CobrandedCardsSelectionScreenContract$InputData.class);
                return new a0(this.f12704b, (w) this.e, this.f12705c, this.d);
            default:
                vc.s.h(this.f12705c, ViewController.class);
                vc.s.h(this.d, CobrandedCardsSelectionScreenContract$InputData.class);
                return new a0(this.f12704b, (x) this.e, this.f12705c, this.d);
        }
    }
}
