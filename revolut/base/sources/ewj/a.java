package ewj;

import com.revolut.kompot.navigable.vc.ViewController;
import ea2.p;
import g9g.e0;
import vc.s;
import xki.e;

/* JADX INFO: loaded from: classes11.dex */
public final class a implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f130297a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewController f130298b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f130299c;

    public a(gxj.a aVar) {
        this.f130299c = aVar;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f130297a) {
            case 0:
                this.f130298b = viewController;
                break;
            default:
                this.f130298b = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final e mo3783build() {
        switch (this.f130297a) {
            case 0:
                s.h(this.f130298b, ViewController.class);
                c cVar = (c) this.f130299c;
                b bVar = new b(0);
                int i = 19;
                bVar.f130301b = e4m.b.b(new p(cVar, bVar, 1, i));
                bVar.f130302c = e4m.b.b(new p(cVar, bVar, 0, i));
                return bVar;
            default:
                s.h(this.f130298b, ViewController.class);
                gxj.a aVar = (gxj.a) this.f130299c;
                b bVar2 = new b(1);
                int i2 = 21;
                bVar2.f130301b = e4m.b.b(new e0(aVar, bVar2, 1, i2));
                bVar2.f130302c = e4m.b.b(new e0(aVar, bVar2, 0, i2));
                return bVar2;
        }
    }

    public a(c cVar, d dVar) {
        this.f130299c = cVar;
    }
}
