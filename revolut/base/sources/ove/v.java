package ove;

import com.revolut.feature.topup_screen.impl.flows.cvv.screen.CvvScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes8.dex */
public final class v implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f230163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f230164b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f230165c;
    public CvvScreenContract$InputData d;
    public final Object e;

    public /* synthetic */ v(t tVar, Object obj2, int i) {
        this.f230163a = i;
        this.f230164b = tVar;
        this.e = obj2;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f230163a) {
            case 0:
                this.f230165c = viewController;
                break;
            default:
                this.f230165c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f230163a) {
            case 0:
                vc.s.h(this.f230165c, ViewController.class);
                vc.s.h(this.d, CvvScreenContract$InputData.class);
                return new x(this.f230164b, (j) this.e, this.d);
            default:
                vc.s.h(this.f230165c, ViewController.class);
                vc.s.h(this.d, CvvScreenContract$InputData.class);
                return new x(this.f230164b, (h) this.e, this.d);
        }
    }
}
