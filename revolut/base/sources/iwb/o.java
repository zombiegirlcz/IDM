package iwb;

import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes6.dex */
public final class o implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f169054a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f169055b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f169056c;

    public o(e eVar) {
        this.f169055b = eVar;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f169054a) {
            case 0:
                this.f169056c = viewController;
                break;
            default:
                this.f169056c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f169054a) {
            case 0:
                vc.s.h(this.f169056c, ViewController.class);
                p pVar = new p(0);
                int i = 7;
                e eVar = this.f169055b;
                pVar.f169058b = e4m.b.b(new b(eVar, pVar, 1, i));
                pVar.f169059c = e4m.b.b(new b(eVar, pVar, 0, i));
                return pVar;
            default:
                vc.s.h(this.f169056c, ViewController.class);
                p pVar2 = new p(1);
                int i2 = 8;
                e eVar2 = this.f169055b;
                pVar2.f169058b = e4m.b.b(new b(eVar2, pVar2, 1, i2));
                pVar2.f169059c = e4m.b.b(new b(eVar2, pVar2, 0, i2));
                return pVar2;
        }
    }

    public o(e eVar, h hVar) {
        this.f169055b = eVar;
    }
}
