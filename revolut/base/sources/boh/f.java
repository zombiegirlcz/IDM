package boh;

import android.content.Context;
import android.view.ViewGroup;
import auc.t0;
import com.revolut.biometric_verification.api.models.BiometricVerificationFeatures;
import com.revolut.biometric_verification.api.models.BiometricVerificationVisionResource;
import com.revolut.core.ui_kit.R$dimen;
import com.revolut.core.ui_kit.delegates.NestedChildDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.address.models.AddressItem;
import com.revolut.feature.crypto.config.api.models.CryptoAddressHostingProviderType;
import com.revolut.feature.crypto.config.api.models.CryptoPeggedPair;
import com.revolut.feature.crypto.config.api.models.CryptoPersonalExchangeFeesResources;
import com.revolut.feature.security_hub.api.models.WealthProtectionSuggestedAmount;
import com.revolut.feature.travel.miles.api.model.TravelMilesTransaction;
import com.revolut.feature.wealth.ui.api.actions.WealthAction;
import com.revolut.feature_travel_hotels_models.property.OverallPrice;
import com.revolut.feature_travel_hotels_models.property.Pricing;
import com.revolut.retail.wealth.resources.R$string;
import com.revolut.shared.feature.market_data.models.domain.models.Asset;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountAvailableToOnboard;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccounts;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingProduct;
import gu7.d4;
import gu7.g4;
import hfg.p0;
import hfg.s0;
import i4h.o0;
import io.reactivex.exceptions.ProtocolViolationException;
import java.math.BigDecimal;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import jr.d1;
import jr.e0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlinx.coroutines.flow.Flow;
import le.u1;
import org.joda.time.DateTime;
import sdl.a1;
import sdl.c1;
import sdl.u0;
import sdl.x0;
import xfg.j0;
import xfg.l0;
import xzg.b0;
import zhm.d0;
import zhm.f0;
import zhm.h0;
import zhm.q0;
import zhm.r0;

