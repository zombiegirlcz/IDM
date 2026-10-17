package nvk;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.retail.feature.stockdetails.impl.ui.activities.statements.models.StockFinancialsStatementPeriodState;
import com.revolut.retail.wealth.resources.R$string;
import ip0.xc;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import z0h.t1;
import zhm.d0;
import zhm.f0;

/* JADX INFO: loaded from: classes12.dex */
public final class a0 implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final csk.j f219704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fsk.d f219705b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final uqk.l f219706c;
    public final kbh.h d;

    public a0(csk.j statementsMapper, fsk.d statementMapper, uqk.l statementType, kbh.h tradingFooterDisclosuresFactory) {
        Intrinsics.checkNotNullParameter(statementsMapper, "statementsMapper");
        Intrinsics.checkNotNullParameter(statementMapper, "statementMapper");
        Intrinsics.checkNotNullParameter(statementType, "statementType");
        Intrinsics.checkNotNullParameter(tradingFooterDisclosuresFactory, "tradingFooterDisclosuresFactory");
        this.f219704a = statementsMapper;
        this.f219705b = statementMapper;
        this.f219706c = statementType;
        this.d = tradingFooterDisclosuresFactory;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        StockFinancialsStatementPeriodState stockFinancialsStatementPeriodState;
        int i;
        int i2;
        String strP;
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        int i3 = y.f219742b[domainState.f219715b.ordinal()];
        if (i3 == 1) {
            stockFinancialsStatementPeriodState = domainState.f219716c;
        } else {
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            stockFinancialsStatementPeriodState = domainState.d;
        }
        Integer num = stockFinancialsStatementPeriodState.f103797a;
        m mVar = null;
        esk.b bVar = num != null ? new esk.b(num.intValue(), true, stockFinancialsStatementPeriodState.f103798b) : null;
        Iterable iterable = (List) domainState.f.getContent();
        if (iterable == null) {
            iterable = f0.f322471a;
        }
        List listP0 = d0.P0(iterable, new k2j.d(new z(), 20));
        List<esk.b> listC = listP0.isEmpty() ? zhm.u.c(null) : listP0;
        ArrayList arrayList = new ArrayList(zhm.w.t(listC, 10));
        for (esk.b bVar2 : listC) {
            if (bVar2 == null || (strP = z92.f.P(bVar2)) == null) {
                strP = "EMPTY";
            }
            String strConcat = "STOCK_FINANCIALS_STATEMENT_PAGE_".concat(strP);
            Collection collection = (Collection) iii.c.f(domainState.f219717g, new nuc.n(this), new nk4.o(this, 27), new lk7.p(this, 8, bVar2, domainState));
            t1 t1Var = (t1) domainState.f219718h.getContent();
            List listA = t1Var != null ? k1h.r.a(this.d, t1Var.f318563a, t1Var.f318564b, null, 12) : null;
            if (listA == null) {
                listA = f0.f322471a;
            }
            arrayList.add(new xc(strConcat, d0.E0(listA, collection), 0, null, null, 0, 0, 0, 1020));
        }
        String str = domainState.f219714a;
        if (str == null) {
            str = "";
        }
        int[] iArr = y.f219741a;
        uqk.l lVar = this.f219706c;
        int i5 = iArr[lVar.ordinal()];
        if (i5 == 1) {
            i = R$string.wealth_stock_details_statements_income_statement_title;
        } else if (i5 == 2) {
            i = R$string.wealth_stock_details_statements_balance_sheet_title;
        } else {
            if (i5 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$string.wealth_stock_details_statements_cashflow_title;
        }
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i, zhm.u.c(str), null, 12);
        int i6 = iArr[lVar.ordinal()];
        if (i6 == 1) {
            i2 = R$string.wealth_stock_details_statements_income_statement_description;
        } else if (i6 == 2) {
            i2 = R$string.wealth_stock_details_statements_balance_sheet_description;
        } else {
            if (i6 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i2 = R$string.wealth_stock_details_statements_cashflow_description;
        }
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(i2, null, null, 14);
        uqk.e eVar = domainState.f219715b;
        csk.j jVar2 = this.f219704a;
        ActionsView.Item itemA = jVar2.a(eVar);
        if (bVar != null) {
            Iterator it8 = listP0.iterator();
            int i21 = 0;
            while (true) {
                if (!it8.hasNext()) {
                    i21 = -1;
                    break;
                }
                if (Intrinsics.f(z92.f.P((esk.b) it8.next()), z92.f.P(bVar))) {
                    break;
                }
                i21++;
            }
            Integer numValueOf = Integer.valueOf(i21);
            if (i21 < 0) {
                numValueOf = null;
            }
            if (numValueOf != null) {
                mVar = new m(z92.f.P(bVar), numValueOf.intValue());
            }
        }
        m mVar2 = mVar;
        List<esk.b> list = listP0;
        ArrayList arrayList2 = new ArrayList(zhm.w.t(list, 10));
        for (esk.b bVar3 : list) {
            arrayList2.add(new com.revolut.core.ui_kit.views.q(z92.f.P(bVar3), new com.revolut.core.ui_kit.views.t(jVar2.c(bVar3)), 58));
        }
        return new n(arrayList, textLocalisedClause, textLocalisedClause2, itemA, listP0, mVar2, arrayList2);
    }
}
