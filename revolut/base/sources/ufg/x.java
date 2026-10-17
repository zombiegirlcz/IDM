package ufg;

import com.revolut.feature.travel.miles.impl.ui.screen.account_registration.TravelMilesAccountRegistrationScreenContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;

/* JADX INFO: loaded from: classes9.dex */
public final class x implements sji.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f279802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f279803b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public BaseScreen f279804c;
    public TravelMilesAccountRegistrationScreenContract$InputData d;
    public final Object e;

    public /* synthetic */ x(g gVar, Object obj2, int i) {
        this.f279802a = i;
        this.f279803b = gVar;
        this.e = obj2;
    }

    @Override // sji.a
    public final Object S(BaseScreen baseScreen) {
        switch (this.f279802a) {
            case 0:
                this.f279804c = baseScreen;
                break;
            default:
                this.f279804c = baseScreen;
                break;
        }
        return this;
    }

    @Override // sji.a
    /* JADX INFO: renamed from: build */
    public final sji.b mo3800build() {
        switch (this.f279802a) {
            case 0:
                vc.s.h(this.f279804c, BaseScreen.class);
                vc.s.h(this.d, TravelMilesAccountRegistrationScreenContract$InputData.class);
                return new y(this.f279803b, (t) this.e, this.d);
            default:
                vc.s.h(this.f279804c, BaseScreen.class);
                vc.s.h(this.d, TravelMilesAccountRegistrationScreenContract$InputData.class);
                return new y(this.f279803b, (b) this.e, this.d);
        }
    }
}
