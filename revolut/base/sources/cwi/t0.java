package cwi;

import com.revolut.kompot.navigable.screen.BaseScreen;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.airport_details.AirportDetailsScreenContract$InputData;

/* JADX INFO: loaded from: classes10.dex */
public final class t0 implements sji.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f109771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h0 f109772b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public BaseScreen f109773c;
    public AirportDetailsScreenContract$InputData d;
    public final Object e;

    public /* synthetic */ t0(h0 h0Var, Object obj2, int i) {
        this.f109771a = i;
        this.f109772b = h0Var;
        this.e = obj2;
    }

    @Override // sji.a
    public final Object S(BaseScreen baseScreen) {
        switch (this.f109771a) {
            case 0:
                this.f109773c = baseScreen;
                break;
            default:
                this.f109773c = baseScreen;
                break;
        }
        return this;
    }

    @Override // sji.a
    /* JADX INFO: renamed from: build */
    public final sji.b mo3800build() {
        switch (this.f109771a) {
            case 0:
                vc.s.h(this.f109773c, BaseScreen.class);
                vc.s.h(this.d, AirportDetailsScreenContract$InputData.class);
                return new u0(this.f109772b, (f0) this.e, this.f109773c, this.d);
            default:
                vc.s.h(this.f109773c, BaseScreen.class);
                vc.s.h(this.d, AirportDetailsScreenContract$InputData.class);
                return new u0(this.f109772b, (p0) this.e, this.f109773c, this.d);
        }
    }
}
