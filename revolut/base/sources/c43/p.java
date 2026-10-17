package c43;

import com.revolut.kompot.navigable.vc.ViewController;
import vc.s;

/* JADX INFO: loaded from: classes21.dex */
public final class p implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f21071b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f21072c;
    public l43.d d;
    public final Object e;

    public /* synthetic */ p(h hVar, Object obj2, int i) {
        this.f21070a = i;
        this.f21071b = hVar;
        this.e = obj2;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f21070a) {
            case 0:
                this.f21072c = viewController;
                break;
            default:
                this.f21072c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f21070a) {
            case 0:
                s.h(this.f21072c, ViewController.class);
                s.h(this.d, l43.d.class);
                return new q(this.f21071b, (l) this.e, this.d);
            default:
                s.h(this.f21072c, ViewController.class);
                s.h(this.d, l43.d.class);
                return new q(this.f21071b, (j) this.e, this.d);
        }
    }
}
