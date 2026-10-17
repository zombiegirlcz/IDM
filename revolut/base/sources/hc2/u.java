package hc2;

import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes20.dex */
public final class u implements xc2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f150834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f150835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f150836c;
    public final Object d;

    public /* synthetic */ u(m mVar, Object obj2, int i) {
        this.f150834a = i;
        this.f150835b = mVar;
        this.d = obj2;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f150834a) {
            case 0:
                this.f150836c = viewController;
                break;
            default:
                this.f150836c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f150834a) {
            case 0:
                vc.s.h(this.f150836c, ViewController.class);
                return new v(this.f150835b, (q) this.d);
            default:
                vc.s.h(this.f150836c, ViewController.class);
                return new v(this.f150835b, (o) this.d);
        }
    }
}
