package lu7;

import com.revolut.feature.insurance_embedded.impl.ui.screen.detail.EmbeddedInsuranceDetailScreenContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;

/* JADX INFO: loaded from: classes4.dex */
public final class x implements dv7.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f200188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f200189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public BaseScreen f200190c;
    public EmbeddedInsuranceDetailScreenContract$InputData d;

    public x(s sVar, i iVar) {
        this.f200188a = sVar;
        this.f200189b = iVar;
    }

    @Override // sji.a
    public final Object S(BaseScreen baseScreen) {
        this.f200190c = baseScreen;
        return this;
    }

    @Override // sji.a
    /* JADX INFO: renamed from: build */
    public final sji.b mo3800build() {
        vc.s.h(this.f200190c, BaseScreen.class);
        vc.s.h(this.d, EmbeddedInsuranceDetailScreenContract$InputData.class);
        return new y(this.f200188a, this.f200189b, this.f200190c, this.d);
    }

    @Override // dv7.a
    public final dv7.a m0(EmbeddedInsuranceDetailScreenContract$InputData embeddedInsuranceDetailScreenContract$InputData) {
        this.d = embeddedInsuranceDetailScreenContract$InputData;
        return this;
    }
}
