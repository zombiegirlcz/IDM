package kvg;

import aw0.o9;
import com.revolut.core.ui_kit.models.CapitalizedClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.credit.card.impl.ui.topup.CreditCardTopupScreen;
import com.revolut.feature.insurance_home.api.widget.models.ActiveInsuranceProduct;
import com.revolut.feature.insurance_home.api.widget.models.InsuranceHomeWidgetContent;
import com.revolut.feature.insurance_home.impl.R$string;
import com.revolut.feature.trading_orders.common.models.AutoTopUpSource;
import com.revolut.feature.trading_orders.common.models.AutoTopUpStatus;
import com.revolut.feature.wealth.analytics.domain.models.complex_analytics.PerformanceChart;
import com.revolut.feature.wealth.api.domain.model.WealthAccount;
import com.revolut.shared.feature.wealth.models.config.Links;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import do3.n;
import hha.w0;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kwg.l;
import le.u1;
import org.joda.time.DateTime;
import z0h.h0;
import z0h.p1;
import z0h.t1;
import zhm.a0;
import zhm.d0;
import zhm.f0;
import zhm.r0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class j implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f190121a;

    public /* synthetic */ j(int i) {
        this.f190121a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        String str;
        TextLocalisedClause textLocalisedClause;
        jw7.a aVar;
        InsuranceHomeWidgetContent.Item item;
        Object next;
        int i = 0;
        switch (this.f190121a) {
            case 0:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return (List) getDefaultLoadingItems.invoke();
            case 1:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                return r0.k(new Pair(uqk.e.QUARTERLY, (List) pair.f186385a), new Pair(uqk.e.ANNUALLY, (List) pair.f186386b));
            case 2:
                t1 t1Var = (t1) obj2;
                Intrinsics.checkNotNullParameter(t1Var, "<destruct>");
                Links links = t1Var.f318563a;
                hel.b bVar = t1Var.f318564b;
                return new p1(u.c(new h0(links, bVar)), bVar);
            case 3:
                io3.d it8 = (io3.d) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return Optional.of(new AutoTopUpSource.Pocket(it8));
            case 4:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return Optional.empty();
            case 5:
                hel.a it9 = (hel.a) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return Boolean.valueOf(it9.f151719g);
            case 6:
                return new AutoTopUpStatus.Available((AutoTopUpSource) gj7.b.m((Optional) obj2));
            case 7:
                Pair it10 = (Pair) obj2;
                KProperty[] kPropertyArr = CreditCardTopupScreen.X;
                Intrinsics.checkNotNullParameter(it10, "it");
                return (cy0.a) it10.f186386b;
            case 8:
                kw4.i it11 = (kw4.i) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                kw4.h hVar = (kw4.h) it11.f190230b.getContent();
                if (hVar != null) {
                    return hVar.f190227l;
                }
                return null;
            case 9:
                InsuranceHomeWidgetContent content = (InsuranceHomeWidgetContent) obj2;
                Intrinsics.checkNotNullParameter(content, "content");
                ArrayList arrayList = content.f76159b;
                ArrayList<InsuranceHomeWidgetContent.Item> arrayList2 = new ArrayList();
                for (Object obj3 : arrayList) {
                    if (((InsuranceHomeWidgetContent.Item) obj3).f76165c == jw7.a.ACTIVE) {
                        arrayList2.add(obj3);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                for (InsuranceHomeWidgetContent.Item item2 : arrayList2) {
                    InsuranceHomeWidgetContent.Action action = item2.d;
                    InsuranceHomeWidgetContent.Action.OpenDetails openDetails = action instanceof InsuranceHomeWidgetContent.Action.OpenDetails ? (InsuranceHomeWidgetContent.Action.OpenDetails) action : null;
                    ActiveInsuranceProduct activeInsuranceProduct = (openDetails == null || (str = openDetails.f76161a) == null) ? null : new ActiveInsuranceProduct(item2.f76164b, item2.f76163a, str);
                    if (activeInsuranceProduct != null) {
                        arrayList3.add(activeInsuranceProduct);
                    }
                }
                return arrayList3;
            case 10:
                com.revolut.feature.insurance_home.impl.data.model.f it12 = (com.revolut.feature.insurance_home.impl.data.model.f) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return Boolean.valueOf(it12.a());
            case 11:
                hha.d plan = (hha.d) obj2;
                Intrinsics.checkNotNullParameter(plan, "plan");
                return plan.f152287a;
            case 12:
                e7l.f config = (e7l.f) obj2;
                Intrinsics.checkNotNullParameter(config, "config");
                return Boolean.valueOf(config.f123400w0.f123416b);
            case 13:
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                com.revolut.feature.insurance_home.impl.data.model.f fVar = (com.revolut.feature.insurance_home.impl.data.model.f) pair2.f186385a;
                w0 w0Var = (w0) pair2.f186386b;
                Iterable iterable = fVar.f76213c;
                if (iterable == null) {
                    iterable = f0.f322471a;
                }
                ArrayList arrayList4 = new ArrayList();
                Iterator it13 = iterable.iterator();
                while (it13.hasNext()) {
                    a0.x(((lw7.d) it13.next()).f200420b, arrayList4);
                }
                ArrayList<com.revolut.feature.insurance_home.impl.data.model.d> arrayList5 = new ArrayList();
                for (Object obj4 : arrayList4) {
                    if (((com.revolut.feature.insurance_home.impl.data.model.d) obj4).e.f76167a == lw7.a.EMBEDDED_INSURANCE) {
                        arrayList5.add(obj4);
                    }
                }
                ArrayList arrayList6 = new ArrayList();
                for (com.revolut.feature.insurance_home.impl.data.model.d dVar : arrayList5) {
                    String str2 = dVar.e.f76169c;
                    if (str2 == null) {
                        item = null;
                    } else {
                        List list = dVar.d;
                        if ((list instanceof Collection) && list.isEmpty()) {
                            aVar = jw7.a.LOCKED;
                            item = new InsuranceHomeWidgetContent.Item(dVar.f76207a, new TextClause(dVar.f76208b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), aVar, new InsuranceHomeWidgetContent.Action.OpenDetails(str2));
                        } else {
                            Iterator it14 = list.iterator();
                            while (it14.hasNext()) {
                                if (Intrinsics.f(((lw7.h) it14.next()).f200423b, "16_check")) {
                                    aVar = jw7.a.ACTIVE;
                                    item = new InsuranceHomeWidgetContent.Item(dVar.f76207a, new TextClause(dVar.f76208b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), aVar, new InsuranceHomeWidgetContent.Action.OpenDetails(str2));
                                }
                            }
                            aVar = jw7.a.LOCKED;
                            item = new InsuranceHomeWidgetContent.Item(dVar.f76207a, new TextClause(dVar.f76208b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), aVar, new InsuranceHomeWidgetContent.Action.OpenDetails(str2));
                        }
                    }
                    if (item != null) {
                        arrayList6.add(item);
                    }
                }
                int i2 = w0Var == null ? -1 : kw7.g.f190303a[w0Var.ordinal()];
                if (i2 == -1 || i2 == 1 || i2 == 2) {
                    textLocalisedClause = new TextLocalisedClause(R$string.insurance_home_interactive_widget_catalogue_title, null, null, 14);
                } else {
                    String lowerCase = w0Var.name().toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                    textLocalisedClause = new TextLocalisedClause(R$string.insurance_home_interactive_widget_title, u.c(new CapitalizedClause(new TextClause(lowerCase, (Style) null, (Integer) null, false, (o9) null, (List) null, 126))), null, 12);
                }
                return new InsuranceHomeWidgetContent(textLocalisedClause, arrayList6, InsuranceHomeWidgetContent.Action.OpenHome.f76162a);
            case 14:
                return ((Boolean) obj2).booleanValue() ? new b39.a(b39.d.INSURANCE) : b39.b.f12015a;
            case 15:
                ((kwa.a) obj2).getClass();
                Intrinsics.checkNotNullParameter("", "enteredCode");
                return new kwa.a("");
            case 16:
                ((kwa.a) obj2).getClass();
                Intrinsics.checkNotNullParameter("", "enteredCode");
                return new kwa.a("");
            case 17:
                xi0.b it15 = (xi0.b) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                return zi0.c.P(it15, false, null, 3);
            case 18:
                Optional it16 = (Optional) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                PerformanceChart performanceChart = (PerformanceChart) gj7.b.m(it16);
                if (performanceChart != null) {
                    return performanceChart;
                }
                DateTime dateTime = l.f190352t;
                return new PerformanceChart(dateTime, dateTime, f0.f322471a, dateTime);
            case 19:
                Optional it17 = (Optional) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                PerformanceChart performanceChart2 = (PerformanceChart) gj7.b.m(it17);
                if (performanceChart2 != null) {
                    return performanceChart2;
                }
                DateTime dateTime2 = l.f190352t;
                return new PerformanceChart(dateTime2, dateTime2, f0.f322471a, dateTime2);
            case 20:
                Optional it18 = (Optional) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                mwg.i iVar = (mwg.i) gj7.b.m(it18);
                if (iVar != null) {
                    return iVar;
                }
                DateTime dateTime3 = l.f190352t;
                return new mwg.i(dateTime3, dateTime3, f0.f322471a, null);
            case 21:
                Optional it19 = (Optional) obj2;
                Intrinsics.checkNotNullParameter(it19, "it");
                mwg.i iVar2 = (mwg.i) gj7.b.m(it19);
                if (iVar2 != null) {
                    return iVar2;
                }
                DateTime dateTime4 = l.f190352t;
                return new mwg.i(dateTime4, dateTime4, f0.f322471a, null);
            case 22:
                mwg.e allocation = (mwg.e) obj2;
                Intrinsics.checkNotNullParameter(allocation, "allocation");
                Map map = allocation.d;
                iwg.a aVar2 = iwg.a.ROBO;
                List list2 = (List) map.get(aVar2);
                Map map2 = allocation.e;
                List list3 = (List) map2.get(aVar2);
                if (ue0.e.n(list2) && ue0.e.n(list3)) {
                    return allocation;
                }
                List list4 = list2 == null ? f0.f322471a : list2;
                ArrayList arrayList7 = new ArrayList(w.t(list4, 10));
                Iterator it20 = list4.iterator();
                while (it20.hasNext()) {
                    arrayList7.add(((mwg.d) it20.next()).f209448b);
                }
                List list5 = list3 == null ? f0.f322471a : list3;
                ArrayList arrayList8 = new ArrayList(w.t(list5, 10));
                Iterator it21 = list5.iterator();
                while (it21.hasNext()) {
                    arrayList8.add(((mwg.c) it21.next()).f209444c);
                }
                ArrayList arrayListE0 = d0.E0(arrayList8, arrayList7);
                dj0.d.Companion.getClass();
                dj0.d dVar2 = dj0.d.e;
                dj0.d dVarO = dVar2;
                for (Object obj5 : arrayListE0) {
                    int i3 = i + 1;
                    if (i < 0) {
                        v.s();
                        throw null;
                    }
                    dVarO = i == 0 ? (dj0.d) obj5 : pyd.c.O(dVarO, (dj0.d) obj5);
                    i = i3;
                }
                if (list2 == null) {
                    list2 = f0.f322471a;
                }
                List list6 = list2;
                ArrayList arrayList9 = new ArrayList(w.t(list6, 10));
                Iterator it22 = list6.iterator();
                while (it22.hasNext()) {
                    arrayList9.add(Float.valueOf(((mwg.d) it22.next()).f209449c));
                }
                if (list3 == null) {
                    list3 = f0.f322471a;
                }
                List list7 = list3;
                ArrayList arrayList10 = new ArrayList(w.t(list7, 10));
                Iterator it23 = list7.iterator();
                while (it23.hasNext()) {
                    arrayList10.add(Float.valueOf(((mwg.c) it23.next()).d));
                }
                ArrayList arrayListE02 = d0.E0(arrayList10, arrayList9);
                BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
                Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
                Iterator it24 = arrayListE02.iterator();
                while (it24.hasNext()) {
                    bigDecimalValueOf = bigDecimalValueOf.add(new BigDecimal(String.valueOf(((Number) it24.next()).floatValue())));
                    Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "add(...)");
                }
                float fFloatValue = bigDecimalValueOf.floatValue();
                BigDecimal ONE = BigDecimal.ONE;
                Intrinsics.checkNotNullExpressionValue(ONE, "ONE");
                mwg.c cVar = new mwg.c("ROBO", ONE, dVarO, fFloatValue, null, null, null, null, null);
                Map map3 = allocation.d;
                iwg.a aVar3 = iwg.a.ROBO;
                Map cash = r0.l(aVar3, map3);
                Map assets = r0.q(map2, new Pair(aVar3, u.c(cVar)));
                List analyticsProductTypes = allocation.f209450a;
                boolean z = allocation.f209451b;
                dj0.d totalValue = allocation.f209452c;
                Intrinsics.checkNotNullParameter(analyticsProductTypes, "analyticsProductTypes");
                Intrinsics.checkNotNullParameter(totalValue, "totalValue");
                Intrinsics.checkNotNullParameter(cash, "cash");
                Intrinsics.checkNotNullParameter(assets, "assets");
                return new mwg.e(analyticsProductTypes, z, totalValue, cash, assets);
            case 23:
                Optional it25 = (Optional) obj2;
                Intrinsics.checkNotNullParameter(it25, "it");
                PerformanceChart performanceChart3 = (PerformanceChart) gj7.b.m(it25);
                if (performanceChart3 != null) {
                    return performanceChart3;
                }
                DateTime dateTime5 = l.f190352t;
                return new PerformanceChart(dateTime5, dateTime5, f0.f322471a, dateTime5);
            case 24:
                WealthAccount it26 = (WealthAccount) obj2;
                Intrinsics.checkNotNullParameter(it26, "it");
                Iterator it27 = ((WealthAccount.Robo) it26).f95237c.iterator();
                while (true) {
                    if (it27.hasNext()) {
                        next = it27.next();
                        if (v.k(com.revolut.shared.feature.wealth.models.trading_accounts.a.ACTIVE, com.revolut.shared.feature.wealth.models.trading_accounts.a.SUSPENDED, com.revolut.shared.feature.wealth.models.trading_accounts.a.OFFBOARDING).contains(((TradingAccount.Portfolio) next).f105211b)) {
                        }
                    } else {
                        next = null;
                    }
                }
                TradingAccount.Portfolio portfolio = (TradingAccount.Portfolio) next;
                return u1.a(String.valueOf(portfolio != null ? portfolio.f105210a : null));
            case 25:
                Pair pair3 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair3, "<destruct>");
                return new Pair(((n) pair3.f186385a).f116408a, (xi0.b) pair3.f186386b);
            case 26:
                n user = (n) obj2;
                Intrinsics.checkNotNullParameter(user, "user");
                Address address = user.k;
                if (address != null) {
                    return address.getCountry();
                }
                return null;
            case 27:
                Data it28 = (Data) obj2;
                Intrinsics.checkNotNullParameter(it28, "it");
                return (String) it28.getContent();
            case 28:
                Pair pair4 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair4, "<destruct>");
                return Boolean.valueOf(((cy0.a) pair4.f186386b).f110015b);
            default:
                List it29 = (List) obj2;
                Intrinsics.checkNotNullParameter(it29, "it");
                Intrinsics.checkNotNullParameter(it29, "<this>");
                List list8 = it29;
                ArrayList arrayList11 = new ArrayList(w.t(list8, 10));
                Iterator it30 = list8.iterator();
                while (it30.hasNext()) {
                    arrayList11.add(kp0.w0.t((hxb.g) it30.next()));
                }
                return arrayList11;
        }
    }

    public /* synthetic */ j(Object obj2, int i) {
        this.f190121a = i;
    }
}
