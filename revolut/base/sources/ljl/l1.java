package ljl;

import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.sso.impl.ui.phone.enter_phone.EnterPhoneScreenContract$InputData;

/* JADX INFO: loaded from: classes12.dex */
public final class l1 implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f196022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q0 f196023b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f196024c;
    public EnterPhoneScreenContract$InputData d;
    public final Object e;

    public /* synthetic */ l1(q0 q0Var, Object obj2, int i) {
        this.f196022a = i;
        this.f196023b = q0Var;
        this.e = obj2;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f196022a) {
            case 0:
                this.f196024c = viewController;
                break;
            case 1:
                this.f196024c = viewController;
                break;
            default:
                this.f196024c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f196022a) {
            case 0:
                vc.s.h(this.f196024c, ViewController.class);
                vc.s.h(this.d, EnterPhoneScreenContract$InputData.class);
                return new m1(this.f196023b, (w0) this.e, this.d);
            case 1:
                vc.s.h(this.f196024c, ViewController.class);
                vc.s.h(this.d, EnterPhoneScreenContract$InputData.class);
                return new m1(this.f196023b, (h) this.e, this.d);
            default:
                vc.s.h(this.f196024c, ViewController.class);
                vc.s.h(this.d, EnterPhoneScreenContract$InputData.class);
                return new m1(this.f196023b, (c) this.e, this.d);
        }
    }
}
