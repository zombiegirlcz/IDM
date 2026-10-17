package ufg;

import com.revolut.kompot.navigable.vc.ViewController;
import u45.w0;

/* JADX INFO: loaded from: classes9.dex */
public final class f0 implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f279706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f279707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f279708c;

    public /* synthetic */ f0(g gVar, Object obj2, int i) {
        this.f279706a = i;
        this.f279707b = gVar;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f279706a) {
            case 0:
                this.f279708c = viewController;
                break;
            default:
                this.f279708c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f279706a) {
            case 0:
                vc.s.h(this.f279708c, ViewController.class);
                ViewController viewController = this.f279708c;
                g0 g0Var = new g0(0);
                g0Var.f279727b = e4m.b.b(e4m.c.a(viewController));
                int i = 28;
                g gVar = this.f279707b;
                g0Var.f279728c = e4m.b.b(new w0(gVar, g0Var, 2, i));
                g0Var.d = e4m.b.b(new w0(gVar, g0Var, 1, i));
                g0Var.e = e4m.b.b(new w0(gVar, g0Var, 0, i));
                g0Var.f = e4m.b.b(new w0(gVar, g0Var, 5, i));
                g0Var.f279729g = e4m.b.b(new w0(gVar, g0Var, 4, i));
                g0Var.f279730h = e4m.b.b(new w0(gVar, g0Var, 3, i));
                g0Var.i = e4m.b.b(new w0(gVar, g0Var, 7, i));
                g0Var.f279731j = e4m.b.b(new w0(gVar, g0Var, 6, i));
                g0Var.k = e4m.b.b(new w0(gVar, g0Var, 9, i));
                g0Var.f279732l = e4m.b.b(new w0(gVar, g0Var, 8, i));
                g0Var.f279733m = e4m.b.b(new w0(gVar, g0Var, 10, i));
                g0Var.f279734n = e4m.b.b(new w0(gVar, g0Var, 12, i));
                g0Var.o = e4m.b.b(new w0(gVar, g0Var, 11, i));
                return g0Var;
            default:
                vc.s.h(this.f279708c, ViewController.class);
                ViewController viewController2 = this.f279708c;
                g0 g0Var2 = new g0(1);
                g0Var2.f279727b = e4m.b.b(e4m.c.a(viewController2));
                int i2 = 29;
                g gVar2 = this.f279707b;
                g0Var2.f279728c = e4m.b.b(new w0(gVar2, g0Var2, 2, i2));
                g0Var2.d = e4m.b.b(new w0(gVar2, g0Var2, 1, i2));
                g0Var2.e = e4m.b.b(new w0(gVar2, g0Var2, 0, i2));
                g0Var2.f = e4m.b.b(new w0(gVar2, g0Var2, 5, i2));
                g0Var2.f279729g = e4m.b.b(new w0(gVar2, g0Var2, 4, i2));
                g0Var2.f279730h = e4m.b.b(new w0(gVar2, g0Var2, 3, i2));
                g0Var2.i = e4m.b.b(new w0(gVar2, g0Var2, 7, i2));
                g0Var2.f279731j = e4m.b.b(new w0(gVar2, g0Var2, 6, i2));
                g0Var2.k = e4m.b.b(new w0(gVar2, g0Var2, 9, i2));
                g0Var2.f279732l = e4m.b.b(new w0(gVar2, g0Var2, 8, i2));
                g0Var2.f279733m = e4m.b.b(new w0(gVar2, g0Var2, 10, i2));
                g0Var2.f279734n = e4m.b.b(new w0(gVar2, g0Var2, 12, i2));
                g0Var2.o = e4m.b.b(new w0(gVar2, g0Var2, 11, i2));
                return g0Var2;
        }
    }
}
