package foh;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import aw0.v1;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.apm.bills.core.api.model.BillInputV2;
import com.revolut.feature.backend_flow.domain.models.BackendFlowCheckboxItem;
import com.revolut.feature.backend_flow.domain.models.FormScreen;
import com.revolut.feature.backend_flow.domain.models.InputItem;
import com.revolut.feature.backend_flow.domain.models.NoneApplyItem;
import com.revolut.feature.external_accounts.models.open_banking_brazil.ThirdPartyBrazil;
import com.revolut.feature.global_markets.domain.Market;
import com.revolut.feature.pix.api.model.PixAuthorisationFrequency;
import com.revolut.feature.pricingplans.models.subscribe_info.PricingPlanSubscribeInfoIneligibilityReason;
import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod;
import com.revolut.feature.store.api.model.StoreGenericBadge;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.wealth.resources.R$string;
import efm.d0;
import f2e.r1;
import java.math.BigInteger;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import org.joda.time.DateTime;
import org.joda.time.ReadableInstant;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;
import qgb.c0;
import qgb.f0;
import qgb.i0;
import qgb.l0;
import qgb.m0;
import qgb.z;
import tof.h2;
import tof.q6;
import xzg.n0;
import yhm.m;
import zh9.u0;
import zhm.h0;
import zhm.q0;
import zhm.r0;

/* JADX INFO: loaded from: classes10.dex */
public abstract class i {
    public static final ggc.t A(rgc.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        return new ggc.t(fVar.getTiny(), fVar.getBrief(), fVar.getNormal(), fVar.getVerbose(), fVar.getTerms(), fVar.getPicture());
    }

