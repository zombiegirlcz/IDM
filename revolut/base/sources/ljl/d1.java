package ljl;

import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.sso.impl.ui.consent.common.consent_screen.ConsentScreenContract$InputData;

/* JADX INFO: loaded from: classes12.dex */
public final class d1 implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f195919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q0 f195920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f195921c;
    public ConsentScreenContract$InputData d;
    public final Object e;

    public /* synthetic */ d1(q0 q0Var, Object obj2, int i) {
        this.f195919a = i;
        this.f195920b = q0Var;
        this.e = obj2;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f195919a) {
            case 0:
                this.f195921c = viewController;
                break;
            default:
                this.f195921c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f195919a) {
            case 0:
                vc.s.h(this.f195921c, ViewController.class);
                vc.s.h(this.d, ConsentScreenContract$InputData.class);
                return new e1(this.f195920b, (m0) this.e, this.d);
            default:
                vc.s.h(this.f195921c, ViewController.class);
                vc.s.h(this.d, ConsentScreenContract$InputData.class);
                return new e1(this.f195920b, (b) this.e, this.d);
        }
    }
}
