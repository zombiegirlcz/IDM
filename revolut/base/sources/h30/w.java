package h30;

import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes19.dex */
public final class w implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f148975a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f148976b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f148977c;

    public w(n nVar, o oVar) {
        this.f148976b = nVar;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f148975a) {
            case 0:
                this.f148977c = viewController;
                break;
            default:
                this.f148977c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f148975a) {
            case 0:
                vc.s.h(this.f148977c, ViewController.class);
                ViewController viewController = this.f148977c;
                x xVar = new x(0);
                xVar.f148979b = e4m.b.b(e4m.c.a(viewController));
                int i = 10;
                n nVar = this.f148976b;
                xVar.f148980c = e4m.b.b(new h08.e(nVar, xVar, 1, i));
                xVar.d = e4m.b.b(new h08.e(nVar, xVar, 0, i));
                xVar.e = e4m.b.b(new h08.e(nVar, xVar, 4, i));
                xVar.f = e4m.b.b(new h08.e(nVar, xVar, 7, i));
                xVar.f148981g = e4m.b.b(new h08.e(nVar, xVar, 6, i));
                xVar.f148982h = e4m.b.b(new h08.e(nVar, xVar, 5, i));
                xVar.i = e4m.b.b(new h08.e(nVar, xVar, 3, i));
                xVar.f148983j = e4m.b.b(new h08.e(nVar, xVar, 2, i));
                xVar.k = e4m.b.b(new h08.e(nVar, xVar, 8, i));
                xVar.f148984l = e4m.b.b(new h08.e(nVar, xVar, 10, i));
                xVar.f148985m = e4m.b.b(new h08.e(nVar, xVar, 9, i));
                return xVar;
            default:
                vc.s.h(this.f148977c, ViewController.class);
                ViewController viewController2 = this.f148977c;
                int i2 = 1;
                x xVar2 = new x(i2);
                xVar2.f148979b = e4m.b.b(e4m.c.a(viewController2));
                int i3 = 11;
                n nVar2 = this.f148976b;
                xVar2.f148980c = e4m.b.b(new h08.e(nVar2, xVar2, i2, i3));
                xVar2.d = e4m.b.b(new h08.e(nVar2, xVar2, 0, i3));
                xVar2.e = e4m.b.b(new h08.e(nVar2, xVar2, 4, i3));
                xVar2.f = e4m.b.b(new h08.e(nVar2, xVar2, 7, i3));
                xVar2.f148981g = e4m.b.b(new h08.e(nVar2, xVar2, 6, i3));
                xVar2.f148982h = e4m.b.b(new h08.e(nVar2, xVar2, 5, i3));
                xVar2.i = e4m.b.b(new h08.e(nVar2, xVar2, 3, i3));
                xVar2.f148983j = e4m.b.b(new h08.e(nVar2, xVar2, 2, i3));
                xVar2.k = e4m.b.b(new h08.e(nVar2, xVar2, 8, i3));
                xVar2.f148984l = e4m.b.b(new h08.e(nVar2, xVar2, 10, i3));
                xVar2.f148985m = e4m.b.b(new h08.e(nVar2, xVar2, 9, i3));
                return xVar2;
        }
    }

    public w(n nVar) {
        this.f148976b = nVar;
    }
}
