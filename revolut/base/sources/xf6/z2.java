package xf6;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.external_accounts.impl.ui.apptoapp.screen.funds_confirmation.OpenBankingFundsConfirmationScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class z2 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OpenBankingFundsConfirmationScreenContract$InputData f305191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w2 f305192b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f305193c;
    public final e4m.e d;

    public z2(w2 w2Var, y2 y2Var, OpenBankingFundsConfirmationScreenContract$InputData openBankingFundsConfirmationScreenContract$InputData) {
        this.f305192b = w2Var;
        this.f305191a = openBankingFundsConfirmationScreenContract$InputData;
        int i = 14;
        this.f305193c = e4m.b.b(new t1(w2Var, this, 1, i));
        this.d = e4m.b.b(new t1(w2Var, this, 0, i));
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
