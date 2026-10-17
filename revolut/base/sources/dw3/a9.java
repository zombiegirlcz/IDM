package dw3;

import com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.content.OfferContentScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes22.dex */
public final class a9 implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f118298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c1 f118299b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f118300c;
    public OfferContentScreenContract$InputData d;
    public final Object e;

    public /* synthetic */ a9(c1 c1Var, Object obj2, int i) {
        this.f118298a = i;
        this.f118299b = c1Var;
        this.e = obj2;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f118298a) {
            case 0:
                this.f118300c = viewController;
                break;
            default:
                this.f118300c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f118298a) {
            case 0:
                vc.s.h(this.f118300c, ViewController.class);
                vc.s.h(this.d, OfferContentScreenContract$InputData.class);
                return new b9(this.f118299b, (f4) this.e, this.f118300c, this.d);
            default:
                vc.s.h(this.f118300c, ViewController.class);
                vc.s.h(this.d, OfferContentScreenContract$InputData.class);
                return new b9(this.f118299b, (q4) this.e, this.f118300c, this.d);
        }
    }
}
