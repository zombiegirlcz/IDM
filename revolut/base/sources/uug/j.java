package uug;

import cli.n;
import cli.y;
import com.revolut.feature.wealth.account_closure.impl.ui.screens.negative_balance.NegativeBalancePromptScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class j extends oki.h implements h {
    public final ktg.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final NegativeBalancePromptScreenContract$InputData f283235p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final m4f.b f283236q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f283237r;

    public j(n stateMapper, ktg.a interactor, NegativeBalancePromptScreenContract$InputData inputData, m4f.b wealthAddMoneyCommandProvider) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(wealthAddMoneyCommandProvider, "wealthAddMoneyCommandProvider");
        this.o = interactor;
        this.f283235p = inputData;
        this.f283236q = wealthAddMoneyCommandProvider;
        this.f283237r = mra.d.b(this, new f(null), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void T1(long j2) {
        n2(new u83.f(this, null, 25), new whi.b(6));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f283237r;
    }
}
