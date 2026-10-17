package v13;

import android.hardware.Camera;
import ar9.j;
import ar9.m;
import bvh.k;
import bvh.l;
import com.fasterxml.jackson.databind.JavaType;
import com.revolut.feature.defi.asset_details.api.model.DeFiAssetDetails;
import com.revolut.feature.defi.asset_details.api.model.DefiCurrency;
import com.revolut.feature.defi.common.models.domain.DeFiAssetRiskAssessment;
import com.revolut.feature.defi.common.models.domain.DeFiAssetRiskType;
import com.revolut.feature.kyc_documents_scan.api.models.DocType;
import com.revolut.feature_travel_hotels_models.booking.amendment.TravelHotelsBookingAmendmentCost;
import com.revolut.feature_travel_hotels_models.booking.amendment.TravelHotelsBookingAmendmentFees;
import com.revolut.feature_travel_hotels_models.property.PriceFee;
import com.revolut.shared.feature.market_data.models.domain.models.Asset;
import com.revolut.shared.feature.market_data.models.domain.models.LegacyOrderQuoteParams;
import com.revolut.shared.feature.workflow.engine.api.models.workflow.AlternativeDocumentGroups;
import com.revolut.shared.feature.workflow.engine.api.models.workflow.AlternativeDocumentSection;
import com.revolut.shared.feature.workflow.engine.api.models.workflow.ApplicableDocuments;
import com.revolut.shared.feature.workflow.engine.api.models.workflow.Document;
import com.revolut.shared.feature.workflow.engine.api.models.workflow.DocumentGroup;
import d26.f;
import dda.u;
import dda.v;
import dda.x;
import do3.r;
import h26.n;
import h93.s;
import igb.e;
import igb.i;
import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import k9.t;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.ranges.IntRange;
import kotlin.text.a0;
import le.u1;
import oq9.g;
import oq9.h;
import oq9.o;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormatter;
import tof.a3;
import tof.i3;
import tof.j3;
import tof.k3;
import tof.l2;
import uam.p;
import wp5.y;
import xda.a1;
import xda.x0;
import yfe.s0;
import yfe.w0;
import zda.b1;
import zda.u0;
import zda.v0;
import zda.y0;
import zhm.d0;
import zhm.f0;
import zhm.h0;
import zhm.w;

