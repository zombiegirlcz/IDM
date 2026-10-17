package dw3;

import com.revolut.feature.credit.application.plugins.impl.ui.spinner.SpinnerScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes22.dex */
public final class g9 implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f118834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c1 f118835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f118836c;
    public SpinnerScreenContract$InputData d;
    public final Object e;

    public /* synthetic */ g9(c1 c1Var, Object obj2, int i) {
        this.f118834a = i;
        this.f118835b = c1Var;
        this.e = obj2;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f118834a) {
            case 0:
                this.f118836c = viewController;
                break;
            case 1:
                this.f118836c = viewController;
                break;
            case 2:
                this.f118836c = viewController;
                break;
            default:
                this.f118836c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f118834a) {
            case 0:
                vc.s.h(this.f118836c, ViewController.class);
                vc.s.h(this.d, SpinnerScreenContract$InputData.class);
                return new h9(this.f118835b, (j0) this.e, this.f118836c, this.d);
            case 1:
                vc.s.h(this.f118836c, ViewController.class);
                vc.s.h(this.d, SpinnerScreenContract$InputData.class);
                return new h9(this.f118835b, (s6) this.e, this.f118836c, this.d);
            case 2:
                vc.s.h(this.f118836c, ViewController.class);
                vc.s.h(this.d, SpinnerScreenContract$InputData.class);
                return new h9(this.f118835b, (u2) this.e, this.f118836c, this.d);
            default:
                vc.s.h(this.f118836c, ViewController.class);
                vc.s.h(this.d, SpinnerScreenContract$InputData.class);
                return new h9(this.f118835b, (c0) this.e, this.f118836c, this.d);
        }
    }
}
