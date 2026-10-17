package xf6;

import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes3.dex */
public final class y0 implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f305168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f305169b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f305170c;
    public xn6.f d;
    public final Object e;

    public /* synthetic */ y0(t tVar, Object obj2, int i) {
        this.f305168a = i;
        this.f305169b = tVar;
        this.e = obj2;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f305168a) {
            case 0:
                this.f305170c = viewController;
                break;
            case 1:
                this.f305170c = viewController;
                break;
            default:
                this.f305170c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f305168a) {
            case 0:
                vc.s.h(this.f305170c, ViewController.class);
                vc.s.h(this.d, xn6.f.class);
                return new z0(this.f305169b, (s) this.e, this.d);
            case 1:
                vc.s.h(this.f305170c, ViewController.class);
                vc.s.h(this.d, xn6.f.class);
                return new z0(this.f305169b, (h0) this.e, this.d);
            default:
                vc.s.h(this.f305170c, ViewController.class);
                vc.s.h(this.d, xn6.f.class);
                return new z0(this.f305169b, (z) this.e, this.d);
        }
    }
}
