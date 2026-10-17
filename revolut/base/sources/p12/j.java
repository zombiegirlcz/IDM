package p12;

import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes20.dex */
public final class j implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f231685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f231686b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f231687c;
    public g12.l d;
    public final Object e;

    public /* synthetic */ j(d dVar, Object obj2, int i) {
        this.f231685a = i;
        this.f231686b = dVar;
        this.e = obj2;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f231685a) {
            case 0:
                this.f231687c = viewController;
                break;
            default:
                this.f231687c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f231685a) {
            case 0:
                vc.s.h(this.f231687c, ViewController.class);
                vc.s.h(this.d, g12.l.class);
                return new k(this.f231686b, (g) this.e, this.f231687c, this.d);
            default:
                vc.s.h(this.f231687c, ViewController.class);
                vc.s.h(this.d, g12.l.class);
                return new k(this.f231686b, (f) this.e, this.f231687c, this.d);
        }
    }
}
