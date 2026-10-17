package u45;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.loan.impl.ui.direct_debit_selection.LoanDirectDebitFlowContract$InputData;
import dw3.c2;
import dw3.e2;
import dw3.l4;
import java.util.Set;

/* JADX INFO: loaded from: classes21.dex */
public final class p implements qji.a, qy4.a, oy4.a, uy4.a, gz4.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LoanDirectDebitFlowContract$InputData f277191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f277192b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f277193c = this;
    public final e4m.e d;
    public final e4m.e e;

    public p(h hVar, LoanDirectDebitFlowContract$InputData loanDirectDebitFlowContract$InputData) {
        this.f277192b = hVar;
        this.f277191a = loanDirectDebitFlowContract$InputData;
        int i = 8;
        this.d = e4m.b.b(new e(hVar, this, 0, i));
        this.e = e4m.b.b(new e(hVar, this, 1, i));
    }

    @Override // gz4.a
    public final l4 b() {
        return new l4(this.f277192b, this.f277193c, 2);
    }

    @Override // uy4.a
    public final dw3.n c() {
        return new dw3.n(this.f277192b, this.f277193c, 2);
    }

    @Override // dki.t
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // dki.q
    public final Set g() {
        return ImmutableSet.of();
    }

    @Override // oy4.a
    public final c2 j() {
        return new c2(this.f277192b, this.f277193c, 2);
    }

    @Override // qy4.a
    public final e2 s() {
        return new e2(this.f277192b, this.f277193c, 3);
    }
}
