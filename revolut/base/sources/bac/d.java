package bac;

import com.revolut.kompot.navigable.vc.ViewController;
import p12.o;
import vc.s;

/* JADX INFO: loaded from: classes6.dex */
public final class d implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewController f14026b;

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f14025a) {
            case 0:
                this.f14026b = viewController;
                break;
            default:
                this.f14026b = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f14025a) {
            case 0:
                s.h(this.f14026b, ViewController.class);
                e eVar = new e(0);
                eVar.f14028b = e4m.b.b(new a96.b(10));
                return eVar;
            default:
                s.h(this.f14026b, ViewController.class);
                e eVar2 = new e(1);
                eVar2.f14028b = e4m.b.b(new o(5));
                return eVar2;
        }
    }
}
