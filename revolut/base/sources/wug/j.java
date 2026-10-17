package wug;

import ael.q0;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.wealth.account_closure.impl.ui.screens.progress.AccountClosureProgressScreenContract$InputData;
import ip0.v7;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class j extends oki.h implements e {

    @NotNull
    public static final g Companion = new g();
    public final AccountClosureProgressScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ktg.a f300140p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ybl.k f300141q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final aah.h f300142r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f300143s;

    public j(m stateMapper, AccountClosureProgressScreenContract$InputData inputData, ktg.a accountClosureInteractor, ybl.k tradingAccountsInteractor, aah.h disclaimersControllerModelExtension) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(accountClosureInteractor, "accountClosureInteractor");
        Intrinsics.checkNotNullParameter(tradingAccountsInteractor, "tradingAccountsInteractor");
        Intrinsics.checkNotNullParameter(disclaimersControllerModelExtension, "disclaimersControllerModelExtension");
        this.o = inputData;
        this.f300140p = accountClosureInteractor;
        this.f300141q = tradingAccountsInteractor;
        this.f300142r = disclaimersControllerModelExtension;
        this.f300143s = mra.d.b(this, new d(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        AccountClosureProgressScreenContract$InputData accountClosureProgressScreenContract$InputData = this.o;
        String str = accountClosureProgressScreenContract$InputData.f94958a;
        yji.l.a1(this, com.revolut.data.database.models.openbanking.d.x("AccountClosureProgressScreenModel", "collectTradingAccount", nim.a.v(((q0) this.f300141q).o(str, w4l.h.f294642c), new wsg.j(str, 3))), null, null, new h(this, null, 1), 3);
        String portfolioId = accountClosureProgressScreenContract$InputData.f94958a;
        aug.d dVar = (aug.d) this.f300140p;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        xtg.e eVar = dVar.f9824a;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        yji.l.a1(this, com.revolut.data.database.models.openbanking.d.y("AccountClosureProgressScreenModel", "collectAccountClosureProgress", rd0.e.b(eVar.f.f(portfolioId, true))), null, null, new h(this, null, 0), 3);
        yji.l.a1(this, v7.y("AccountClosureProgressScreenModel", "collectWealthDisclaimers", this.f300142r.f2828l.w0()), null, null, new h(this, null, 2), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f300143s;
    }
}
