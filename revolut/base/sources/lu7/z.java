package lu7;

import com.revolut.feature.insurance_embedded.impl.ui.screen.detail.EmbeddedInsuranceDetailScreenContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;

/* JADX INFO: loaded from: classes4.dex */
public final class z implements dv7.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f200197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public BaseScreen f200198b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public EmbeddedInsuranceDetailScreenContract$InputData f200199c;

    public z(s sVar) {
        this.f200197a = sVar;
    }

    @Override // sji.a
    public final Object S(BaseScreen baseScreen) {
        this.f200198b = baseScreen;
        return this;
    }

    @Override // sji.a
    /* JADX INFO: renamed from: build */
    public final sji.b mo3800build() {
        vc.s.h(this.f200198b, BaseScreen.class);
        vc.s.h(this.f200199c, EmbeddedInsuranceDetailScreenContract$InputData.class);
        return new y(this.f200197a, this.f200198b, this.f200199c);
    }

    @Override // dv7.a
    public final dv7.a m0(EmbeddedInsuranceDetailScreenContract$InputData embeddedInsuranceDetailScreenContract$InputData) {
        this.f200199c = embeddedInsuranceDetailScreenContract$InputData;
        return this;
    }
}
