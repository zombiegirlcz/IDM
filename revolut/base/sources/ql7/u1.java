package ql7;

import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.driver.details.AdditionalDriverDetailsScreenContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;

/* JADX INFO: loaded from: classes4.dex */
public final class u1 implements sji.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f247487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k0 f247488b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public BaseScreen f247489c;
    public AdditionalDriverDetailsScreenContract$InputData d;
    public final Object e;

    public /* synthetic */ u1(k0 k0Var, Object obj2, int i) {
        this.f247487a = i;
        this.f247488b = k0Var;
        this.e = obj2;
    }

    @Override // sji.a
    public final Object S(BaseScreen baseScreen) {
        switch (this.f247487a) {
            case 0:
                this.f247489c = baseScreen;
                break;
            default:
                this.f247489c = baseScreen;
                break;
        }
        return this;
    }

    @Override // sji.a
    /* JADX INFO: renamed from: build */
    public final sji.b mo3800build() {
        switch (this.f247487a) {
            case 0:
                vc.s.h(this.f247489c, BaseScreen.class);
                vc.s.h(this.d, AdditionalDriverDetailsScreenContract$InputData.class);
                return new w1(this.f247488b, (t0) this.e, this.f247489c, this.d);
            default:
                vc.s.h(this.f247489c, BaseScreen.class);
                vc.s.h(this.d, AdditionalDriverDetailsScreenContract$InputData.class);
                return new w1(this.f247488b, (n) this.e, this.f247489c, this.d);
        }
    }
}
