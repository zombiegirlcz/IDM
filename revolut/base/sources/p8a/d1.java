package p8a;

import com.revolut.feature.pix.impl.flow.authorisation_request.screens.transaction_limit.PixAuthorisationTransactionLimitScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes5.dex */
public final class d1 implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f233946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d0 f233947b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f233948c;
    public PixAuthorisationTransactionLimitScreenContract$InputData d;
    public final Object e;

    public /* synthetic */ d1(d0 d0Var, Object obj2, int i) {
        this.f233946a = i;
        this.f233947b = d0Var;
        this.e = obj2;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f233946a) {
            case 0:
                this.f233948c = viewController;
                break;
            default:
                this.f233948c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f233946a) {
            case 0:
                vc.s.h(this.f233948c, ViewController.class);
                vc.s.h(this.d, PixAuthorisationTransactionLimitScreenContract$InputData.class);
                return new e1(this.f233947b, (s) this.e, this.d);
            default:
                vc.s.h(this.f233948c, ViewController.class);
                vc.s.h(this.d, PixAuthorisationTransactionLimitScreenContract$InputData.class);
                return new e1(this.f233947b, (u) this.e, this.d);
        }
    }
}
