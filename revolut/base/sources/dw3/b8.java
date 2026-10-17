package dw3;

import com.revolut.feature.credit.application.plugins.impl.ui.core.common.prompt.CreditPromptScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes22.dex */
public final class b8 implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f118393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c1 f118394b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f118395c;
    public CreditPromptScreenContract$InputData d;
    public final Object e;

    public /* synthetic */ b8(c1 c1Var, Object obj2, int i) {
        this.f118393a = i;
        this.f118394b = c1Var;
        this.e = obj2;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f118393a) {
            case 0:
                this.f118395c = viewController;
                break;
            default:
                this.f118395c = viewController;
                break;
        }
        return this;
    }

    public final b8 b(CreditPromptScreenContract$InputData creditPromptScreenContract$InputData) {
        switch (this.f118393a) {
            case 0:
                creditPromptScreenContract$InputData.getClass();
                this.d = creditPromptScreenContract$InputData;
                break;
            default:
                creditPromptScreenContract$InputData.getClass();
                this.d = creditPromptScreenContract$InputData;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f118393a) {
            case 0:
                vc.s.h(this.f118395c, ViewController.class);
                vc.s.h(this.d, CreditPromptScreenContract$InputData.class);
                return new c8(this.f118394b, (t4) this.e, this.d);
            default:
                vc.s.h(this.f118395c, ViewController.class);
                vc.s.h(this.d, CreditPromptScreenContract$InputData.class);
                return new c8(this.f118394b, (q1) this.e, this.d);
        }
    }
}
