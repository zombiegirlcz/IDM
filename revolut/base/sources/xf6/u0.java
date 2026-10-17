package xf6;

import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes3.dex */
public final class u0 implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f305101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f305102b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f305103c;
    public tn6.g d;
    public final Object e;

    public /* synthetic */ u0(t tVar, Object obj2, int i) {
        this.f305101a = i;
        this.f305102b = tVar;
        this.e = obj2;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f305101a) {
            case 0:
                this.f305103c = viewController;
                break;
            case 1:
                this.f305103c = viewController;
                break;
            default:
                this.f305103c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f305101a) {
            case 0:
                vc.s.h(this.f305103c, ViewController.class);
                vc.s.h(this.d, tn6.g.class);
                return new v0(this.f305102b, (r) this.e, this.d);
            case 1:
                vc.s.h(this.f305103c, ViewController.class);
                vc.s.h(this.d, tn6.g.class);
                return new v0(this.f305102b, (y) this.e, this.d);
            default:
                vc.s.h(this.f305103c, ViewController.class);
                vc.s.h(this.d, tn6.g.class);
                return new v0(this.f305102b, (z) this.e, this.d);
        }
    }
}
