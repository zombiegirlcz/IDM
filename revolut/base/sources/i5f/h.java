package i5f;

import ael.y;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.wealth.resources.R$string;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import t1h.n;
import vkm.q;
import ybl.l;
import zh9.u0;

/* JADX INFO: loaded from: classes8.dex */
public final class h implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f158830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ybl.d f158831b;

    public h(l configInteractor, ybl.d portfolioInteractor) {
        Intrinsics.checkNotNullParameter(configInteractor, "configInteractor");
        Intrinsics.checkNotNullParameter(portfolioInteractor, "portfolioInteractor");
        this.f158830a = configInteractor;
        this.f158831b = portfolioInteractor;
    }

    @Override // t1h.n
    public final Flow a(String portfolioId, xi0.b currency) {
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(currency, "currency");
        return com.revolut.data.database.models.openbanking.d.x("StocksWealthWithdrawToolbarProvider", "observeState", nim.a.v(u0.m(l.d(this.f158830a), q.q(nim.a.v(((y) this.f158831b).e(portfolioId, w4l.h.f294642c), new g(this, currency, 0)))), new ho6.n(portfolioId, 15)));
    }

    @Override // t1h.n
    public final Flow b(String portfolioId, xi0.b currency) {
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(currency, "currency");
        return zi0.c.i(new TextLocalisedClause(R$string.wealth_stocks_withdrawal_title, null, null, 14));
    }
}
