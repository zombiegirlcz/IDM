package ljl;

import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.sso.impl.ui.consent.common.unexpected_location.UnexpectedLocationScreenContract$InputData;

/* JADX INFO: loaded from: classes12.dex */
public final class f1 implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f195941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q0 f195942b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f195943c;
    public UnexpectedLocationScreenContract$InputData d;
    public final Object e;

    public /* synthetic */ f1(q0 q0Var, Object obj2, int i) {
        this.f195941a = i;
        this.f195942b = q0Var;
        this.e = obj2;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f195941a) {
            case 0:
                this.f195943c = viewController;
                break;
            default:
                this.f195943c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f195941a) {
            case 0:
                vc.s.h(this.f195943c, ViewController.class);
                vc.s.h(this.d, UnexpectedLocationScreenContract$InputData.class);
                return new g1(this.f195942b, (m0) this.e, this.d);
            default:
                vc.s.h(this.f195943c, ViewController.class);
                vc.s.h(this.d, UnexpectedLocationScreenContract$InputData.class);
                return new g1(this.f195942b, (b) this.e, this.d);
        }
    }
}
