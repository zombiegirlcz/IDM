package ea2;

import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes20.dex */
public final class n implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f124099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f124100b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f124101c;
    public cb2.d d;
    public final Object e;

    public /* synthetic */ n(h hVar, Object obj2, int i) {
        this.f124099a = i;
        this.f124100b = hVar;
        this.e = obj2;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f124099a) {
            case 0:
                this.f124101c = viewController;
                break;
            default:
                this.f124101c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f124099a) {
            case 0:
                vc.s.h(this.f124101c, ViewController.class);
                vc.s.h(this.d, cb2.d.class);
                return new o(this.f124100b, (i) this.e, this.d);
            default:
                vc.s.h(this.f124101c, ViewController.class);
                vc.s.h(this.d, cb2.d.class);
                return new o(this.f124100b, (k) this.e, this.d);
        }
    }
}
