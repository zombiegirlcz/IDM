package h30;

import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes19.dex */
public final class b0 implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f148875a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewController f148876b;

    public /* synthetic */ b0() {
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f148875a) {
            case 0:
                this.f148876b = viewController;
                break;
            default:
                this.f148876b = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f148875a) {
            case 0:
                vc.s.h(this.f148876b, ViewController.class);
                return new c0(0);
            default:
                vc.s.h(this.f148876b, ViewController.class);
                return new c0(1);
        }
    }

    public b0(n nVar) {
    }
}
