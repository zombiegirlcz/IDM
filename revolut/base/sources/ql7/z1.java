package ql7;

import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.survey.binary_questions.BinaryQuestionsScreenContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;

/* JADX INFO: loaded from: classes4.dex */
public final class z1 implements sji.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f247550a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k0 f247551b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public BaseScreen f247552c;
    public BinaryQuestionsScreenContract$InputData d;
    public final Object e;

    public /* synthetic */ z1(k0 k0Var, Object obj2, int i) {
        this.f247550a = i;
        this.f247551b = k0Var;
        this.e = obj2;
    }

    @Override // sji.a
    public final Object S(BaseScreen baseScreen) {
        switch (this.f247550a) {
            case 0:
                this.f247552c = baseScreen;
                break;
            default:
                this.f247552c = baseScreen;
                break;
        }
        return this;
    }

    @Override // sji.a
    /* JADX INFO: renamed from: build */
    public final sji.b mo3800build() {
        switch (this.f247550a) {
            case 0:
                vc.s.h(this.f247552c, BaseScreen.class);
                vc.s.h(this.d, BinaryQuestionsScreenContract$InputData.class);
                return new a2(this.f247551b, (q) this.e, this.d);
            default:
                vc.s.h(this.f247552c, BaseScreen.class);
                vc.s.h(this.d, BinaryQuestionsScreenContract$InputData.class);
                return new a2(this.f247551b, (y0) this.e, this.d);
        }
    }
}
