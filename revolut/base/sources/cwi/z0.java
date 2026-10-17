package cwi;

import com.revolut.kompot.navigable.screen.BaseScreen;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.lounge_details.AirportLoungeDetailsScreenContract$InputData;

/* JADX INFO: loaded from: classes10.dex */
public final class z0 implements sji.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f109826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h0 f109827b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public BaseScreen f109828c;
    public AirportLoungeDetailsScreenContract$InputData d;
    public final Object e;

    public /* synthetic */ z0(h0 h0Var, Object obj2, int i) {
        this.f109826a = i;
        this.f109827b = h0Var;
        this.e = obj2;
    }

    @Override // sji.a
    public final Object S(BaseScreen baseScreen) {
        switch (this.f109826a) {
            case 0:
                this.f109828c = baseScreen;
                break;
            default:
                this.f109828c = baseScreen;
                break;
        }
        return this;
    }

    @Override // sji.a
    /* JADX INFO: renamed from: build */
    public final sji.b mo3800build() {
        switch (this.f109826a) {
            case 0:
                vc.s.h(this.f109828c, BaseScreen.class);
                vc.s.h(this.d, AirportLoungeDetailsScreenContract$InputData.class);
                return new a1(this.f109827b, (f0) this.e, this.f109828c, this.d);
            default:
                vc.s.h(this.f109828c, BaseScreen.class);
                vc.s.h(this.d, AirportLoungeDetailsScreenContract$InputData.class);
                return new a1(this.f109827b, (p0) this.e, this.f109828c, this.d);
        }
    }
}
