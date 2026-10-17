package dw3;

import com.revolut.feature.credit.autopay.ui.screen.confirm_autopay.ConfirmAutopayContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes22.dex */
public final class k9 implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f119141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f119142b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f119143c;
    public ConfirmAutopayContract$InputData d;
    public final Object e;

    public /* synthetic */ k9(Object obj2, Object obj3, int i) {
        this.f119141a = i;
        this.f119142b = obj2;
        this.e = obj3;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f119141a) {
            case 0:
                this.f119143c = viewController;
                break;
            case 1:
                this.f119143c = viewController;
                break;
            case 2:
                this.f119143c = viewController;
                break;
            case 3:
                this.f119143c = viewController;
                break;
            default:
                this.f119143c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f119141a) {
            case 0:
                vc.s.h(this.f119143c, ViewController.class);
                vc.s.h(this.d, ConfirmAutopayContract$InputData.class);
                return new l9((c1) this.f119142b, (d1) this.e, this.d);
            case 1:
                vc.s.h(this.f119143c, ViewController.class);
                vc.s.h(this.d, ConfirmAutopayContract$InputData.class);
                return new l9((c1) this.f119142b, (w) this.e, this.d);
            case 2:
                vc.s.h(this.f119143c, ViewController.class);
                vc.s.h(this.d, ConfirmAutopayContract$InputData.class);
                return new l9((jm4.a3) this.f119142b, (jm4.j0) this.e, this.d);
            case 3:
                vc.s.h(this.f119143c, ViewController.class);
                vc.s.h(this.d, ConfirmAutopayContract$InputData.class);
                return new l9((jm4.a3) this.f119142b, (jm4.l2) this.e, this.d);
            default:
                vc.s.h(this.f119143c, ViewController.class);
                vc.s.h(this.d, ConfirmAutopayContract$InputData.class);
                return new l9((u45.h) this.f119142b, (u45.i) this.e, this.d);
        }
    }
}
