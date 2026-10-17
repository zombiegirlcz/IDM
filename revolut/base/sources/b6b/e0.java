package b6b;

import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes6.dex */
public final class e0 implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f12584b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f12585c;
    public i7d.i d;
    public final Object e;

    public /* synthetic */ e0(o oVar, Object obj2, int i) {
        this.f12583a = i;
        this.f12584b = oVar;
        this.e = obj2;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f12583a) {
            case 0:
                this.f12585c = viewController;
                break;
            default:
                this.f12585c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f12583a) {
            case 0:
                vc.s.h(this.f12585c, ViewController.class);
                vc.s.h(this.d, i7d.i.class);
                return new f0(this.f12584b, (j) this.e, this.d);
            default:
                vc.s.h(this.f12585c, ViewController.class);
                vc.s.h(this.d, i7d.i.class);
                return new f0(this.f12584b, (q) this.e, this.d);
        }
    }
}
