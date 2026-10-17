package hc2;

import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes20.dex */
public final class w implements xc2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f150840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewController f150841b;

    public w(m mVar) {
        this.f150840a = mVar;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        this.f150841b = viewController;
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        vc.s.h(this.f150841b, ViewController.class);
        return new v(this.f150840a);
    }
}
