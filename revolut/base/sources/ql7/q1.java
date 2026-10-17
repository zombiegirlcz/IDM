package ql7;

import com.revolut.feature.insurance_car.impl.ui.screen.mta.decline.MtaDeclineScreenContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;

/* JADX INFO: loaded from: classes4.dex */
public final class q1 implements sji.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f247440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k0 f247441b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public BaseScreen f247442c;
    public MtaDeclineScreenContract$InputData d;
    public final Object e;

    public /* synthetic */ q1(k0 k0Var, Object obj2, int i) {
        this.f247440a = i;
        this.f247441b = k0Var;
        this.e = obj2;
    }

    @Override // sji.a
    public final Object S(BaseScreen baseScreen) {
        switch (this.f247440a) {
            case 0:
                this.f247442c = baseScreen;
                break;
            default:
                this.f247442c = baseScreen;
                break;
        }
        return this;
    }

    @Override // sji.a
    /* JADX INFO: renamed from: build */
    public final sji.b mo3800build() {
        switch (this.f247440a) {
            case 0:
                vc.s.h(this.f247442c, BaseScreen.class);
                vc.s.h(this.d, MtaDeclineScreenContract$InputData.class);
                return new r1(this.f247441b, (u0) this.e, this.d);
            default:
                vc.s.h(this.f247442c, BaseScreen.class);
                vc.s.h(this.d, MtaDeclineScreenContract$InputData.class);
                return new r1(this.f247441b, (t0) this.e, this.d);
        }
    }
}
