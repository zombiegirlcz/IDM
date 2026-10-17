package xf6;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.external_accounts.impl.ui.brazil.payment_confirmation.OpenBankingBrPaymentsFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class u2 implements xki.c, xj6.a, ik6.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OpenBankingBrPaymentsFlowContract$InputData f305109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w2 f305110b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u2 f305111c = this;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f305112g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f305113h;

    public u2(w2 w2Var, OpenBankingBrPaymentsFlowContract$InputData openBankingBrPaymentsFlowContract$InputData) {
        this.f305110b = w2Var;
        this.f305109a = openBankingBrPaymentsFlowContract$InputData;
        int i = 12;
        this.d = e4m.b.b(new t1(w2Var, this, 0, i));
        this.e = e4m.b.b(new t1(w2Var, this, 1, i));
        this.f = e4m.b.b(new t1(w2Var, this, 3, i));
        this.f305112g = e4m.b.b(new t1(w2Var, this, 4, i));
        this.f305113h = e4m.b.b(new t1(w2Var, this, 2, i));
    }

    @Override // xj6.a
    public final l b() {
        return new l(this.f305110b, this.f305111c, 2);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.e.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.d.get());
    }

    @Override // ik6.a
    public final k j() {
        return new k(this.f305110b, this.f305111c, 2);
    }
}
