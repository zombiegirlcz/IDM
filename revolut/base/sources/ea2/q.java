package ea2;

import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes20.dex */
public final class q implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f124108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f124109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f124110c;
    public final Object d;

    public /* synthetic */ q(h hVar, Object obj2, int i) {
        this.f124108a = i;
        this.f124109b = hVar;
        this.d = obj2;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f124108a) {
            case 0:
                this.f124110c = viewController;
                break;
            default:
                this.f124110c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f124108a) {
            case 0:
                vc.s.h(this.f124110c, ViewController.class);
                return new r(this.f124109b, (i) this.d, this.f124110c);
            default:
                vc.s.h(this.f124110c, ViewController.class);
                return new r(this.f124109b, (k) this.d, this.f124110c);
        }
    }
}
