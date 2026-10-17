package xf6;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.external_accounts.impl.ui.apptoapp.flow.accounts_au.OpenBankingAuthAccountsAuFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class p2 implements xki.c, zi6.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OpenBankingAuthAccountsAuFlowContract$InputData f304990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w2 f304991b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p2 f304992c = this;
    public final e4m.e d;

    public p2(w2 w2Var, OpenBankingAuthAccountsAuFlowContract$InputData openBankingAuthAccountsAuFlowContract$InputData) {
        this.f304991b = w2Var;
        this.f304990a = openBankingAuthAccountsAuFlowContract$InputData;
        this.d = e4m.b.b(new i0(w2Var, this, 13));
    }

    @Override // zi6.a
    public final c3 b() {
        return new c3(this.f304991b, this.f304992c, 0);
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
