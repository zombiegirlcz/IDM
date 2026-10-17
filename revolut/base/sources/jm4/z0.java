package jm4;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.card.impl.ui.statement.details.flow.CreditCardStatementDetailsFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class z0 implements xki.c, uv4.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditCardStatementDetailsFlowContract$InputData f176462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a3 f176463b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z0 f176464c = this;
    public final e4m.e d;

    public z0(a3 a3Var, CreditCardStatementDetailsFlowContract$InputData creditCardStatementDetailsFlowContract$InputData) {
        this.f176463b = a3Var;
        this.f176462a = creditCardStatementDetailsFlowContract$InputData;
        this.d = e4m.b.b(new iwh.k(a3Var, this, 16));
    }

    @Override // uv4.a
    public final n4 b() {
        return new n4(this.f176463b, this.f176464c, 1);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