    public static final tgb.o B(m0 m0Var) {
        tgb.m mVar;
        tgb.f fVar;
        Instant instant;
        tgb.i iVar;
        Intrinsics.checkNotNullParameter(m0Var, "<this>");
        do3.g gVarValueOf = do3.g.valueOf(m0Var.f245756a);
        boolean z = m0Var.f245757b;
        Instant instant2 = m0Var.f245758c;
        qgb.w wVar = m0Var.d;
        tgb.g gVar = new tgb.g(wVar.f245769a, wVar.f245770b, wVar.f245771c);
        List list = m0Var.e;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            f0 f0Var = (f0) it8.next();
            tgb.k kVarValueOf = tgb.k.valueOf(f0Var.f245733a);
            tgb.j jVarValueOf = tgb.j.valueOf(f0Var.f245734b);
            String str = f0Var.f245735c;
            Integer num = f0Var.d;
            Instant instant3 = f0Var.e;
            Instant instant4 = f0Var.f;
            Instant instant5 = f0Var.f245736g;
            Iterator it9 = it8;
            Instant instant6 = f0Var.f245737h;
            z zVar = f0Var.i;
            if (zVar != null) {
                instant = instant5;
                iVar = new tgb.i(mo3.a.o(zVar.f245773a), zVar.f245774b);
            } else {
                instant = instant5;
                iVar = null;
            }
            arrayList.add(new tgb.l(kVarValueOf, jVarValueOf, str, num, instant3, instant4, instant, instant6, iVar));
            it8 = it9;
        }
        i0 i0Var = m0Var.f;
        if (i0Var != null) {
            String str2 = i0Var.f245744a;
            String str3 = i0Var.f245745b;
            String str4 = i0Var.f245746c;
            qgb.q qVar = i0Var.d;
            mVar = new tgb.m(str2, str3, str4, new tgb.e(qVar.f245762a, qVar.f245763b));
        } else {
            mVar = null;
        }
        c0 c0Var = m0Var.f245759g;
        boolean z3 = c0Var.f245727a;
        Instant instant7 = c0Var.f245728b;
        qgb.t tVar = c0Var.f245729c;
        if (tVar != null) {
            String str5 = tVar.f245766a;
            List<qgb.m> list2 = tVar.f245767b;
            ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
            for (qgb.m mVar2 : list2) {
                arrayList2.add(new tgb.d(mVar2.f245753a, mVar2.f245754b));
            }
            fVar = new tgb.f(str5, arrayList2);
        } else {
            fVar = null;
        }
        tgb.h hVar = new tgb.h(z3, instant7, fVar);
        l0 l0Var = m0Var.f245760h;
        String str6 = l0Var.f245751a;
        List<qgb.m> list3 = l0Var.f245752b;
        ArrayList arrayList3 = new ArrayList(zhm.w.t(list3, 10));
        for (qgb.m mVar3 : list3) {
            arrayList3.add(new tgb.d(mVar3.f245753a, mVar3.f245754b));
        }
        return new tgb.o(gVarValueOf, z, instant2, gVar, arrayList, mVar, hVar, new tgb.n(str6, arrayList3), m0Var.i);
    }

    public static final r1 C(StoreGenericBadge storeGenericBadge) {
        Intrinsics.checkNotNullParameter(storeGenericBadge, "<this>");
        return new r1(storeGenericBadge.f88522a.name(), storeGenericBadge.f88523b, storeGenericBadge.f88524c);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:197:0x01fc A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String D(java.lang.String r1) {
        /*
            Method dump skipped, instruction units count: 670
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: foh.i.D(java.lang.String):java.lang.String");
    }

    public static final arj.a E(jrj.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        String strD = cVar.getId();
        String strF = cVar.getWalletId();
        long jA = cVar.getAmount();
        String strE = cVar.getStartDate();
        String strC = cVar.getEndDate();
        String strB = cVar.getCategoryTag();
        Locale locale = Locale.ROOT;
        return new arj.a(jA, strD, F(arj.b.GLOBAL), strF, "", strE, strC, p.a.r(locale, "ROOT", strB, locale, "toLowerCase(...)"));
    }

    public static final String F(arj.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        int i = irj.a.f168063a[bVar.ordinal()];
        if (i == 1) {
            return "GLOBAL";
        }
        if (i == 2) {
            return "POCKET";
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final ro6.g G(ThirdPartyBrazil thirdPartyBrazil) {
        Intrinsics.checkNotNullParameter(thirdPartyBrazil, "<this>");
        io3.b bVar = thirdPartyBrazil.f73115a;
        return new ro6.g(bVar != null ? bVar.f163143b : null, thirdPartyBrazil.f73116b);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final PixAuthorisationFrequency H(String str) {
        String upperCase = str.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        if (upperCase == null) {
            return null;
        }
        switch (upperCase.hashCode()) {
            case -1738378111:
                if (!upperCase.equals("WEEKLY")) {
                    return null;
                }
                return PixAuthorisationFrequency.WEEKLY;
            case -235019571:
                if (upperCase.equals("SEMIANNUAL")) {
                    return PixAuthorisationFrequency.SEMIANNUAL;
                }
                return null;
            case 78467:
                if (upperCase.equals("P1D")) {
                    return PixAuthorisationFrequency.DAILY;
                }
                return null;
            case 78476:
                if (!upperCase.equals("P1M")) {
                    return null;
                }
                return PixAuthorisationFrequency.MONTHLY;
            case 78486:
                if (!upperCase.equals("P1W")) {
                    return null;
                }
                return PixAuthorisationFrequency.WEEKLY;
            case 78488:
                if (!upperCase.equals("P1Y")) {
                    return null;
                }
                return PixAuthorisationFrequency.ANNUAL;
            case 78517:
                if (!upperCase.equals("P2W")) {
                    return null;
                }
                return PixAuthorisationFrequency.FORTNIGHTLY;
            case 78538:
                if (!upperCase.equals("P3M")) {
                    return null;
                }
                return PixAuthorisationFrequency.QUARTERLY;
            case 78653:
                if (!upperCase.equals("P7D")) {
                    return null;
                }
                return PixAuthorisationFrequency.WEEKLY;
            case 2432049:
                if (!upperCase.equals("P14D")) {
                    return null;
                }
                return PixAuthorisationFrequency.FORTNIGHTLY;
            case 1720567065:
                if (!upperCase.equals("QUARTERLY")) {
                    return null;
                }
                return PixAuthorisationFrequency.QUARTERLY;
            case 1935336927:
                if (!upperCase.equals("ANNUAL")) {
                    return null;
                }
                return PixAuthorisationFrequency.ANNUAL;
            case 1954618349:
                if (!upperCase.equals("MONTHLY")) {
                    return null;
                }
                return PixAuthorisationFrequency.MONTHLY;
            default:
                return null;
        }
    }

    public static final h87.f I(Market market) {
        Intrinsics.checkNotNullParameter(market, "<this>");
        int i = b87.b.f13114a[market.ordinal()];
        if (i == 1) {
            return h87.f.US_INDEXES;
        }
        if (i == 2) {
            return h87.f.EUROPE_INDEXES;
        }
        if (i == 3) {
            return h87.f.APAC_INDEXES;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final String J(l6j.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        int i = o6j.a.f222617a[aVar.ordinal()];
        if (i == 1) {
            return "STOP_BUY_ORDER_INTRO";
        }
        if (i == 2) {
            return "STOP_SELL_ORDER_INTRO";
        }
        if (i == 3) {
            return "LIMIT_BUY_ORDER_INTRO";
        }
        if (i == 4) {
            return "LIMIT_SELL_ORDER_INTRO";
        }
        if (i == 5) {
            return "RECURRING_ORDER_INTRO";
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final TextLocalisedClause K(xzg.l0 l0Var) {
        Intrinsics.checkNotNullParameter(l0Var, "<this>");
        int i = h.f136967b[l0Var.ordinal()];
        if (i == 1) {
            return new TextLocalisedClause(R$string.wealth_trading_topMovers_filters_timeSpan_oneDay, null, null, 14);
        }
        if (i == 2) {
            return new TextLocalisedClause(R$string.wealth_trading_topMovers_filters_timeSpan_oneWeek, null, null, 14);
        }
        if (i == 3) {
            return new TextLocalisedClause(R$string.wealth_trading_topMovers_filters_timeSpan_oneMonth, null, null, 14);
        }
        if (i == 4) {
            return new TextLocalisedClause(R$string.wealth_trading_topMovers_filters_timeSpan_oneYear, null, null, 14);
        }
        if (i == 5) {
            return new TextLocalisedClause(R$string.wealth_trading_topMovers_filters_timeSpan_fiveYears, null, null, 14);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final TextLocalisedClause L(n0 n0Var) {
        Intrinsics.checkNotNullParameter(n0Var, "<this>");
        int i = h.f136966a[n0Var.ordinal()];
        if (i == 1) {
            return new TextLocalisedClause(R$string.wealth_trading_topMovers_filters_moverType_all, null, null, 14);
        }
        if (i == 2) {
            return new TextLocalisedClause(R$string.wealth_trading_topMovers_filters_moverType_topGainers, null, null, 14);
        }
        if (i == 3) {
            return new TextLocalisedClause(R$string.wealth_trading_topMovers_filters_moverType_topLosers, null, null, 14);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final LinkedHashSet M(b9h.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        LinkedHashSet linkedHashSet = aVar.d;
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        DateTimeFormatter dateTimeFormatterDate = ISODateTimeFormat.date();
        Intrinsics.checkNotNullExpressionValue(dateTimeFormatterDate, "date(...)");
        Iterator it8 = linkedHashSet.iterator();
        while (it8.hasNext()) {
            linkedHashSet2.add(dateTimeFormatterDate.print((ReadableInstant) it8.next()));
        }
        linkedHashSet2.add(aVar.f13782c.toString());
        return linkedHashSet2;
    }

    public static final f9i.c a(String url2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        return new f9i.c(new f9i.e(url2, false));
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String c(java.lang.String r7, kotlin.Pair r8) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "keyPrefix"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.Object r0 = r8.f186385a
            kotlin.Pair r0 = (kotlin.Pair) r0
            java.lang.String r0 = cp5.d.d(r0)
            java.lang.Object r8 = r8.f186386b
            b9h.a r8 = (b9h.a) r8
            org.joda.time.DateTime r1 = r8.f13781b
            if (r1 == 0) goto L29
            org.joda.time.format.DateTimeFormatter r2 = org.joda.time.format.ISODateTimeFormat.date()
            java.lang.String r3 = "date(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            java.lang.String r1 = r2.print(r1)
            if (r1 != 0) goto L34
        L29:
            java.time.LocalDate r8 = r8.f13782c
            java.lang.String r1 = r8.toString()
            java.lang.String r8 = "toString(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r8)
        L34:
            java.lang.String[] r7 = new java.lang.String[]{r7, r0, r1}
            java.util.List r7 = zhm.v.k(r7)
            r0 = r7
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            r5 = 0
            r6 = 62
            java.lang.String r1 = "_"
            r2 = 0
            r3 = 0
            r4 = 0
            java.lang.String r7 = zhm.d0.k0(r0, r1, r2, r3, r4, r5, r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: foh.i.c(java.lang.String, kotlin.Pair):java.lang.String");
    }

    public static final boolean d(hrf.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        if (cVar instanceof hrf.a) {
            return ((hrf.a) cVar).f154810a.f104757j.e;
        }
        if (!(cVar instanceof hrf.b)) {
            throw new NoWhenBranchMatchedException();
        }
        Boolean bool = ((hrf.b) cVar).f154811a.f218622a.f199516j;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void e(View view, v1 colorScheme, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(colorScheme, "colorScheme");
        if (view instanceof ur0.a) {
            ((ur0.a) view).r(colorScheme, i, i2, i3);
        }
        if (!(view instanceof ViewGroup) || (view instanceof ur0.b)) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            e(viewGroup.getChildAt(i5), colorScheme, i, i2, i3);
        }
    }

    public static final LinkedHashMap f(Map map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null) {
                linkedHashMap.put(key, value);
            }
        }
        return linkedHashMap;
    }

    public static final BillInputV2 g(String name, List list) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (list == null) {
            return null;
        }
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            BillInputV2 billInputV2 = (BillInputV2) it8.next();
            if (Intrinsics.f(billInputV2.getF61319a(), name)) {
                return billInputV2;
            }
            BillInputV2 billInputV2G = g(name, billInputV2.getF61321c());
            if (billInputV2G != null) {
                return billInputV2G;
            }
        }
        return null;
    }

    public static final DateTime h(h2 step, boolean z) {
        Intrinsics.checkNotNullParameter(step, "step");
        DateTime dateTimeA = step.a();
        if (dateTimeA != null || (dateTimeA = step.c()) != null) {
            return dateTimeA;
        }
        DateTime dateTimeI = step.i();
        if (dateTimeI == null || !z) {
            return null;
        }
        return dateTimeI;
    }

    public static final BridgeDestination i(PricingPlanSubscribeInfoIneligibilityReason pricingPlanSubscribeInfoIneligibilityReason) {
        Intrinsics.checkNotNullParameter(pricingPlanSubscribeInfoIneligibilityReason, "<this>");
        if (glk.n.f144725a[pricingPlanSubscribeInfoIneligibilityReason.ordinal()] == 1) {
            return u0.b(jbb.a.a(ibb.c.f160141b, null, null, null, 14));
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final int j(int i) {
        return (int) (i * Resources.getSystem().getDisplayMetrics().density);
    }

    public static final d0 k(wsg.n nVar, String str, xi0.b currency, io3.l pocketType) {
        Intrinsics.checkNotNullParameter(nVar, "<this>");
        Intrinsics.checkNotNullParameter(currency, "currency");
        AccountId.Personal accountId = AccountId.Personal.f51414a;
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(pocketType, "pocketType");
        return str != null ? nVar.z(accountId, str) : osg.b.r(nVar, currency, pocketType, null, accountId, 28);
    }

    public static final ArrayList l(e16.d dVar, Set excludedAssetExternalIds) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(excludedAssetExternalIds, "excludedAssetExternalIds");
        ArrayList arrayList = dVar.f121891c;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (!excludedAssetExternalIds.contains(((e16.g) obj2).f121894a.f71635a)) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : arrayList2) {
            if (((e16.g) obj3).f121894a.f71636b.compareTo(BigInteger.ZERO) > 0) {
                arrayList3.add(obj3);
            }
        }
        return arrayList3;
    }

    public static final ArrayList m(FormScreen formScreen) {
        Intrinsics.checkNotNullParameter(formScreen, "<this>");
        List list = formScreen.f63468b;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (obj2 instanceof InputItem) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    public static final Collection n(FormScreen formScreen) {
        String id10;
        Intrinsics.checkNotNullParameter(formScreen, "<this>");
        ArrayList arrayListM = m(formScreen);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : arrayListM) {
            InputItem inputItem = (InputItem) obj2;
            if (inputItem instanceof BackendFlowCheckboxItem) {
                id10 = "CHECKBOX_GROUP";
            } else if (inputItem instanceof xl2.l) {
                id10 = "RADIO_GROUP_" + ((xl2.l) inputItem).getF63595c();
            } else {
                id10 = inputItem instanceof NoneApplyItem ? "NONE_APPLY" : inputItem.getId();
            }
            Object objO = linkedHashMap.get(id10);
            if (objO == null) {
                objO = v0.a.o(linkedHashMap, id10);
            }
            ((List) objO).add(obj2);
        }
        return linkedHashMap.values();
    }

    public static final InputItem o(FormScreen formScreen, String id10) {
        Intrinsics.checkNotNullParameter(formScreen, "<this>");
        Intrinsics.checkNotNullParameter(id10, "id");
        for (InputItem inputItem : m(formScreen)) {
            if (Intrinsics.f(inputItem.getId(), id10)) {
                return inputItem;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public static final void p(PaymentMethod paymentMethod, String tag2) {
        String str;
        Intrinsics.checkNotNullParameter(tag2, "tag");
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        if (paymentMethod instanceof PaymentMethod.Card) {
            str = "Card";
        } else if (paymentMethod instanceof PaymentMethod.Pocket) {
            str = "Pocket";
        } else if (paymentMethod instanceof PaymentMethod.RevolutAccount) {
            str = "Revolut account";
        } else {
            if (!(paymentMethod instanceof PaymentMethod.BankAccount)) {
                throw new NoWhenBranchMatchedException();
            }
            str = "BankAccount";
        }
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, tag2, "Error while payment method selection. Selected type is: ".concat(str), null, h0Var);
    }

    public static final Map q(Pair... pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        return r0.v(nkm.y.x(nkm.y.n(kotlin.collections.d.E(pairs), new jj3.a(23)), new jj3.a(24)));
    }

    public static final float r(dj0.d dVar, dj0.d min, dj0.d max) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(min, "min");
        Intrinsics.checkNotNullParameter(max, "max");
        if (Intrinsics.f(min, max)) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        float f = min.f115082a;
        return (dVar.f115082a - f) / (max.f115082a - f);
    }

    public static final String s(hrf.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        if (cVar instanceof hrf.a) {
            return ((hrf.a) cVar).f154810a.f104765t;
        }
        if (cVar instanceof hrf.b) {
            return ((hrf.b) cVar).f154811a.f218627j;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final void t(LinkedHashMap linkedHashMap, q6 q6Var, Object obj2) {
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        linkedHashMap.put(q6Var, obj2);
    }

    public static final Object u(Json json, JsonElement element, mlm.b deserializer) {
        Decoder sVar;
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(element, "element");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        String str = null;
        if (element instanceof JsonObject) {
            sVar = new slm.u(json, (JsonObject) element, str, 12);
        } else if (element instanceof kotlinx.serialization.json.a) {
            sVar = new slm.v(json, (kotlinx.serialization.json.a) element);
        } else {
            if (!(element instanceof rlm.p) && !Intrinsics.f(element, JsonNull.INSTANCE)) {
                throw new NoWhenBranchMatchedException();
            }
            sVar = new slm.s(json, (kotlinx.serialization.json.b) element, null);
        }
        return sVar.b(deserializer);
    }

    public static final Object v(Json json, String discriminator, JsonObject element, mlm.b deserializer) {
        Intrinsics.checkNotNullParameter(json, "<this>");
        Intrinsics.checkNotNullParameter(discriminator, "discriminator");
        Intrinsics.checkNotNullParameter(element, "element");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        return new slm.u(json, element, discriminator, deserializer.getDescriptor()).b(deserializer);
    }

    public static final LinkedHashMap w(Object obj2, Object obj3, Map map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap(q0.b(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object key2 = entry.getKey();
            Object value = entry.getValue();
            if (Intrinsics.f(obj2, key2)) {
                value = obj3;
            }
            linkedHashMap.put(key, value);
        }
        return linkedHashMap;
    }

    public static final ThirdPartyBrazil x(qo6.s sVar) {
        Intrinsics.checkNotNullParameter(sVar, "<this>");
        String logoPng = sVar.getLogoPng();
        return new ThirdPartyBrazil(logoPng != null ? new io3.b(io3.a.BASE64, logoPng) : null, sVar.getTitle());
    }

    public static final ThirdPartyBrazil y(ro6.g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        String strA = gVar.getLogoPng();
        return new ThirdPartyBrazil(strA != null ? new io3.b(io3.a.BASE64, strA) : null, gVar.getTitle());
    }

    public static final StoreGenericBadge z(r1 r1Var) {
        Object objA;
        Intrinsics.checkNotNullParameter(r1Var, "<this>");
        String str = r1Var.f131702a;
        try {
            m.Companion companion = yhm.m.INSTANCE;
            objA = t1e.t.valueOf(str);
        } catch (Throwable th10) {
            m.Companion companion2 = yhm.m.INSTANCE;
            objA = yhm.o.a(th10);
        }
        if (objA instanceof yhm.n) {
            objA = null;
        }
        t1e.t tVar = (t1e.t) objA;
        if (tVar == null) {
            tVar = t1e.t.UNKNOWN;
        }
        return new StoreGenericBadge(tVar, r1Var.f131703b, r1Var.f131704c);
    }

    public abstract String b();
}
