package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.sepa_direct_debit.repayment_method.SepaDirectDebitRepaymentMethodContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class i6 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SepaDirectDebitRepaymentMethodContract$InputData f118981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f118982b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t5 f118983c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f118984g;

    public i6(c1 c1Var, h6 h6Var, ViewController viewController, SepaDirectDebitRepaymentMethodContract$InputData sepaDirectDebitRepaymentMethodContract$InputData) {
        this.f118981a = sepaDirectDebitRepaymentMethodContract$InputData;
        this.f118982b = e4m.b.b(e4m.c.a(viewController));
        int i = 5;
        t5 t5Var = new t5(c1Var, h6Var, this, 1, i);
        this.f118983c = t5Var;
        this.d = e4m.b.b(t5Var);
        this.e = e4m.b.b(new t5(c1Var, h6Var, this, 0, i));
        this.f = e4m.b.b(this.f118983c);
        this.f118984g = e4m.b.b(new t5(c1Var, h6Var, this, 2, i));
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
