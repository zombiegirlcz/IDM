package h30;

import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes19.dex */
public final class f0 implements f50.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f148890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewController f148891b;

    public f0(n nVar) {
        this.f148890a = nVar;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        this.f148891b = viewController;
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        vc.s.h(this.f148891b, ViewController.class);
        return new e0(this.f148890a, this.f148891b);
    }
}
