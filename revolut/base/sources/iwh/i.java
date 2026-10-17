package iwh;

import com.revolut.feature.card.view_pin.ui.screen.show_card_pin_screen.ShowCardPinScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import vc.s;

/* JADX INFO: loaded from: classes10.dex */
public final class i implements xv2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f169105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f169106b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f169107c;
    public ShowCardPinScreenContract$InputData d;

    public i(c cVar, e eVar) {
        this.f169105a = cVar;
        this.f169106b = eVar;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        this.f169107c = viewController;
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        s.h(this.f169107c, ViewController.class);
        s.h(this.d, ShowCardPinScreenContract$InputData.class);
        return new j(this.f169105a, this.f169106b, this.d);
    }

    @Override // xv2.a
    public final xv2.a e0(ShowCardPinScreenContract$InputData showCardPinScreenContract$InputData) {
        showCardPinScreenContract$InputData.getClass();
        this.d = showCardPinScreenContract$InputData;
        return this;
    }
}
