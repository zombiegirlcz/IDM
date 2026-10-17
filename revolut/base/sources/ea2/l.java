package ea2;

import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes20.dex */
public final class l implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f124093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f124094b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f124095c;
    public sa2.e d;
    public final Object e;

    public /* synthetic */ l(h hVar, Object obj2, int i) {
        this.f124093a = i;
        this.f124094b = hVar;
        this.e = obj2;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f124093a) {
            case 0:
                this.f124095c = viewController;
                break;
            case 1:
                this.f124095c = viewController;
                break;
            default:
                this.f124095c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f124093a) {
            case 0:
                vc.s.h(this.f124095c, ViewController.class);
                vc.s.h(this.d, sa2.e.class);
                return new m(this.f124094b, (k) this.e, this.d);
            case 1:
                vc.s.h(this.f124095c, ViewController.class);
                vc.s.h(this.d, sa2.e.class);
                return new m(this.f124094b, (i) this.e, this.d);
            default:
                vc.s.h(this.f124095c, ViewController.class);
                vc.s.h(this.d, sa2.e.class);
                return new m(this.f124094b, (f) this.e, this.d);
        }
    }
}