/* JADX INFO: loaded from: classes21.dex */
public abstract class d {
    /* JADX WARN: Removed duplicated region for block: B:19:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final d93.b A(v13.b r9) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r2 = r9.getName()
            java.lang.String r1 = r9.getEdt()
            org.joda.time.format.DateTimeFormatter r3 = jli.b.f175839a
            org.joda.time.LocalDate r3 = org.joda.time.LocalDate.parse(r1, r3)
            java.lang.String r1 = "parse(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r1)
            h93.s r4 = r9.getTrackingChannel()
            jo3.a r1 = r9.getFee()
            jo3.a r5 = r9.getOriginalFee()
            v93.d r6 = r9.getPricing()
            r7 = 0
            if (r6 == 0) goto L4f
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            c93.j r1 = new c93.j
            v93.c r5 = r6.getPrice()
            c93.l r5 = hx7.a.s(r5)
            v93.c r6 = r6.getOriginalPrice()
            if (r6 == 0) goto L43
            c93.l r6 = hx7.a.s(r6)
            goto L4a
        L43:
            c93.k r6 = c93.l.Companion
            r6.getClass()
            c93.l r6 = c93.l.e
        L4a:
            r1.<init>(r5, r6)
        L4d:
            r6 = r1
            goto L84
        L4f:
            if (r1 == 0) goto L7c
            c93.l r6 = new c93.l
            dj0.d r8 = mo3.a.o(r1)
            dj0.d r1 = mo3.a.o(r1)
            r6.<init>(r8, r1, r7, r7)
            if (r5 == 0) goto L6e
            c93.l r1 = new c93.l
            dj0.d r8 = mo3.a.o(r5)
            dj0.d r5 = mo3.a.o(r5)
            r1.<init>(r8, r5, r7, r7)
            goto L75
        L6e:
            c93.k r1 = c93.l.Companion
            r1.getClass()
            c93.l r1 = c93.l.e
        L75:
            c93.j r5 = new c93.j
            r5.<init>(r6, r1)
            r6 = r5
            goto L84
        L7c:
            c93.i r1 = c93.j.Companion
            r1.getClass()
            c93.j r1 = c93.j.f22287c
            goto L4d
        L84:
            jo3.a r1 = r9.getTopupNeeded()
            if (r1 == 0) goto L8f
            dj0.d r1 = mo3.a.o(r1)
            goto L90
        L8f:
            r1 = r7
        L90:
            v13.a r5 = r9.getDeliveryDateRange()
            if (r5 == 0) goto Lb0
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            h93.f r7 = new h93.f
            org.joda.time.LocalDate r0 = new org.joda.time.LocalDate
            java.lang.String r8 = r5.getFrom()
            r0.<init>(r8)
            org.joda.time.LocalDate r8 = new org.joda.time.LocalDate
            java.lang.String r5 = r5.getTo()
            r8.<init>(r5)
            r7.<init>(r0, r8)
        Lb0:
            r5 = r7
            java.lang.Long r8 = r9.getRemainingTimeToOrderInMillis()
            r7 = r1
            d93.b r1 = new d93.b
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: v13.d.A(v13.b):d93.b");
    }

    public static final d93.d B(c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        List methods = cVar.getMethods();
        ArrayList arrayList = new ArrayList(w.t(methods, 10));
        Iterator it8 = methods.iterator();
        while (it8.hasNext()) {
            arrayList.add(A((b) it8.next()));
        }
        List upgradableDeliveryMethods = cVar.getUpgradableDeliveryMethods();
        if (upgradableDeliveryMethods == null) {
            upgradableDeliveryMethods = f0.f322471a;
        }
        List list = upgradableDeliveryMethods;
        ArrayList arrayList2 = new ArrayList(w.t(list, 10));
        Iterator it9 = list.iterator();
        while (it9.hasNext()) {
            arrayList2.add(A((b) it9.next()));
        }
        return new d93.d(arrayList, arrayList2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.ArrayList] */
    public static final dda.w C(x0 x0Var) throws Throwable {
        ?? arrayList;
        u uVar;
        a1 a1Var = x0Var.f304375b;
        String str = x0Var.f304374a;
        if (a1Var == null) {
            String str2 = x0Var.f304376c;
            if (str2 != null) {
                return new u(str, str2);
            }
            y.B("Either popup or deeplink should be non null");
            return null;
        }
        String str3 = a1Var.f304303a;
        String str4 = a1Var.f304304b;
        List list = a1Var.f304305c;
        if (list != null) {
            arrayList = new ArrayList();
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                dda.w wVarC = C((x0) it8.next());
                if (wVarC != null) {
                    if (!(wVarC instanceof u)) {
                        wVarC = null;
                    }
                    uVar = (u) wVarC;
                } else {
                    uVar = null;
                }
                if (uVar != null) {
                    arrayList.add(uVar);
                }
            }
        } else {
            arrayList = f0.f322471a;
        }
        return new v(str, new x(str3, str4, arrayList));
    }

    public static final dda.w D(v0 v0Var) {
        y0 y0Var = v0Var.f321421b;
        String str = v0Var.f321420a;
        if (y0Var == null) {
            String str2 = v0Var.f321422c;
            if (str2 != null) {
                return new u(str, str2);
            }
            y.B("Either popup or deeplink should be non null");
            return null;
        }
        String str3 = y0Var.f321428a;
        String str4 = y0Var.f321429b;
        List<v0> list = y0Var.f321430c;
        ArrayList arrayList = new ArrayList();
        for (v0 v0Var2 : list) {
            String str5 = v0Var2.f321422c;
            u uVar = str5 != null ? new u(v0Var2.f321420a, str5) : null;
            if (uVar != null) {
                arrayList.add(uVar);
            }
        }
        return new v(str, new x(str3, str4, arrayList));
    }

    public static final dda.y E(b1 b1Var) {
        String str = b1Var.f321361a;
        String str2 = b1Var.f321362b;
        String str3 = b1Var.f321363c;
        List list = b1Var.d;
        ArrayList arrayList = new ArrayList();
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            dda.w wVarD = D((v0) it8.next());
            if (wVarD != null) {
                arrayList.add(wVarD);
            }
        }
        return new dda.y(str, str2, str3, arrayList);
    }

    public static final dj0.d F(n nVar) {
        Intrinsics.checkNotNullParameter(nVar, "<this>");
        return mif.a.Q(cj9.c.Q(new ko3.a(nVar.f148732a, nVar.f148733b)));
    }

    public static final ArrayList G(LinkedHashMap members, List list, List list2) {
        Object hVar;
        List splits = list2;
        String str = "<this>";
        Intrinsics.checkNotNullParameter(list, "<this>");
        String str2 = "members";
        Intrinsics.checkNotNullParameter(members, "members");
        String str3 = "splits";
        Intrinsics.checkNotNullParameter(splits, "splits");
        List list3 = list;
        ArrayList arrayList = new ArrayList(w.t(list3, 10));
        Iterator it8 = list3.iterator();
        while (it8.hasNext()) {
            j jVar = (j) it8.next();
            Intrinsics.checkNotNullParameter(jVar, str);
            Intrinsics.checkNotNullParameter(members, str2);
            Intrinsics.checkNotNullParameter(splits, str3);
            ar9.n nVar = jVar.e;
            List list4 = jVar.f8557n;
            long j2 = jVar.f8554j;
            jo3.b bVar = jVar.i;
            String str4 = jVar.f8553h;
            long j3 = jVar.f8552g;
            Iterator it9 = it8;
            String str5 = jVar.f8549a;
            String str6 = jVar.d;
            String str7 = str;
            String str8 = jVar.f8551c;
            String str9 = str2;
            String str10 = jVar.f8550b;
            int i = br9.d.f17956a[nVar.ordinal()];
            String str11 = str3;
            if (i == 1) {
                String str12 = jVar.f8549a;
                String str13 = jVar.f8550b;
                String str14 = jVar.f;
                xi0.b.Companion.getClass();
                dj0.d dVar = new dj0.d(j3, xi0.a.a(str4));
                dj0.d dVarV = bVar != null ? hx7.a.v(bVar) : null;
                DateTime dateTime = new DateTime(j2);
                o nVar2 = (o) members.get(str8);
                if (nVar2 == null) {
                    nVar2 = new oq9.n(str8, str10);
                }
                o oVar = nVar2;
                o nVar3 = (o) members.get(str6);
                if (nVar3 == null) {
                    nVar3 = new oq9.n(str6, str10);
                }
                o oVar2 = nVar3;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : list2) {
                    if (Intrinsics.f(((oq9.j) obj2).f227831b, str5)) {
                        arrayList2.add(obj2);
                    }
                }
                ArrayList arrayListM = list4 != null ? M(list4) : null;
                String str15 = jVar.o;
                String str16 = jVar.k;
                String str17 = jVar.f8555l;
                if (str17 == null) {
                    ar9.n nVar4 = jVar.e;
                    StringBuilder sbM = v0.a.m("transactionCategory must exists for billId=", str5, ", groupId=", str10, ", type=");
                    sbM.append(nVar4);
                    throw new NullPointerException(sbM.toString());
                }
                hVar = new h(str12, str13, str14, dVar, dVarV, dateTime, oVar, oVar2, arrayList2, arrayListM, str15, str16, str17, jVar.f8556m);
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                String str18 = jVar.f8549a;
                String str19 = jVar.f8550b;
                String str20 = jVar.f;
                xi0.b.Companion.getClass();
                dj0.d dVar2 = new dj0.d(j3, xi0.a.a(str4));
                dj0.d dVarV2 = bVar != null ? hx7.a.v(bVar) : null;
                DateTime dateTime2 = new DateTime(j2);
                o nVar5 = (o) members.get(str8);
                if (nVar5 == null) {
                    nVar5 = new oq9.n(str8, str10);
                }
                o oVar3 = nVar5;
                o nVar6 = (o) members.get(str6);
                if (nVar6 == null) {
                    nVar6 = new oq9.n(str6, str10);
                }
                o oVar4 = nVar6;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : list2) {
                    if (Intrinsics.f(((oq9.j) obj3).f227831b, str5)) {
                        arrayList3.add(obj3);
                    }
                }
                hVar = new g(str18, str19, str20, dVar2, dVarV2, dateTime2, oVar3, oVar4, arrayList3, list4 != null ? M(list4) : null, jVar.o);
            }
            arrayList.add(hVar);
            it8 = it9;
            splits = list2;
            str = str7;
            str2 = str9;
            str3 = str11;
        }
        return arrayList;
    }

    public static final ArrayList H(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<l> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (l lVar : list2) {
            List<k> documents = lVar.getDocuments();
            ArrayList arrayList2 = new ArrayList(w.t(documents, 10));
            for (k kVar : documents) {
                wi0.a aVar = wi0.b.Companion;
                String issuingCountry = kVar.getIssuingCountry();
                aVar.getClass();
                arrayList2.add(new Document(new DocType(kVar.getDocumentType()), kVar.getDocumentName(), kVar.getDocumentSubtype(), wi0.a.a(issuingCountry)));
            }
            List tags = lVar.getTags();
            if (tags == null) {
                tags = f0.f322471a;
            }
            arrayList.add(new DocumentGroup(arrayList2, tags));
        }
        return arrayList;
    }

    public static final mgb.c J(i iVar) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        do3.g gVarValueOf = do3.g.valueOf(iVar.f161135a);
        List list = iVar.f161136b;
        ArrayList arrayList = new ArrayList();
        Iterator it8 = list.iterator();
        while (true) {
            mgb.o oVar = null;
            if (!it8.hasNext()) {
                break;
            }
            String str = (String) it8.next();
            mgb.o[] oVarArrValues = mgb.o.values();
            int length = oVarArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                mgb.o oVar2 = oVarArrValues[i];
                if (a0.z(oVar2.name(), str, true)) {
                    oVar = oVar2;
                    break;
                }
                i++;
            }
            if (oVar != null) {
                arrayList.add(oVar);
            }
        }
        e eVar = iVar.f161137c;
        mgb.a aVar = eVar != null ? new mgb.a(eVar.f161120a) : null;
        igb.h hVar = iVar.d;
        return new mgb.c(gVarValueOf, arrayList, aVar, hVar != null ? new mgb.b(mo3.a.o(hVar.f161133b), hVar.f161132a) : null);
    }

    public static final qta.a K(rpk.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        xi0.a aVar2 = xi0.b.Companion;
        String from = aVar.getFrom();
        aVar2.getClass();
        xi0.b bVarA = xi0.a.a(from);
        xi0.b bVarA2 = xi0.a.a(aVar.getTo());
        BigDecimal bigDecimal = new BigDecimal(aVar.getRate().getAsk());
        BigDecimal bigDecimal2 = new BigDecimal(aVar.getRate().getBid());
        BigDecimal bigDecimal3 = new BigDecimal(aVar.getRate().getMid());
        String eodRate = aVar.getEodRate();
        return new qta.a(bVarA, bVarA2, bigDecimal, bigDecimal2, bigDecimal3, eodRate != null ? new BigDecimal(eodRate) : null);
    }

    public static final ArrayList M(List list) {
        List<ar9.k> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (ar9.k kVar : list2) {
            String strC = kVar.getName();
            long jA = kVar.getAmount();
            String strB = kVar.getCurrencyCode();
            List listD = kVar.getPayerIds();
            ArrayList arrayList2 = new ArrayList(w.t(listD, 10));
            Iterator it8 = listD.iterator();
            while (it8.hasNext()) {
                arrayList2.add(((ar9.l) it8.next()).getMemberId());
            }
            arrayList.add(new oq9.k(strC, jA, strB, arrayList2));
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.Map] */
    public static final dp5.y0 N(ko5.k kVar) {
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        jo3.a aVarP = mo3.a.p(kVar.f186235a);
        String str = kVar.f186236b;
        String str2 = kVar.f186237c;
        String strH = u1.h(kVar.d, wk5.b.f298250a);
        if (strH == null) {
            m70.a.c(t0.f186434a);
            strH = "";
        }
        return new dp5.y0(str, str2, strH, aVarP);
    }

    public static final h26.i P(DeFiAssetDetails deFiAssetDetails) {
        h26.k kVar;
        Intrinsics.checkNotNullParameter(deFiAssetDetails, "<this>");
        DefiCurrency defiCurrency = deFiAssetDetails.f71665a;
        String str = defiCurrency.f71671a;
        String str2 = defiCurrency.f71672b;
        int i = defiCurrency.d;
        Integer numValueOf = Integer.valueOf(defiCurrency.e);
        DefiCurrency defiCurrency2 = deFiAssetDetails.f71665a;
        f fVar = new f(i, numValueOf, str, str2, defiCurrency2.f71673c, defiCurrency2.f);
        String str3 = deFiAssetDetails.f71666b;
        ArrayList arrayList = deFiAssetDetails.f71667c;
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            arrayList2.add(((wk5.a) it8.next()).name());
        }
        String str4 = deFiAssetDetails.d;
        String str5 = deFiAssetDetails.e;
        String str6 = deFiAssetDetails.f;
        dj0.d dVar = deFiAssetDetails.f71668g;
        n nVarR = dVar != null ? R(dVar) : null;
        dj0.d dVar2 = deFiAssetDetails.f71669h;
        n nVarR2 = dVar2 != null ? R(dVar2) : null;
        dj0.d dVar3 = deFiAssetDetails.i;
        n nVarR3 = dVar3 != null ? R(dVar3) : null;
        dj0.d dVar4 = deFiAssetDetails.f71670j;
        n nVarR4 = dVar4 != null ? R(dVar4) : null;
        DeFiAssetRiskAssessment deFiAssetRiskAssessment = deFiAssetDetails.k;
        if (deFiAssetRiskAssessment != null) {
            String strName = deFiAssetRiskAssessment.f71685a.name();
            ArrayList arrayList3 = deFiAssetRiskAssessment.f71686b;
            ArrayList arrayList4 = new ArrayList(w.t(arrayList3, 10));
            Iterator it9 = arrayList3.iterator();
            while (it9.hasNext()) {
                arrayList4.add(new h26.j(((DeFiAssetRiskType) it9.next()).name()));
            }
            kVar = new h26.k(strName, arrayList4, deFiAssetRiskAssessment.f71687c);
        } else {
            kVar = null;
        }
        return new h26.i(fVar, str3, arrayList2, str4, str5, str6, nVarR, nVarR2, nVarR3, nVarR4, kVar);
    }

    public static final n R(dj0.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        ko3.a aVarW = cj9.c.W(new ej0.b(pyd.c.Y(dVar), dVar.f115083b));
        return new n(aVarW.getValue(), aVarW.getCurrency());
    }

    public static final ArrayList S(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            DocumentGroup documentGroup = (DocumentGroup) it8.next();
            ArrayList<Document> arrayList3 = documentGroup.f105594a;
            ArrayList arrayList4 = new ArrayList(w.t(arrayList3, 10));
            for (Document document : arrayList3) {
                arrayList4.add(new k(document.f105591a.f297794a, document.f105592b.f77926a, document.f105593c, document.d));
            }
            arrayList2.add(new l(arrayList4, documentGroup.f105595b));
        }
        return arrayList2;
    }

    public static final b U(d93.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        String str = bVar.f112336a;
        LocalDate localDate = bVar.f112337b;
        DateTimeFormatter dateTimeFormatter = jli.b.f175839a;
        String string = localDate.toString(dateTimeFormatter);
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        s sVar = bVar.f112338c;
        c93.j jVar = bVar.e;
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        v93.d dVar = new v93.d(hx7.a.z(jVar.f22288a), hx7.a.z(jVar.f22289b));
        dj0.d dVar2 = bVar.f;
        a aVar = null;
        jo3.a aVarP = dVar2 != null ? mo3.a.p(dVar2) : null;
        h93.f fVar = bVar.d;
        if (fVar != null) {
            Intrinsics.checkNotNullParameter(fVar, "<this>");
            String string2 = fVar.f150108a.toString(dateTimeFormatter);
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            String string3 = fVar.f150109b.toString(dateTimeFormatter);
            Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
            aVar = new a(string2, string3);
        }
        return new b(str, string, sVar, dVar, aVarP, aVar, bVar.f112339g);
    }

    public static final c V(d93.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        List list = dVar.f112340a;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(U((d93.b) it8.next()));
        }
        List list2 = dVar.f112341b;
        ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
        Iterator it9 = list2.iterator();
        while (it9.hasNext()) {
            arrayList2.add(U((d93.b) it9.next()));
        }
        return new c(arrayList, arrayList2);
    }

    public static final ArrayList X(List list) {
        Iterator it8;
        j jVar;
        Intrinsics.checkNotNullParameter(list, "<this>");
        List list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        Iterator it9 = list2.iterator();
        while (it9.hasNext()) {
            oq9.i iVar = (oq9.i) it9.next();
            Intrinsics.checkNotNullParameter(iVar, "<this>");
            if (iVar instanceof h) {
                h hVar = (h) iVar;
                String str = hVar.f227821a;
                String str2 = hVar.f227822b;
                ar9.n nVar = ar9.n.TRANSACTION;
                String str3 = hVar.f227823c;
                dj0.d dVar = hVar.d;
                long j2 = dVar.f115082a;
                String str4 = dVar.f115083b.f306286a;
                dj0.d dVar2 = hVar.e;
                jo3.b bVarA = dVar2 != null ? hx7.a.A(dVar2) : null;
                long millis = hVar.f.getMillis();
                String strB = hVar.f227824g.b();
                String strB2 = hVar.f227825h.b();
                String str5 = hVar.f227827l;
                String str6 = hVar.f227828m;
                String str7 = hVar.f227829n;
                it8 = it9;
                List list3 = hVar.f227826j;
                jVar = new j(str, str2, strB, strB2, nVar, str3, j2, str4, bVarA, millis, str5, str6, str7, list3 != null ? a0(list3) : null, hVar.k);
            } else {
                it8 = it9;
                if (!(iVar instanceof g)) {
                    throw new NoWhenBranchMatchedException();
                }
                g gVar = (g) iVar;
                String str8 = gVar.f227815a;
                String str9 = gVar.f227816b;
                ar9.n nVar2 = ar9.n.CUSTOM;
                String str10 = gVar.f227817c;
                dj0.d dVar3 = gVar.d;
                long j3 = dVar3.f115082a;
                String str11 = dVar3.f115083b.f306286a;
                dj0.d dVar4 = gVar.e;
                jo3.b bVarA2 = dVar4 != null ? hx7.a.A(dVar4) : null;
                long millis2 = gVar.f.getMillis();
                String strB3 = gVar.f227818g.b();
                String strB4 = gVar.f227819h.b();
                List list4 = gVar.f227820j;
                jVar = new j(str8, str9, strB3, strB4, nVar2, str10, j3, str11, bVarA2, millis2, null, null, null, list4 != null ? a0(list4) : null, gVar.k);
            }
            arrayList.add(jVar);
            it9 = it8;
        }
        return arrayList;
    }

    public static final v0 Y(dda.w wVar) {
        if (wVar instanceof u) {
            u0 u0Var = v0.Companion;
            u uVar = (u) wVar;
            String value = uVar.f113199a;
            String deeplink = uVar.f113200b;
            u0Var.getClass();
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            return new v0(value, null, deeplink);
        }
        if (!(wVar instanceof v)) {
            throw new NoWhenBranchMatchedException();
        }
        u0 u0Var2 = v0.Companion;
        v vVar = (v) wVar;
        String value2 = vVar.f113201a;
        x xVar = vVar.f113202b;
        String str = xVar.f113203a;
        String str2 = xVar.f113204b;
        List<u> list = xVar.f113205c;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (u uVar2 : list) {
            u0 u0Var3 = v0.Companion;
            String value3 = uVar2.f113199a;
            String deeplink2 = uVar2.f113200b;
            u0Var3.getClass();
            Intrinsics.checkNotNullParameter(value3, "value");
            Intrinsics.checkNotNullParameter(deeplink2, "deeplink");
            arrayList.add(new v0(value3, null, deeplink2));
        }
        y0 popup = new y0(str, str2, arrayList);
        u0Var2.getClass();
        Intrinsics.checkNotNullParameter(value2, "value");
        Intrinsics.checkNotNullParameter(popup, "popup");
        return new v0(value2, popup, null);
    }

    public static final yfe.x0 Z(List list, yfe.b1 fallback) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(fallback, "fallback");
        return list.isEmpty() ? new w0(fallback) : list.size() == 1 ? new w0((yfe.y0) d0.b0(list)) : list.size() == 2 ? new yfe.v0((yfe.y0) d0.b0(list), new s0((yfe.y0) list.get(1))) : new yfe.v0((yfe.y0) d0.b0(list), new yfe.t0(list.size() - 1));
    }

    public static final Set a(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<vfe.a> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (vfe.a aVar : list2) {
            List list3 = aVar.f288608c;
            ArrayList arrayList2 = new ArrayList(w.t(list3, 10));
            Iterator it8 = list3.iterator();
            while (it8.hasNext()) {
                arrayList2.add(new tge.a(aVar.f288606a, ((pie.s) it8.next()).a()));
            }
            arrayList.add(arrayList2);
        }
        return d0.i1(w.u(arrayList));
    }

    public static final ArrayList a0(List list) {
        List<oq9.k> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (oq9.k kVar : list2) {
            String str = kVar.f227833a;
            long j2 = kVar.f227834b;
            String str2 = kVar.f227835c;
            ArrayList arrayList2 = kVar.d;
            ArrayList arrayList3 = new ArrayList(w.t(arrayList2, 10));
            Iterator it8 = arrayList2.iterator();
            while (it8.hasNext()) {
                arrayList3.add(new ar9.l((String) it8.next()));
            }
            arrayList.add(new ar9.k(str, j2, str2, arrayList3));
        }
        return arrayList;
    }

    public static final Object b(ArrayList collection, wi0.b bVar) {
        Intrinsics.checkNotNullParameter(collection, "collection");
        if (!collection.isEmpty()) {
            Intrinsics.checkNotNullParameter(collection, "collection");
            if (!collection.contains(bVar)) {
                return d0.a0(collection);
            }
        }
        return bVar;
    }

    public static final ArrayList b0(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<oq9.i> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (oq9.i iVar : list2) {
            Intrinsics.checkNotNullParameter(iVar, "<this>");
            List listK = iVar.k();
            Intrinsics.checkNotNullParameter(listK, "<this>");
            List<oq9.j> list3 = listK;
            ArrayList arrayList2 = new ArrayList(w.t(list3, 10));
            for (oq9.j jVar : list3) {
                Intrinsics.checkNotNullParameter(jVar, "<this>");
                String str = jVar.f227830a;
                String str2 = jVar.f227831b;
                String str3 = jVar.f227832c;
                String strB = jVar.d.b();
                dj0.d dVar = jVar.e;
                long j2 = dVar.f115082a;
                String str4 = dVar.f115083b.f306286a;
                dj0.d dVar2 = jVar.f;
                arrayList2.add(new m(str, str2, str3, strB, j2, str4, dVar2 != null ? hx7.a.A(dVar2) : null));
            }
            arrayList.add(arrayList2);
        }
        return w.u(arrayList);
    }

    public static final dj0.d d0(List list, boolean z) {
        dj0.d dVar = null;
        if (list != null) {
            try {
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (((PriceFee) obj2).f98065c == z) {
                        arrayList.add(obj2);
                    }
                }
                dj0.d.Companion.getClass();
                dj0.d dVarO = dj0.d.e;
                int i = 0;
                for (Object obj3 : arrayList) {
                    int i2 = i + 1;
                    if (i < 0) {
                        zhm.v.s();
                        throw null;
                    }
                    dVarO = i == 0 ? ((PriceFee) obj3).d : pyd.c.O(dVarO, ((PriceFee) obj3).d);
                    i = i2;
                }
                dVar = dVarO;
            } catch (Exception e) {
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
            }
        }
        if (dVar != null) {
            return dVar;
        }
        dj0.d.Companion.getClass();
        return dj0.d.e;
    }

    public static final Asset e(xi0.b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        return cp5.d.A(currency) ? new Asset(f8l.c.FIAT, currency.f306286a, currency) : cp5.d.z(currency) ? new Asset(f8l.c.CRYPTO, currency.f306286a, currency) : cp5.d.y(currency) ? new Asset(f8l.c.COMMODITY, currency.f306286a, currency) : new Asset(f8l.c.UNDEFINED, currency.f306286a, currency);
    }

    public static final dj0.d e0(TravelHotelsBookingAmendmentCost travelHotelsBookingAmendmentCost, boolean z) {
        TravelHotelsBookingAmendmentFees f97854a = travelHotelsBookingAmendmentCost.getF97854a();
        return d0(f97854a != null ? f97854a.f97861b : null, z);
    }

    public static final Set f(List list, Function1 function1) {
        ArrayList arrayList = new ArrayList();
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            Object objInvoke = function1.invoke(it8.next());
            if (objInvoke != null) {
                arrayList.add(objInvoke);
            }
        }
        return d0.i1(arrayList);
    }

    public static final dj0.d g0(TravelHotelsBookingAmendmentCost travelHotelsBookingAmendmentCost) {
        Intrinsics.checkNotNullParameter(travelHotelsBookingAmendmentCost, "<this>");
        TravelHotelsBookingAmendmentFees f97854a = travelHotelsBookingAmendmentCost.getF97854a();
        return d0(f97854a != null ? f97854a.f97860a : null, false);
    }

    public static final do3.e h(List list, do3.f service) {
        Object next;
        Object next2;
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(service, "service");
        Iterator it8 = list.iterator();
        while (true) {
            next = null;
            if (!it8.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it8.next();
            if (((r) next2).f116430a) {
                break;
            }
        }
        r rVar = (r) next2;
        if (rVar == null) {
            return null;
        }
        ArrayList arrayList = rVar.f116431b;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (((do3.e) obj2).f116396b == service) {
                arrayList2.add(obj2);
            }
        }
        Iterator it9 = arrayList2.iterator();
        if (it9.hasNext()) {
            next = it9.next();
            if (it9.hasNext()) {
                LocalDateTime localDateTime = ((do3.e) next).f116397c;
                do {
                    Object next3 = it9.next();
                    LocalDateTime localDateTime2 = ((do3.e) next3).f116397c;
                    if (localDateTime.compareTo((Object) localDateTime2) < 0) {
                        next = next3;
                        localDateTime = localDateTime2;
                    }
                } while (it9.hasNext());
            }
        }
        return (do3.e) next;
    }

    public static final npg.a h0(List list, Object obj2, dj0.d itemMoney, xi0.b baseCurrency) {
        Object next;
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(itemMoney, "itemMoney");
        Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
        Iterator it8 = list.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            n9l.a aVar = (n9l.a) next;
            if (Intrinsics.f(aVar.f213661a, itemMoney.f115083b) && Intrinsics.f(aVar.f213662b, baseCurrency)) {
                break;
            }
        }
        n9l.a aVar2 = (n9l.a) next;
        return new npg.a(aVar2 != null ? new dj0.d(pyd.c.J(itemMoney, aVar2.f213663c, aVar2.f213662b), baseCurrency) : null, obj2);
    }

    public static final q02.a i(a3 a3Var) {
        Instant instant;
        Intrinsics.checkNotNullParameter(a3Var, "<this>");
        aef.a aVar = a3Var.f272617v0;
        if (aVar == null || (instant = a3Var.f272620w0) == null) {
            return null;
        }
        return new q02.a(aVar, instant);
    }

    public static final jam.a k(Camera camera) {
        Intrinsics.checkNotNullParameter(camera, "<this>");
        Camera.Parameters parameters = camera.getParameters();
        Intrinsics.checkNotNullExpressionValue(parameters, "parameters");
        f78.a aVar = new f78.a(parameters);
        p pVar = (p) ((Lazy) aVar.f132566h).getValue();
        Set setF = f((List) ((Lazy) aVar.f132563b).getValue(), kam.a.f182499h);
        Object value = ((Lazy) aVar.f132564c).getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-focusModes>(...)");
        Set setF2 = f((List) value, kam.a.i);
        int iIntValue = ((Number) ((Lazy) aVar.f132569m).getValue()).intValue();
        boolean zBooleanValue = ((Boolean) ((Lazy) aVar.i).getValue()).booleanValue();
        int iIntValue2 = ((Number) ((Lazy) aVar.f132570n).getValue()).intValue();
        IntRange intRange = (IntRange) ((Lazy) aVar.k).getValue();
        IntRange intRange2 = (IntRange) ((Lazy) aVar.f132568l).getValue();
        Set setF3 = f((List) ((Lazy) aVar.f132567j).getValue(), kam.b.f);
        Set setI1 = d0.i1((List) ((Lazy) aVar.f132565g).getValue());
        Object value2 = ((Lazy) aVar.f).getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "<get-supportedPreviewFpsRanges>(...)");
        ArrayList arrayList = new ArrayList();
        for (int[] it8 : (List) value2) {
            Intrinsics.checkNotNullParameter(it8, "it");
            Intrinsics.checkNotNullParameter(it8, "<this>");
            arrayList.add(new uam.g(it8[0], it8[1]));
        }
        Set setI12 = d0.i1(arrayList);
        Object value3 = ((Lazy) aVar.e).getValue();
        Intrinsics.checkNotNullExpressionValue(value3, "<get-pictureResolutions>(...)");
        Set setS = s((List) value3);
        Object value4 = ((Lazy) aVar.d).getValue();
        Intrinsics.checkNotNullExpressionValue(value4, "<get-previewResolutions>(...)");
        return new jam.a(pVar, setF, setF2, zBooleanValue, iIntValue, iIntValue2, intRange, intRange2, setI12, setF3, setS, s((List) value4), setI1);
    }

    public static im.c l(String format, List customNotations) {
        Intrinsics.j(format, "format");
        Intrinsics.j(customNotations, "customNotations");
        HashMap map = im.c.f162274c;
        im.c cVar = (im.c) map.get(format);
        if (cVar != null) {
            return cVar;
        }
        im.c cVar2 = new im.c(format, customNotations);
        map.put(format, cVar2);
        return cVar2;
    }

    public static final LegacyOrderQuoteParams m(long j2, xi0.b sourceCurrency, xi0.b targetCurrency) {
        Intrinsics.checkNotNullParameter(sourceCurrency, "sourceCurrency");
        Intrinsics.checkNotNullParameter(targetCurrency, "targetCurrency");
        Asset assetE = e(sourceCurrency);
        Asset assetE2 = e(targetCurrency);
        f8l.e eVar = f8l.e.MARKET;
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(j2 / cp5.d.k(sourceCurrency));
        f8l.b bVar = f8l.b.FROM;
        return new LegacyOrderQuoteParams(assetE, assetE2, eVar, bigDecimalValueOf, bVar, bVar, null, false, null, null, null, null, null, null, 16128);
    }

    public static final Pair n(b6i.l mode, s6i.e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(mode, "mode");
        int i = s6i.f.f260366b[mode.ordinal()];
        if (i == 1) {
            return new Pair(eVar.f260362a, eVar.f260363b);
        }
        if (i == 2) {
            return new Pair(eVar.f260363b, eVar.f260362a);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final x5i.a o(s6i.e eVar, b6i.j inputPosition) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(inputPosition, "inputPosition");
        int i = s6i.f.f260365a[inputPosition.ordinal()];
        if (i == 1) {
            return eVar.f260362a;
        }
        if (i == 2) {
            return eVar.f260363b;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final String p(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Locale locale = Locale.ENGLISH;
        return p.a.r(locale, "ENGLISH", str, locale, "toLowerCase(...)");
    }

    public static final boolean q(bfl.g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        return gVar == bfl.g.BUY;
    }

    public static final boolean r(s6i.e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        return !Intrinsics.f(eVar.f260363b.f302979a.f115083b, eVar.f260362a.f302979a.f115083b);
    }

    public static final Set s(Collection collection) {
        Collection<Camera.Size> collection2 = collection;
        ArrayList arrayList = new ArrayList(w.t(collection2, 10));
        for (Camera.Size size : collection2) {
            Intrinsics.checkNotNullParameter(size, "<this>");
            arrayList.add(new uam.i(size.width, size.height));
        }
        return d0.i1(arrayList);
    }

    public static final String t(i3 i3Var) {
        Enum r110;
        Intrinsics.checkNotNullParameter(i3Var, "<this>");
        if (i3Var instanceof j3) {
            return ((j3) i3Var).f272843a;
        }
        if (!(i3Var instanceof k3)) {
            throw new NoWhenBranchMatchedException();
        }
        l2 l2Var = ((k3) i3Var).f272879a;
        switch (l2Var == null ? -1 : qzi.j.f250660a[l2Var.ordinal()]) {
            case -1:
                r110 = qzi.l.OVERALL;
                break;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                r110 = qzi.l.SERVICES;
                break;
            case 2:
                r110 = qzi.l.GROCERIES;
                break;
            case 3:
                r110 = qzi.l.ENTERTAINMENT;
                break;
            case 4:
                r110 = qzi.l.HEALTH;
                break;
            case 5:
                r110 = qzi.l.RESTAURANTS;
                break;
            case 6:
                r110 = qzi.l.SHOPPING;
                break;
            case 7:
                r110 = qzi.l.TRANSPORT;
                break;
            case 8:
                r110 = qzi.l.TRAVEL;
                break;
            case 9:
                r110 = qzi.l.UTILITIES;
                break;
            case 10:
                r110 = qzi.l.CASH;
                break;
            case 11:
                r110 = qzi.l.TRANSFERS;
                break;
            case 12:
                r110 = qzi.l.WEALTH;
                break;
            case 13:
                r110 = qzi.l.INSURANCE;
                break;
            case 14:
                r110 = qzi.l.GENERAL;
                break;
            case 15:
                r110 = qzi.l.REFUND;
                break;
            case 16:
                r110 = qzi.l.CASHBACK;
                break;
            case 17:
                r110 = qzi.l.CHILD_ALLOWANCE;
                break;
            case 18:
                r110 = qzi.l.INVESTMENT;
                break;
            case 19:
                r110 = qzi.l.LOAN;
                break;
            case 20:
                r110 = qzi.l.CREDIT;
                break;
            case 21:
                r110 = qzi.l.SAVINGS;
                break;
            case 22:
                r110 = qzi.l.DONATION;
                break;
            case 23:
                r110 = qzi.l.SALARY;
                break;
            case 24:
                r110 = qzi.l.GIFT;
                break;
            case 25:
                r110 = qzi.l.TOPUP;
                break;
            case 26:
                r110 = qzi.l.NET_SALES;
                break;
            case 27:
                r110 = qzi.l.INTEREST;
                break;
            case 28:
                r110 = qzi.l.FEE;
                break;
            case 29:
                r110 = qzi.l.CARD;
                break;
            case 30:
                r110 = qzi.l.ACCOMMODATION;
                break;
            case 31:
                r110 = qzi.l.FINANCIAL;
                break;
            case 32:
                r110 = qzi.l.FURNITURE;
                break;
            case 33:
                r110 = qzi.l.HARDWARE;
                break;
            case 34:
                r110 = qzi.l.FUEL;
                break;
            case 35:
                r110 = qzi.l.SOFTWARE;
                break;
            case 36:
                r110 = qzi.l.ADVERTISING;
                break;
            case 37:
                r110 = qzi.l.EDUCATION;
                break;
            case 38:
                r110 = qzi.l.GOVERNMENT;
                break;
            case 39:
                r110 = l2.REMITTANCES;
                break;
        }
        return r110.name();
    }

    public static final String u(qzi.l lVar) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        return lVar.name();
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.revolut.feature.defi.asset_details.api.model.DeFiAssetDetails v(h26.i r22) {
        /*
            Method dump skipped, instruction units count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v13.d.v(h26.i):com.revolut.feature.defi.asset_details.api.model.DeFiAssetDetails");
    }

    public static final ApplicableDocuments w(bvh.c cVar) {
        AlternativeDocumentGroups alternativeDocumentGroups;
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        ArrayList arrayListH = H(cVar.getGroups());
        bvh.a alternativeDocumentGroups2 = cVar.getAlternativeDocumentGroups();
        if (alternativeDocumentGroups2 != null) {
            List<bvh.b> sections = alternativeDocumentGroups2.getSections();
            ArrayList arrayList = new ArrayList(w.t(sections, 10));
            for (bvh.b bVar : sections) {
                arrayList.add(new AlternativeDocumentSection(bVar.getTitle(), H(bVar.getGroups())));
            }
            alternativeDocumentGroups = new AlternativeDocumentGroups(arrayList);
        } else {
            alternativeDocumentGroups = null;
        }
        return new ApplicableDocuments(arrayListH, alternativeDocumentGroups);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final cs3.b x(gr3.a r9) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            cs3.b r1 = new cs3.b
            jo3.a r2 = r9.getLoanMaxAmount()
            dj0.d r2 = mo3.a.o(r2)
            jo3.a r3 = r9.getLoanMinAmount()
            dj0.d r3 = mo3.a.o(r3)
            jo3.a r4 = r9.getCreditLimit()
            dj0.d r4 = mo3.a.o(r4)
            jo3.a r5 = r9.getUnknownBankMaxLimit()
            r6 = 0
            if (r5 == 0) goto L2b
            dj0.d r5 = mo3.a.o(r5)
            goto L2c
        L2b:
            r5 = r6
        L2c:
            jo3.a r7 = r9.getCreditCardUnknownBankMaxLimit()
            if (r7 == 0) goto L36
            dj0.d r6 = mo3.a.o(r7)
        L36:
            gr3.b r9 = r9.getEntryPoints()
            if (r9 == 0) goto L87
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.util.List r0 = r9.getProductSort()
            if (r0 == 0) goto L6c
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r0 = r0.iterator()
        L50:
            boolean r8 = r0.hasNext()
            if (r8 == 0) goto L66
            java.lang.Object r8 = r0.next()
            java.lang.String r8 = (java.lang.String) r8
            ft3.d1 r8 = ft3.g1.b(r8)
            if (r8 == 0) goto L50
            r7.add(r8)
            goto L50
        L66:
            java.util.Set r0 = zhm.d0.i1(r7)
            if (r0 != 0) goto L75
        L6c:
            cs3.c r0 = cs3.d.Companion
            r0.getClass()
            java.util.Set r0 = cs3.c.a()
        L75:
            java.lang.Boolean r9 = r9.getIsBalanceTransferEnabled()
            if (r9 == 0) goto L80
            boolean r9 = r9.booleanValue()
            goto L81
        L80:
            r9 = 0
        L81:
            cs3.d r7 = new cs3.d
            r7.<init>(r0, r9)
            goto L8e
        L87:
            cs3.c r9 = cs3.d.Companion
            r9.getClass()
            cs3.d r7 = cs3.d.f108444c
        L8e:
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: v13.d.x(gr3.a):cs3.b");
    }

    public static final d26.c y(h26.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        Double dK = kotlin.text.y.k(fVar.f148715a);
        double dDoubleValue = dK != null ? dK.doubleValue() : 0.0d;
        List<h26.c> list = fVar.f148716b;
        ArrayList arrayList = new ArrayList();
        for (h26.c cVar : list) {
            Double dK2 = kotlin.text.y.k(cVar.f148712b);
            d26.a aVar = dK2 != null ? new d26.a(cVar.f148711a, dK2.doubleValue()) : null;
            if (aVar != null) {
                arrayList.add(aVar);
            }
        }
        return new d26.c(dDoubleValue, arrayList);
    }

    public abstract k9.k c(k9.v vVar, JavaType javaType);

    public abstract s9.l d(t tVar, JavaType javaType);
}
