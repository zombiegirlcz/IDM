package dw3;

import com.revolut.feature.credit.autopay.ui.screen.select_autopay_method.SelectAutopayMethodContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;

/* JADX INFO: loaded from: classes22.dex */
public final class z5 implements sji.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f120299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public BaseScreen f120300b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SelectAutopayMethodContract$InputData f120301c;
    public final Object d;
    public final Object e;

    public /* synthetic */ z5(Object obj2, Object obj3, int i) {
        this.f120299a = i;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // sji.a
    public final Object S(BaseScreen baseScreen) {
        switch (this.f120299a) {
            case 0:
                this.f120300b = baseScreen;
                break;
            case 1:
                this.f120300b = baseScreen;
                break;
            default:
                this.f120300b = baseScreen;
                break;
        }
        return this;
    }

    @Override // sji.a
    /* JADX INFO: renamed from: build */
    public final sji.b mo3800build() {
        switch (this.f120299a) {
            case 0:
                vc.s.h(this.f120300b, BaseScreen.class);
                vc.s.h(this.f120301c, SelectAutopayMethodContract$InputData.class);
                return new a6((c1) this.d, (d1) this.e, this.f120301c);
            case 1:
                vc.s.h(this.f120300b, BaseScreen.class);
                vc.s.h(this.f120301c, SelectAutopayMethodContract$InputData.class);
                return new a6((jm4.a3) this.d, (jm4.j0) this.e, this.f120301c);
            default:
                vc.s.h(this.f120300b, BaseScreen.class);
                vc.s.h(this.f120301c, SelectAutopayMethodContract$InputData.class);
                return new a6((u45.h) this.d, (u45.i) this.e, this.f120301c);
        }
    }
}
