package xf6;

import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes3.dex */
public final class j1 implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f304900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f304901b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f304902c;
    public jo6.l d;
    public final Object e;

    public /* synthetic */ j1(t tVar, Object obj2, int i) {
        this.f304900a = i;
        this.f304901b = tVar;
        this.e = obj2;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f304900a) {
            case 0:
                this.f304902c = viewController;
                break;
            default:
                this.f304902c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f304900a) {
            case 0:
                vc.s.h(this.f304902c, ViewController.class);
                vc.s.h(this.d, jo6.l.class);
                return new k1(this.f304901b, (r) this.e, this.d);
            default:
                vc.s.h(this.f304902c, ViewController.class);
                vc.s.h(this.d, jo6.l.class);
                return new k1(this.f304901b, (q) this.e, this.d);
        }
    }
}
