package jm4;

import com.revolut.feature.credit.autopay.ui.screen.select_autopay_method_v3.SelectAutopayMethodV3ScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes22.dex */
public final class q3 implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f176271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a3 f176272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f176273c;
    public SelectAutopayMethodV3ScreenContract$InputData d;
    public final Object e;

    public /* synthetic */ q3(a3 a3Var, Object obj2, int i) {
        this.f176271a = i;
        this.f176272b = a3Var;
        this.e = obj2;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f176271a) {
            case 0:
                this.f176273c = viewController;
                break;
            default:
                this.f176273c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f176271a) {
            case 0:
                vc.s.h(this.f176273c, ViewController.class);
                vc.s.h(this.d, SelectAutopayMethodV3ScreenContract$InputData.class);
                return new r3(this.f176272b, (j0) this.e, this.d);
            default:
                vc.s.h(this.f176273c, ViewController.class);
                vc.s.h(this.d, SelectAutopayMethodV3ScreenContract$InputData.class);
                return new r3(this.f176272b, (l2) this.e, this.d);
        }
    }
}
