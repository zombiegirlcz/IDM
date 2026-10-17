package jm4;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.card.impl.ui.statement.export.CreditCardStatementExportScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class o2 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditCardStatementExportScreenContract$InputData f176229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a3 f176230b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f176231c;
    public final e4m.e d;

    public o2(a3 a3Var, z0 z0Var, CreditCardStatementExportScreenContract$InputData creditCardStatementExportScreenContract$InputData) {
        this.f176230b = a3Var;
        this.f176229a = creditCardStatementExportScreenContract$InputData;
        this.f176231c = e4m.b.b(new f1(a3Var, this, 1, 10));
        this.d = e4m.b.b(new f1(a3Var, this, 0, 10));
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
