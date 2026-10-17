package j3b;

import aw0.o9;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.r2;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.data.model.Data;
import com.revolut.feature.retail.cfd.impl.screens.cash_trade.CfdCashTradeDetailsContract$InputData;
import com.revolut.retail.wealth.resources.R$string;
import com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import k1h.l;
import k1h.m;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.t0;
import zhm.f0;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
public final class k implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CfdCashTradeDetailsContract$InputData f171011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c5b.e f171012b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wfl.b f171013c;

    public k(CfdCashTradeDetailsContract$InputData inputData, c5b.e tradeUiDataMapper, wfl.b wealthTradeClauseFactory) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(tradeUiDataMapper, "tradeUiDataMapper");
        Intrinsics.checkNotNullParameter(wealthTradeClauseFactory, "wealthTradeClauseFactory");
        this.f171011a = inputData;
        this.f171012b = tradeUiDataMapper;
        this.f171013c = wealthTradeClauseFactory;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        Clause textClause;
        d cVar;
        TradingLegalEntityInformation tradingLegalEntityInformation;
        a domainState = (a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        dfl.b bVar = this.f171011a.f82205a;
        c5b.e eVar = this.f171012b;
        CellDetailsNoteDelegate.Model model = null;
        k1h.k kVarB = eVar.b(bVar, null, null);
        Data data = domainState.f170997b;
        if (data == null || (tradingLegalEntityInformation = (TradingLegalEntityInformation) data.getContent()) == null) {
            m70.a.c(t0.f186434a);
            textClause = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        } else {
            textClause = eVar.f(bVar, tradingLegalEntityInformation, null);
        }
        Clause clauseG = eVar.g(bVar);
        Clause clauseE = eVar.e(bVar, k1h.n.DATETIME, null, null);
        if (kVarB instanceof l) {
            cVar = new b(((l) kVarB).f180267a);
        } else {
            if (!(kVarB instanceof m)) {
                throw new NoWhenBranchMatchedException();
            }
            m mVar = (m) kVarB;
            cVar = new c(mVar.f180268a, mVar.f180269b, mVar.f180270c);
        }
        d dVar = cVar;
        s0 s0Var = new s0(3);
        CellDetailsDelegate.Model model2 = new CellDetailsDelegate.Model("ID_ROW_STATUS", new TextLocalisedClause(R$string.wealth_trade_info_status, null, null, 14), wfl.b.b(this.f171013c, bVar), 0, null, null, null, null, null, false, 0, 0, 32760);
        yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
        s0Var.a(model2);
        Instant instant = domainState.f170996a;
        if (instant != null) {
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.wealth_transactions_cfd_cash_withdraw_settlement_date_title, null, null, 14);
            long epochMilli = instant.toEpochMilli();
            TimeClause.Format.INSTANCE.getClass();
            CellDetailsNoteDelegate.Model model3 = new CellDetailsNoteDelegate.Model("ID_EXPECTED_PAYOUT_DATE", textLocalisedClause, null, new TextLocalisedClause(R$string.wealth_transactions_cfd_cash_withdraw_settlement_date_description, null, null, 14), null, false, null, new TimeClause(epochMilli, TimeClause.Format.f57959a, null, null, 12), r2.f54655a, null, null, 0, 130292);
            yp0.b.l(model3, 0, 0, 0, 0, null, false, 63);
            model = model3;
        }
        s0Var.a(model);
        Collection collection = domainState.f170998c;
        if (collection == null) {
            collection = f0.f322471a;
        }
        s0Var.b(collection.toArray(new koi.j[0]));
        ArrayList arrayList = s0Var.f186433a;
        return new e(clauseG, textClause, clauseE, dVar, v.m(arrayList.toArray(new koi.j[arrayList.size()])));
    }
}
