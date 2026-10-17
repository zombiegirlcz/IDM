package xf6;

import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes3.dex */
public final class h1 implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f304873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f304874b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f304875c;
    public ho6.i d;
    public final Object e;

    public /* synthetic */ h1(t tVar, Object obj2, int i) {
        this.f304873a = i;
        this.f304874b = tVar;
        this.e = obj2;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f304873a) {
            case 0:
                this.f304875c = viewController;
                break;
            default:
                this.f304875c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f304873a) {
            case 0:
                vc.s.h(this.f304875c, ViewController.class);
                vc.s.h(this.d, ho6.i.class);
                return new i1(this.f304874b, (r) this.e, this.d);
            default:
                vc.s.h(this.f304875c, ViewController.class);
                vc.s.h(this.d, ho6.i.class);
                return new i1(this.f304874b, (q) this.e, this.d);
        }
    }
}
