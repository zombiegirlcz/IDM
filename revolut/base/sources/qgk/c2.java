package qgk;

import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes11.dex */
public final class c2 implements xki.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f245905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i0 f245906b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f245907c;
    public jhk.c d;
    public final Object e;

    public /* synthetic */ c2(i0 i0Var, Object obj2, int i) {
        this.f245905a = i;
        this.f245906b = i0Var;
        this.e = obj2;
    }

    @Override // xki.b
    public final Object a(ViewController viewController) {
        switch (this.f245905a) {
            case 0:
                this.f245907c = viewController;
                break;
            default:
                this.f245907c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.b
    public final xki.c build() {
        switch (this.f245905a) {
            case 0:
                vc.s.h(this.f245907c, ViewController.class);
                vc.s.h(this.d, jhk.c.class);
                return new d2(this.f245906b, (g1) this.e, this.d);
            default:
                vc.s.h(this.f245907c, ViewController.class);
                vc.s.h(this.d, jhk.c.class);
                return new e2(this.f245906b, (z) this.e, this.d);
        }
    }
}
