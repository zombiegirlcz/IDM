package yq1;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.core.ui_kit.delegates.s4;
import com.revolut.core.ui_kit.delegates.t4;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.apm.bills.pagopa.api.R$string;
import com.revolut.feature.apm.bills.pagopa.api.models.PagoPABill;
import java.util.List;
import jki.m;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes20.dex */
public final class j implements p {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // jki.p
    public final m a(jki.i iVar) {
        c domainState = (c) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.pagopa_bill_pay_button, u.c(new MoneyClause(domainState.f315968a.f61476c, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12);
        aim.e eVarB = u.b();
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.pagopa_bill_amount, null, null, 14);
        PagoPABill pagoPABill = domainState.f315968a;
        CounterTextDelegate.Model model = new CounterTextDelegate.Model("BILL_AMOUNT_LIST_ID", textLocalisedClause2, new t4(new MoneyClause(pagoPABill.f61476c, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), s4.FIXED_LARGE), new TextLocalisedClause(R$string.pagopa_bill_to, u.c(pagoPABill.e), null, 12), false, null, null, 0, 0, 0, 0, 2032);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        eVarB.add(model);
        List listK = v.k(new CellDetailsNoteDelegate.Model("FISCAL_CODE_LIST_ID", new TextLocalisedClause(R$string.pagopa_bill_fiscal_code, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10), null, new TextClause(pagoPABill.f61477g, (Style) new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124), null, false, null, null, null, null, null, 0, 131060), new CellDetailsNoteDelegate.Model("NOTICE_NUMBER_LIST_ID", new TextLocalisedClause(R$string.pagopa_bill_notice_number, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10), null, new TextClause(pagoPABill.f, (Style) new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124), null, false, null, null, null, null, null, 0, 131060));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        eVarB.addAll(listK);
        CellDetailsDelegate.Model model2 = new CellDetailsDelegate.Model("FEE_LIST_ID", new TextLocalisedClause(R$string.pagopa_bill_fees, null, null, 14), new TextLocalisedClause(R$string.pagopa_bill_no_fees, null, null, 14), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552);
        yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
        eVarB.add(model2);
        return new g(u.a(eVarB), textLocalisedClause);
    }
}
