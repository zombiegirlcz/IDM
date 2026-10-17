package jm4;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.card.impl.ui.direct_debit_selection.CreditCardDirectDebitFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class a4 implements qji.a, qy4.a, oy4.a, uy4.a, gz4.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditCardDirectDebitFlowContract$InputData f175991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a3 f175992b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a4 f175993c = this;
    public final e4m.e d;
    public final e4m.e e;

    public a4(a3 a3Var, CreditCardDirectDebitFlowContract$InputData creditCardDirectDebitFlowContract$InputData) {
        this.f175992b = a3Var;
        this.f175991a = creditCardDirectDebitFlowContract$InputData;
        int i = 1;
        this.d = e4m.b.b(new z3(a3Var, this, 0, i));
        this.e = e4m.b.b(new z3(a3Var, this, 1, i));
    }

    @Override // gz4.a
    public final dw3.l4 b() {
        return new dw3.l4(this.f175992b, this.f175993c, 1);
    }

    @Override // uy4.a
    public final dw3.n c() {
        return new dw3.n(this.f175992b, this.f175993c, 1);
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
    public final dw3.c2 j() {
        return new dw3.c2(this.f175992b, this.f175993c, 1);
    }

    @Override // qy4.a
    public final dw3.e2 s() {
        return new dw3.e2(this.f175992b, this.f175993c, 1);
    }
}
