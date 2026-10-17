package lf9;

import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes5.dex */
public final class v implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f194805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f194806b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f194807c;
    public mg9.d d;
    public final Object e;

    public /* synthetic */ v(m mVar, Object obj2, int i) {
        this.f194805a = i;
        this.f194806b = mVar;
        this.e = obj2;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f194805a) {
            case 0:
                this.f194807c = viewController;
                break;
            case 1:
                this.f194807c = viewController;
                break;
            default:
                this.f194807c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f194805a) {
            case 0:
                vc.s.h(this.f194807c, ViewController.class);
                vc.s.h(this.d, mg9.d.class);
                return new w(this.f194806b, (h) this.e, this.d);
            case 1:
                vc.s.h(this.f194807c, ViewController.class);
                vc.s.h(this.d, mg9.d.class);
                return new w(this.f194806b, (b) this.e, this.d);
            default:
                vc.s.h(this.f194807c, ViewController.class);
                vc.s.h(this.d, mg9.d.class);
                return new w(this.f194806b, (n) this.e, this.d);
        }
    }
}
