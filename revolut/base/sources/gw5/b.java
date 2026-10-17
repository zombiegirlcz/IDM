package gw5;

import ce9.m;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RewardDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.delegates.SmallStockCardDelegate;
import com.revolut.core.ui_kit.delegates.eg;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import ip0.qd0;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ny5.e;
import ny5.f;
import rrd.l;
import zhm.d0;
import zhm.f0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes3.dex */
public interface b {
    static ArrayList a(b bVar, Clause clause, Clause clause2, cw5.a ratesItems, a ratesStyle, int i, Integer num, String listId, List selectedCurrencies, Function1 function1, l lVar, String str, int i2) {
        ListSubheaderDelegate.Model model;
        xi0.b bVar2;
        xi0.b bVar3;
        Object aVar;
        BigDecimal bigDecimal;
        Object objC;
        Object aVar2;
        BigDecimal bigDecimal2;
        xi0.b bVar4;
        xi0.b bVar5;
        xi0.b bVar6;
        Object objInvoke;
        BigDecimal bigDecimal3;
        Function1 function12 = (i2 & 512) != 0 ? null : function1;
        l lVar2 = (i2 & 1024) != 0 ? null : lVar;
        boolean z = (i2 & 2048) == 0;
        String listIdPrefix = (i2 & 4096) != 0 ? "" : str;
        e eVar = (e) bVar;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(ratesItems, "ratesItems");
        Intrinsics.checkNotNullParameter(ratesStyle, "ratesStyle");
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(selectedCurrencies, "selectedCurrencies");
        Intrinsics.checkNotNullParameter(listIdPrefix, "listIdPrefix");
        boolean z3 = (clause2 == null || (ratesItems.f109531a.size() == 1)) ? false : true;
        ListSubheaderDelegate.Model model2 = clause != null ? new ListSubheaderDelegate.Model(listId, (Image) null, clause, (ResourceImage) null, false, false, z3 ? clause2 : null, z3, (Object) null, (AnalyticsContext) null, i, 0, 0, 0, (String) null, 253754) : null;
        List listV0 = ratesItems.f109531a;
        boolean z4 = z;
        List list = ratesItems.f109532b;
        List list2 = ratesItems.f109533c;
        int i3 = f.f220670a[ratesStyle.ordinal()];
        int i5 = 14;
        CurrencyClause.Format.Ticker ticker = CurrencyClause.Format.Ticker.f57756a;
        if (i3 == 1) {
            String str2 = listIdPrefix;
            model = model2;
            if (num != null) {
                listV0 = d0.V0(listV0, num.intValue());
            }
            List list3 = listV0;
            ArrayList arrayList = new ArrayList(w.t(list3, 10));
            Iterator it8 = list3.iterator();
            int i6 = 0;
            while (it8.hasNext()) {
                Object next = it8.next();
                int i21 = i6 + 1;
                if (i6 < 0) {
                    v.s();
                    throw null;
                }
                xi0.b bVar7 = (xi0.b) next;
                n9l.a aVarD = e.d(list, bVar7);
                vel.a aVarG = e.g(list2, bVar7);
                if (aVarD == null || (bVar2 = aVarD.f213661a) == null) {
                    bVar2 = bVar7;
                }
                String str3 = bVar2.f306286a;
                String strA = m.A(str3, str2);
                List list4 = list2;
                CurrencyImage currencyImage = new CurrencyImage(str3, (ImageTransformations) null, (TextLocalisedClause) null, 14);
                List list5 = list;
                CurrencyClause currencyClause = new CurrencyClause(bVar2, ticker, null, 4);
                if (aVarD == null || (bVar3 = aVarD.f213661a) == null) {
                    bVar3 = bVar7;
                }
                Iterator it9 = it8;
                CurrencyClause currencyClause2 = new CurrencyClause(bVar3, null, null, 6);
                SmallStockCardDelegate.Model.a aVar3 = new SmallStockCardDelegate.Model.a(e.f(aVarD, bVar7), (aVarG == null || (bigDecimal = aVarG.f288346c) == null) ? null : xqi.a.b(bigDecimal, false, 7));
                if (function12 == null || (aVar = function12.invoke(str3)) == null) {
                    aVar = new zv5.a(str3);
                }
                SmallStockCardDelegate.Model model3 = new SmallStockCardDelegate.Model(strA, currencyImage, currencyClause, currencyClause2, aVar3, null, null, z4 ? Integer.valueOf(i21) : null, null, null, null, false, null, aVar, null, 67075808);
                yp0.b.l(model3, 0, 0, 0, 0, null, false, 63);
                arrayList.add(model3);
                it8 = it9;
                i6 = i21;
                list2 = list4;
                list = list5;
            }
            objC = u.c(e.i(str2, arrayList));
        } else if (i3 == 2) {
            model = model2;
            if (num != null) {
                listV0 = d0.V0(listV0, num.intValue());
            }
            objC = e.h(eVar, listV0, list, list2, selectedCurrencies, function12, lVar2, false, listIdPrefix, 64);
        } else if (i3 == 3) {
            model = model2;
            if (num != null) {
                listV0 = d0.V0(listV0, num.intValue());
            }
            String strA2 = m.A("RatesRewards", listIdPrefix);
            int i22 = R$attr.uikit_dp8;
            List<xi0.b> list6 = listV0;
            ArrayList arrayList2 = new ArrayList(w.t(list6, 10));
            for (xi0.b bVar8 : list6) {
                n9l.a aVarD2 = e.d(list, bVar8);
                vel.a aVarG2 = e.g(list2, bVar8);
                if (aVarD2 != null && (bVar4 = aVarD2.f213661a) != null) {
                    bVar8 = bVar4;
                }
                String str4 = bVar8.f306286a;
                String strA3 = m.A("RatesRewards" + str4, listIdPrefix);
                CurrencyImage currencyImage2 = new CurrencyImage(str4, (ImageTransformations) null, (TextLocalisedClause) null, 14);
                CurrencyClause currencyClause3 = new CurrencyClause(bVar8, ticker, null, 4);
                if (function12 == null || (aVar2 = function12.invoke(str4)) == null) {
                    aVar2 = new zv5.a(str4);
                }
                arrayList2.add(new RewardDelegate.Model(strA3, (Image) currencyImage2, (Clause) currencyClause3, (aVarG2 == null || (bigDecimal2 = aVarG2.f288346c) == null) ? null : xqi.a.b(bigDecimal2, false, 7), (RewardDelegate.a) null, false, aVar2, (AnalyticsContext) null, 752));
            }
            eg egVar = new eg(strA2, arrayList2, null, BitmapDescriptorFactory.HUE_RED, true, null, i22, i22, 0, 0, 26604);
            yp0.b.l(egVar, 0, 0, 0, 0, null, false, 63);
            objC = u.c(egVar);
        } else {
            if (i3 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            if (num != null) {
                listV0 = d0.V0(listV0, num.intValue());
            }
            List list7 = listV0;
            ArrayList arrayList3 = new ArrayList(w.t(list7, 10));
            Iterator it10 = list7.iterator();
            while (it10.hasNext()) {
                xi0.b bVar9 = (xi0.b) it10.next();
                n9l.a aVarD3 = e.d(list, bVar9);
                vel.a aVarG3 = e.g(list2, bVar9);
                if (aVarD3 == null || (bVar5 = aVarD3.f213661a) == null) {
                    bVar5 = bVar9;
                }
                String str5 = bVar5.f306286a;
                String strA4 = m.A(str5, listIdPrefix);
                String strA5 = m.A(str5, listIdPrefix);
                Iterator it11 = it10;
                CurrencyImage currencyImage3 = new CurrencyImage(str5, (ImageTransformations) null, (TextLocalisedClause) null, i5);
                if (aVarD3 == null || (bVar6 = aVarD3.f213661a) == null) {
                    bVar6 = bVar9;
                }
                ListSubheaderDelegate.Model model4 = model2;
                RowDelegate.Model model5 = new RowDelegate.Model(strA5, currencyImage3, null, null, new CurrencyClause(bVar6, null, null, 6), new CurrencyClause(bVar5, ticker, null, 4), null, null, 0, new RowDelegate.Model.c.b(e.f(aVarD3, bVar9), (aVarG3 == null || (bigDecimal3 = aVarG3.f288346c) == null) ? null : xqi.a.b(bigDecimal3, false, 7), null, false, 124), false, false, null, null, null, null, null, (function12 == null || (objInvoke = function12.invoke(str5)) == null) ? bVar9 : objInvoke, null, 0, 0, 0, 0, 1056962412);
                xi0.b.Companion.getClass();
                arrayList3.add(new SelectableDelegate.Model(strA4, model5, selectedCurrencies.contains(xi0.a.a(str5)) ? qd0.SELECTED : qd0.UNSELECTED, null, null, false, null, null, null, false, 32760));
                it10 = it11;
                model2 = model4;
                i5 = 14;
            }
            model = model2;
            yp0.b.k(arrayList3, 0, 0, 0, 0, 31);
            objC = arrayList3;
        }
        return d0.E0((Iterable) objC, v.l(model));
    }

    static ArrayList b(e eVar, List sortedCurrencies, List exchangeRates, List performances, int i) {
        boolean z = (i & 16) != 0;
        Intrinsics.checkNotNullParameter(sortedCurrencies, "sortedCurrencies");
        Intrinsics.checkNotNullParameter(exchangeRates, "exchangeRates");
        Intrinsics.checkNotNullParameter(performances, "performances");
        Intrinsics.checkNotNullParameter("", "listIdPrefix");
        return e.h(eVar, sortedCurrencies, exchangeRates, performances, f0.f322471a, null, null, z, "", 48);
    }
}
