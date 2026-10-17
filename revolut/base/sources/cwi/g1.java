package cwi;

import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes10.dex */
public final class g1 implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f109692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h0 f109693b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f109694c;
    public final Object d;

    public /* synthetic */ g1(h0 h0Var, Object obj2, int i) {
        this.f109692a = i;
        this.f109693b = h0Var;
        this.d = obj2;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f109692a) {
            case 0:
                this.f109694c = viewController;
                break;
            case 1:
                this.f109694c = viewController;
                break;
            default:
                this.f109694c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f109692a) {
            case 0:
                vc.s.h(this.f109694c, ViewController.class);
                return new h1(this.f109693b, (b0) this.d, this.f109694c);
            case 1:
                vc.s.h(this.f109694c, ViewController.class);
                return new h1(this.f109693b, (q0) this.d, this.f109694c);
            default:
                vc.s.h(this.f109694c, ViewController.class);
                return new h1(this.f109693b, (p0) this.d, this.f109694c);
        }
    }
}
