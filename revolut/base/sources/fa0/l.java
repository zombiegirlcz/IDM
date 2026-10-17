package fa0;

import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes19.dex */
public final class l implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f133108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f133109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f133110c;
    public hb0.h d;
    public final na0.d e;

    public /* synthetic */ l(k kVar, na0.d dVar, int i) {
        this.f133108a = i;
        this.f133109b = kVar;
        this.e = dVar;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f133108a) {
            case 0:
                this.f133110c = viewController;
                break;
            default:
                this.f133110c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f133108a) {
            case 0:
                vc.s.h(this.f133110c, ViewController.class);
                vc.s.h(this.d, hb0.h.class);
                return new m(this.f133109b, (j) this.e, this.d);
            default:
                vc.s.h(this.f133110c, ViewController.class);
                vc.s.h(this.d, hb0.h.class);
                return new m(this.f133109b, (h) this.e, this.d);
        }
    }
}
