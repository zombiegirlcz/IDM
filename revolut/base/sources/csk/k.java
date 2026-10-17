package csk;

import au0.e0;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.retail.core.navigation.FinishCommand;
import com.revolut.retail.feature.stockdetails.impl.ui.activities.statements.StockFinancialsStatementsContract$Configuration;
import com.revolut.retail.feature.stockdetails.impl.ui.activities.statements.models.StockFinancialsStatementPeriodState;
import com.revolut.retail.wealth.resources.R$string;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import zhm.u;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f108517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f108518b;

    public /* synthetic */ k(q qVar, int i) {
        this.f108517a = i;
        this.f108518b = qVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i;
        int i2;
        switch (this.f108517a) {
            case 0:
                String symbol = (String) obj2;
                Intrinsics.checkNotNullParameter(symbol, "symbol");
                q qVar = this.f108518b;
                xpi.g gVar = qVar.i;
                StockFinancialsStatementsContract$Configuration stockFinancialsStatementsContract$Configuration = qVar.f108523h;
                uqk.l lVar = stockFinancialsStatementsContract$Configuration.f103796c;
                int[] iArr = l.f108519a;
                int i3 = iArr[lVar.ordinal()];
                if (i3 == 1) {
                    i = R$string.wealth_stock_details_statements_income_statement_title;
                } else if (i3 == 2) {
                    i = R$string.wealth_stock_details_statements_balance_sheet_title;
                } else {
                    if (i3 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = R$string.wealth_stock_details_statements_cashflow_title;
                }
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i, u.c(symbol), null, 12);
                xpi.c cVar = (xpi.c) gVar;
                cVar.n0(textLocalisedClause);
                cVar.p0(textLocalisedClause);
                cVar.W(u.c(qVar.f108526m.a((uqk.e) ((xrk.k) qVar.k.f316331a).x0().get())));
                int i5 = iArr[stockFinancialsStatementsContract$Configuration.f103796c.ordinal()];
                if (i5 == 1) {
                    i2 = R$string.wealth_stock_details_statements_income_statement_description;
                } else if (i5 == 2) {
                    i2 = R$string.wealth_stock_details_statements_balance_sheet_description;
                } else {
                    if (i5 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i2 = R$string.wealth_stock_details_statements_cashflow_description;
                }
                cVar.f0(new TextLocalisedClause(i2, null, null, 14));
                e0 style = e0.CAPTION;
                Intrinsics.checkNotNullParameter(style, "style");
                NavBarWithToolbar navBarWithToolbar = cVar.f307974j;
                if (navBarWithToolbar == null) {
                    Intrinsics.r("navBarWithToolbarView");
                    throw null;
                }
                navBarWithToolbar.setSecondDescriptionTextStyle(style);
                cVar.l0(true);
                cVar.e0(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
                return Unit.f186387a;
            case 1:
                esk.b subPeriod = (esk.b) obj2;
                q qVar2 = this.f108518b;
                yrk.g gVar2 = qVar2.k;
                uqk.l statementType = qVar2.f108523h.f103796c;
                Intrinsics.h(subPeriod);
                gVar2.getClass();
                Intrinsics.checkNotNullParameter(statementType, "statementType");
                Intrinsics.checkNotNullParameter(subPeriod, "subPeriod");
                return w.z0(gVar2.a(), new StockFinancialsStatementPeriodState(Integer.valueOf(subPeriod.f128995a), subPeriod.f128996b));
            case 2:
                uqk.e it8 = (uqk.e) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                q qVar3 = this.f108518b;
                ((opi.b) qVar3.f108527n).Z(qVar3.f108526m.b(it8));
                return Unit.f186387a;
            case 3:
                q qVar4 = this.f108518b;
                yrk.g gVar3 = qVar4.k;
                gVar3.getClass();
                pfm.h hVar = new pfm.h(new ty7.b(gVar3, 27), 2);
                Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
                xrk.j jVar = (xrk.j) qVar4.f108525l;
                jVar.getClass();
                pfm.a aVarE = hVar.e(jVar.f308368a.a(new FinishCommand(null, null, null, 7)));
                Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
                return aVarE;
            case 4:
                uqk.e it9 = (uqk.e) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                q qVar5 = this.f108518b;
                ((xpi.c) qVar5.i).W(u.c(qVar5.f108526m.a(it9)));
                return Unit.f186387a;
            case 5:
                opi.d.c(this.f108518b.f108527n);
                return Unit.f186387a;
            default:
                uqk.e period = (uqk.e) obj2;
                yrk.g gVar4 = this.f108518b.k;
                Intrinsics.h(period);
                gVar4.getClass();
                Intrinsics.checkNotNullParameter(period, "period");
                return w.z0(((xrk.k) gVar4.f316331a).x0(), period);
        }
    }
}
