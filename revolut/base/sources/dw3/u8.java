package dw3;

import com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.content.OfferContentScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes22.dex */
public final class u8 implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f119942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c1 f119943b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f119944c;
    public OfferContentScreenContract$InputData d;
    public final Object e;

    public /* synthetic */ u8(c1 c1Var, Object obj2, int i) {
        this.f119942a = i;
        this.f119943b = c1Var;
        this.e = obj2;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f119942a) {
            case 0:
                this.f119944c = viewController;
                break;
            default:
                this.f119944c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f119942a) {
            case 0:
                vc.s.h(this.f119944c, ViewController.class);
                vc.s.h(this.d, OfferContentScreenContract$InputData.class);
                return new v8(this.f119943b, (f4) this.e, this.f119944c, this.d);
            default:
                vc.s.h(this.f119944c, ViewController.class);
                vc.s.h(this.d, OfferContentScreenContract$InputData.class);
                return new v8(this.f119943b, (q4) this.e, this.f119944c, this.d);
        }
    }
}
