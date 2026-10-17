package cwi;

import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.pass_list.AirportLoungesPassListContract$InputData;

/* JADX INFO: loaded from: classes10.dex */
public final class d1 implements hyi.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0 f109657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewController f109658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AirportLoungesPassListContract$InputData f109659c;

    public d1(h0 h0Var) {
        this.f109657a = h0Var;
    }

    @Override // hyi.a
    public final hyi.a Y(AirportLoungesPassListContract$InputData airportLoungesPassListContract$InputData) {
        airportLoungesPassListContract$InputData.getClass();
        this.f109659c = airportLoungesPassListContract$InputData;
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        this.f109658b = viewController;
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        vc.s.h(this.f109658b, ViewController.class);
        vc.s.h(this.f109659c, AirportLoungesPassListContract$InputData.class);
        return new c1(this.f109657a, this.f109658b, this.f109659c);
    }
}
