package ehe;

import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes8.dex */
public final class j implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f126047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f126048b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f126049c;
    public final hhe.d d;

    public /* synthetic */ j(c cVar, hhe.d dVar, int i) {
        this.f126047a = i;
        this.f126048b = cVar;
        this.d = dVar;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f126047a) {
            case 0:
                this.f126049c = viewController;
                break;
            default:
                this.f126049c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f126047a) {
            case 0:
                vc.s.h(this.f126049c, ViewController.class);
                return new k(this.f126048b, (a) this.d, this.f126049c);
            default:
                vc.s.h(this.f126049c, ViewController.class);
                return new l(this.f126048b, (b) this.d, this.f126049c);
        }
    }
}
