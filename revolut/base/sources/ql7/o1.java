package ql7;

import com.revolut.feature.insurance_car.impl.ui.screen.common.benefit_details.BenefitDetailsScreenContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;

/* JADX INFO: loaded from: classes4.dex */
public final class o1 implements sji.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f247416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k0 f247417b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public BaseScreen f247418c;
    public BenefitDetailsScreenContract$InputData d;
    public final Object e;

    public /* synthetic */ o1(k0 k0Var, Object obj2, int i) {
        this.f247416a = i;
        this.f247417b = k0Var;
        this.e = obj2;
    }

    @Override // sji.a
    public final Object S(BaseScreen baseScreen) {
        switch (this.f247416a) {
            case 0:
                this.f247418c = baseScreen;
                break;
            default:
                this.f247418c = baseScreen;
                break;
        }
        return this;
    }

    @Override // sji.a
    /* JADX INFO: renamed from: build */
    public final sji.b mo3800build() {
        switch (this.f247416a) {
            case 0:
                vc.s.h(this.f247418c, BaseScreen.class);
                vc.s.h(this.d, BenefitDetailsScreenContract$InputData.class);
                return new p1(this.f247417b, (o) this.e, this.d);
            default:
                vc.s.h(this.f247418c, BaseScreen.class);
                vc.s.h(this.d, BenefitDetailsScreenContract$InputData.class);
                return new p1(this.f247417b, (n) this.e, this.d);
        }
    }
}
