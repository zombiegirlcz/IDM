package lu7;

import com.revolut.feature.insurance_embedded.impl.ui.screen.document.details.AllPolicyDocumentsScreenContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;

/* JADX INFO: loaded from: classes4.dex */
public final class c0 implements fv7.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f200076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public BaseScreen f200077b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AllPolicyDocumentsScreenContract$InputData f200078c;

    public c0(s sVar) {
        this.f200076a = sVar;
    }

    @Override // sji.a
    public final Object S(BaseScreen baseScreen) {
        this.f200077b = baseScreen;
        return this;
    }

    @Override // sji.a
    /* JADX INFO: renamed from: build */
    public final sji.b mo3800build() {
        vc.s.h(this.f200077b, BaseScreen.class);
        vc.s.h(this.f200078c, AllPolicyDocumentsScreenContract$InputData.class);
        return new b0(this.f200076a, this.f200078c);
    }

    @Override // fv7.a
    public final fv7.a d(AllPolicyDocumentsScreenContract$InputData allPolicyDocumentsScreenContract$InputData) {
        this.f200078c = allPolicyDocumentsScreenContract$InputData;
        return this;
    }
}
