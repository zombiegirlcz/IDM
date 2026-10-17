package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.mortgage_signature.otp.OtpScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class r4 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OtpScreenContract$InputData f119659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f119660b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e0 f119661c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f119662g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f119663h;
    public final e4m.e i;

    public r4(c1 c1Var, h4 h4Var, ViewController viewController, OtpScreenContract$InputData otpScreenContract$InputData) {
        this.f119659a = otpScreenContract$InputData;
        this.f119660b = e4m.b.b(e4m.c.a(viewController));
        int i = 24;
        e0 e0Var = new e0(c1Var, h4Var, this, 1, i);
        this.f119661c = e0Var;
        this.d = e4m.b.b(e0Var);
        this.e = e4m.b.b(new e0(c1Var, h4Var, this, 0, i));
        this.f = e4m.b.b(new e0(c1Var, h4Var, this, 3, i));
        this.f119662g = e4m.b.b(new e0(c1Var, h4Var, this, 2, i));
        this.f119663h = e4m.b.b(this.f119661c);
        this.i = e4m.b.b(new e0(c1Var, h4Var, this, 4, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f119662g.get(), (yji.n) this.f119663h.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.e.get());
    }
}
