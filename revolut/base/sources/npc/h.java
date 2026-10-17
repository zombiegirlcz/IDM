package npc;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.wealth.resources.R$string;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import t1h.n;

/* JADX INFO: loaded from: classes6.dex */
public final class h implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jpc.e f218189a;

    public h(jpc.e roboWithdrawBreakdownProvider) {
        Intrinsics.checkNotNullParameter(roboWithdrawBreakdownProvider, "roboWithdrawBreakdownProvider");
        this.f218189a = roboWithdrawBreakdownProvider;
    }

    @Override // t1h.n
    public final Flow a(String portfolioId, xi0.b currency) {
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(currency, "currency");
        return nim.a.v(this.f218189a.O(portfolioId, currency), new nnf.h(23));
    }

    @Override // t1h.n
    public final Flow b(String portfolioId, xi0.b currency) {
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(currency, "currency");
        return zi0.c.i(new TextLocalisedClause(R$string.wealth_robo_withdraw_title, null, null, 14));
    }
}
