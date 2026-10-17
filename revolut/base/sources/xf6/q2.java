package xf6;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.external_accounts.impl.ui.apptoapp.flow.accounts.OpenBankingAuthAccountsFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class q2 implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OpenBankingAuthAccountsFlowContract$InputData f305008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w2 f305009b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q2 f305010c = this;
    public final e4m.e d;
    public final e4m.e e;

    public q2(w2 w2Var, OpenBankingAuthAccountsFlowContract$InputData openBankingAuthAccountsFlowContract$InputData) {
        this.f305009b = w2Var;
        this.f305008a = openBankingAuthAccountsFlowContract$InputData;
        int i = 10;
        this.d = e4m.b.b(new t1(w2Var, this, 1, i));
        this.e = e4m.b.b(new t1(w2Var, this, 0, i));
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
