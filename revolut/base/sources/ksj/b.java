package ksj;

import android.accounts.Account;
import android.graphics.ColorMatrix;
import android.view.View;
import ch.qos.logback.core.CoreConstants;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.credit.core.ui.picker.PickerBottomSheetController;
import com.revolut.feature.credit.core.ui.picker.PickerBottomSheetControllerContract$InputData;
import com.revolut.feature.defi.accounts.api.model.DeFiBalance;
import com.revolut.feature.defi.accounts.api.model.DeFiWallet;
import com.revolut.feature.rev_points.models.RevPointsPersonalisationBrandOption;
import com.revolut.feature.rev_points.models.RevPointsPersonalisationBrandsResponse;
import com.revolut.feature.rev_points.models.RevPointsPersonalisationPreferenceOption;
import com.revolut.feature.rev_points.models.RevPointsPersonalisationPreferencesResponse;
import com.revolut.feature.revolut_shop.api.domain.model.IppProductType;
import com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.CheckoutScreenContract$CheckoutTarget;
import com.revolut.feature.wealth.api.domain.model.WealthAccount;
import com.revolut.kompot.R$id;
import com.revolut.retail.feature.esim.api.model.EsimMobilePlanPointsOption;
import com.revolut.sso.api.accounts.RevolutAccount;
import com.revolut.sso.impl.domain.models.RevolutAccountImpl;
import d3c.a0;
import d3c.b0;
import d3c.d0;
import d3c.e0;
import d3c.f;
import d3c.g;
import d3c.n0;
import d3c.y;
import dj0.d;
import dx4.q5;
import dx4.r5;
import fdl.a3;
import fdl.s2;
import gfk.o;
import j3c.c0;
import j3c.f0;
import j3c.k;
import j3c.l;
import j3c.v;
import j3c.x;
import j3c.z;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.Instant;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import k16.j;
import k16.m;
import k16.p;
import k16.s;
import kfj.t0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kp0.w0;
import m1c.p1;
import mha.i;
import mha.n;
import mx0.c9;
import org.joda.time.DateTime;
import uvg.q;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes11.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static ColorMatrix f189467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static float[] f189468b;

    public static final b0 A(x xVar) {
        n0 n0Var;
        Iterator it8;
        v vVar;
        a0 a0Var;
        String str;
        e0 e0Var;
        Intrinsics.checkNotNullParameter(xVar, "<this>");
        String strB = xVar.getId();
        String strE = xVar.getOrderId();
        String strA = xVar.getCreatedBy();
        String strD = xVar.getMerchantId();
        j3c.b0 b0VarH = xVar.getTotalAmount();
        d dVarX = b0VarH != null ? w0.x(b0VarH) : null;
        j3c.b0 b0VarJ = xVar.getTotalTaxAmount();
        d dVarX2 = b0VarJ != null ? w0.x(b0VarJ) : null;
        j3c.b0 b0VarI = xVar.getTotalDeliveryAmount();
        d dVarX3 = b0VarI != null ? w0.x(b0VarI) : null;
        List<z> listC = xVar.getItems();
        d dVar = dVarX2;
        d dVar2 = dVarX3;
        ArrayList arrayList = new ArrayList(w.t(listC, 10));
        for (z zVar : listC) {
            Intrinsics.checkNotNullParameter(zVar, "<this>");
            String strF = zVar.getSku();
            IppProductType ippProductTypeA = g3c.a.a(zVar.getType());
            String strG = zVar.getState();
            e0[] e0VarArrValues = e0.values();
            int length = e0VarArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    str = strB;
                    e0Var = null;
                    break;
                }
                e0Var = e0VarArrValues[i];
                str = strB;
                if (kotlin.text.a0.z(e0Var.name(), strG, true)) {
                    break;
                }
                i++;
                strB = str;
            }
            if (e0Var == null) {
                e0Var = e0.UNKNOWN;
            }
            e0 e0Var2 = e0Var;
            long jA = zVar.getCount();
            long jB = zVar.getCountLimit();
            d dVarX4 = w0.x(zVar.getUnitPrice());
            d dVarX5 = w0.x(zVar.getUnitPriceWithoutDiscounts());
            d dVarX6 = w0.x(zVar.getTotalPrice());
            d dVarX7 = w0.x(zVar.getTotalPriceWithoutDiscounts());
            j3c.a0 a0VarD = zVar.getMetadata();
            Intrinsics.checkNotNullParameter(a0VarD, "<this>");
            d0 d0Var = new d0(a0VarD.getLocationId());
            List listE = zVar.getPromotions();
            ArrayList arrayList2 = new ArrayList(w.t(listE, 10));
            Iterator it9 = listE.iterator();
            while (it9.hasNext()) {
                arrayList2.add(mra.d.Y((c0) it9.next()));
            }
            l lVarH = zVar.getStrings();
            Intrinsics.checkNotNullParameter(lVarH, "<this>");
            g gVar = new g(lVarH.getType(), lVarH.getVariation());
            k kVarC = zVar.getImages();
            Intrinsics.checkNotNullParameter(kVarC, "<this>");
            arrayList.add(new d3c.c0(strF, ippProductTypeA, e0Var2, jA, jB, dVarX4, dVarX5, dVarX6, dVarX7, d0Var, arrayList2, gVar, new f(kVarC.getSmall(), kVarC.getAvatar())));
            strB = str;
        }
        String str2 = strB;
        List listF = xVar.getShipments();
        ArrayList arrayList3 = new ArrayList(w.t(listF, 10));
        Iterator it10 = listF.iterator();
        while (it10.hasNext()) {
            v vVar2 = (v) it10.next();
            Intrinsics.checkNotNullParameter(vVar2, "<this>");
            String strD2 = vVar2.getServiceProvider();
            a0[] a0VarArrValues = a0.values();
            int length2 = a0VarArrValues.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length2) {
                    it8 = it10;
                    vVar = vVar2;
                    a0Var = null;
                    break;
                }
                a0Var = a0VarArrValues[i2];
                it8 = it10;
                vVar = vVar2;
                if (kotlin.text.a0.z(a0Var.name(), strD2, true)) {
                    break;
                }
                i2++;
                it10 = it8;
                vVar2 = vVar;
            }
            if (a0Var == null) {
                a0Var = a0.UNKNOWN;
            }
            a0 a0Var2 = a0Var;
            d dVarX8 = w0.x(vVar.getDeliveryPrice());
            long jA2 = vVar.getDeliveryDate();
            List<j3c.w> listC2 = vVar.getItems();
            ArrayList arrayList4 = new ArrayList(w.t(listC2, 10));
            for (j3c.w wVar : listC2) {
                Intrinsics.checkNotNullParameter(wVar, "<this>");
                arrayList4.add(new d3c.z(wVar.getSku(), g3c.a.a(wVar.getType()), wVar.getCount()));
            }
            arrayList3.add(new y(a0Var2, dVarX8, jA2, arrayList4));
            it10 = it8;
        }
        String strG2 = xVar.getTaxRate();
        f0 f0VarK = xVar.getVatSettings();
        if (f0VarK != null) {
            Intrinsics.checkNotNullParameter(f0VarK, "<this>");
            n0Var = new n0(f0VarK.getRegistered(), f0VarK.getNumber());
        } else {
            n0Var = null;
        }
        z zVar2 = (z) zhm.d0.d0(xVar.getItems());
        return new b0(str2, strE, strA, strD, dVarX, dVar, dVar2, arrayList, arrayList3, strG2, n0Var, zVar2 != null ? zVar2.getTermsAndConditionsUri() : null);
    }

    public static final e16.b B(i16.b bVar) {
        ej0.b bVar2;
        String str = "<this>";
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        String str2 = bVar.f157575a;
        String str3 = bVar.f157576b;
        List list = bVar.f157577c;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            i16.f fVar = (i16.f) it8.next();
            Intrinsics.checkNotNullParameter(fVar, str);
            String str4 = fVar.f;
            String str5 = fVar.f157583g;
            if (str4 == null || str5 == null) {
                bVar2 = null;
            } else {
                BigDecimal bigDecimal = new BigDecimal(str4);
                xi0.b.Companion.getClass();
                bVar2 = new ej0.b(bigDecimal, xi0.a.a(str5));
            }
            ej0.b bVar3 = bVar2;
            String str6 = fVar.f157580a;
            String str7 = fVar.f157581b;
            String str8 = fVar.f157582c;
            BigInteger bigInteger = fVar.d;
            int i = fVar.e;
            Instant instantOfEpochMilli = Instant.ofEpochMilli(fVar.f157584h);
            Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli, "ofEpochMilli(...)");
            Instant instantOfEpochMilli2 = Instant.ofEpochMilli(fVar.i);
            Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli2, "ofEpochMilli(...)");
            arrayList.add(new DeFiBalance(str7, bigInteger, i, bVar3, instantOfEpochMilli, instantOfEpochMilli2, str8, str6));
            it8 = it8;
            str = str;
        }
        return new e16.b(str2, str3, arrayList, zhm.f0.f322471a);
    }

    public static final e16.b C(k16.g gVar) {
        ej0.b bVar;
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        String str = gVar.f180110a;
        String str2 = gVar.f180112c;
        List<p> list = gVar.e;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (p pVar : list) {
            Intrinsics.checkNotNullParameter(pVar, "<this>");
            j jVar = pVar.f180122a;
            String str3 = jVar.f180117c;
            String str4 = jVar.f180115a;
            String str5 = pVar.f180123b;
            BigInteger bigInteger = pVar.f180124c;
            int i = jVar.f180116b;
            m mVar = pVar.f;
            if (mVar != null) {
                Intrinsics.checkNotNullParameter(mVar, "<this>");
                BigDecimal bigDecimal = new BigDecimal(mVar.f180119a);
                xi0.a aVar = xi0.b.Companion;
                String str6 = mVar.f180120b;
                aVar.getClass();
                bVar = new ej0.b(bigDecimal, xi0.a.a(str6));
            } else {
                bVar = null;
            }
            arrayList.add(new DeFiBalance(str4, bigInteger, i, bVar, pVar.d, pVar.e, str5, str3));
        }
        List<s> list2 = gVar.d;
        ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
        for (s sVar : list2) {
            Intrinsics.checkNotNullParameter(sVar, "<this>");
            String str7 = sVar.f180126a;
            String str8 = sVar.f180127b;
            arrayList2.add(new DeFiWallet(str7, Intrinsics.f(str8, "EVM") ? wk5.k.EVM : Intrinsics.f(str8, "SOLANA") ? wk5.k.SPL : wk5.k.UNKNOWN, sVar.f180128c, sVar.d, sVar.e, sVar.f));
        }
        return new e16.b(str, str2, arrayList, arrayList2);
    }

    public static final mha.k D(gfk.m mVar, xi0.b currency) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(currency, "currency");
        String type = mVar.getType();
        if (Intrinsics.f(type, "PERCENTAGE")) {
            double d = Double.parseDouble(mVar.getValue());
            Long minMoneyAmount = mVar.getMinMoneyAmount();
            return new mha.j(d, minMoneyAmount != null ? new d(minMoneyAmount.longValue(), currency) : null);
        }
        if (Intrinsics.f(type, "ABSOLUTE")) {
            return new i(new d(Long.parseLong(mVar.getValue()), currency));
        }
        throw new IllegalArgumentException(j6.a.q("unknown plan limit fee type: ", mVar.getType()));
    }

    public static final mha.p E(o oVar, xi0.b currency) {
        Intrinsics.checkNotNullParameter(oVar, "<this>");
        Intrinsics.checkNotNullParameter(currency, "currency");
        mha.p pVarI = I(oVar, currency);
        if (pVarI != null) {
            return pVarI;
        }
        throw new IllegalArgumentException(j6.a.q("unknown plan limit value unit: ", oVar.getUnit()));
    }

    public static final mwg.i F(uvg.o oVar, String str) {
        Intrinsics.checkNotNullParameter(oVar, "<this>");
        DateTime dateTimeC = oVar.getStart();
        DateTime dateTimeA = oVar.getEnd();
        List<q> listB = oVar.getPoints();
        ArrayList arrayList = new ArrayList(w.t(listB, 10));
        for (q qVar : listB) {
            DateTime dateTimeE = qVar.getStart();
            DateTime dateTimeC2 = qVar.getEnd();
            d dVarO = mo3.a.o(qVar.getNetSell());
            jo3.a aVarB = qVar.getDividends();
            arrayList.add(new mwg.j(dateTimeE, dateTimeC2, dVarO, aVarB != null ? mo3.a.o(aVarB) : null, mo3.a.o(qVar.getCumulative())));
        }
        return new mwg.i(dateTimeC, dateTimeA, arrayList, ZonedDateTime.parse(str));
    }

    public static final pck.d G(tck.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        tck.c cVar = fVar.f269861a;
        String str = cVar.f269857a;
        Instant instantOfEpochMilli = Instant.ofEpochMilli(cVar.f269858b);
        Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli, "ofEpochMilli(...)");
        tck.c cVar2 = fVar.f269861a;
        Instant instantOfEpochMilli2 = Instant.ofEpochMilli(cVar2.f269859c);
        Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli2, "ofEpochMilli(...)");
        pck.b bVar = new pck.b(str, instantOfEpochMilli, instantOfEpochMilli2, cVar2.d);
        int i = fVar.f269862b;
        Long l2 = fVar.f269863c;
        return new pck.d(bVar, i, l2 != null ? Instant.ofEpochMilli(l2.longValue()) : null);
    }

    public static final wbl.b H(s2 s2Var) {
        Intrinsics.checkNotNullParameter(s2Var, "<this>");
        if (s2Var instanceof fdl.q) {
            fdl.q qVar = (fdl.q) s2Var;
            return new wbl.a(qVar.f134243b, qVar.f134244c, mo3.a.o(qVar.d));
        }
        if (!(s2Var instanceof a3)) {
            return new wbl.g(s2Var.getF134243b(), s2Var.getF134244c());
        }
        a3 a3Var = (a3) s2Var;
        return new wbl.f(a3Var.f134016b, a3Var.f134017c, a3Var.d);
    }

    public static final mha.p I(o oVar, xi0.b currency) {
        Intrinsics.checkNotNullParameter(oVar, "<this>");
        Intrinsics.checkNotNullParameter(currency, "currency");
        String unit = oVar.getUnit();
        if (Intrinsics.f(unit, "QUANTITY")) {
            return new mha.o(Long.parseLong(oVar.getValue()));
        }
        if (Intrinsics.f(unit, "MONEY")) {
            return new n(new d(Long.parseLong(oVar.getValue()), currency));
        }
        return null;
    }

    public static final gfk.m J(mha.k kVar) {
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        if (!(kVar instanceof mha.j)) {
            if (kVar instanceof i) {
                return new gfk.m("ABSOLUTE", null, String.valueOf(((i) kVar).f205453a.f115082a));
            }
            throw new NoWhenBranchMatchedException();
        }
        mha.j jVar = (mha.j) kVar;
        String strValueOf = String.valueOf(jVar.f205454a);
        d dVar = jVar.f205455b;
        return new gfk.m("PERCENTAGE", dVar != null ? Long.valueOf(dVar.f115082a) : null, strValueOf);
    }

    public static final t0 K(EsimMobilePlanPointsOption esimMobilePlanPointsOption) {
        Intrinsics.checkNotNullParameter(esimMobilePlanPointsOption, "<this>");
        return new t0(esimMobilePlanPointsOption.f100304a, mo3.a.p(esimMobilePlanPointsOption.f100305b), mo3.a.p(esimMobilePlanPointsOption.f100306c), Boolean.valueOf(esimMobilePlanPointsOption.d));
    }

    public static final i16.b L(e16.b bVar) {
        xi0.b bVar2;
        BigDecimal bigDecimal;
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        String str = bVar.f121886a;
        String str2 = bVar.f121887b;
        ArrayList<DeFiBalance> arrayList = bVar.f121888c;
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        for (DeFiBalance deFiBalance : arrayList) {
            Intrinsics.checkNotNullParameter(deFiBalance, "<this>");
            String str3 = deFiBalance.f71639h;
            String str4 = deFiBalance.f71635a;
            String str5 = deFiBalance.f71638g;
            BigInteger bigInteger = deFiBalance.f71636b;
            int i = deFiBalance.f71637c;
            ej0.b bVar3 = deFiBalance.d;
            String str6 = null;
            String plainString = (bVar3 == null || (bigDecimal = bVar3.f126703a) == null) ? null : bigDecimal.toPlainString();
            if (bVar3 != null && (bVar2 = bVar3.f126704b) != null) {
                str6 = bVar2.f306286a;
            }
            arrayList2.add(new i16.f(str3, str4, str5, bigInteger, i, plainString, str6, deFiBalance.e.toEpochMilli(), deFiBalance.f.toEpochMilli()));
        }
        return new i16.b(str, str2, arrayList2);
    }

    public static final l7c.a M(u9c.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        if (cVar instanceof u9c.b) {
            return new l7c.a(((u9c.b) cVar).f278450a, null, null);
        }
        if (!(cVar instanceof u9c.a)) {
            throw new NoWhenBranchMatchedException();
        }
        u9c.a aVar = (u9c.a) cVar;
        return new l7c.a(null, aVar.f278448a, aVar.f278449b);
    }

    public static final o N(d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        return new o("MONEY", String.valueOf(dVar.f115082a));
    }

    public static final Account O(RevolutAccount revolutAccount) {
        Intrinsics.checkNotNullParameter(revolutAccount, "<this>");
        return new Account(((RevolutAccountImpl) revolutAccount).f106157a, ((RevolutAccountImpl) revolutAccount).f106159c);
    }

    public static final cji.d a(Object obj2) {
        return new cji.d(obj2);
    }

    public static cji.d b() {
        return new cji.d(null);
    }

    public static final Pair c(com.revolut.kompot.navigable.a aVar) {
        if (aVar != null) {
            View viewD2 = aVar.D2();
            com.revolut.kompot.navigable.a aVar2 = aVar.f98405m;
            while (true) {
                if (aVar2 == null) {
                    break;
                }
                View viewD22 = aVar2.D2();
                Intrinsics.checkNotNullParameter(viewD22, "<this>");
                Object tag2 = viewD22.getTag(R$id.postponed_modal_transition);
                wji.f fVar = tag2 instanceof wji.f ? (wji.f) tag2 : null;
                if (fVar == null) {
                    aVar2 = aVar2.f98405m;
                } else if (com.bumptech.glide.c.q(viewD2, viewD22)) {
                    return new Pair(viewD22, fVar);
                }
            }
        }
        return null;
    }

    public static final boolean d(cxe.b bVar) {
        d dVarA;
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        if (!bVar.d || !bVar.f) {
            return false;
        }
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        jxe.c cVar = bVar.f109924h;
        d dVarH = null;
        d dVarM = pyd.c.M(cVar != null ? cVar.a() : null);
        jxe.l lVar = bVar.i;
        if (lVar != null && (dVarA = lVar.a()) != null) {
            dVarH = pyd.c.H(dVarA, dVarM);
        }
        return pyd.c.M(dVarH).f(d.e);
    }

    public static final PickerBottomSheetController e(r5 config) {
        Intrinsics.checkNotNullParameter(config, "config");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.credit_application_offer_variant_selection_popup_title, u.c(config.f120756b), null, 12);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.credit_application_offer_variant_selection_popup_button, u.c(config.d), null, 12);
        ArrayList<q5> arrayList = config.f120757c;
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        for (q5 q5Var : arrayList) {
            arrayList2.add(new gy4.j(new TextLocalisedClause(R$string.credit_application_offer_variant_selection_popup_variant_title, u.c(q5Var.f120730b), null, 12), Long.valueOf(q5Var.f120729a)));
        }
        Iterator it8 = arrayList.iterator();
        int i = 0;
        while (true) {
            if (!it8.hasNext()) {
                i = -1;
                break;
            }
            if (((q5) it8.next()).f120731c) {
                break;
            }
            i++;
        }
        return new PickerBottomSheetController(new PickerBottomSheetControllerContract$InputData(textLocalisedClause, textLocalisedClause2, arrayList2, i != -1 ? i : 0));
    }

    public static final ArrayList f(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<svi.b> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (svi.b bVar : list2) {
            Intrinsics.checkNotNullParameter(bVar, "<this>");
            arrayList.add(new iwi.c(bVar.f265874a, bVar.f265875b, bVar.f265876c, bVar.d, bVar.e, bVar.f, bVar.f265877g, bVar.f265878h, bVar.i, jwi.b.f(bVar.f265879j)));
        }
        return arrayList;
    }

    public static final ArrayList g(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<gwi.i> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (gwi.i iVar : list2) {
            Intrinsics.checkNotNullParameter(iVar, "<this>");
            String str = iVar.f147416a;
            String string = kotlin.text.d0.F0(iVar.f147417b).toString();
            String str2 = iVar.f147418c;
            if (str2 == null) {
                str2 = "";
            }
            arrayList.add(new svi.b(str, string, str2, iVar.d, iVar.e, iVar.f, iVar.f147419g, iVar.f147420h, iVar.i, jwi.b.d(iVar.f147421j)));
        }
        return arrayList;
    }

    public static final ArrayList h(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<iwi.c> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (iwi.c cVar : list2) {
            Intrinsics.checkNotNullParameter(cVar, "<this>");
            arrayList.add(new svi.b(cVar.getId(), cVar.getName(), cVar.getAirportId(), cVar.getAirportName(), cVar.getIataCode(), cVar.getTerminal(), cVar.getTravelType(), cVar.getInspection(), cVar.getImageUrl(), jwi.b.e(cVar.getOpeningHours())));
        }
        return arrayList;
    }

    public static int i(float[] fArr, int[] iArr, byte[] bArr) {
        Arrays.fill(bArr, (byte) 0);
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < 6; i2++) {
            int iCeil = (int) Math.ceil(fArr[i2]);
            iArr[i2] = iCeil;
            if (i > iCeil) {
                Arrays.fill(bArr, (byte) 0);
                i = iCeil;
            }
            if (i == iCeil) {
                bArr[i2] = (byte) (bArr[i2] + 1);
            }
        }
        return i;
    }

    public static final int j(ajm.i iVar) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        return iVar.d().size();
    }

    public static final int k(ys.x xVar) {
        Intrinsics.checkNotNullParameter(xVar, "<this>");
        int i = ys.w.f316369a[xVar.ordinal()];
        if (i == 1) {
            return com.revolut.camerakit.revolut.ui.R$string.vision_nfc_my_number_dob_calendar_gregorian;
        }
        if (i == 2) {
            return com.revolut.camerakit.revolut.ui.R$string.vision_nfc_my_number_dob_calendar_taishou;
        }
        if (i == 3) {
            return com.revolut.camerakit.revolut.ui.R$string.vision_nfc_my_number_dob_calendar_shouwa;
        }
        if (i == 4) {
            return com.revolut.camerakit.revolut.ui.R$string.vision_nfc_my_number_dob_calendar_heisei;
        }
        if (i == 5) {
            return com.revolut.camerakit.revolut.ui.R$string.vision_nfc_my_number_dob_calendar_reiwa;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final lji.c l(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Object tag2 = view.getTag(com.revolut.core.ui_kit.foundation.R$id.internal_overlay_blur_applicator);
        if (tag2 instanceof lji.c) {
            return (lji.c) tag2;
        }
        return null;
    }

    public static final boolean m(Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return false;
        }
        Iterator it8 = iterable.iterator();
        while (it8.hasNext()) {
            WealthAccount wealthAccount = (WealthAccount) it8.next();
            if ((wealthAccount instanceof WealthAccount.Securities) || (wealthAccount instanceof WealthAccount.TaxAdvantageWealthAccount)) {
                if (wealthAccount.available()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void n(char c2) {
        String hexString = Integer.toHexString(c2);
        throw new IllegalArgumentException("Illegal character: " + c2 + " (0x" + ("0000".substring(0, 4 - hexString.length()) + hexString) + CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    public static boolean o(char c2) {
        return c2 >= '0' && c2 <= '9';
    }

    public static final boolean p(qua.p pVar, DateTime currentTime) {
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        Intrinsics.checkNotNullParameter(currentTime, "currentTime");
        if (!qua.u.i(pVar, currentTime)) {
            return false;
        }
        switch (frj.a.f137485a[pVar.f249314a.f160152c.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
                return true;
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
                return false;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static boolean q(char c2) {
        return c2 >= 128 && c2 <= 255;
    }

    public static final boolean r(cxe.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        return bVar.f109922c && (bVar.f109927m instanceof CheckoutScreenContract$CheckoutTarget.Junior);
    }

    public static boolean s(char c2) {
        if (c2 == '\r' || c2 == '*' || c2 == '>' || c2 == ' ') {
            return true;
        }
        if (c2 < '0' || c2 > '9') {
            return c2 >= 'A' && c2 <= 'Z';
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0193, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01a9, code lost:
    
        return 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01b3, code lost:
    
        return 3;
     */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01f0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x016c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int t(java.lang.CharSequence r20, int r21, int r22) {
        /*
            Method dump skipped, instruction units count: 506
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ksj.b.t(java.lang.CharSequence, int, int):int");
    }

    public static final void u(View view, Function1 callback) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(callback, "callback");
        view.setOnClickListener(new u2m.d(new c9(callback)));
    }

    public static final void v(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            if (((zsl.x) it8.next()) == null) {
                throw new IllegalArgumentException("Non-stock validation error");
            }
        }
    }

    public static final RevPointsPersonalisationBrandsResponse w(vxb.n nVar) {
        Intrinsics.checkNotNullParameter(nVar, "<this>");
        int minimumSelectionCount = nVar.getMinimumSelectionCount();
        List brands = nVar.getBrands();
        Intrinsics.checkNotNullParameter(brands, "<this>");
        List<vxb.m> list = brands;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (vxb.m mVar : list) {
            Intrinsics.checkNotNullParameter(mVar, "<this>");
            arrayList.add(new RevPointsPersonalisationBrandOption(mVar.getId(), mVar.getTitle(), mVar.getLogoUrl(), mVar.getSelected()));
        }
        return new RevPointsPersonalisationBrandsResponse(minimumSelectionCount, arrayList);
    }

    public static final RevPointsPersonalisationPreferencesResponse x(vxb.p pVar) {
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        int iB = pVar.getMinimumSelectionCount();
        List listC = pVar.getPreferences();
        Intrinsics.checkNotNullParameter(listC, "<this>");
        List<vxb.o> list = listC;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (vxb.o oVar : list) {
            Intrinsics.checkNotNullParameter(oVar, "<this>");
            arrayList.add(new RevPointsPersonalisationPreferenceOption(oVar.getKey(), oVar.getTitle(), oVar.getEmoji(), oVar.getSelected()));
        }
        p1 p1VarA = pVar.getDisclaimer();
        return new RevPointsPersonalisationPreferencesResponse(iB, arrayList, p1VarA != null ? qvb.b.b(p1VarA) : null);
    }

    public static final EsimMobilePlanPointsOption y(t0 t0Var) {
        Intrinsics.checkNotNullParameter(t0Var, "<this>");
        return new EsimMobilePlanPointsOption(t0Var.getPoints(), mo3.a.o(t0Var.getDiscount()), mo3.a.o(t0Var.getFinalPrice()), pd.b.j(t0Var.getPreselected()));
    }

    public static final RevolutAccountImpl z(Account account, cjl.b bVar) {
        Intrinsics.checkNotNullParameter(account, "<this>");
        String name = account.name;
        Intrinsics.checkNotNullExpressionValue(name, "name");
        String type = account.type;
        Intrinsics.checkNotNullExpressionValue(type, "type");
        return new RevolutAccountImpl(name, bVar, type);
    }
}
