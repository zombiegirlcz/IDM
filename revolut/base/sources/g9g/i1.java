package g9g;

import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes9.dex */
public final class i1 implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f141698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewController f141699b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f141700c;

    public /* synthetic */ i1(d dVar, Object obj2, int i) {
        this.f141698a = i;
        this.f141700c = obj2;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f141698a) {
            case 0:
                this.f141699b = viewController;
                break;
            default:
                this.f141699b = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f141698a) {
            case 0:
                vc.s.h(this.f141699b, ViewController.class);
                p0 p0Var = (p0) this.f141700c;
                j1 j1Var = new j1(0);
                int i = 12;
                j1Var.f141722b = e4m.b.b(new e0(p0Var, j1Var, 1, i));
                j1Var.f141723c = e4m.b.b(new e0(p0Var, j1Var, 0, i));
                return j1Var;
            default:
                vc.s.h(this.f141699b, ViewController.class);
                o0 o0Var = (o0) this.f141700c;
                j1 j1Var2 = new j1(1);
                int i2 = 13;
                j1Var2.f141722b = e4m.b.b(new e0(o0Var, j1Var2, 1, i2));
                j1Var2.f141723c = e4m.b.b(new e0(o0Var, j1Var2, 0, i2));
                return j1Var2;
        }
    }
}
