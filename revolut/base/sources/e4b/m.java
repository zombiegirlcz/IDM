package e4b;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.retail.wealth.resources.R$string;
import com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation;
import dfl.v;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.t0;
import org.jetbrains.annotations.NotNull;
import zhm.f0;

/* JADX INFO: loaded from: classes6.dex */
public final class m implements cli.n {

    @NotNull
    private static final l Companion = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c5b.e f122530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wfl.b f122531b;

    public m(c5b.e tradeUiDataMapper, wfl.b wealthTradeClauseFactory) {
        Intrinsics.checkNotNullParameter(tradeUiDataMapper, "tradeUiDataMapper");
        Intrinsics.checkNotNullParameter(wealthTradeClauseFactory, "wealthTradeClauseFactory");
        this.f122530a = tradeUiDataMapper;
        this.f122531b = wealthTradeClauseFactory;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        Clause textClause;
        h gVar;
        TradingLegalEntityInformation tradingLegalEntityInformation;
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        v vVar = domainState.f122518a;
        c5b.e eVar = this.f122530a;
        k1h.k kVarB = eVar.b(vVar, null, null);
        Data data = domainState.e;
        if (data == null || (tradingLegalEntityInformation = (TradingLegalEntityInformation) data.getContent()) == null) {
            m70.a.c(t0.f186434a);
            textClause = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        } else {
            textClause = eVar.f(vVar, tradingLegalEntityInformation, null);
        }
        Clause clauseG = eVar.g(vVar);
        Clause clauseE = eVar.e(vVar, k1h.n.DATETIME, domainState.f122520c, null);
        if (kVarB instanceof k1h.l) {
            gVar = new f(((k1h.l) kVarB).f180267a);
        } else {
            if (!(kVarB instanceof k1h.m)) {
                throw new NoWhenBranchMatchedException();
            }
            k1h.m mVar = (k1h.m) kVarB;
            gVar = new g(mVar.f180268a, mVar.f180269b, mVar.f180270c);
        }
        h hVar = gVar;
        s0 s0Var = new s0(3);
        CellDetailsDelegate.Model model = new CellDetailsDelegate.Model("ID_ROW_STATUS", new TextLocalisedClause(R$string.wealth_trade_info_status, null, null, 14), wfl.b.b(this.f122531b, vVar), 0, null, null, null, null, null, false, 0, 0, 32760);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        s0Var.a(model);
        s0Var.b(((List) iii.c.f(domainState.f122519b, new e1d.h(this, 16), new e07.k(18), new dbg.b(this, domainState, 22))).toArray(new koi.j[0]));
        Collection collection = domainState.d;
        if (collection == null) {
            collection = f0.f322471a;
        }
        s0Var.b(collection.toArray(new koi.j[0]));
        ArrayList arrayList = s0Var.f186433a;
        return new k(clauseG, textClause, clauseE, hVar, zhm.v.k(arrayList.toArray(new koi.j[arrayList.size()])));
    }
}
