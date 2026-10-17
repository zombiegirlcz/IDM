package nv1;

import com.revolut.feature.apm.breb.impl.ui.register.BrebRegisterScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes20.dex */
public final class t implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f219448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f219449b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f219450c;
    public BrebRegisterScreenContract$InputData d;
    public final Object e;

    public /* synthetic */ t(g gVar, Object obj2, int i) {
        this.f219448a = i;
        this.f219449b = gVar;
        this.e = obj2;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f219448a) {
            case 0:
                this.f219450c = viewController;
                break;
            default:
                this.f219450c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f219448a) {
            case 0:
                vc.s.h(this.f219450c, ViewController.class);
                vc.s.h(this.d, BrebRegisterScreenContract$InputData.class);
                return new u(this.f219449b, (e) this.e, this.d);
            default:
                vc.s.h(this.f219450c, ViewController.class);
                vc.s.h(this.d, BrebRegisterScreenContract$InputData.class);
                return new u(this.f219449b, (h) this.e, this.d);
        }
    }
}
