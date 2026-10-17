package b6b;

import com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.card_type.CobrandedCardsTypeSelectionScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes6.dex */
public final class b0 implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f12568b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f12569c;
    public CobrandedCardsTypeSelectionScreenContract$InputData d;
    public final Object e;

    public /* synthetic */ b0(o oVar, Object obj2, int i) {
        this.f12567a = i;
        this.f12568b = oVar;
        this.e = obj2;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f12567a) {
            case 0:
                this.f12569c = viewController;
                break;
            case 1:
                this.f12569c = viewController;
                break;
            default:
                this.f12569c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f12567a) {
            case 0:
                vc.s.h(this.f12569c, ViewController.class);
                vc.s.h(this.d, CobrandedCardsTypeSelectionScreenContract$InputData.class);
                return new c0(this.f12568b, (w) this.e, this.d);
            case 1:
                vc.s.h(this.f12569c, ViewController.class);
                vc.s.h(this.d, CobrandedCardsTypeSelectionScreenContract$InputData.class);
                return new d0(this.f12568b, (p) this.e, this.d);
            default:
                vc.s.h(this.f12569c, ViewController.class);
                vc.s.h(this.d, CobrandedCardsTypeSelectionScreenContract$InputData.class);
                return new c0(this.f12568b, (x) this.e, this.d);
        }
    }
}
