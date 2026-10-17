package ljl;

import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.sso.impl.ui.email.enter_email.EnterEmailScreenContract$InputData;

/* JADX INFO: loaded from: classes12.dex */
public final class h1 implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f195969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q0 f195970b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f195971c;
    public EnterEmailScreenContract$InputData d;
    public final Object e;

    public /* synthetic */ h1(q0 q0Var, Object obj2, int i) {
        this.f195969a = i;
        this.f195970b = q0Var;
        this.e = obj2;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f195969a) {
            case 0:
                this.f195971c = viewController;
                break;
            default:
                this.f195971c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f195969a) {
            case 0:
                vc.s.h(this.f195971c, ViewController.class);
                vc.s.h(this.d, EnterEmailScreenContract$InputData.class);
                return new i1(this.f195970b, (f) this.e, this.d);
            default:
                vc.s.h(this.f195971c, ViewController.class);
                vc.s.h(this.d, EnterEmailScreenContract$InputData.class);
                return new i1(this.f195970b, (c) this.e, this.d);
        }
    }
}
