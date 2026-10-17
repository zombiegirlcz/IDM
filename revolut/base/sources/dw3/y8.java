package dw3;

import com.revolut.feature.credit.application.plugins.impl.ui.offer.content.OfferContentScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes22.dex */
public final class y8 implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f120242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c1 f120243b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f120244c;
    public OfferContentScreenContract$InputData d;
    public final Object e;

    public /* synthetic */ y8(c1 c1Var, Object obj2, int i) {
        this.f120242a = i;
        this.f120243b = c1Var;
        this.e = obj2;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f120242a) {
            case 0:
                this.f120244c = viewController;
                break;
            default:
                this.f120244c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f120242a) {
            case 0:
                vc.s.h(this.f120244c, ViewController.class);
                vc.s.h(this.d, OfferContentScreenContract$InputData.class);
                return new z8(this.f120243b, (n4) this.e, this.f120244c, this.d);
            default:
                vc.s.h(this.f120244c, ViewController.class);
                vc.s.h(this.d, OfferContentScreenContract$InputData.class);
                return new z8(this.f120243b, (p5) this.e, this.f120244c, this.d);
        }
    }
}
