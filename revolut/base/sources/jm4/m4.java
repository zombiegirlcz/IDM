package jm4;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.card.impl.ui.statement_details.details.CreditCardStatementDetailsScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class m4 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditCardStatementDetailsScreenContract$InputData f176205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f176206b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f176207c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f176208g;

    public m4(a3 a3Var, n2 n2Var, ViewController viewController, CreditCardStatementDetailsScreenContract$InputData creditCardStatementDetailsScreenContract$InputData) {
        this.f176205a = creditCardStatementDetailsScreenContract$InputData;
        this.f176206b = e4m.b.b(e4m.c.a(viewController));
        this.f176207c = e4m.b.b(new z3(a3Var, this, 2, 9));
        this.d = e4m.b.b(new z3(a3Var, this, 1, 9));
        this.e = e4m.b.b(new z3(a3Var, this, 0, 9));
        this.f = e4m.b.b(new z3(a3Var, this, 4, 9));
        this.f176208g = e4m.b.b(new z3(a3Var, this, 3, 9));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.e.get());
    }
}
