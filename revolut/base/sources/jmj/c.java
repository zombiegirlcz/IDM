package jmj;

import aw0.ka;
import aw0.o9;
import aw0.t0;
import cli.j;
import cli.k;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.DotDividerClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberCheckoutFee;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberCheckoutPhoneNumberFee;
import com.revolut.retail.feature.esim.impl.R$string;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_phone_number_price_breakdown.EsimMobilePlanPhoneNumberPriceBreakdownScreenContract$InputData;
import dj0.d;
import ip0.ak0;
import ip0.yj0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import qv0.i;
import zhm.d0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
public final class c implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EsimMobilePlanPhoneNumberPriceBreakdownScreenContract$InputData f176630a;

    public c(EsimMobilePlanPhoneNumberPriceBreakdownScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f176630a = inputData;
    }

    @Override // cli.n
    public final o c(j jVar) {
        CellDetailsDelegate.Model model;
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.esim_mobile_plans_phone_number_checkout_updated_bill_title, null, null, 14);
        int i = R$string.esim_mobile_plans_phone_number_checkout_updated_bill_subtitle;
        EsimMobilePlanPhoneNumberPriceBreakdownScreenContract$InputData esimMobilePlanPhoneNumberPriceBreakdownScreenContract$InputData = this.f176630a;
        lw0.a aVar = new lw0.a(textLocalisedClause, new TextLocalisedClause(i, u.c(new TimeClause(esimMobilePlanPhoneNumberPriceBreakdownScreenContract$InputData.f101392a.toEpochMilli(), new TimeClause.Format.DayAndMonth(ka.SHORT), null, null, 12)), null, 12), null, null, false, 28);
        CellDetailsDelegate.Model model2 = new CellDetailsDelegate.Model("ID_MONTHLY_PRICE", new t0((Clause) new TextLocalisedClause(R$string.esim_mobile_plans_phone_number_checkout_monthly_plan_title, null, null, 14), (Image) null, 0, false, 30), new MoneyClause(esimMobilePlanPhoneNumberPriceBreakdownScreenContract$InputData.f101393b, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, null, null, 0, null, false, false, null, null, 32760);
        List list = esimMobilePlanPhoneNumberPriceBreakdownScreenContract$InputData.f101394c;
        ArrayList arrayList = new ArrayList();
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            EsimPhoneNumberCheckoutFee esimPhoneNumberCheckoutFee = ((EsimPhoneNumberCheckoutPhoneNumberFee) it8.next()).f100324a;
            if (esimPhoneNumberCheckoutFee != null) {
                arrayList.add(esimPhoneNumberCheckoutFee);
            }
        }
        if (arrayList.isEmpty()) {
            model = null;
        } else {
            int size = list.size();
            t0 t0Var = size == 1 ? new t0((Clause) new TextLocalisedClause(R$string.esim_mobile_plans_phone_number_checkout_monthly_secondary_number_title, null, null, 14), (Image) null, 0, false, 30) : new t0((Clause) new CompositeClause(v.k(new TextLocalisedClause(R$string.esim_mobile_plans_phone_number_checkout_monthly_secondary_number_title, null, null, 14), new DotDividerClause((Integer) null), new TextClause(String.valueOf(size), (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, null, null, 14), (Image) null, 0, false, 30);
            ArrayList arrayList2 = new ArrayList();
            Iterator it9 = list.iterator();
            while (it9.hasNext()) {
                EsimPhoneNumberCheckoutFee esimPhoneNumberCheckoutFee2 = ((EsimPhoneNumberCheckoutPhoneNumberFee) it9.next()).f100324a;
                if (esimPhoneNumberCheckoutFee2 != null) {
                    arrayList2.add(esimPhoneNumberCheckoutFee2);
                }
            }
            d.Companion.getClass();
            d dVar = d.e;
            d dVarO = dVar;
            int i2 = 0;
            for (Object obj2 : arrayList2) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    v.s();
                    throw null;
                }
                dVarO = i2 == 0 ? ((EsimPhoneNumberCheckoutFee) obj2).f100321a : pyd.c.O(dVarO, ((EsimPhoneNumberCheckoutFee) obj2).f100321a);
                i2 = i3;
            }
            model = new CellDetailsDelegate.Model("ID_MONTHLY_SECONDARY_NUMBER_PRICE", t0Var, new MoneyClause(dVarO, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, null, null, 0, null, false, false, null, null, 32760);
        }
        i[] elements = {model2, model, new CellDetailsDelegate.Model("ID_TOTAL_PRICE", new t0((Clause) new TextLocalisedClause(R$string.esim_mobile_plans_phone_number_checkout_total_title, null, null, 14), (Image) null, 0, false, 30), new MoneyClause(esimMobilePlanPhoneNumberPriceBreakdownScreenContract$InputData.d, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, null, null, 0, null, false, false, null, null, 32760)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        yp0.b.k(listL, 0, 0, 0, 0, 31);
        return new cii.b(null, d0.F0(new TextDelegate.Model("ID_PHONE_NUMBER_PRICE_BREAKDOWN_FOOTER", new TextLocalisedClause(R$string.esim_mobile_plans_phone_number_checkout_updated_bill_footer, null, null, 14), false, new ak0(yj0.CENTER_HORIZONTAL, null, 2), null, null, 0, 0, 0, 0, 2036), listL), aVar);
    }
}
