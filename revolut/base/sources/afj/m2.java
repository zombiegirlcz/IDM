package afj;

import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes11.dex */
public final class m2 implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewController f4346b;

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f4345a) {
            case 0:
                this.f4346b = viewController;
                break;
            case 1:
                this.f4346b = viewController;
                break;
            default:
                this.f4346b = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f4345a) {
            case 0:
                vc.s.h(this.f4346b, ViewController.class);
                n2 n2Var = new n2(0);
                int i = 24;
                n2Var.f4361b = e4m.b.b(new a1e.a(n2Var, 1, i));
                n2Var.f4362c = e4m.b.b(new a1e.a(n2Var, 0, i));
                return n2Var;
            case 1:
                vc.s.h(this.f4346b, ViewController.class);
                n2 n2Var2 = new n2(1);
                int i2 = 27;
                n2Var2.f4361b = e4m.b.b(new a1e.a(n2Var2, 1, i2));
                n2Var2.f4362c = e4m.b.b(new a1e.a(n2Var2, 0, i2));
                return n2Var2;
            default:
                vc.s.h(this.f4346b, ViewController.class);
                n2 n2Var3 = new n2(2);
                int i3 = 5;
                n2Var3.f4361b = e4m.b.b(new r2(n2Var3, 1, i3));
                n2Var3.f4362c = e4m.b.b(new r2(n2Var3, 0, i3));
                return n2Var3;
        }
    }
}
