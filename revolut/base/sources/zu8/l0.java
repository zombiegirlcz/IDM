package zu8;

import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes4.dex */
public final class l0 implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f325312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c0 f325313b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f325314c;
    public yv8.e d;
    public final Object e;

    public /* synthetic */ l0(c0 c0Var, Object obj2, int i) {
        this.f325312a = i;
        this.f325313b = c0Var;
        this.e = obj2;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f325312a) {
            case 0:
                this.f325314c = viewController;
                break;
            default:
                this.f325314c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f325312a) {
            case 0:
                vc.s.h(this.f325314c, ViewController.class);
                vc.s.h(this.d, yv8.e.class);
                return new m0(this.f325313b, (s) this.e, this.d);
            default:
                vc.s.h(this.f325314c, ViewController.class);
                vc.s.h(this.d, yv8.e.class);
                return new m0(this.f325313b, (q) this.e, this.d);
        }
    }
}
