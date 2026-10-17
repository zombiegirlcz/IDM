package lu7;

import com.revolut.feature.insurance_embedded.impl.ui.screen.document.details.AllPolicyDocumentsScreenContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;

/* JADX INFO: loaded from: classes4.dex */
public final class a0 implements fv7.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f200062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f200063b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public BaseScreen f200064c;
    public AllPolicyDocumentsScreenContract$InputData d;

    public a0(s sVar, i iVar) {
        this.f200062a = sVar;
        this.f200063b = iVar;
    }

    @Override // sji.a
    public final Object S(BaseScreen baseScreen) {
        this.f200064c = baseScreen;
        return this;
    }

    @Override // sji.a
    /* JADX INFO: renamed from: build */
    public final sji.b mo3800build() {
        vc.s.h(this.f200064c, BaseScreen.class);
        vc.s.h(this.d, AllPolicyDocumentsScreenContract$InputData.class);
        return new b0(this.f200062a, this.f200063b, this.d);
    }

    @Override // fv7.a
    public final fv7.a d(AllPolicyDocumentsScreenContract$InputData allPolicyDocumentsScreenContract$InputData) {
        this.d = allPolicyDocumentsScreenContract$InputData;
        return this;
    }
}
