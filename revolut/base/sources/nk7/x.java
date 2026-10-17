package nk7;

import com.revolut.feature.insurance.impl.ui.cfac.claim.supporting_documents.CFACInsuranceSupportingDocumentsScreenContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;

/* JADX INFO: loaded from: classes4.dex */
public final class x implements sji.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f216739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f216740b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public BaseScreen f216741c;
    public CFACInsuranceSupportingDocumentsScreenContract$InputData d;
    public final Object e;

    public /* synthetic */ x(q qVar, Object obj2, int i) {
        this.f216739a = i;
        this.f216740b = qVar;
        this.e = obj2;
    }

    @Override // sji.a
    public final Object S(BaseScreen baseScreen) {
        switch (this.f216739a) {
            case 0:
                this.f216741c = baseScreen;
                break;
            default:
                this.f216741c = baseScreen;
                break;
        }
        return this;
    }

    @Override // sji.a
    /* JADX INFO: renamed from: build */
    public final sji.b mo3800build() {
        switch (this.f216739a) {
            case 0:
                vc.s.h(this.f216741c, BaseScreen.class);
                vc.s.h(this.d, CFACInsuranceSupportingDocumentsScreenContract$InputData.class);
                return new y(this.f216740b, (j) this.e, this.f216741c, this.d);
            default:
                vc.s.h(this.f216741c, BaseScreen.class);
                vc.s.h(this.d, CFACInsuranceSupportingDocumentsScreenContract$InputData.class);
                return new y(this.f216740b, (r) this.e, this.f216741c, this.d);
        }
    }
}
