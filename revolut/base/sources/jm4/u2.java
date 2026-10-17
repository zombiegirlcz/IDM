package jm4;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.card.impl.ui.statement.hub.CreditCardStatementHubScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class u2 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditCardStatementHubScreenContract$InputData f176383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f176384b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f176385c;

    public u2(a3 a3Var, t2 t2Var, CreditCardStatementHubScreenContract$InputData creditCardStatementHubScreenContract$InputData) {
        this.f176383a = creditCardStatementHubScreenContract$InputData;
        this.f176384b = e4m.b.b(new f1(a3Var, this, 1, 14));
        this.f176385c = e4m.b.b(new f1(a3Var, this, 0, 14));
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
