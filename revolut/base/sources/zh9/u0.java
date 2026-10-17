package zh9;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.Menu;
import android.view.MenuItem;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import aw0.a6;
import aw0.o9;
import aw0.u5;
import aw0.v5;
import aw0.w5;
import aw0.x5;
import aw0.y5;
import aw0.z5;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.backend_flow.domain.models.BackendCard;
import com.revolut.feature.credit.loan.api.models.rev10.LoanAccrual;
import com.revolut.feature.tax_residency.impl.R$string;
import com.revolut.feature.travel.miles.api.model.TravelMilesRedeemOption;
import com.revolut.feature.travel.miles.api.model.TravelMilesRedeemOptionItem;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.kompot.common.StackDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.revolut.shared.feature.wealth.models.trading_accounts.Beneficiary;
import fdl.z2;
import grl.r2;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import jel.b3;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.joda.time.DateTime;
import vkm.v1;

/* JADX INFO: loaded from: classes5.dex */
public abstract class u0 {
    public static final boolean A(r0 r0Var) {
        Intrinsics.checkNotNullParameter(r0Var, "<this>");
        return r0Var.f322335p == q0.OUTSTANDING;
    }

    public static final boolean B(r0 r0Var) {
        Intrinsics.checkNotNullParameter(r0Var, "<this>");
        ArrayList arrayList = r0Var.B;
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            if (((p) it8.next()).f322322l) {
                return true;
            }
        }
        return false;
    }

    public static final boolean C(r0 r0Var) {
        Intrinsics.checkNotNullParameter(r0Var, "<this>");
        return r0Var.f322335p == q0.OVERDUE;
    }

    public static final boolean D(i accountConfig, r0 r0Var) {
        h hVar;
        Intrinsics.checkNotNullParameter(r0Var, "<this>");
        Intrinsics.checkNotNullParameter(accountConfig, "accountConfig");
        Intrinsics.checkNotNullParameter(r0Var, "<this>");
        return r0Var.f322335p == q0.ACTIVE && (hVar = accountConfig.f) != null && cp5.c.C(hVar);
    }

    public static final boolean E(LoanAccrual loanAccrual) {
        Intrinsics.checkNotNullParameter(loanAccrual, "<this>");
        return loanAccrual.f70124a.k();
    }

    public static final void F(Activity activity, int i, List menuItemResIds) {
        Menu menu;
        MenuItem menuItemFindItem;
        Drawable icon;
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Intrinsics.checkNotNullParameter(menuItemResIds, "menuItemResIds");
        Iterator it8 = menuItemResIds.iterator();
        while (it8.hasNext()) {
            int iIntValue = ((Number) it8.next()).intValue();
            Toolbar toolbar = (Toolbar) activity.findViewById(i);
            if (toolbar != null && (menu = toolbar.getMenu()) != null && (menuItemFindItem = menu.findItem(iIntValue)) != null && (icon = menuItemFindItem.getIcon()) != null) {
                icon.setTint(activity.getColor(y(activity) ? R.color.tdcoreekyc__app_bar_icon_dark_mode : R.color.tdcoreekyc__app_bar_icon_light_mode));
            }
        }
    }

    public static final void G(nx0.a aVar, boolean z) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        aVar.F().setVisibility(z ? 0 : 8);
    }

    public static final v1 H(vkm.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        return new v1(new fa7.d(dVar, null, 2));
    }

    public static final ct0.t I(a6 a6Var) {
        Intrinsics.checkNotNullParameter(a6Var, "<this>");
        if ((a6Var instanceof v5) || Intrinsics.f(a6Var, u5.f10561a)) {
            return ct0.t.BASIC;
        }
        if (Intrinsics.f(a6Var, z5.f10641a)) {
            return ct0.t.WARNING;
        }
        if (Intrinsics.f(a6Var, x5.f10605a)) {
            return ct0.t.POSITIVE;
        }
        if (Intrinsics.f(a6Var, w5.f10586a)) {
            return ct0.t.NEGATIVE;
        }
        if (Intrinsics.f(a6Var, y5.f10629a)) {
            return ct0.t.STATIC;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final String J(xzg.o oVar) {
        Intrinsics.checkNotNullParameter(oVar, "<this>");
        int i = f7h.e.f132620a[oVar.ordinal()];
        if (i == 1) {
            return "COLLECTIONS_STOCKS";
        }
        if (i == 2) {
            return "COLLECTIONS_CRYPTO";
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final BackendCard K(q90.g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        return new BackendCard(gVar.getId(), gVar.getImage(), gVar.getSubtitle(), gVar.getTitle());
    }

    public static final TravelMilesRedeemOption L(qfg.k kVar) {
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        String strE = kVar.getTitle();
        String strA = kVar.getDescription();
        String strB = kVar.getIcon();
        String strD = kVar.getStartingPrice();
        Double dValueOf = strD != null ? Double.valueOf(Double.parseDouble(strD)) : null;
        List<qfg.l> listC = kVar.getOptions();
        ArrayList arrayList = new ArrayList(zhm.w.t(listC, 10));
        for (qfg.l lVar : listC) {
            Intrinsics.checkNotNullParameter(lVar, "<this>");
            arrayList.add(new TravelMilesRedeemOptionItem(Double.parseDouble(lVar.getStartingPrice()), lVar.getTitle(), lVar.getIcon()));
        }
        return new TravelMilesRedeemOption(strE, strA, strB, dValueOf, arrayList);
    }

    public static final TravelMilesRedeemOption M(xfg.z zVar) {
        Intrinsics.checkNotNullParameter(zVar, "<this>");
        String strE = zVar.getTitle();
        String strA = zVar.getDescription();
        String strB = zVar.getIcon();
        String strD = zVar.getStartingPrice();
        Double dValueOf = strD != null ? Double.valueOf(Double.parseDouble(strD)) : null;
        List<xfg.a0> listC = zVar.getOptions();
        ArrayList arrayList = new ArrayList(zhm.w.t(listC, 10));
        for (xfg.a0 a0Var : listC) {
            Intrinsics.checkNotNullParameter(a0Var, "<this>");
            arrayList.add(new TravelMilesRedeemOptionItem(Double.parseDouble(a0Var.getStartingPrice()), a0Var.getTitle(), a0Var.getIcon()));
        }
        return new TravelMilesRedeemOption(strE, strA, strB, dValueOf, arrayList);
    }

    public static final Beneficiary N(sdl.c cVar) {
        cfl.a aVar;
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        UUID uuid = cVar.f261941a;
        String str = cVar.f261942b;
        sdl.e eVar = cVar.f261943c;
        if (eVar != null) {
            int i = sdl.l.f261980b[eVar.ordinal()];
            if (i == 1) {
                aVar = cfl.a.DEPENDANT;
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar = cfl.a.SELF;
            }
        } else {
            aVar = null;
        }
        return new Beneficiary(uuid, str, aVar);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final g0j.a O(nuj.i iVar) {
        g0j.b bVar;
        g0j.c cVar;
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        String str = iVar.f219327a;
        wi0.a aVar = wi0.b.Companion;
        String str2 = iVar.f219328b;
        aVar.getClass();
        wi0.b bVarA = wi0.a.a(str2);
        String str3 = iVar.f219329c;
        List list = iVar.d;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            String str4 = ((nuj.f) it8.next()).f219325a;
            switch (str4.hashCode()) {
                case -2122823200:
                    if (!str4.equals("apmAreaBizum")) {
                        throw new UnsupportedOperationException("unknown travel tool key: ".concat(str4));
                    }
                    cVar = g0j.c.BIZUM;
                    break;
                    break;
                case -1462519577:
                    if (!str4.equals("transportHubs")) {
                        throw new UnsupportedOperationException("unknown travel tool key: ".concat(str4));
                    }
                    cVar = g0j.c.TRANSPORT_HUBS;
                    break;
                    break;
                case -1414960566:
                    if (!str4.equals("alipay")) {
                        throw new UnsupportedOperationException("unknown travel tool key: ".concat(str4));
                    }
                    cVar = g0j.c.ALIPAY;
                    break;
                    break;
                case -559870260:
                    if (!str4.equals("pixArea")) {
                        throw new UnsupportedOperationException("unknown travel tool key: ".concat(str4));
                    }
                    cVar = g0j.c.PIX;
                    break;
                    break;
                case 96922:
                    if (!str4.equals("atm")) {
                        throw new UnsupportedOperationException("unknown travel tool key: ".concat(str4));
                    }
                    cVar = g0j.c.ATM;
                    break;
                    break;
                case 3122770:
                    if (!str4.equals("esim")) {
                        throw new UnsupportedOperationException("unknown travel tool key: ".concat(str4));
                    }
                    cVar = g0j.c.ESIM;
                    break;
                    break;
                case 403805761:
                    if (!str4.equals("splitBill")) {
                        throw new UnsupportedOperationException("unknown travel tool key: ".concat(str4));
                    }
                    cVar = g0j.c.SPLIT_BILL;
                    break;
                    break;
                case 1429636515:
                    if (!str4.equals("exchangeRate")) {
                        throw new UnsupportedOperationException("unknown travel tool key: ".concat(str4));
                    }
                    cVar = g0j.c.EXCHANGE_RATE;
                    break;
                    break;
                default:
                    throw new UnsupportedOperationException("unknown travel tool key: ".concat(str4));
            }
            arrayList.add(cVar);
        }
        List list2 = iVar.e;
        ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
        Iterator it9 = list2.iterator();
        while (it9.hasNext()) {
            String str5 = ((nuj.c) it9.next()).f219323a;
            switch (str5.hashCode()) {
                case 73049818:
                    if (!str5.equals("insurance")) {
                        throw new UnsupportedOperationException("unknown lifestyle product: ".concat(str5));
                    }
                    bVar = g0j.b.INSURANCE;
                    break;
                    break;
                case 109757754:
                    if (!str5.equals("stays")) {
                        throw new UnsupportedOperationException("unknown lifestyle product: ".concat(str5));
                    }
                    bVar = g0j.b.STAYS;
                    break;
                    break;
                case 355416697:
                    if (!str5.equals("lounges")) {
                        throw new UnsupportedOperationException("unknown lifestyle product: ".concat(str5));
                    }
                    bVar = g0j.b.LOUNGES;
                    break;
                    break;
                case 1642386505:
                    if (!str5.equals("experiences")) {
                        throw new UnsupportedOperationException("unknown lifestyle product: ".concat(str5));
                    }
                    bVar = g0j.b.EXPERIENCES;
                    break;
                    break;
                default:
                    throw new UnsupportedOperationException("unknown lifestyle product: ".concat(str5));
            }
            arrayList2.add(bVar);
        }
        return new g0j.a(str, bVarA, str3, arrayList, arrayList2);
    }

    public static final it3.i P(tr3.c cVar) {
        it3.h hVar;
        Map mapG;
        r2 r2Var;
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        String status = cVar.getStatus();
        it3.h[] hVarArrValues = it3.h.values();
        int length = hVarArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                hVar = null;
                break;
            }
            hVar = hVarArrValues[i];
            if (kotlin.text.a0.z(hVar.name(), status, true)) {
                break;
            }
            i++;
        }
        if (hVar == null) {
            zhm.h0 h0Var = zhm.h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "CreditProductEligibilityEntityMapper", j6.a.q("Can't map ", cVar.getStatus()), null, h0Var);
            hVar = it3.h.NOT_ELIGIBLE;
        }
        Boolean secondaryEntryPointsVisibleByDefault = cVar.getSecondaryEntryPointsVisibleByDefault();
        boolean zBooleanValue = secondaryEntryPointsVisibleByDefault != null ? secondaryEntryPointsVisibleByDefault.booleanValue() : true;
        Map secondaryEntryPointsVisibleOverrides = cVar.getSecondaryEntryPointsVisibleOverrides();
        if (secondaryEntryPointsVisibleOverrides != null) {
            mapG = new LinkedHashMap();
            for (Map.Entry entry : secondaryEntryPointsVisibleOverrides.entrySet()) {
                String str = (String) entry.getKey();
                r2[] r2VarArrValues = r2.values();
                int length2 = r2VarArrValues.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length2) {
                        r2Var = null;
                        break;
                    }
                    r2Var = r2VarArrValues[i2];
                    if (kotlin.text.a0.z(r2Var.name(), str, true)) {
                        break;
                    }
                    i2++;
                }
                if (r2Var != null) {
                    mapG.put(r2Var, entry.getValue());
                }
            }
        } else {
            mapG = zhm.r0.g();
        }
        return new it3.i(hVar, zBooleanValue, mapG);
    }

    public static final ArrayList Q(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List list2 = list;
        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            arrayList.add(K((q90.g) it8.next()));
        }
        return arrayList;
    }

    public static final jel.a R(fdl.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        if (aVar instanceof fdl.s) {
            fdl.s sVar = (fdl.s) aVar;
            return new jel.p(sVar.getCountry(), sVar.getAllocation());
        }
        if (aVar instanceof fdl.s0) {
            fdl.s0 s0Var = (fdl.s0) aVar;
            return new jel.g1(s0Var.getRef(), s0Var.getSymbol(), s0Var.getHolding(), s0Var.getAllocation());
        }
        if (!(aVar instanceof z2)) {
            throw new NoWhenBranchMatchedException();
        }
        z2 z2Var = (z2) aVar;
        return new b3(z2Var.getSector(), z2Var.getAllocation());
    }

    public static final jel.a S(hcl.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        if (aVar instanceof hcl.l) {
            hcl.l lVar = (hcl.l) aVar;
            return new jel.p(lVar.getCountry(), lVar.getAllocation());
        }
        if (aVar instanceof hcl.h0) {
            hcl.h0 h0Var = (hcl.h0) aVar;
            return new jel.g1(h0Var.getRef(), h0Var.getSymbol(), h0Var.getHolding(), h0Var.getAllocation());
        }
        if (!(aVar instanceof hcl.b3)) {
            throw new NoWhenBranchMatchedException();
        }
        hcl.b3 b3Var = (hcl.b3) aVar;
        return new b3(b3Var.getSector(), b3Var.getAllocation());
    }

    public static final st9.f T(cr9.w wVar) {
        Intrinsics.checkNotNullParameter(wVar, "<this>");
        String strA = wVar.getCode();
        String strD = wVar.getJoinUri();
        String strC = wVar.getGroupId();
        Instant instantOfEpochMilli = Instant.ofEpochMilli(wVar.getExpiryDate());
        Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli, "ofEpochMilli(...)");
        return new st9.f(strA, strD, strC, instantOfEpochMilli);
    }

    public static final sdl.c U(Beneficiary beneficiary) {
        sdl.e eVar;
        Intrinsics.checkNotNullParameter(beneficiary, "<this>");
        UUID uuid = beneficiary.f105175a;
        String str = beneficiary.f105176b;
        cfl.a aVar = beneficiary.f105177c;
        if (aVar != null) {
            int i = sdl.l.f261979a[aVar.ordinal()];
            if (i == 1) {
                eVar = sdl.e.DEPENDANT;
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                eVar = sdl.e.SELF;
            }
        } else {
            eVar = null;
        }
        return new sdl.c(uuid, str, eVar);
    }

    public static final hcl.a V(jel.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        if (aVar instanceof jel.p) {
            jel.p pVar = (jel.p) aVar;
            return new hcl.l(pVar.f173530a, pVar.f173531b);
        }
        if (aVar instanceof jel.g1) {
            jel.g1 g1Var = (jel.g1) aVar;
            return new hcl.h0(g1Var.f173448a, g1Var.f173449b, g1Var.f173450c, g1Var.d);
        }
        if (!(aVar instanceof b3)) {
            throw new NoWhenBranchMatchedException();
        }
        b3 b3Var = (b3) aVar;
        return new hcl.b3(b3Var.f173420a, b3Var.f173421b);
    }

    public static final qfg.k W(TravelMilesRedeemOption travelMilesRedeemOption) {
        Intrinsics.checkNotNullParameter(travelMilesRedeemOption, "<this>");
        String str = travelMilesRedeemOption.f94117a;
        String str2 = travelMilesRedeemOption.f94118b;
        String str3 = travelMilesRedeemOption.f94119c;
        Double d = travelMilesRedeemOption.d;
        String strValueOf = d != null ? String.valueOf(d.doubleValue()) : null;
        ArrayList<TravelMilesRedeemOptionItem> arrayList = travelMilesRedeemOption.e;
        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
        for (TravelMilesRedeemOptionItem travelMilesRedeemOptionItem : arrayList) {
            Intrinsics.checkNotNullParameter(travelMilesRedeemOptionItem, "<this>");
            arrayList2.add(new qfg.l(travelMilesRedeemOptionItem.f94120a, travelMilesRedeemOptionItem.f94121b, String.valueOf(travelMilesRedeemOptionItem.f94122c)));
        }
        return new qfg.k(str, str2, str3, strValueOf, arrayList2);
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.Map] */
    public static final tr3.c X(it3.i iVar) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        String strName = iVar.f168335a.name();
        Boolean boolValueOf = Boolean.valueOf(iVar.f168336b);
        ?? r56 = iVar.f168337c;
        LinkedHashMap linkedHashMap = new LinkedHashMap(zhm.q0.b(r56.size()));
        for (Map.Entry entry : r56.entrySet()) {
            linkedHashMap.put(((r2) entry.getKey()).name(), entry.getValue());
        }
        return new tr3.c(strName, boolValueOf, linkedHashMap);
    }

    public static final j0 Y(r0 r0Var) {
        Intrinsics.checkNotNullParameter(r0Var, "<this>");
        return new j0(r0Var.e, r0Var.f, r0Var.f322329g);
    }

    public static final DateTime Z(tzg.b bVar, DateTime now) {
        DateTime dateTimeMinusDays;
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(now, "now");
        switch (x8h.l.f303357a[bVar.ordinal()]) {
            case 1:
                dateTimeMinusDays = now.minusDays(1);
                break;
            case 2:
                dateTimeMinusDays = now.minusWeeks(1);
                break;
            case 3:
                dateTimeMinusDays = now.minusMonths(1);
                break;
            case 4:
                dateTimeMinusDays = now.minusMonths(3);
                break;
            case 5:
                dateTimeMinusDays = now.minusMonths(6);
                break;
            case 6:
                dateTimeMinusDays = now.minusYears(1);
                break;
            case 7:
                dateTimeMinusDays = now.minusYears(5);
                break;
            case 8:
                dateTimeMinusDays = new DateTime(0L);
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        DateTime dateTimeWithTimeAtStartOfDay = dateTimeMinusDays.withTimeAtStartOfDay();
        Intrinsics.checkNotNullExpressionValue(dateTimeWithTimeAtStartOfDay, "withTimeAtStartOfDay(...)");
        return dateTimeWithTimeAtStartOfDay;
    }

    public static final dda.f a(hea.o oVar) {
        String str = oVar.f;
        Data data = oVar.d;
        Object obj2 = null;
        if (str == null) {
            List list = (List) data.getContent();
            if (list != null) {
                return (dda.f) zhm.d0.d0(list);
            }
            return null;
        }
        List list2 = (List) data.getContent();
        if (list2 == null) {
            return null;
        }
        Iterator it8 = list2.iterator();
        while (true) {
            if (!it8.hasNext()) {
                break;
            }
            Object next = it8.next();
            if (str.equals(((dda.f) next).getType())) {
                obj2 = next;
                break;
            }
        }
        return (dda.f) obj2;
    }

    public static final c4i.a a0(nel.z zVar) {
        Intrinsics.checkNotNullParameter(zVar, "<this>");
        switch (csl.d.f108535a[zVar.ordinal()]) {
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
                return c4i.a.TRADING_ORDER;
            case 14:
            case 15:
                return c4i.a.TRADING_FUND_ORDER;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final BridgeDestination b(NaviCommand naviCommand) {
        Intrinsics.checkNotNullParameter(naviCommand, "<this>");
        return new BridgeDestination(naviCommand);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b0(tji.f r5, java.lang.String r6, kotlin.jvm.functions.Function1 r7, kotlin.coroutines.Continuation r8) {
        /*
            boolean r0 = r8 instanceof lii.b
            if (r0 == 0) goto L13
            r0 = r8
            lii.b r0 = (lii.b) r0
            int r1 = r0.f195528x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f195528x = r1
            goto L18
        L13:
            lii.b r0 = new lii.b
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f195527w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f195528x
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            lii.c r5 = r0.v
            tji.f r6 = r0.u
            yhm.o.b(r8)     // Catch: java.lang.Throwable -> L2f
            r4 = r8
            r8 = r5
            r5 = r6
            r6 = r4
            goto L53
        L2f:
            r7 = move-exception
            r8 = r5
            r5 = r6
            goto L58
        L33:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3b:
            yhm.o.b(r8)
            lii.c r8 = new lii.c
            r8.<init>(r6)
            r5.d(r8)     // Catch: java.lang.Throwable -> L57
            r0.u = r5     // Catch: java.lang.Throwable -> L57
            r0.v = r8     // Catch: java.lang.Throwable -> L57
            r0.f195528x = r3     // Catch: java.lang.Throwable -> L57
            java.lang.Object r6 = r7.invoke(r0)     // Catch: java.lang.Throwable -> L57
            if (r6 != r1) goto L53
            return r1
        L53:
            r5.b(r8)
            return r6
        L57:
            r7 = move-exception
        L58:
            r5.b(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: zh9.u0.b0(tji.f, java.lang.String, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final BridgeDestination c(FeatureConfig featureConfig) {
        Intrinsics.checkNotNullParameter(featureConfig, "<this>");
        return new BridgeDestination(new FeatureCommand(featureConfig));
    }

    public static final Object c0(yji.l lVar, String str, Function1 function1, Continuation continuation) {
        return b0(lVar.X(), str, function1, continuation);
    }

    public static final KompotBridgeFeatureConfig d(StackDestination stackDestination) {
        Intrinsics.checkNotNullParameter(stackDestination, "<this>");
        return new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) stackDestination, false, (Integer) null, 0, 61);
    }

    public static final FeatureCommand e(ParcelableDestination parcelableDestination) {
        Intrinsics.checkNotNullParameter(parcelableDestination, "<this>");
        return new FeatureCommand(new KompotBridgeFeatureConfig((ActivityAnimation) null, parcelableDestination, false, (Integer) null, 0, 61));
    }

    public static final FeatureCommand f(StackDestination stackDestination) {
        Intrinsics.checkNotNullParameter(stackDestination, "<this>");
        return new FeatureCommand(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) stackDestination, false, (Integer) null, 0, 61));
    }

    public static final void g(Fragment fragment, List buttonResIds, x2m.f settings) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(settings, "settings");
        Intrinsics.checkNotNullParameter(buttonResIds, "buttonResIds");
        new t2m.b(fragment, buttonResIds, settings);
    }

    public static void h(AppCompatActivity appCompatActivity, x2m.f settings) {
        zhm.f0 menuItemResIds = zhm.f0.f322471a;
        Intrinsics.checkNotNullParameter(appCompatActivity, "<this>");
        Intrinsics.checkNotNullParameter(settings, "settings");
        Intrinsics.checkNotNullParameter(menuItemResIds, "menuItemResIds");
        new t2m.a(appCompatActivity, menuItemResIds, settings, 0);
    }

    public static final akg.n i(Flow a7, Flow b4, Flow c2) {
        Intrinsics.checkNotNullParameter(a7, "a");
        Intrinsics.checkNotNullParameter(b4, "b");
        Intrinsics.checkNotNullParameter(c2, "c");
        return nim.a.v(m(m(a7, b4), c2), new je5.n(29));
    }

    public static final akg.n j(Flow a7, Flow b4, Flow c2, Flow d) {
        Intrinsics.checkNotNullParameter(a7, "a");
        Intrinsics.checkNotNullParameter(b4, "b");
        Intrinsics.checkNotNullParameter(c2, "c");
        Intrinsics.checkNotNullParameter(d, "d");
        return nim.a.v(m(m(a7, b4), m(c2, d)), new jhi.a(0));
    }

    public static final j23.b k(Iterable flows) {
        Intrinsics.checkNotNullParameter(flows, "flows");
        return new j23.b((Flow[]) zhm.d0.d1(flows).toArray(new Flow[0]), 1);
    }

    public static final j23.b l(Flow... flows) {
        Intrinsics.checkNotNullParameter(flows, "flows");
        return k(kotlin.collections.d.v0(flows));
    }

    public static final t38.e m(Flow a7, Flow b4) {
        Intrinsics.checkNotNullParameter(a7, "a");
        Intrinsics.checkNotNullParameter(b4, "b");
        return new t38.e(a7, 24, b4, new a83.o0(3, 10, null));
    }

    public static final ArrayList n(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (z((r0) obj2)) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    public static final Drawable o(Drawable drawable, Class type) {
        Intrinsics.checkNotNullParameter(drawable, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        if (type.isInstance(drawable)) {
            return (Drawable) type.cast(drawable);
        }
        LayerDrawable layerDrawable = drawable instanceof LayerDrawable ? (LayerDrawable) drawable : null;
        if (layerDrawable != null) {
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            for (int i = 0; i < numberOfLayers; i++) {
                Drawable drawable2 = layerDrawable.getDrawable(i);
                Intrinsics.checkNotNullExpressionValue(drawable2, "getDrawable(...)");
                Drawable drawableO = o(drawable2, type);
                if (drawableO != null) {
                    return drawableO;
                }
            }
        }
        return null;
    }

    public static final Clause p(zme.g gVar) {
        return (gVar == null || kotlin.text.d0.W(gVar.e)) ? new TextLocalisedClause(R$string.tax_residency_fallback_tin, null, null, 14) : new TextClause(gVar.e, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
    }

    public static final Context q(nx0.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Context context = aVar.F().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return context;
    }

    public static final dj0.d r(r0 r0Var) {
        Intrinsics.checkNotNullParameter(r0Var, "<this>");
        ArrayList arrayList = r0Var.B;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            p pVar = (p) obj2;
            if (czi.c.D(pVar) || czi.c.C(pVar)) {
                arrayList2.add(obj2);
            }
        }
        dj0.d.Companion.getClass();
        dj0.d dVarV = dj0.d.e;
        int i = 0;
        for (Object obj3 : arrayList2) {
            int i2 = i + 1;
            if (i < 0) {
                zhm.v.s();
                throw null;
            }
            dVarV = i == 0 ? czi.c.v((p) obj3) : pyd.c.O(dVarV, czi.c.v((p) obj3));
            i = i2;
        }
        return dVarV;
    }

    public static final dj0.d s(r0 r0Var) {
        dj0.d dVarV;
        Intrinsics.checkNotNullParameter(r0Var, "<this>");
        ArrayList arrayList = r0Var.B;
        dj0.d.Companion.getClass();
        dj0.d dVarO = dj0.d.e;
        int i = 0;
        for (Object obj2 : arrayList) {
            int i2 = i + 1;
            if (i < 0) {
                zhm.v.s();
                throw null;
            }
            if (i == 0) {
                p pVar = (p) obj2;
                int i3 = t0.f322348a[pVar.e.ordinal()];
                if (i3 == 1 || i3 == 2 || i3 == 3) {
                    dVarO = czi.c.v(pVar);
                } else {
                    if (i3 != 4 && i3 != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    dVarO = dj0.d.c(pVar.f322318c, 0L, null, 2);
                }
            } else {
                p pVar2 = (p) obj2;
                int i5 = t0.f322348a[pVar2.e.ordinal()];
                if (i5 == 1 || i5 == 2 || i5 == 3) {
                    dVarV = czi.c.v(pVar2);
                } else {
                    if (i5 != 4 && i5 != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    dVarV = dj0.d.c(pVar2.f322318c, 0L, null, 2);
                }
                dVarO = pyd.c.O(dVarO, dVarV);
            }
            i = i2;
        }
        return dVarO;
    }

    public static final dj0.d t(dj0.d dVar, dj0.d other) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        if (Intrinsics.f(dVar, other)) {
            return null;
        }
        return dVar;
    }

    public static final dj0.d u(r0 r0Var) {
        Intrinsics.checkNotNullParameter(r0Var, "<this>");
        ArrayList arrayList = r0Var.B;
        dj0.d.Companion.getClass();
        dj0.d dVarQ = dj0.d.e;
        int i = 0;
        for (Object obj2 : arrayList) {
            int i2 = i + 1;
            if (i < 0) {
                zhm.v.s();
                throw null;
            }
            dVarQ = i == 0 ? czi.c.q((p) obj2) : pyd.c.O(dVarQ, czi.c.q((p) obj2));
            i = i2;
        }
        return dVarQ;
    }

    public static final ArrayList v(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (((mv3.f) obj2).f209122c) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            arrayList2.add(((mv3.f) it8.next()).f209120a);
        }
        return arrayList2;
    }

    public static final dj0.d w(r0 r0Var) {
        Intrinsics.checkNotNullParameter(r0Var, "<this>");
        return pyd.c.O(pyd.c.O(r0Var.f322331j, r0Var.f322334n), r0Var.A.a());
    }

    public static final dj0.d x(r0 r0Var) {
        Intrinsics.checkNotNullParameter(r0Var, "<this>");
        ArrayList arrayList = r0Var.B;
        dj0.d.Companion.getClass();
        dj0.d dVarV = dj0.d.e;
        int i = 0;
        for (Object obj2 : arrayList) {
            int i2 = i + 1;
            if (i < 0) {
                zhm.v.s();
                throw null;
            }
            dVarV = i == 0 ? czi.c.v((p) obj2) : pyd.c.O(dVarV, czi.c.v((p) obj2));
            i = i2;
        }
        return dVarV;
    }

    public static final boolean y(Activity activity) {
        int i = activity.getResources().getConfiguration().uiMode & 48;
        return (i == 0 || i == 16 || i != 32) ? false : true;
    }

    public static final boolean z(r0 r0Var) {
        Intrinsics.checkNotNullParameter(r0Var, "<this>");
        Intrinsics.checkNotNullParameter(r0Var, "<this>");
        return r0Var.f322335p == q0.ACTIVE || C(r0Var) || A(r0Var);
    }
}