/* JADX INFO: loaded from: classes10.dex */
public abstract class f {
    public static final pd5.e A(ud5.d dVar) {
        Map mapG;
        Map externalProviders;
        if (dVar == null || (externalProviders = dVar.getExternalProviders()) == null) {
            mapG = r0.g();
        } else {
            try {
                LinkedHashMap linkedHashMap = new LinkedHashMap(q0.b(externalProviders.size()));
                for (Object obj2 : externalProviders.entrySet()) {
                    linkedHashMap.put(CryptoAddressHostingProviderType.valueOf((String) ((Map.Entry) obj2).getKey()), ((Map.Entry) obj2).getValue());
                }
                mapG = new LinkedHashMap(q0.b(linkedHashMap.size()));
                for (Object obj3 : linkedHashMap.entrySet()) {
                    Object key = ((Map.Entry) obj3).getKey();
                    Iterable<ud5.a> iterable = (Iterable) ((Map.Entry) obj3).getValue();
                    ArrayList arrayList = new ArrayList(zhm.w.t(iterable, 10));
                    for (ud5.a aVar : iterable) {
                        Intrinsics.checkNotNullParameter(aVar, "<this>");
                        arrayList.add(new pd5.a(aVar.getName(), aVar.getLogoId()));
                    }
                    mapG.put(key, arrayList);
                }
            } catch (IllegalArgumentException e) {
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
                mapG = r0.g();
            }
        }
        return new pd5.e(mapG);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final qzi.a B(arj.a r10) {
        /*
            Method dump skipped, instruction units count: 602
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: boh.f.B(arj.a):qzi.a");
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, java.util.Map] */
    public static final yt8.c C(vt8.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        yt8.i iVar = (yt8.i) u1.u(aVar.getStatus(), vt8.d.f291926a);
        List<vt8.b> elements = aVar.getElements();
        ArrayList arrayList = new ArrayList(zhm.w.t(elements, 10));
        for (vt8.b bVar : elements) {
            Intrinsics.checkNotNullParameter(bVar, "<this>");
            yt8.i iVar2 = (yt8.i) u1.u(bVar.getStatus(), vt8.d.f291926a);
            yt8.j jVar = (yt8.j) u1.u(bVar.getElement(), vt8.d.f291927b);
            String reviewMethod = bVar.getReviewMethod();
            yt8.g gVar = null;
            yt8.h hVar = reviewMethod != null ? (yt8.h) u1.v(reviewMethod, vt8.d.d) : null;
            String failReason = bVar.getFailReason();
            if (failReason != null) {
                gVar = (yt8.g) u1.v(failReason, vt8.d.e);
            }
            arrayList.add(new yt8.f(iVar2, jVar, hVar, gVar));
        }
        return new yt8.c(iVar, d0.i1(arrayList), f0.f322471a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v0, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ArrayList] */
    public static final yt8.d D(rt8.a aVar) {
        ?? arrayList;
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        List addresses = aVar.getAddresses();
        if (addresses != null) {
            List<rt8.d> list = addresses;
            arrayList = new ArrayList(zhm.w.t(list, 10));
            for (rt8.d dVar : list) {
                Intrinsics.checkNotNullParameter(dVar, "<this>");
                arrayList.add(new AddressItem(dVar.getElementId(), oo3.a.a(dVar.getAddress())));
            }
        } else {
            arrayList = f0.f322471a;
        }
        return new yt8.d((yt8.i) u1.u(aVar.getStatus(), vt8.d.f291926a), arrayList);
    }

    public static final Map E(Map map) {
        pd5.k kVar;
        if (map == null) {
            return r0.g();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(q0.b(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            pd5.k[] kVarArrValues = pd5.k.values();
            int length = kVarArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    kVar = null;
                    break;
                }
                kVar = kVarArrValues[i];
                if (a0.z(kVar.name(), str, true)) {
                    break;
                }
                i++;
            }
            if (kVar == null) {
                kVar = pd5.k.NONE;
            }
            linkedHashMap.put(kVar, entry.getValue());
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(q0.b(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            Object key = entry2.getKey();
            Iterable iterable = (Iterable) entry2.getValue();
            ArrayList arrayList = new ArrayList(zhm.w.t(iterable, 10));
            Iterator it8 = iterable.iterator();
            while (it8.hasNext()) {
                t61.a.A(xi0.b.Companion, (String) it8.next(), arrayList);
            }
            linkedHashMap2.put(key, arrayList);
        }
        return linkedHashMap2;
    }

    public static final n77.f F(k77.i iVar) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        String str = iVar.f181834a;
        String str2 = iVar.f181835b;
        xi0.b bVar = iVar.f181836c;
        return new n77.f(str, str2, bVar != null ? bVar.f306286a : null, iVar.d, iVar.e);
    }

    /* JADX WARN: Type inference failed for: r15v5, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v24, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v11, types: [java.lang.Object, java.util.Map] */
    public static final vd5.b G(pd5.d dVar) {
        vd5.a aVar;
        ArrayList arrayList;
        ArrayList arrayList2;
        Iterator it8;
        LinkedHashMap linkedHashMap;
        vd5.d dVar2;
        String str = "<this>";
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        boolean z = dVar.f235095a;
        String str2 = dVar.f235096b;
        ArrayList arrayList3 = dVar.f235097c;
        ArrayList arrayList4 = new ArrayList(zhm.w.t(arrayList3, 10));
        Iterator it9 = arrayList3.iterator();
        while (it9.hasNext()) {
            pd5.g gVar = (pd5.g) it9.next();
            Intrinsics.checkNotNullParameter(gVar, "<this>");
            String str3 = gVar.f235102a.f306286a;
            String str4 = gVar.f235103b;
            String str5 = gVar.f235104c;
            List list = gVar.d;
            ArrayList arrayList5 = new ArrayList();
            Iterator it10 = list.iterator();
            while (it10.hasNext()) {
                String strH = u1.h((wk5.a) it10.next(), wk5.b.f298250a);
                if (strH != null) {
                    arrayList5.add(strH);
                }
            }
            Set set = gVar.e;
            ArrayList arrayList6 = new ArrayList();
            Iterator it11 = set.iterator();
            while (it11.hasNext()) {
                String strH2 = u1.h((wk5.a) it11.next(), wk5.b.f298250a);
                if (strH2 != null) {
                    arrayList6.add(strH2);
                }
            }
            List list2 = gVar.f;
            ArrayList arrayList7 = new ArrayList();
            Iterator it12 = list2.iterator();
            while (it12.hasNext()) {
                String strH3 = u1.h((wk5.a) it12.next(), wk5.b.f298250a);
                if (strH3 != null) {
                    arrayList7.add(strH3);
                }
            }
            ?? r62 = gVar.f235105g;
            Intrinsics.checkNotNullParameter(r62, "<this>");
            if (r62.isEmpty()) {
                it8 = it9;
                linkedHashMap = null;
            } else {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(q0.b(r62.size()));
                for (Map.Entry entry : r62.entrySet()) {
                    linkedHashMap2.put(((wk5.a) entry.getKey()).name(), entry.getValue());
                    it9 = it9;
                }
                it8 = it9;
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(q0.b(linkedHashMap2.size()));
                for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                    linkedHashMap3.put(entry2.getKey(), mo3.a.p((dj0.d) entry2.getValue()));
                }
                linkedHashMap = linkedHashMap3;
            }
            pd5.j jVar = gVar.f235106h;
            if (jVar != null) {
                Intrinsics.checkNotNullParameter(jVar, "<this>");
                dVar2 = new vd5.d(jVar.f235111a.f306286a);
            } else {
                dVar2 = null;
            }
            arrayList4.add(new vd5.c(str3, str4, str5, arrayList5, arrayList6, arrayList7, linkedHashMap, dVar2));
            it9 = it8;
        }
        int i = dVar.d;
        pd5.b bVar = dVar.e;
        if (bVar != null) {
            Intrinsics.checkNotNullParameter(bVar, "<this>");
            aVar = new vd5.a(bVar.f235093a.doubleValue(), bVar.f235094b.doubleValue());
        } else {
            aVar = null;
        }
        ?? r2 = dVar.f;
        Intrinsics.checkNotNullParameter(r2, "<this>");
        LinkedHashMap linkedHashMap4 = new LinkedHashMap(q0.b(r2.size()));
        for (Map.Entry entry3 : r2.entrySet()) {
            linkedHashMap4.put(((pd5.k) entry3.getKey()).name(), entry3.getValue());
        }
        LinkedHashMap linkedHashMap5 = new LinkedHashMap(q0.b(linkedHashMap4.size()));
        for (Map.Entry entry4 : linkedHashMap4.entrySet()) {
            Object key = entry4.getKey();
            Iterable iterable = (Iterable) entry4.getValue();
            ArrayList arrayList8 = new ArrayList(zhm.w.t(iterable, 10));
            Iterator it13 = iterable.iterator();
            while (it13.hasNext()) {
                arrayList8.add(((xi0.b) it13.next()).f306286a);
            }
            linkedHashMap5.put(key, arrayList8);
        }
        ?? r87 = dVar.f235098g;
        Intrinsics.checkNotNullParameter(r87, "<this>");
        LinkedHashMap linkedHashMap6 = new LinkedHashMap(q0.b(r87.size()));
        for (Map.Entry entry5 : r87.entrySet()) {
            linkedHashMap6.put(((wk5.a) entry5.getKey()).name(), entry5.getValue());
        }
        LinkedHashMap linkedHashMap7 = new LinkedHashMap(q0.b(linkedHashMap6.size()));
        for (Map.Entry entry6 : linkedHashMap6.entrySet()) {
            Object key2 = entry6.getKey();
            pd5.h hVar = (pd5.h) entry6.getValue();
            Intrinsics.checkNotNullParameter(hVar, "<this>");
            linkedHashMap7.put(key2, new ud5.g(hVar.f235107a, hVar.f235108b));
        }
        ?? r92 = dVar.f235099h.f235101a;
        Intrinsics.checkNotNullParameter(r92, "<this>");
        LinkedHashMap linkedHashMap8 = new LinkedHashMap(q0.b(r92.size()));
        for (Map.Entry entry7 : r92.entrySet()) {
            linkedHashMap8.put(((CryptoAddressHostingProviderType) entry7.getKey()).name(), entry7.getValue());
        }
        LinkedHashMap linkedHashMap9 = new LinkedHashMap(q0.b(linkedHashMap8.size()));
        for (Map.Entry entry8 : linkedHashMap8.entrySet()) {
            Object key3 = entry8.getKey();
            Iterable<pd5.a> iterable2 = (Iterable) entry8.getValue();
            LinkedHashMap linkedHashMap10 = linkedHashMap5;
            ArrayList arrayList9 = new ArrayList(zhm.w.t(iterable2, 10));
            for (pd5.a aVar2 : iterable2) {
                Intrinsics.checkNotNullParameter(aVar2, str);
                arrayList9.add(new ud5.a(aVar2.f235091a, aVar2.f235092b));
                str = str;
            }
            linkedHashMap9.put(key3, arrayList9);
            linkedHashMap5 = linkedHashMap10;
        }
        LinkedHashMap linkedHashMap11 = linkedHashMap5;
        ud5.d dVar3 = new ud5.d(linkedHashMap9);
        List list3 = dVar.i;
        if (list3 != null) {
            List<pd5.i> list4 = list3;
            ArrayList arrayList10 = new ArrayList(zhm.w.t(list4, 10));
            for (pd5.i iVar : list4) {
                arrayList10.add(new ud5.j(iVar.f235109a, iVar.f235110b));
            }
            arrayList = arrayList10;
        } else {
            arrayList = null;
        }
        List list5 = dVar.f235100j;
        if (list5 != null) {
            List<CryptoPeggedPair> list6 = list5;
            ArrayList arrayList11 = new ArrayList(zhm.w.t(list6, 10));
            for (CryptoPeggedPair cryptoPeggedPair : list6) {
                arrayList11.add(new ud5.h(cryptoPeggedPair.f70777a.f306286a, cryptoPeggedPair.f70778b.f306286a));
            }
            arrayList2 = arrayList11;
        } else {
            arrayList2 = null;
        }
        CryptoPersonalExchangeFeesResources cryptoPersonalExchangeFeesResources = dVar.k;
        return new vd5.b(z, str2, arrayList4, i, aVar, linkedHashMap11, linkedHashMap7, dVar3, arrayList, arrayList2, cryptoPersonalExchangeFeesResources != null ? new ud5.i(cryptoPersonalExchangeFeesResources.f70779a, cryptoPersonalExchangeFeesResources.f70780b) : null);
    }

    public static final xei.f H(dj0.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        return new xei.f(dVar.f115082a, dVar.f115083b.f306286a);
    }

    public static final Map I(Map map) {
        wk5.a aVar;
        if (map == null) {
            return r0.g();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(q0.b(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            wk5.a[] aVarArrValues = wk5.a.values();
            int length = aVarArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    aVar = null;
                    break;
                }
                aVar = aVarArrValues[i];
                if (a0.z(aVar.name(), str, true)) {
                    break;
                }
                i++;
            }
            if (aVar == null) {
                aVar = wk5.a.UNSPECIFIED;
            }
            linkedHashMap.put(aVar, entry.getValue());
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(q0.b(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            Object key = entry2.getKey();
            ud5.g gVar = (ud5.g) entry2.getValue();
            Intrinsics.checkNotNullParameter(gVar, "<this>");
            linkedHashMap2.put(key, new pd5.h(gVar.getAddressUrl(), gVar.getTransactionUrl()));
        }
        return linkedHashMap2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.List] */
    public static final vr.f J(ir.d dVar) {
        ?? arrayList;
        List list = dVar.f167916b;
        e0 e0Var = dVar.f167915a;
        if (list != null) {
            arrayList = new ArrayList();
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                BiometricVerificationVisionResource biometricVerificationVisionResourceB = er.d.b((d1) it8.next());
                if (biometricVerificationVisionResourceB != null) {
                    arrayList.add(biometricVerificationVisionResourceB);
                }
            }
        } else {
            arrayList = 0;
        }
        if (arrayList == 0) {
            arrayList = f0.f322471a;
        }
        ?? r56 = arrayList;
        BiometricVerificationFeatures biometricVerificationFeaturesA = er.b.a(dVar.f167917c);
        return new vr.f(er.c.a(e0Var, r56, biometricVerificationFeaturesA, er.a.a(biometricVerificationFeaturesA)), r56, biometricVerificationFeaturesA, e0Var.getD(), e0Var.getE());
    }

    public static final aw7.f K(d4 d4Var, int i) {
        if (d4Var != null) {
            return new aw7.f(d4Var.f146730a, i, d4Var.f146731b);
        }
        return null;
    }

    public static final String L(DateTime dateTime) {
        Intrinsics.checkNotNullParameter(dateTime, "<this>");
        String string = dateTime.withTimeAtStartOfDay().toString("YYYY-MM-dd");
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public static final iih.b a(WealthAction wealthAction) {
        if (wealthAction instanceof WealthAction.AddMoney) {
            return iih.b.DEPOSIT;
        }
        if (wealthAction instanceof WealthAction.Withdraw) {
            return iih.b.WITHDRAW;
        }
        throw new IllegalArgumentException("Unsupported wealth transfer action " + wealthAction);
    }

    public static final void b(koi.k kVar, koi.b childHolder, koi.j childItem, int i, List childPayloads, koi.j parentItem) {
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        Intrinsics.checkNotNullParameter(childHolder, "childHolder");
        Intrinsics.checkNotNullParameter(childItem, "childItem");
        Intrinsics.checkNotNullParameter(childPayloads, "childPayloads");
        Intrinsics.checkNotNullParameter(parentItem, "parentItem");
        if (kVar instanceof NestedChildDelegate) {
            ((NestedChildDelegate) kVar).q(childHolder, childItem, i, childPayloads, parentItem);
        } else {
            kVar.p(childHolder, childItem, i, childPayloads);
        }
    }

    public static final int c(m7g.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        int i = q4g.f.f242146a[bVar.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return 2;
        }
        if (i == 4) {
            return 3;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final aw7.f d(Data data, String str) {
        List list;
        Intrinsics.checkNotNullParameter(data, "<this>");
        g4 g4Var = (g4) data.getContent();
        if (g4Var == null || (list = g4Var.f146753a) == null) {
            return null;
        }
        if (str == null) {
            d4 d4Var = (d4) d0.d0(list);
            if (d4Var != null) {
                return K(d4Var, 0);
            }
            return null;
        }
        Iterator it8 = list.iterator();
        int i = 0;
        while (true) {
            if (!it8.hasNext()) {
                i = -1;
                break;
            }
            if (Intrinsics.f(((d4) it8.next()).f146730a, str)) {
                break;
            }
            i++;
        }
        if (i >= 0) {
            return K((d4) list.get(i), i);
        }
        d4 d4Var2 = (d4) d0.d0(list);
        if (d4Var2 != null) {
            return K(d4Var2, 0);
        }
        return null;
    }

    public static final Flow e(Flow flow, Function1 block) {
        Intrinsics.checkNotNullParameter(flow, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        return vkm.q.q(vkm.q.Q(flow, new o0(1, null, block)));
    }

    public static final int f(ViewGroup.LayoutParams layoutParams) {
        Intrinsics.checkNotNullParameter(layoutParams, "<this>");
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null) == null) {
            return 0;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    public static final dj0.d g(Pricing pricing) {
        dj0.d dVar;
        Intrinsics.checkNotNullParameter(pricing, "<this>");
        OverallPrice overallPrice = pricing.d;
        return (overallPrice == null || (dVar = overallPrice.f98058b) == null) ? new dj0.d(0L, pricing.f98068c.f98058b.f115083b) : dVar;
    }

    public static final Long h(String propertyName, kg.u uVar) {
        Intrinsics.checkNotNullParameter(uVar, "<this>");
        Intrinsics.checkNotNullParameter(propertyName, "propertyName");
        kg.u uVarI = uVar.c().i(propertyName);
        if (uVarI != null) {
            return Long.valueOf(uVarI.e());
        }
        return null;
    }

    public static final String i(String propertyName, kg.u uVar) {
        Intrinsics.checkNotNullParameter(uVar, "<this>");
        Intrinsics.checkNotNullParameter(propertyName, "propertyName");
        kg.u uVarI = uVar.c().i(propertyName);
        if (uVarI != null) {
            return uVarI.f();
        }
        return null;
    }

    public static final String j(String propertyName, kg.u uVar) {
        Intrinsics.checkNotNullParameter(uVar, "<this>");
        Intrinsics.checkNotNullParameter(propertyName, "propertyName");
        String strI = i(propertyName, uVar);
        if (strI != null) {
            return strI;
        }
        throw new NullPointerException(propertyName);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final dj0.d k(com.revolut.feature_travel_hotels_models.property.Pricing r6) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            dj0.d r1 = g(r6)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            com.revolut.feature_travel_hotels_models.property.OverallPrice r0 = r6.d
            if (r0 == 0) goto L62
            java.util.ArrayList r0 = r0.d
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r0 = r0.iterator()
        L1b:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L30
            java.lang.Object r3 = r0.next()
            r4 = r3
            com.revolut.feature_travel_hotels_models.property.PriceFee r4 = (com.revolut.feature_travel_hotels_models.property.PriceFee) r4
            boolean r4 = r4.f98065c
            if (r4 != 0) goto L1b
            r2.add(r3)
            goto L1b
        L30:
            dj0.c r0 = dj0.d.Companion
            r0.getClass()
            dj0.d r0 = dj0.d.e
            java.util.Iterator r2 = r2.iterator()
            r3 = 0
        L3c:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L60
            java.lang.Object r4 = r2.next()
            int r5 = r3 + 1
            if (r3 < 0) goto L5b
            if (r3 != 0) goto L51
            com.revolut.feature_travel_hotels_models.property.PriceFee r4 = (com.revolut.feature_travel_hotels_models.property.PriceFee) r4
            dj0.d r0 = r4.d
            goto L59
        L51:
            com.revolut.feature_travel_hotels_models.property.PriceFee r4 = (com.revolut.feature_travel_hotels_models.property.PriceFee) r4
            dj0.d r3 = r4.d
            dj0.d r0 = pyd.c.O(r0, r3)
        L59:
            r3 = r5
            goto L3c
        L5b:
            zhm.v.s()
            r6 = 0
            throw r6
        L60:
            if (r0 != 0) goto L6f
        L62:
            dj0.d r0 = new dj0.d
            com.revolut.feature_travel_hotels_models.property.OverallPrice r6 = r6.f98068c
            dj0.d r6 = r6.f98058b
            xi0.b r6 = r6.f115083b
            r2 = 0
            r0.<init>(r2, r6)
        L6f:
            dj0.d r6 = pyd.c.O(r1, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: boh.f.k(com.revolut.feature_travel_hotels_models.property.Pricing):dj0.d");
    }

    public static final boolean l(Asset asset) {
        Intrinsics.checkNotNullParameter(asset, "<this>");
        int i = f8l.a.f132786a[asset.f104719a.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return true;
        }
        if (i == 4 || i == 5) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final x9m.c m(x9m.c v) {
        Intrinsics.checkNotNullParameter(v, "v");
        float f = v.f303750a;
        float f4 = v.f303751b;
        float f5 = v.f303752c;
        float fSqrt = 1.0f / ((float) Math.sqrt((f5 * f5) + ((f4 * f4) + (f * f))));
        return new x9m.c(f * fSqrt, f4 * fSqrt, f5 * fSqrt);
    }

    public static final lk0.g n(lk0.g gVar, lk0.e newPage) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        Intrinsics.checkNotNullParameter(newPage, "newPage");
        ArrayList arrayListF1 = d0.f1(gVar.f196174a);
        Iterator it8 = arrayListF1.iterator();
        int i = 0;
        while (true) {
            if (!it8.hasNext()) {
                i = -1;
                break;
            }
            if (Intrinsics.f(((lk0.e) it8.next()).f196172b, newPage.f196172b)) {
                break;
            }
            i++;
        }
        if (i != -1) {
            arrayListF1.remove(i);
            arrayListF1.add(i, newPage);
        } else {
            arrayListF1.add(newPage);
        }
        return new lk0.g(arrayListF1);
    }

    public static void o(Class cls) {
        String name = cls.getName();
        mo3.a.m(new ProtocolViolationException(j6.a.s("It is not allowed to subscribe with a(n) ", name, " multiple times. Please create a fresh instance of ", name, " and subscribe that to the target source instead.")));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    public static final int p(Context context) {
        Intrinsics.checkNotNullParameter(jo0.j.f176846a, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        return ((Boolean) jo0.g.f176828j.getValue()).booleanValue() ? kli.a.k(context, 84.0f) : context.getResources().getDimensionPixelSize(R$dimen.uikit_solid_bottom_bar);
    }

    public static final TextLocalisedClause q(b0 b0Var) {
        Intrinsics.checkNotNullParameter(b0Var, "<this>");
        int i = e.f17464b[b0Var.ordinal()];
        if (i == 1) {
            return new TextLocalisedClause(R$string.wealth_most_traded_selector_timespan_one_day, null, null, 14);
        }
        if (i == 2) {
            return new TextLocalisedClause(R$string.wealth_most_traded_selector_timespan_one_week, null, null, 14);
        }
        if (i == 3) {
            return new TextLocalisedClause(R$string.wealth_most_traded_selector_timespan_one_month, null, null, 14);
        }
        if (i == 4) {
            return new TextLocalisedClause(R$string.wealth_most_traded_selector_timespan_one_year, null, null, 14);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final TextLocalisedClause r(xzg.d0 d0Var) {
        Intrinsics.checkNotNullParameter(d0Var, "<this>");
        int i = e.f17463a[d0Var.ordinal()];
        if (i == 1) {
            return new TextLocalisedClause(R$string.wealth_most_traded_selector_section_most_traded, null, null, 14);
        }
        if (i == 2) {
            return new TextLocalisedClause(R$string.wealth_most_traded_selector_section_most_bought, null, null, 14);
        }
        if (i == 3) {
            return new TextLocalisedClause(R$string.wealth_most_traded_selector_section_most_sold, null, null, 14);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final WealthProtectionSuggestedAmount s(t0 t0Var, xi0.b currency) {
        Object next;
        Intrinsics.checkNotNullParameter(t0Var, "<this>");
        Intrinsics.checkNotNullParameter(currency, "currency");
        dj0.d dVar = new dj0.d(t0Var.getAmount(), currency);
        qtc.u uVar = qtc.v.Companion;
        String type = t0Var.getType();
        uVar.getClass();
        Intrinsics.checkNotNullParameter(type, "type");
        Iterator<E> it8 = qtc.v.a().iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(((qtc.v) next).name(), type)) {
                break;
            }
        }
        qtc.v vVar = (qtc.v) next;
        if (vVar == null) {
            vVar = qtc.v.DEFAULT;
        }
        return new WealthProtectionSuggestedAmount(dVar, vVar);
    }

    public static final TradingAccounts t(x0 x0Var) {
        Intrinsics.checkNotNullParameter(x0Var, "<this>");
        List list = x0Var.f262071a;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(sdl.o0.g((sdl.r) it8.next()));
        }
        List<u0> list2 = x0Var.f262072b;
        ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
        for (u0 u0Var : list2) {
            Intrinsics.checkNotNullParameter(u0Var, "<this>");
            String str = u0Var.f262061a;
            String str2 = u0Var.f262062b;
            String str3 = u0Var.f262063c;
            String str4 = u0Var.d;
            Intrinsics.checkNotNullParameter(str4, "<this>");
            TradingAccountType tradingAccountType = Intrinsics.f(str4, "GIA") ? TradingAccountType.Gia.f105270a : Intrinsics.f(str4, "ROBO") ? TradingAccountType.Robo.f105274a : Intrinsics.f(str4, "MARGIN") ? TradingAccountType.Margin.f105271a : Intrinsics.f(str4, "TAX_ADVANTAGED") ? TradingAccountType.Taa.f105275a : Intrinsics.f(str4, "MMF") ? TradingAccountType.MoneyMarketFunds.f105272a : Intrinsics.f(str4, "PAPER_TRADING") ? TradingAccountType.PaperTrading.f105273a : TradingAccountType.Unknown.f105276a;
            cfl.j jVarY = zi0.c.Y(u0Var.e);
            List<a1> list3 = u0Var.f;
            ArrayList arrayList3 = new ArrayList(zhm.w.t(list3, 10));
            for (a1 a1Var : list3) {
                Intrinsics.checkNotNullParameter(a1Var, "<this>");
                arrayList3.add(new TradingProduct(a1Var.f261938a, c1.a(a1Var.f261939b), cfl.v.AVAILABLE, null, null));
            }
            List list4 = u0Var.f262064g;
            ArrayList arrayList4 = new ArrayList(zhm.w.t(list4, 10));
            Iterator it9 = list4.iterator();
            while (it9.hasNext()) {
                arrayList4.add(a.a.D((sdl.q0) it9.next()));
            }
            arrayList2.add(new TradingAccountAvailableToOnboard(str, str2, str3, tradingAccountType, jVarY, arrayList3, arrayList4, zh9.u0.N(u0Var.f262065h)));
        }
        return new TradingAccounts(arrayList, arrayList2);
    }

    public static final dj0.d u(xei.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        long amount = fVar.getAmount();
        xi0.a aVar = xi0.b.Companion;
        String currency = fVar.getCurrency();
        aVar.getClass();
        return new dj0.d(amount, xi0.a.a(currency));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final dx4.t1 v(nx4.u0 r15) {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: boh.f.v(nx4.u0):dx4.t1");
    }

    public static final hfg.o0 w(j0 j0Var) {
        p0 p0Var;
        s0 s0Var;
        hfg.q0 q0Var;
        String str;
        hfg.r0 r0Var;
        String str2 = "<this>";
        Intrinsics.checkNotNullParameter(j0Var, "<this>");
        String id10 = j0Var.getId();
        Instant createdDate = j0Var.getCreatedDate();
        Instant updatedDate = j0Var.getUpdatedDate();
        List<l0> transactions = j0Var.getTransactions();
        ArrayList arrayList = new ArrayList(zhm.w.t(transactions, 10));
        for (l0 l0Var : transactions) {
            Intrinsics.checkNotNullParameter(l0Var, str2);
            String id11 = l0Var.getId();
            String type = l0Var.getType();
            s0[] s0VarArrValues = s0.values();
            int length = s0VarArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    s0Var = null;
                    break;
                }
                s0Var = s0VarArrValues[i];
                if (a0.z(s0Var.name(), type, true)) {
                    break;
                }
                i++;
            }
            if (s0Var == null) {
                s0Var = s0.UNKNOWN;
            }
            s0 s0Var2 = s0Var;
            String idType = l0Var.getIdType();
            hfg.q0[] q0VarArrValues = hfg.q0.values();
            int length2 = q0VarArrValues.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length2) {
                    q0Var = null;
                    break;
                }
                q0Var = q0VarArrValues[i2];
                if (a0.z(q0Var.name(), idType, true)) {
                    break;
                }
                i2++;
            }
            if (q0Var == null) {
                q0Var = hfg.q0.UNKNOWN;
            }
            hfg.q0 q0Var2 = q0Var;
            String source = l0Var.getSource();
            hfg.r0[] r0VarArrValues = hfg.r0.values();
            int length3 = r0VarArrValues.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length3) {
                    str = str2;
                    r0Var = null;
                    break;
                }
                r0Var = r0VarArrValues[i3];
                str = str2;
                if (a0.z(r0Var.name(), source, true)) {
                    break;
                }
                i3++;
                str2 = str;
            }
            if (r0Var == null) {
                r0Var = hfg.r0.UNKNOWN;
            }
            arrayList.add(new TravelMilesTransaction(id11, s0Var2, q0Var2, r0Var));
            str2 = str;
        }
        String state = j0Var.getState();
        p0[] p0VarArrValues = p0.values();
        int length4 = p0VarArrValues.length;
        int i5 = 0;
        while (true) {
            if (i5 >= length4) {
                p0Var = null;
                break;
            }
            p0 p0Var2 = p0VarArrValues[i5];
            if (a0.z(p0Var2.name(), state, true)) {
                p0Var = p0Var2;
                break;
            }
            i5++;
        }
        return new hfg.o0(id10, createdDate, updatedDate, arrayList, p0Var);
    }

    public static final Map x(Map map) {
        wk5.a aVar;
        if (map == null) {
            return r0.g();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(q0.b(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            wk5.a[] aVarArrValues = wk5.a.values();
            int length = aVarArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    aVar = null;
                    break;
                }
                aVar = aVarArrValues[i];
                if (a0.z(aVar.name(), str, true)) {
                    break;
                }
                i++;
            }
            if (aVar == null) {
                aVar = wk5.a.UNSPECIFIED;
            }
            linkedHashMap.put(aVar, entry.getValue());
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(q0.b(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry2.getKey(), mo3.a.o((jo3.a) entry2.getValue()));
        }
        return linkedHashMap2;
    }

    public static final k77.i y(n77.f fVar) {
        xi0.b bVarA;
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        String str = fVar.f213014a;
        String str2 = fVar.f213015b;
        String str3 = fVar.f213016c;
        if (str3 != null) {
            xi0.b.Companion.getClass();
            bVarA = xi0.a.a(str3);
        } else {
            bVarA = null;
        }
        return new k77.i(str, str2, bVarA, fVar.d, fVar.e);
    }

    public static final pd5.d z(vd5.b bVar) {
        pd5.b bVar2;
        ArrayList arrayList;
        ArrayList arrayList2;
        CryptoPersonalExchangeFeesResources cryptoPersonalExchangeFeesResources;
        pd5.j jVar;
        Set set;
        Iterator it8;
        wk5.a aVar;
        Iterator it9;
        String str;
        wk5.a aVar2;
        boolean z;
        wk5.a aVar3;
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        boolean zK = bVar.getTestnetAddressesAllowed();
        String strJ = bVar.getSentimentIndicatorFaqsLink();
        List<vd5.c> listC = bVar.getCurrencies();
        int i = 10;
        ArrayList arrayList3 = new ArrayList(zhm.w.t(listC, 10));
        for (vd5.c cVar : listC) {
            Intrinsics.checkNotNullParameter(cVar, "<this>");
            xi0.a aVar4 = xi0.b.Companion;
            String strE = cVar.getId();
            aVar4.getClass();
            xi0.b bVarA = xi0.a.a(strE);
            String strA = cVar.getAddressUrl();
            String strH = cVar.getTransactionUrl();
            List<String> listD = cVar.getAvailableWithdrawalBlockchains();
            ArrayList arrayList4 = new ArrayList(zhm.w.t(listD, i));
            for (String str2 : listD) {
                wk5.a[] aVarArrValues = wk5.a.values();
                int length = aVarArrValues.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        z = zK;
                        aVar3 = null;
                        break;
                    }
                    aVar3 = aVarArrValues[i2];
                    z = zK;
                    if (a0.z(aVar3.name(), str2, true)) {
                        break;
                    }
                    i2++;
                    zK = z;
                }
                if (aVar3 == null) {
                    aVar3 = wk5.a.UNSPECIFIED;
                }
                arrayList4.add(aVar3);
                zK = z;
            }
            boolean z3 = zK;
            List listB = cVar.getAvailableDeFiWithdrawalBlockchains();
            if (listB == null) {
                listB = f0.f322471a;
            }
            ArrayList arrayList5 = new ArrayList();
            Iterator it10 = listB.iterator();
            while (it10.hasNext()) {
                String str3 = (String) it10.next();
                wk5.a[] aVarArrValues2 = wk5.a.values();
                int length2 = aVarArrValues2.length;
                int i3 = 0;
                while (true) {
                    if (i3 >= length2) {
                        it9 = it10;
                        str = strJ;
                        aVar2 = null;
                        break;
                    }
                    aVar2 = aVarArrValues2[i3];
                    it9 = it10;
                    str = strJ;
                    if (a0.z(aVar2.name(), str3, true)) {
                        break;
                    }
                    i3++;
                    it10 = it9;
                    strJ = str;
                }
                if (aVar2 != null) {
                    arrayList5.add(aVar2);
                }
                it10 = it9;
                strJ = str;
            }
            String str4 = strJ;
            Set setI1 = d0.i1(arrayList5);
            List listC2 = cVar.getAvailableDepositBlockchains();
            ArrayList arrayList6 = new ArrayList(zhm.w.t(listC2, 10));
            Iterator it11 = listC2.iterator();
            while (it11.hasNext()) {
                String str5 = (String) it11.next();
                wk5.a[] aVarArrValues3 = wk5.a.values();
                int length3 = aVarArrValues3.length;
                int i5 = 0;
                while (true) {
                    if (i5 >= length3) {
                        set = setI1;
                        it8 = it11;
                        aVar = null;
                        break;
                    }
                    aVar = aVarArrValues3[i5];
                    set = setI1;
                    it8 = it11;
                    if (a0.z(aVar.name(), str5, true)) {
                        break;
                    }
                    i5++;
                    setI1 = set;
                    it11 = it8;
                }
                if (aVar == null) {
                    aVar = wk5.a.UNSPECIFIED;
                }
                arrayList6.add(aVar);
                setI1 = set;
                it11 = it8;
            }
            Set set2 = setI1;
            Map mapX = x(cVar.getMinimumDeposit());
            vd5.d dVarG = cVar.getRevStablecoinDetailsEntity();
            if (dVarG != null) {
                Intrinsics.checkNotNullParameter(dVarG, "<this>");
                xi0.a aVar5 = xi0.b.Companion;
                String baseCurrency = dVarG.getBaseCurrency();
                aVar5.getClass();
                jVar = new pd5.j(xi0.a.a(baseCurrency));
            } else {
                jVar = null;
            }
            arrayList3.add(new pd5.g(bVarA, strA, strH, arrayList4, set2, arrayList6, mapX, jVar));
            zK = z3;
            strJ = str4;
            i = 10;
        }
        boolean z4 = zK;
        String str6 = strJ;
        int iE = bVar.getMaximumAddresses();
        vd5.a aVarB = bVar.getCryptoCashbackConfig();
        if (aVarB != null) {
            Intrinsics.checkNotNullParameter(aVarB, "<this>");
            BigDecimal bigDecimalValueOf = BigDecimal.valueOf(aVarB.getSmallPercent());
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
            BigDecimal bigDecimalValueOf2 = BigDecimal.valueOf(aVarB.getLargePercent());
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf2, "valueOf(...)");
            bVar2 = new pd5.b(bigDecimalValueOf, bigDecimalValueOf2);
        } else {
            bVar2 = null;
        }
        Map mapE = E(bVar.getRiskDisclaimers());
        Map mapI = I(bVar.getExplorers());
        pd5.e eVarA = A(bVar.getCompliance());
        List listH = bVar.getPromotions();
        if (listH != null) {
            List<ud5.j> list = listH;
            ArrayList arrayList7 = new ArrayList(zhm.w.t(list, 10));
            for (ud5.j jVar2 : list) {
                Intrinsics.checkNotNullParameter(jVar2, "<this>");
                arrayList7.add(new pd5.i(jVar2.getType(), jVar2.getParameters()));
            }
            arrayList = arrayList7;
        } else {
            arrayList = null;
        }
        List listF = bVar.getPeggedPairs();
        if (listF != null) {
            List<ud5.h> list2 = listF;
            ArrayList arrayList8 = new ArrayList(zhm.w.t(list2, 10));
            for (ud5.h hVar : list2) {
                Intrinsics.checkNotNullParameter(hVar, "<this>");
                xi0.a aVar6 = xi0.b.Companion;
                String from = hVar.getFrom();
                aVar6.getClass();
                arrayList8.add(new CryptoPeggedPair(xi0.a.a(from), xi0.a.a(hVar.getTo())));
            }
            arrayList2 = arrayList8;
        } else {
            arrayList2 = null;
        }
        ud5.i iVarG = bVar.getPersonalExchangeFeesResources();
        if (iVarG != null) {
            Intrinsics.checkNotNullParameter(iVarG, "<this>");
            cryptoPersonalExchangeFeesResources = new CryptoPersonalExchangeFeesResources(iVarG.getPersonalExchangeFeesFaqArticleKey(), iVarG.getPersonalExchangeFeesUrl());
        } else {
            cryptoPersonalExchangeFeesResources = null;
        }
        return new pd5.d(z4, str6, arrayList3, iE, bVar2, mapE, mapI, eVarA, arrayList, arrayList2, cryptoPersonalExchangeFeesResources);
    }
}
