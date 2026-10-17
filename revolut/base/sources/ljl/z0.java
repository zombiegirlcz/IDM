package ljl;

import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes12.dex */
public final class z0 implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f196150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q0 f196151b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f196152c;
    public final Object d;

    public /* synthetic */ z0(q0 q0Var, Object obj2, int i) {
        this.f196150a = i;
        this.f196151b = q0Var;
        this.d = obj2;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f196150a) {
            case 0:
                this.f196152c = viewController;
                break;
            default:
                this.f196152c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f196150a) {
            case 0:
                vc.s.h(this.f196152c, ViewController.class);
                return new a1(this.f196151b, (b0) this.d);
            default:
                vc.s.h(this.f196152c, ViewController.class);
                return new a1(this.f196151b, (c) this.d);
        }
    }
}
