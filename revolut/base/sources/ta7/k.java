package ta7;

import com.revolut.kompot.navigable.vc.ViewController;
import vc.s;

/* JADX INFO: loaded from: classes21.dex */
public final class k implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f269141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f269142b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f269143c;

    public /* synthetic */ k(d dVar, Object obj2, int i) {
        this.f269141a = i;
        this.f269142b = dVar;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f269141a) {
            case 0:
                this.f269143c = viewController;
                break;
            default:
                this.f269143c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f269141a) {
            case 0:
                s.h(this.f269143c, ViewController.class);
                l lVar = new l(0);
                lVar.f269145b = e4m.b.b(new f(this.f269142b, 1));
                return lVar;
            default:
                s.h(this.f269143c, ViewController.class);
                l lVar2 = new l(1);
                lVar2.f269145b = e4m.b.b(new f(this.f269142b, 2));
                return lVar2;
        }
    }
}
