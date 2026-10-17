package jqa;

import com.revolut.feature.push_to_card.impl.flows.add_card_kompot.main_info.CardOwnerMainInfoScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes5.dex */
public final class j implements dra.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f177597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f177598b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f177599c;
    public CardOwnerMainInfoScreenContract$InputData d;

    public j(e eVar, b bVar) {
        this.f177597a = eVar;
        this.f177598b = bVar;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        this.f177599c = viewController;
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        vc.s.h(this.f177599c, ViewController.class);
        vc.s.h(this.d, CardOwnerMainInfoScreenContract$InputData.class);
        return new k(this.f177597a, this.f177598b, this.f177599c, this.d);
    }

    @Override // dra.a
    public final dra.a o(CardOwnerMainInfoScreenContract$InputData cardOwnerMainInfoScreenContract$InputData) {
        cardOwnerMainInfoScreenContract$InputData.getClass();
        this.d = cardOwnerMainInfoScreenContract$InputData;
        return this;
    }
}
