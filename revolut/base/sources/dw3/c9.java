package dw3;

import com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.content.OfferContentScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes22.dex */
public final class c9 implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f118525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c1 f118526b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f118527c;
    public OfferContentScreenContract$InputData d;
    public final Object e;

    public /* synthetic */ c9(c1 c1Var, Object obj2, int i) {
        this.f118525a = i;
        this.f118526b = c1Var;
        this.e = obj2;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f118525a) {
            case 0:
                this.f118527c = viewController;
                break;
            case 1:
                this.f118527c = viewController;
                break;
            case 2:
                this.f118527c = viewController;
                break;
            default:
                this.f118527c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f118525a) {
            case 0:
                vc.s.h(this.f118527c, ViewController.class);
                vc.s.h(this.d, OfferContentScreenContract$InputData.class);
                return new d9(this.f118526b, (e1) this.e, this.f118527c, this.d);
            case 1:
                vc.s.h(this.f118527c, ViewController.class);
                vc.s.h(this.d, OfferContentScreenContract$InputData.class);
                return new d9(this.f118526b, (f4) this.e, this.f118527c, this.d);
            case 2:
                vc.s.h(this.f118527c, ViewController.class);
                vc.s.h(this.d, OfferContentScreenContract$InputData.class);
                return new d9(this.f118526b, (v4) this.e, this.f118527c, this.d);
            default:
                vc.s.h(this.f118527c, ViewController.class);
                vc.s.h(this.d, OfferContentScreenContract$InputData.class);
                return new d9(this.f118526b, (q4) this.e, this.f118527c, this.d);
        }
    }
}
