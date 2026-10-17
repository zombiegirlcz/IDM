package ql7;

import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.eligibility.EligibilityScreenContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;

/* JADX INFO: loaded from: classes4.dex */
public final class x1 implements sji.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f247524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k0 f247525b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public BaseScreen f247526c;
    public EligibilityScreenContract$InputData d;
    public final Object e;

    public /* synthetic */ x1(k0 k0Var, Object obj2, int i) {
        this.f247524a = i;
        this.f247525b = k0Var;
        this.e = obj2;
    }

    @Override // sji.a
    public final Object S(BaseScreen baseScreen) {
        switch (this.f247524a) {
            case 0:
                this.f247526c = baseScreen;
                break;
            default:
                this.f247526c = baseScreen;
                break;
        }
        return this;
    }

    @Override // sji.a
    /* JADX INFO: renamed from: build */
    public final sji.b mo3800build() {
        switch (this.f247524a) {
            case 0:
                vc.s.h(this.f247526c, BaseScreen.class);
                vc.s.h(this.d, EligibilityScreenContract$InputData.class);
                return new y1(this.f247525b, (t0) this.e, this.f247526c, this.d);
            default:
                vc.s.h(this.f247526c, BaseScreen.class);
                vc.s.h(this.d, EligibilityScreenContract$InputData.class);
                return new y1(this.f247525b, (n) this.e, this.f247526c, this.d);
        }
    }
}
