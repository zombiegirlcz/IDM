package bt6;

import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes3.dex */
public final class b0 implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f18312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f18313c;

    public /* synthetic */ b0(b bVar, Object obj2, int i) {
        this.f18311a = i;
        this.f18312b = bVar;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f18311a) {
            case 0:
                this.f18313c = viewController;
                break;
            default:
                this.f18313c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f18311a) {
            case 0:
                vc.s.h(this.f18313c, ViewController.class);
                c0 c0Var = new c0(0);
                int i = 26;
                b bVar = this.f18312b;
                c0Var.f18317b = e4m.b.b(new b6b.m(bVar, c0Var, 1, i));
                c0Var.f18318c = e4m.b.b(new b6b.m(bVar, c0Var, 0, i));
                return c0Var;
            default:
                vc.s.h(this.f18313c, ViewController.class);
                c0 c0Var2 = new c0(1);
                int i2 = 27;
                b bVar2 = this.f18312b;
                c0Var2.f18317b = e4m.b.b(new b6b.m(bVar2, c0Var2, 1, i2));
                c0Var2.f18318c = e4m.b.b(new b6b.m(bVar2, c0Var2, 0, i2));
                return c0Var2;
        }
    }
}
