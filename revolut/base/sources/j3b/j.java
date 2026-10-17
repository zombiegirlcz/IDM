package j3b;

import cli.y;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.retail.cfd.impl.screens.cash_trade.CfdCashTradeDetailsContract$InputData;
import com.revolut.revolut.feature_fourthline_impl.R;
import dfl.q0;
import i7d.o;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ybl.l;

/* JADX INFO: loaded from: classes6.dex */
public final class j extends oki.h implements dli.b {

    @NotNull
    private static final h Companion = new h();
    public final o o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final l f171009p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f171010q;

    public j(CfdCashTradeDetailsContract$InputData inputData, k stateMapper, o helpWidgetControllerModelExtension, l tradingConfigInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(helpWidgetControllerModelExtension, "helpWidgetControllerModelExtension");
        Intrinsics.checkNotNullParameter(tradingConfigInteractor, "tradingConfigInteractor");
        this.o = helpWidgetControllerModelExtension;
        this.f171009p = tradingConfigInteractor;
        dfl.b bVar = inputData.f82205a;
        this.f171010q = mra.d.b(this, new a((bVar.f114191s == bfl.g.SELL && bVar.e == q0.PENDING) ? bVar.f114184j : null, null, null), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        yji.l.a1(this, this.o.Z2(new i7d.j("cfd-cash-trade-details", new TextLocalisedClause(R.string.contact_us, null, null, 14), new i7d.c("topic.trading"))), null, null, new i(this, null, 0), 3);
        yji.l.a1(this, l.d(this.f171009p), null, null, new i(this, null, 1), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f171010q;
    }
}
