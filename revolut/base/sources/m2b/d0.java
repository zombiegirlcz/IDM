package m2b;

import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes6.dex */
public final class d0 implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f201798a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f201799b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f201800c;
    public q4b.g d;
    public final Object e;

    public /* synthetic */ d0(v vVar, Object obj2, int i) {
        this.f201798a = i;
        this.f201799b = vVar;
        this.e = obj2;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f201798a) {
            case 0:
                this.f201800c = viewController;
                break;
            default:
                this.f201800c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f201798a) {
            case 0:
                vc.s.h(this.f201800c, ViewController.class);
                vc.s.h(this.d, q4b.g.class);
                return new e0(this.f201799b, (p) this.e, this.d);
            default:
                vc.s.h(this.f201800c, ViewController.class);
                vc.s.h(this.d, q4b.g.class);
                return new e0(this.f201799b, (m) this.e, this.d);
        }
    }
}
