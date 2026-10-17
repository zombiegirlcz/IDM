package ql7;

import com.revolut.feature.insurance_car.impl.ui.screen.mta.review.MtaReviewScreenContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;

/* JADX INFO: loaded from: classes4.dex */
public final class s1 implements sji.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f247464a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k0 f247465b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public BaseScreen f247466c;
    public MtaReviewScreenContract$InputData d;
    public final Object e;

    public /* synthetic */ s1(k0 k0Var, Object obj2, int i) {
        this.f247464a = i;
        this.f247465b = k0Var;
        this.e = obj2;
    }

    @Override // sji.a
    public final Object S(BaseScreen baseScreen) {
        switch (this.f247464a) {
            case 0:
                this.f247466c = baseScreen;
                break;
            default:
                this.f247466c = baseScreen;
                break;
        }
        return this;
    }

    @Override // sji.a
    /* JADX INFO: renamed from: build */
    public final sji.b mo3800build() {
        switch (this.f247464a) {
            case 0:
                vc.s.h(this.f247466c, BaseScreen.class);
                vc.s.h(this.d, MtaReviewScreenContract$InputData.class);
                return new t1(this.f247465b, (u0) this.e, this.f247466c, this.d);
            default:
                vc.s.h(this.f247466c, BaseScreen.class);
                vc.s.h(this.d, MtaReviewScreenContract$InputData.class);
                return new t1(this.f247465b, (t0) this.e, this.f247466c, this.d);
        }
    }
}
