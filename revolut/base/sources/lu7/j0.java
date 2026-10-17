package lu7;

import com.revolut.feature.insurance_embedded.impl.ui.screen.help.EmbeddedInsuranceGetHelpScreenContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;

/* JADX INFO: loaded from: classes4.dex */
public final class j0 implements zv7.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f200120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f200121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public BaseScreen f200122c;
    public EmbeddedInsuranceGetHelpScreenContract$InputData d;

    public j0(s sVar, i iVar) {
        this.f200120a = sVar;
        this.f200121b = iVar;
    }

    @Override // zv7.a
    public final zv7.a J(EmbeddedInsuranceGetHelpScreenContract$InputData embeddedInsuranceGetHelpScreenContract$InputData) {
        this.d = embeddedInsuranceGetHelpScreenContract$InputData;
        return this;
    }

    @Override // sji.a
    public final Object S(BaseScreen baseScreen) {
        this.f200122c = baseScreen;
        return this;
    }

    @Override // sji.a
    /* JADX INFO: renamed from: build */
    public final sji.b mo3800build() {
        vc.s.h(this.f200122c, BaseScreen.class);
        vc.s.h(this.d, EmbeddedInsuranceGetHelpScreenContract$InputData.class);
        return new k0(this.f200120a, this.f200121b, this.f200122c, this.d);
    }
}
