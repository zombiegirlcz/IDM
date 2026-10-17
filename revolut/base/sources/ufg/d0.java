package ufg;

import com.revolut.kompot.navigable.vc.ViewController;
import u45.w0;

/* JADX INFO: loaded from: classes9.dex */
public final class d0 implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f279682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f279683b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f279684c;

    public /* synthetic */ d0(g gVar, Object obj2, int i) {
        this.f279682a = i;
        this.f279683b = gVar;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f279682a) {
            case 0:
                this.f279684c = viewController;
                break;
            default:
                this.f279684c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f279682a) {
            case 0:
                vc.s.h(this.f279684c, ViewController.class);
                ViewController viewController = this.f279684c;
                e0 e0Var = new e0(0);
                e0Var.f279692b = e4m.b.b(e4m.c.a(viewController));
                int i = 26;
                g gVar = this.f279683b;
                e0Var.f279693c = e4m.b.b(new w0(gVar, e0Var, 2, i));
                e0Var.d = e4m.b.b(new w0(gVar, e0Var, 1, i));
                e0Var.e = e4m.b.b(new w0(gVar, e0Var, 0, i));
                e0Var.f = e4m.b.b(new w0(gVar, e0Var, 5, i));
                e0Var.f279694g = e4m.b.b(new w0(gVar, e0Var, 4, i));
                e0Var.f279695h = e4m.b.b(new w0(gVar, e0Var, 3, i));
                e0Var.i = e4m.b.b(new w0(gVar, e0Var, 7, i));
                e0Var.f279696j = e4m.b.b(new w0(gVar, e0Var, 6, i));
                e0Var.k = e4m.b.b(new w0(gVar, e0Var, 9, i));
                e0Var.f279697l = e4m.b.b(new w0(gVar, e0Var, 8, i));
                e0Var.f279698m = e4m.b.b(new w0(gVar, e0Var, 10, i));
                e0Var.f279699n = e4m.b.b(new w0(gVar, e0Var, 12, i));
                e0Var.o = e4m.b.b(new w0(gVar, e0Var, 11, i));
                return e0Var;
            default:
                vc.s.h(this.f279684c, ViewController.class);
                ViewController viewController2 = this.f279684c;
                e0 e0Var2 = new e0(1);
                e0Var2.f279692b = e4m.b.b(e4m.c.a(viewController2));
                int i2 = 27;
                g gVar2 = this.f279683b;
                e0Var2.f279693c = e4m.b.b(new w0(gVar2, e0Var2, 2, i2));
                e0Var2.d = e4m.b.b(new w0(gVar2, e0Var2, 1, i2));
                e0Var2.e = e4m.b.b(new w0(gVar2, e0Var2, 0, i2));
                e0Var2.f = e4m.b.b(new w0(gVar2, e0Var2, 5, i2));
                e0Var2.f279694g = e4m.b.b(new w0(gVar2, e0Var2, 4, i2));
                e0Var2.f279695h = e4m.b.b(new w0(gVar2, e0Var2, 3, i2));
                e0Var2.i = e4m.b.b(new w0(gVar2, e0Var2, 7, i2));
                e0Var2.f279696j = e4m.b.b(new w0(gVar2, e0Var2, 6, i2));
                e0Var2.k = e4m.b.b(new w0(gVar2, e0Var2, 9, i2));
                e0Var2.f279697l = e4m.b.b(new w0(gVar2, e0Var2, 8, i2));
                e0Var2.f279698m = e4m.b.b(new w0(gVar2, e0Var2, 10, i2));
                e0Var2.f279699n = e4m.b.b(new w0(gVar2, e0Var2, 12, i2));
                e0Var2.o = e4m.b.b(new w0(gVar2, e0Var2, 11, i2));
                return e0Var2;
        }
    }
}
