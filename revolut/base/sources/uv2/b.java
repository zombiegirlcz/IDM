package uv2;

import com.revolut.feature.card.view_pin.ui.screen.show_card_pin_screen.ShowCardPinScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import iwh.j;
import vc.s;
import xki.e;

/* JADX INFO: loaded from: classes21.dex */
public final class b implements xv2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f283296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewController f283297b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ShowCardPinScreenContract$InputData f283298c;

    public b(a aVar) {
        this.f283296a = aVar;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        this.f283297b = viewController;
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final e mo3783build() {
        s.h(this.f283297b, ViewController.class);
        s.h(this.f283298c, ShowCardPinScreenContract$InputData.class);
        return new j(this.f283296a, this.f283298c);
    }

    @Override // xv2.a
    public final xv2.a e0(ShowCardPinScreenContract$InputData showCardPinScreenContract$InputData) {
        showCardPinScreenContract$InputData.getClass();
        this.f283298c = showCardPinScreenContract$InputData;
        return this;
    }
}
