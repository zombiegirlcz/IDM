package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.co_borrower.consent.initiator.request_consent.RequestConsentScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class a8 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RequestConsentScreenContract$InputData f118294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f118295b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s7 f118296c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f118297g;

    public a8(c1 c1Var, h0 h0Var, ViewController viewController, RequestConsentScreenContract$InputData requestConsentScreenContract$InputData) {
        this.f118294a = requestConsentScreenContract$InputData;
        this.f118295b = e4m.b.b(e4m.c.a(viewController));
        s7 s7Var = new s7(c1Var, h0Var, this, 1, 17);
        this.f118296c = s7Var;
        this.d = e4m.b.b(s7Var);
        this.e = e4m.b.b(new s7(c1Var, h0Var, this, 0, 17));
        this.f = e4m.b.b(this.f118296c);
        this.f118297g = e4m.b.b(new s7(c1Var, h0Var, this, 2, 17));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.e.get());
    }
}
