package lu7;

import com.revolut.feature.insurance_embedded.impl.ui.screen.help.EmbeddedInsuranceGetHelpScreenContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;

/* JADX INFO: loaded from: classes4.dex */
public final class l0 implements zv7.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f200134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public BaseScreen f200135b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public EmbeddedInsuranceGetHelpScreenContract$InputData f200136c;

    public l0(s sVar) {
        this.f200134a = sVar;
    }

    @Override // zv7.a
    public final zv7.a J(EmbeddedInsuranceGetHelpScreenContract$InputData embeddedInsuranceGetHelpScreenContract$InputData) {
        this.f200136c = embeddedInsuranceGetHelpScreenContract$InputData;
        return this;
    }

    @Override // sji.a
    public final Object S(BaseScreen baseScreen) {
        this.f200135b = baseScreen;
        return this;
    }

    @Override // sji.a
    /* JADX INFO: renamed from: build */
    public final sji.b mo3800build() {
        vc.s.h(this.f200135b, BaseScreen.class);
        vc.s.h(this.f200136c, EmbeddedInsuranceGetHelpScreenContract$InputData.class);
        return new k0(this.f200134a, this.f200135b, this.f200136c);
    }
}
