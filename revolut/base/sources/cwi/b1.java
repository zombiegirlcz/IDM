package cwi;

import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.pass_list.AirportLoungesPassListContract$InputData;

/* JADX INFO: loaded from: classes10.dex */
public final class b1 implements hyi.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f109640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h0 f109641b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f109642c;
    public AirportLoungesPassListContract$InputData d;
    public final Object e;

    public /* synthetic */ b1(h0 h0Var, Object obj2, int i) {
        this.f109640a = i;
        this.f109641b = h0Var;
        this.e = obj2;
    }

    @Override // hyi.a
    public final hyi.a Y(AirportLoungesPassListContract$InputData airportLoungesPassListContract$InputData) {
        switch (this.f109640a) {
            case 0:
                airportLoungesPassListContract$InputData.getClass();
                this.d = airportLoungesPassListContract$InputData;
                break;
            case 1:
                airportLoungesPassListContract$InputData.getClass();
                this.d = airportLoungesPassListContract$InputData;
                break;
            default:
                airportLoungesPassListContract$InputData.getClass();
                this.d = airportLoungesPassListContract$InputData;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f109640a) {
            case 0:
                this.f109642c = viewController;
                break;
            case 1:
                this.f109642c = viewController;
                break;
            default:
                this.f109642c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f109640a) {
            case 0:
                vc.s.h(this.f109642c, ViewController.class);
                vc.s.h(this.d, AirportLoungesPassListContract$InputData.class);
                return new c1(this.f109641b, (p0) this.e, this.f109642c, this.d);
            case 1:
                vc.s.h(this.f109642c, ViewController.class);
                vc.s.h(this.d, AirportLoungesPassListContract$InputData.class);
                return new c1(this.f109641b, (b0) this.e, this.f109642c, this.d);
            default:
                vc.s.h(this.f109642c, ViewController.class);
                vc.s.h(this.d, AirportLoungesPassListContract$InputData.class);
                return new c1(this.f109641b, (f0) this.e, this.f109642c, this.d);
        }
    }
}
