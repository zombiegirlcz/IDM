package ove;

import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes8.dex */
public final class y implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f230172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f230173b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f230174c;
    public dze.d d;
    public final Object e;

    public /* synthetic */ y(Object obj2, Object obj3, int i) {
        this.f230172a = i;
        this.f230173b = obj2;
        this.e = obj3;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f230172a) {
            case 0:
                this.f230174c = viewController;
                break;
            case 1:
                this.f230174c = viewController;
                break;
            case 2:
                this.f230174c = viewController;
                break;
            default:
                this.f230174c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f230172a) {
            case 0:
                vc.s.h(this.f230174c, ViewController.class);
                vc.s.h(this.d, dze.d.class);
                return new z((t) this.f230173b, (j) this.e, this.d);
            case 1:
                vc.s.h(this.f230174c, ViewController.class);
                vc.s.h(this.d, dze.d.class);
                return new z((t) this.f230173b, (u) this.e, this.d);
            case 2:
                vc.s.h(this.f230174c, ViewController.class);
                vc.s.h(this.d, dze.d.class);
                return new z((t) this.f230173b, (h) this.e, this.d);
            default:
                vc.s.h(this.f230174c, ViewController.class);
                vc.s.h(this.d, dze.d.class);
                return new qve.r((qve.k) this.f230173b, (qve.g) this.e, this.d);
        }
    }
}
