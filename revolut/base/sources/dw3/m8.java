package dw3;

import com.revolut.feature.credit.application.plugins.impl.ui.insurance.common.InsuranceScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes22.dex */
public final class m8 implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f119300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c1 f119301b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f119302c;
    public InsuranceScreenContract$InputData d;
    public final Object e;

    public /* synthetic */ m8(c1 c1Var, Object obj2, int i) {
        this.f119300a = i;
        this.f119301b = c1Var;
        this.e = obj2;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f119300a) {
            case 0:
                this.f119302c = viewController;
                break;
            default:
                this.f119302c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f119300a) {
            case 0:
                vc.s.h(this.f119302c, ViewController.class);
                vc.s.h(this.d, InsuranceScreenContract$InputData.class);
                return new n8(this.f119301b, (k1) this.e, this.f119302c);
            default:
                vc.s.h(this.f119302c, ViewController.class);
                vc.s.h(this.d, InsuranceScreenContract$InputData.class);
                return new n8(this.f119301b, (q4) this.e, this.f119302c);
        }
    }
}
