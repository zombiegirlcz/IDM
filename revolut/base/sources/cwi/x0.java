package cwi;

import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.home.modals.help.AirportLoungesHomeHelpScreenContract$InputData;

/* JADX INFO: loaded from: classes10.dex */
public final class x0 implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f109813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h0 f109814b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f109815c;
    public AirportLoungesHomeHelpScreenContract$InputData d;
    public final Object e;

    public /* synthetic */ x0(h0 h0Var, Object obj2, int i) {
        this.f109813a = i;
        this.f109814b = h0Var;
        this.e = obj2;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f109813a) {
            case 0:
                this.f109815c = viewController;
                break;
            default:
                this.f109815c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f109813a) {
            case 0:
                vc.s.h(this.f109815c, ViewController.class);
                vc.s.h(this.d, AirportLoungesHomeHelpScreenContract$InputData.class);
                return new y0(this.f109814b, (b0) this.e, this.f109815c, this.d);
            default:
                vc.s.h(this.f109815c, ViewController.class);
                vc.s.h(this.d, AirportLoungesHomeHelpScreenContract$InputData.class);
                return new y0(this.f109814b, (p0) this.e, this.f109815c, this.d);
        }
    }
}
