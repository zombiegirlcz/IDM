package xf6;

import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes3.dex */
public final class f1 implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f304847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f304848b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f304849c;
    public fo6.j d;
    public final Object e;

    public /* synthetic */ f1(t tVar, Object obj2, int i) {
        this.f304847a = i;
        this.f304848b = tVar;
        this.e = obj2;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f304847a) {
            case 0:
                this.f304849c = viewController;
                break;
            default:
                this.f304849c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f304847a) {
            case 0:
                vc.s.h(this.f304849c, ViewController.class);
                vc.s.h(this.d, fo6.j.class);
                return new g1(this.f304848b, (r) this.e, this.d);
            default:
                vc.s.h(this.f304849c, ViewController.class);
                vc.s.h(this.d, fo6.j.class);
                return new g1(this.f304848b, (q) this.e, this.d);
        }
    }
}
