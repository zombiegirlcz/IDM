package cwi;

import com.revolut.kompot.navigable.screen.BaseScreen;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.amenities.AirportLoungesAmenitiesScreenContract$InputData;

/* JADX INFO: loaded from: classes10.dex */
public final class v0 implements sji.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f109779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h0 f109780b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public BaseScreen f109781c;
    public AirportLoungesAmenitiesScreenContract$InputData d;
    public final Object e;

    public /* synthetic */ v0(h0 h0Var, Object obj2, int i) {
        this.f109779a = i;
        this.f109780b = h0Var;
        this.e = obj2;
    }

    @Override // sji.a
    public final Object S(BaseScreen baseScreen) {
        switch (this.f109779a) {
            case 0:
                this.f109781c = baseScreen;
                break;
            default:
                this.f109781c = baseScreen;
                break;
        }
        return this;
    }

    @Override // sji.a
    /* JADX INFO: renamed from: build */
    public final sji.b mo3800build() {
        switch (this.f109779a) {
            case 0:
                vc.s.h(this.f109781c, BaseScreen.class);
                vc.s.h(this.d, AirportLoungesAmenitiesScreenContract$InputData.class);
                return new w0(this.f109780b, (f0) this.e, this.f109781c, this.d);
            default:
                vc.s.h(this.f109781c, BaseScreen.class);
                vc.s.h(this.d, AirportLoungesAmenitiesScreenContract$InputData.class);
                return new w0(this.f109780b, (p0) this.e, this.f109781c, this.d);
        }
    }
}
