package pw5;

import ci7.f;
import ci7.i;
import ci7.m;
import ci7.p;
import ci7.s;
import ci7.t;
import ci7.u;
import ci7.v;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.credit.autopay.models.CreditAutopaySourceConfig;
import com.revolut.feature.credit.card.models.CreditCard;
import com.revolut.feature.instruments.trend.collections.api.model.InstrumentsTrendCollectionFilterValue;
import com.revolut.feature.instruments.trend.collections.api.model.InstrumentsTrendCollectionTimeframeFilterValue;
import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import com.revolut.feature.topup_screen.common.TopUpTarget;
import com.revolut.kompot.common.R$string;
import com.revolut.retail.feature.balance.picker.api.balance_picker_v2.BalanceSelector$InputData;
import com.revolut.retail.feature.esim.api.model.EsimGetPlanLaunchMode;
import com.revolut.retail.feature.esim.impl.ui.screens.home.get_plan.EsimGetPlanScreenContract$InputData;
import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import com.revolut.shared.feature.market_data.models.domain.models.Asset;
import com.revolut.shared.feature.market_data.models.domain.models.ChargeBreakdown;
import com.revolut.shared.feature.market_data.models.domain.models.ChargeEntry;
import efm.r;
import hfk.n;
import hha.h0;
import io3.l;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import koi.j;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.a0;
import kotlinx.coroutines.d;
import nii.z;
import org.joda.time.DateTimeZone;
import org.joda.time.format.DateTimeFormatter;
import pfm.h;
import qi7.e;
import s06.q;
import skm.p0;
import tk0.g;
import zhm.d0;
import zhm.q0;
import zhm.w;
import zhm.y0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {
    public static h A(mk0.a aVar, g key, Object value) {
        d coroutineContext = p0.f264003c;
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        return pd.b.n(coroutineContext, new uvf.b(aVar, key, value, false, null, 29));
    }

    public static final l5k.c B(kq2.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        return new l5k.c(dVar.f188299b, Double.valueOf(dVar.f188298a));
    }

    public static final double C(String str) {
        try {
            return Double.parseDouble(a0.D(str, "%", "", false));
        } catch (NumberFormatException unused) {
            return 0.0d;
        }
    }

    public static final bi7.a D(v vVar) {
        Object next;
        qi7.g fVar;
        Intrinsics.checkNotNullParameter(vVar, "<this>");
        Iterator<E> it8 = ph7.c.a().iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(vVar.f24424a, ((ph7.c) next).b())) {
                break;
            }
        }
        ph7.c cVar = (ph7.c) next;
        if (cVar == null) {
            return null;
        }
        ArrayList<u> arrayList = vVar.f24425b;
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        for (u uVar : arrayList) {
            Intrinsics.checkNotNullParameter(uVar, "<this>");
            String str = uVar.f24421a;
            String str2 = uVar.f24422b;
            t tVar = uVar.f24423c;
            if (tVar instanceof p) {
                p pVar = (p) tVar;
                fVar = new e(pVar.f24415a, pVar.f24416b);
            } else if (tVar instanceof i) {
                i iVar = (i) tVar;
                fVar = new qi7.c(iVar.f24408a, iVar.f24409b, iVar.f24410c);
            } else if (tVar instanceof f) {
                f fVar2 = (f) tVar;
                fVar = new qi7.b(fVar2.f24405a, fVar2.f24406b);
            } else if (tVar instanceof m) {
                fVar = new qi7.d(((m) tVar).f24413a);
            } else if (tVar instanceof s) {
                s sVar = (s) tVar;
                fVar = new qi7.f(sVar.f24418a, sVar.f24419b, sVar.f24420c);
            } else {
                if (tVar != null) {
                    throw new NoWhenBranchMatchedException();
                }
                fVar = null;
            }
            arrayList2.add(new qi7.a(str, str2, fVar));
        }
        return new bi7.a(cVar, arrayList2);
    }

    public static final qha.b E(n nVar) {
        Intrinsics.checkNotNullParameter(nVar, "<this>");
        qha.d dVar = new qha.d(nVar.getFeeCode());
        dj0.d dVarO = mo3.a.o(nVar.getAmount());
        jo3.a aVarD = nVar.getOriginalAmount();
        qha.e eVar = null;
        h0Var = null;
        h0 h0Var = null;
        dj0.d dVarO2 = aVarD != null ? mo3.a.o(aVarD) : null;
        hfk.m mVarB = nVar.getDiscountInfo();
        if (mVarB != null) {
            Intrinsics.checkNotNullParameter(mVarB, "<this>");
            String type = mVarB.getType();
            if (type != null) {
                h0[] h0VarArrValues = h0.values();
                int length = h0VarArrValues.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    h0 h0Var2 = h0VarArrValues[i];
                    if (a0.z(h0Var2.name(), type, true)) {
                        h0Var = h0Var2;
                        break;
                    }
                    i++;
                }
            }
            eVar = new qha.e(h0Var, mVarB.getEndDate());
        }
        return new qha.b(dVar, dVarO, dVarO2, eVar);
    }

    public static final z3d.a F(s4d.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        List<s4d.d> listA = aVar.getItems();
        ArrayList arrayList = new ArrayList(w.t(listA, 10));
        for (s4d.d dVar : listA) {
            Intrinsics.checkNotNullParameter(dVar, "<this>");
            List listB = dVar.getItems();
            ArrayList arrayList2 = new ArrayList(w.t(listB, 10));
            Iterator it8 = listB.iterator();
            while (it8.hasNext()) {
                arrayList2.add(pyd.c.d0((s4d.e) it8.next()));
            }
            arrayList.add(new z3d.d(dVar.getId(), dVar.getName(), arrayList2, dVar.getIsDefault()));
        }
        return new z3d.a(arrayList);
    }

    public static final lg0.e G(String template, jf0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(template, "template");
        q qVarL = l(template, cVar);
        if (qVarL == null) {
            return null;
        }
        List list = qVarL.f258874b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i = 0;
        for (Object obj2 : qVarL.f258873a) {
            int i2 = i + 1;
            if (i < 0) {
                zhm.v.s();
                throw null;
            }
            String str = (String) obj2;
            String str2 = (String) list.get(i);
            if (a0.H(str, "{", false) && a0.y(str, "}", false)) {
                String strSubstring = str.substring(1, str.length() - 1);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                linkedHashMap.put(strSubstring, str2);
            }
            i = i2;
        }
        String str3 = cVar.f173629c;
        lg0.f fVar = lg0.g.Companion;
        HashMap params = cVar.d;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(params, "params");
        LinkedHashMap params2 = new LinkedHashMap(q0.b(params.size()));
        for (Map.Entry entry : params.entrySet()) {
            params2.put(entry.getKey(), y0.b(entry.getValue()));
        }
        Intrinsics.checkNotNullParameter(params2, "params");
        return new lg0.e(str3, linkedHashMap, params2, list);
    }

    public static final ChargeBreakdown H(nrf.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Amount amountD = d(cVar.e.f218633a);
        nrf.e eVar = cVar.e;
        ArrayList arrayListE0 = d0.E0(eVar.f218635c.f218642b, eVar.f218634b.f218638c);
        ArrayList arrayList = new ArrayList(w.t(arrayListE0, 10));
        Iterator it8 = arrayListE0.iterator();
        while (true) {
            Amount amountD2 = null;
            if (!it8.hasNext()) {
                return new ChargeBreakdown(amountD, arrayList, (Amount) null, 12);
            }
            nrf.d dVar = (nrf.d) it8.next();
            String str = dVar.f218630a;
            String str2 = dVar.f218631b;
            String str3 = dVar.f218632c;
            Amount amountD3 = d(dVar.d);
            dj0.d dVar2 = dVar.e;
            if (dVar2 != null) {
                amountD2 = d(dVar2);
            }
            arrayList.add(new ChargeEntry(str2, str, str3, amountD3, amountD2));
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final zm3.h I(String str) {
        if (str == null) {
            return null;
        }
        switch (str.hashCode()) {
            case 2459034:
                if (str.equals("PLUS")) {
                    return zm3.h.PLUS;
                }
                return null;
            case 73249511:
                if (str.equals("METAL")) {
                    return zm3.h.METAL;
                }
                return null;
            case 80846732:
                if (str.equals("ULTRA")) {
                    return zm3.h.ULTRA;
                }
                return null;
            case 399530551:
                if (str.equals("PREMIUM")) {
                    return zm3.h.PREMIUM;
                }
                return null;
            case 403485027:
                if (str.equals("PRIVATE")) {
                    return zm3.h.PRIVATE;
                }
                return null;
            case 1676075749:
                if (str.equals("ESSENTIALS")) {
                    return zm3.h.ESSENTIALS;
                }
                return null;
            case 2095255229:
                if (str.equals("STANDARD")) {
                    return zm3.h.STANDARD;
                }
                return null;
            default:
                return null;
        }
    }

    public static final String J(InstrumentsTrendCollectionFilterValue instrumentsTrendCollectionFilterValue) {
        Intrinsics.checkNotNullParameter(instrumentsTrendCollectionFilterValue, "<this>");
        if (instrumentsTrendCollectionFilterValue == InstrumentsTrendCollectionTimeframeFilterValue.ONE_DAY) {
            return "ONE_DAY";
        }
        if (instrumentsTrendCollectionFilterValue == InstrumentsTrendCollectionTimeframeFilterValue.ONE_WEEK) {
            return "ONE_WEEK";
        }
        if (instrumentsTrendCollectionFilterValue == InstrumentsTrendCollectionTimeframeFilterValue.ONE_MONTH) {
            return "ONE_MONTH";
        }
        if (instrumentsTrendCollectionFilterValue == InstrumentsTrendCollectionTimeframeFilterValue.ONE_YEAR) {
            return "ONE_YEAR";
        }
        if (instrumentsTrendCollectionFilterValue == InstrumentsTrendCollectionTimeframeFilterValue.FIVE_YEAR) {
            return "FIVE_YEAR";
        }
        throw new IllegalArgumentException("Missing timeSpan filter value");
    }

    public static final yte.n K(pte.a aVar, TopUpTarget topUpTarget) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(topUpTarget, "topUpTarget");
        int i = que.b.f249437a[aVar.ordinal()];
        if (i == 1) {
            return yte.n.REVPAY;
        }
        if (i != 2 && i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        Intrinsics.checkNotNullParameter(topUpTarget, "<this>");
        if (topUpTarget instanceof TopUpTarget.Invest) {
            return yte.n.INVEST;
        }
        if (topUpTarget instanceof TopUpTarget.Joint) {
            return yte.n.JOINT;
        }
        if (topUpTarget instanceof TopUpTarget.Main) {
            return yte.n.CURRENT;
        }
        if (topUpTarget instanceof TopUpTarget.Pro) {
            return yte.n.PRO;
        }
        if (topUpTarget instanceof TopUpTarget.Savings) {
            return yte.n.SAVINGS;
        }
        if (topUpTarget instanceof TopUpTarget.RevXFiat) {
            return yte.n.REVX;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [gim.h, kotlin.jvm.functions.Function2] */
    public static String L(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        String upperCase = str.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        if (oi0.d.f0(upperCase)) {
            return str;
        }
        nkm.n nVarA = nkm.p.a((gim.h) h(upperCase).f195577b);
        while (nVarA.hasNext()) {
            String str2 = (String) nVarA.next();
            if (oi0.d.f0(str2)) {
                return str2;
            }
        }
        return null;
    }

    public static final void a(aim.e eVar, j jVar) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        if (jVar != null) {
            eVar.add(jVar);
        }
    }

    public static final SimpleDateFormat b(SimpleDateFormat simpleDateFormat, ZoneId zoneId) {
        Intrinsics.checkNotNullParameter(simpleDateFormat, "<this>");
        if (zoneId == null) {
            return simpleDateFormat;
        }
        Object objClone = simpleDateFormat.clone();
        Intrinsics.i(objClone, "null cannot be cast to non-null type java.text.SimpleDateFormat");
        SimpleDateFormat simpleDateFormat2 = (SimpleDateFormat) objClone;
        simpleDateFormat2.setTimeZone(TimeZone.getTimeZone(zoneId));
        return simpleDateFormat2;
    }

    public static final DateTimeFormatter c(DateTimeFormatter dateTimeFormatter, ZoneId zoneId) {
        Intrinsics.checkNotNullParameter(dateTimeFormatter, "<this>");
        if (zoneId == null) {
            return dateTimeFormatter;
        }
        DateTimeFormatter dateTimeFormatterWithZone = dateTimeFormatter.withZone(DateTimeZone.forTimeZone(TimeZone.getTimeZone(zoneId)));
        Intrinsics.h(dateTimeFormatterWithZone);
        return dateTimeFormatterWithZone;
    }

    public static final Amount d(dj0.d dVar) {
        BigInteger bigIntegerValueOf = BigInteger.valueOf(dVar.f115082a);
        xi0.b bVar = dVar.f115083b;
        return new Amount(new BigDecimal(bigIntegerValueOf, bVar.c()), cp5.d.A(bVar) ? new Asset(f8l.c.FIAT, bVar.f306286a, bVar) : cp5.d.z(bVar) ? new Asset(f8l.c.CRYPTO, bVar.f306286a, bVar) : cp5.d.y(bVar) ? new Asset(f8l.c.COMMODITY, bVar.f306286a, bVar) : new Asset(f8l.c.UNDEFINED, bVar.f306286a, bVar));
    }

    public static final z e() {
        return new z(new TextLocalisedClause(R$string.common_error_state_title, null, null, 14), new TextLocalisedClause(R$string.common_error_state_description, null, null, 14), null, null, null, null, true, null, null, null, null, null, null, 32508);
    }

    public static final ArrayList f(qv0.i header, List items) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(items, "items");
        List listC = zhm.u.c(header);
        yp0.b.k(items, 0, R$attr.uikit_dp16, 0, 0, 29);
        return d0.E0(items, listC);
    }

    public static final r g(r rVar) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        r rVarFlatMap = rVar.flatMap(new u3a.q(new u8c.c(12), 25));
        Intrinsics.checkNotNullExpressionValue(rVarFlatMap, "flatMap(...)");
        r map = rVarFlatMap.filter(new u3a.q(new u8c.c(10), 23)).map(new u3a.q(new u8c.c(11), 24));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    public static final lim.q h(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Character[] chArr = {'0', 'O'};
        IntRange intRangeO = kotlin.text.d0.O(str);
        ArrayList arrayList = new ArrayList();
        vim.f it8 = intRangeO.iterator();
        while (it8.f289625c) {
            Object next = it8.next();
            if (kotlin.collections.d.I(chArr, Character.valueOf(str.charAt(((Number) next).intValue())))) {
                arrayList.add(next);
            }
        }
        return nkm.p.b(new z00.f(str, 1 << arrayList.size(), arrayList, chArr, null));
    }

    public static final Address i(com.revolut.feature.junior_profile.api.models.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        if (aVar instanceof JuniorBankingProfile) {
            return ((JuniorBankingProfile) aVar).k;
        }
        if (!(aVar instanceof com.revolut.feature.junior_profile.api.models.c)) {
            throw new NoWhenBranchMatchedException();
        }
        com.revolut.feature.junior_profile.api.models.f fVarY = y(aVar);
        if (fVarY != null) {
            return fVarY.b();
        }
        return null;
    }

    public static final dj0.d j(CreditCard creditCard) {
        Intrinsics.checkNotNullParameter(creditCard, "<this>");
        int i = ml4.a.f206632a[creditCard.a().ordinal()];
        if (i == 1) {
            return creditCard.d;
        }
        if (i == 2) {
            return creditCard.f69801p;
        }
        if (i == 3 || i == 4 || i == 5) {
            return creditCard.f69794c;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final boolean k(EsimGetPlanScreenContract$InputData esimGetPlanScreenContract$InputData) {
        Intrinsics.checkNotNullParameter(esimGetPlanScreenContract$InputData, "<this>");
        EsimGetPlanLaunchMode esimGetPlanLaunchMode = esimGetPlanScreenContract$InputData.f100995c;
        if ((esimGetPlanLaunchMode instanceof EsimGetPlanLaunchMode.PlanChange) || (esimGetPlanLaunchMode instanceof EsimGetPlanLaunchMode.PlanUpgrade)) {
            return false;
        }
        if ((esimGetPlanLaunchMode instanceof EsimGetPlanLaunchMode.DataPlanChange) || esimGetPlanLaunchMode == null) {
            return true;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final q l(String str, jf0.c cVar) {
        String strSubstring;
        String strSubstring2;
        int iS = kotlin.text.d0.S(str, '?', 0, 6);
        if (iS != -1) {
            str = str.substring(0, iS);
            Intrinsics.checkNotNullExpressionValue(str, "substring(...)");
        }
        int length = str.length();
        int i = 0;
        while (true) {
            strSubstring = "";
            if (i >= length) {
                strSubstring2 = "";
                break;
            }
            if (str.charAt(i) != '/') {
                strSubstring2 = str.substring(i);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                break;
            }
            i++;
        }
        int iP = kotlin.text.d0.P(strSubstring2);
        while (true) {
            if (-1 >= iP) {
                break;
            }
            if (strSubstring2.charAt(iP) != '/') {
                strSubstring = strSubstring2.substring(0, iP + 1);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                break;
            }
            iP--;
        }
        List listM0 = kotlin.text.d0.m0(strSubstring, new char[]{'/'}, 6);
        List listSubList = cVar.h().subList(1, cVar.h().size());
        if (listSubList.size() == listM0.size()) {
            int i2 = 0;
            for (Object obj2 : listM0) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    zhm.v.s();
                    throw null;
                }
                String str2 = (String) obj2;
                if (a0.H(str2, "{", false) || str2.equals(listSubList.get(i2))) {
                    i2 = i3;
                }
            }
            return new q(listM0, listSubList);
        }
        return null;
    }

    public static final dj0.d m(CreditCard creditCard) {
        Intrinsics.checkNotNullParameter(creditCard, "<this>");
        int i = ml4.a.f206633b[creditCard.i.ordinal()];
        if (i == 1) {
            return creditCard.f69794c;
        }
        if (i == 2) {
            return creditCard.f69795g;
        }
        if (i == 3) {
            return creditCard.e;
        }
        if (i == 4) {
            return new dj0.d(0L, creditCard.d.f115083b);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final int n(h5b.e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        return eVar.f149526b.k() ? R$attr.uikit_colorBlue : eVar.a() <= 60 ? R$attr.uikit_colorRed : eVar.a() <= 80 ? R$attr.uikit_colorOrange : R$attr.uikit_colorBlue;
    }

    public static final String o(com.revolut.feature.junior_profile.api.models.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        if (aVar instanceof JuniorBankingProfile) {
            return ((JuniorBankingProfile) aVar).f77103j;
        }
        if (!(aVar instanceof com.revolut.feature.junior_profile.api.models.c)) {
            throw new NoWhenBranchMatchedException();
        }
        com.revolut.feature.junior_profile.api.models.f fVarY = y(aVar);
        if (fVarY != null) {
            return fVarY.a();
        }
        return null;
    }

    public static final boolean p(j8l.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return aVar == j8l.a.INVEST_CASH_HOLDING || aVar == j8l.a.JOINT_INVEST_CASH_HOLDING;
    }

    public static final boolean q(j8l.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        int i = j8l.b.f172226a[aVar.ordinal()];
        return i == 2 || i == 7 || i == 9 || i == 10;
    }

    public static final boolean r(j8l.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        switch (j8l.b.f172226a[aVar.ordinal()]) {
            case 1:
            case 3:
            case 6:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                return true;
            case 2:
            case 4:
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
            case 19:
            case 20:
            case 21:
            case 22:
                return false;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final boolean s(j8l.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        int i = j8l.b.f172226a[aVar.ordinal()];
        return i == 6 || i == 7 || i == 8;
    }

    public static final boolean t(j8l.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        int i = j8l.b.f172226a[aVar.ordinal()];
        return i == 1 || i == 2 || i == 3 || i == 4 || i == 5;
    }

    public static final BalanceSelector$InputData u(CreditAutopaySourceConfig creditAutopaySourceConfig, String str) {
        k1j.a aVar;
        Intrinsics.checkNotNullParameter(creditAutopaySourceConfig, "<this>");
        if (pr4.a.f238926a[creditAutopaySourceConfig.f68545a.ordinal()] != 1) {
            throw new NoWhenBranchMatchedException();
        }
        k1j.d dVar = k1j.d.RETAIL;
        l lVar = creditAutopaySourceConfig.f68546b;
        Set set = creditAutopaySourceConfig.f68547c;
        ArrayList arrayList = new ArrayList(w.t(set, 10));
        Iterator it8 = set.iterator();
        while (it8.hasNext()) {
            int i = pr4.a.f238927b[((bk4.h) it8.next()).ordinal()];
            if (i == 1) {
                aVar = k1j.a.POCKETS;
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar = k1j.a.JOINT_ACCOUNT;
            }
            arrayList.add(aVar);
        }
        Set setI1 = d0.i1(arrayList);
        Set set2 = creditAutopaySourceConfig.d;
        ArrayList arrayList2 = new ArrayList(w.t(set2, 10));
        Iterator it9 = set2.iterator();
        while (it9.hasNext()) {
            arrayList2.add(((xi0.b) it9.next()).f306286a);
        }
        return new BalanceSelector$InputData(setI1, dVar, lVar, null, creditAutopaySourceConfig.e, d0.i1(arrayList2), creditAutopaySourceConfig.f, str, null, 264);
    }

    public static final boolean v(String template, jf0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(template, "template");
        return l(template, cVar) != null;
    }

    public static final void w(mri.w wVar) {
        Intrinsics.checkNotNullParameter(wVar, "<this>");
        ((nzl.a) wVar).c(true, true);
    }

    public static final void x(mri.w wVar) {
        Intrinsics.checkNotNullParameter(wVar, "<this>");
        ((nzl.a) wVar).c(true, false);
    }

    public static final com.revolut.feature.junior_profile.api.models.f y(com.revolut.feature.junior_profile.api.models.a aVar) {
        List list;
        com.revolut.feature.junior_profile.api.models.h hVar;
        com.revolut.feature.junior_profile.api.models.c cVar = aVar instanceof com.revolut.feature.junior_profile.api.models.c ? (com.revolut.feature.junior_profile.api.models.c) aVar : null;
        if (cVar != null && (list = cVar.f77119j) != null) {
            Intrinsics.checkNotNullParameter(list, "<this>");
            List<com.revolut.feature.junior_profile.api.models.f> list2 = list;
            Iterator it8 = list2.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    hVar = null;
                    break;
                }
                com.revolut.feature.junior_profile.api.models.f fVar = (com.revolut.feature.junior_profile.api.models.f) it8.next();
                hVar = fVar instanceof com.revolut.feature.junior_profile.api.models.h ? (com.revolut.feature.junior_profile.api.models.h) fVar : null;
                if (hVar != null) {
                    break;
                }
            }
            if (hVar != null) {
                return hVar;
            }
            for (com.revolut.feature.junior_profile.api.models.f fVar2 : list2) {
                com.revolut.feature.junior_profile.api.models.e eVar = fVar2 instanceof com.revolut.feature.junior_profile.api.models.e ? (com.revolut.feature.junior_profile.api.models.e) fVar2 : null;
                if (eVar != null) {
                    return eVar;
                }
            }
        }
        return null;
    }

    public static r z(mk0.a aVar, g key) {
        d coroutineContext = p0.f264003c;
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        return rd0.e.c(aVar.f(key), coroutineContext);
    }
}
