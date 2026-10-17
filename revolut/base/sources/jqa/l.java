package jqa;

import com.revolut.feature.push_to_card.impl.flows.add_card_kompot.main_info.CardOwnerMainInfoScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes5.dex */
public final class l implements dra.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f177606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewController f177607b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public CardOwnerMainInfoScreenContract$InputData f177608c;

    public l(e eVar) {
        this.f177606a = eVar;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        this.f177607b = viewController;
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        vc.s.h(this.f177607b, ViewController.class);
        vc.s.h(this.f177608c, CardOwnerMainInfoScreenContract$InputData.class);
        return new k(this.f177606a, this.f177607b, this.f177608c);
    }

    @Override // dra.a
    public final dra.a o(CardOwnerMainInfoScreenContract$InputData cardOwnerMainInfoScreenContract$InputData) {
        cardOwnerMainInfoScreenContract$InputData.getClass();
        this.f177608c = cardOwnerMainInfoScreenContract$InputData;
        return this;
    }
}
