package ta6;

import a9g.i;
import a9g.m;
import a9g.n0;
import android.graphics.drawable.GradientDrawable;
import androidx.collection.ArrayMap;
import ba6.c;
import bta.j;
import bta.p;
import bta.s;
import bta.v;
import bta.y;
import bta.z;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.backend_flow.domain.models.BackendFlow;
import com.revolut.feature.backend_flow.domain.models.BackendScreen;
import com.revolut.feature.defi.accounts.api.model.DeFiBalance;
import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import com.revolut.feature.raffle.impl.data.models.RaffleCampaign$ShareInfo;
import com.revolut.feature.retail.corporate_events.common.R$string;
import com.revolut.feature_travel_hotels_models.cashback.CashbackDetails;
import com.revolut.feature_travel_hotels_models.location.Coordinates;
import com.revolut.feature_travel_hotels_models.location.Country;
import com.revolut.feature_travel_hotels_models.location.HotelsLocation;
import com.revolut.feature_travel_hotels_models.property.Distance;
import com.revolut.feature_travel_hotels_models.property.search.EmptyLocation;
import com.revolut.feature_travel_hotels_models.property.search.LocationData;
import com.revolut.feature_travel_hotels_models.property.search.LocationMapBoundaries;
import com.revolut.feature_travel_hotels_models.property.search.LocationType;
import com.revolut.feature_travel_hotels_models.property.search.PropertyType;
import com.revolut.feature_travel_hotels_models.property.search.SimplifiedLocationType;
import hx7.e;
import io3.d;
import io3.k;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import jel.a3;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.text.a0;
import kotlin.text.d0;
import kotlinx.coroutines.flow.Flow;
import le.u1;
import oji.g;
import oji.h;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import vel.l;
import vkm.q;
import vkm.v1;
import vkm.z1;
import yhm.m;
import yhm.n;
import yhm.o;
import z87.f;
import zhm.q0;
import zhm.r0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {
    public static final boolean A(psg.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return aVar.d == psg.b.GUARDIAN;
    }

    public static final boolean B(BackendFlow backendFlow) {
        Intrinsics.checkNotNullParameter(backendFlow, "<this>");
        return Boolean.parseBoolean((String) backendFlow.i.get("screenCaptureProtection"));
    }

    public static final boolean C(f fVar, String searchQuery, Set keywords) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        Intrinsics.checkNotNullParameter(keywords, "keywords");
        if (keywords.isEmpty() || searchQuery.length() <= 2) {
            return false;
        }
        String string = d0.F0(searchQuery).toString();
        Set set = keywords;
        if ((set instanceof Collection) && set.isEmpty()) {
            return false;
        }
        Iterator it8 = set.iterator();
        while (it8.hasNext()) {
            if (a0.H((String) it8.next(), string, true)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean D(g3i.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return aVar == g3i.a.STOP_LOSS;
    }

    public static final boolean E(DeFiBalance deFiBalance) {
        Intrinsics.checkNotNullParameter(deFiBalance, "<this>");
        return Intrinsics.f(deFiBalance.f71638g, "SYNTHETIC_DEFI_BALANCE");
    }

    public static final boolean F(g3i.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return aVar == g3i.a.TAKE_PROFIT;
    }

    public static final boolean G(d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        k kVar = dVar.f;
        return (kVar == k.INACTIVE || kVar == k.DELISTED) ? false : true;
    }

    public static final v1 H(long j2, long j3, TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        return new v1(new g(j2, timeUnit, j3, null));
    }

    public static final v1 I(long j2, TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        return new v1(new h(timeUnit, j2, null, 0));
    }

    public static final v1 J(long j2, TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        return new v1(new h(timeUnit, j2, null, 1));
    }

    public static final int K(int i, int i2) {
        if (i2 != 0) {
            return rim.d.c((i / i2) * 100);
        }
        return 0;
    }

    public static byte[] L(com.google.firebase.messaging.d dVar) throws IOException {
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int iMin = Math.min(8192, Math.max(128, Integer.highestOneBit(0) * 2));
        int i = 0;
        while (i < 2147483639) {
            int iMin2 = Math.min(iMin, 2147483639 - i);
            byte[] bArr = new byte[iMin2];
            arrayDeque.add(bArr);
            int i2 = 0;
            while (i2 < iMin2) {
                int i3 = dVar.read(bArr, i2, iMin2 - i2);
                if (i3 == -1) {
                    return i(arrayDeque, i);
                }
                i2 += i3;
                i += i3;
            }
            long j2 = ((long) iMin) * ((long) (iMin < 4096 ? 4 : 2));
            iMin = j2 > 2147483647L ? Integer.MAX_VALUE : j2 < -2147483648L ? Integer.MIN_VALUE : (int) j2;
        }
        if (dVar.read() == -1) {
            return i(arrayDeque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final ba6.l M(va6.g r21) {
        /*
            Method dump skipped, instruction units count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ta6.a.M(va6.g):ba6.l");
    }

    public static final com.revolut.feature.raffle.impl.data.models.b N(z zVar) {
        RaffleCampaign$ShareInfo raffleCampaign$ShareInfo;
        bta.k kVar;
        j jVar;
        Intrinsics.checkNotNullParameter(zVar, "<this>");
        String str = zVar.f18510a;
        String str2 = zVar.f18511b;
        String str3 = zVar.f18512c;
        bta.k[] kVarArrValues = bta.k.values();
        int length = kVarArrValues.length;
        int i = 0;
        while (true) {
            raffleCampaign$ShareInfo = null;
            if (i >= length) {
                kVar = null;
                break;
            }
            kVar = kVarArrValues[i];
            if (a0.z(kVar.name(), str3, true)) {
                break;
            }
            i++;
        }
        if (kVar == null) {
            kVar = bta.k.UNKNOWN;
        }
        bta.k kVar2 = kVar;
        p pVar = zVar.d;
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        bta.d dVar = new bta.d(pVar.f18496a, pVar.f18497b, pVar.f18498c, pVar.d);
        List<s> list = zVar.e;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (s sVar : list) {
            Intrinsics.checkNotNullParameter(sVar, "<this>");
            arrayList.add(new bta.g(sVar.f18500a, sVar.f18501b));
        }
        String str4 = zVar.f;
        v vVar = zVar.f18513g;
        if (vVar != null) {
            Intrinsics.checkNotNullParameter(vVar, "<this>");
            String str5 = vVar.f18503a;
            Boolean bool = vVar.f18504b;
            jVar = new j(str5, vVar.f18505c, vVar.d, bool != null ? bool.booleanValue() : true);
        } else {
            jVar = null;
        }
        y yVar = zVar.f18514h;
        if (yVar != null) {
            Intrinsics.checkNotNullParameter(yVar, "<this>");
            raffleCampaign$ShareInfo = new RaffleCampaign$ShareInfo(yVar.f18507a, yVar.f18508b, yVar.f18509c, yVar.d);
        }
        return new com.revolut.feature.raffle.impl.data.models.b(str, str2, kVar2, dVar, arrayList, str4, jVar, raffleCampaign$ShareInfo);
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, java.util.Map] */
    public static final Coordinates O(i iVar) {
        Distance distance;
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        double dB = iVar.getLatitude();
        double dC = iVar.getLongitude();
        m mVarA = iVar.getAccuracyRadius();
        if (mVarA != null) {
            Intrinsics.checkNotNullParameter(mVarA, "<this>");
            distance = new Distance(mVarA.getValue(), (ufi.a) u1.u(mVarA.getUnit(), lfi.a.f194930b));
        } else {
            distance = null;
        }
        return new Coordinates(dB, dC, distance);
    }

    public static final HotelsLocation P(n0 n0Var) {
        ffi.a aVar;
        Intrinsics.checkNotNullParameter(n0Var, "<this>");
        String str = n0Var.f2539a;
        String str2 = n0Var.f2540b;
        ffi.a[] aVarArrValues = ffi.a.values();
        int length = aVarArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                aVar = null;
                break;
            }
            aVar = aVarArrValues[i];
            if (a0.z(aVar.name(), str2, true)) {
                break;
            }
            i++;
        }
        if (aVar == null) {
            aVar = ffi.a.UNKNOWN;
        }
        ffi.a aVar2 = aVar;
        String str3 = n0Var.f2541c;
        String str4 = n0Var.d;
        String str5 = n0Var.e;
        a9g.k kVar = n0Var.f;
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        return new HotelsLocation(str, aVar2, str3, str4, str5, new Country(kVar.getCode(), kVar.getName()), n0Var.f2542g, O(n0Var.f2543h), n0Var.i);
    }

    public static final ArrayList Q(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<ldl.a> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (ldl.a aVar : list2) {
            Intrinsics.checkNotNullParameter(aVar, "<this>");
            String strA = aVar.getPortfolioId();
            vel.i iVarC = aVar.getType();
            ldl.b bVarB = aVar.getTransactionsSummary();
            arrayList.add(new l(strA, iVarC, new vel.k(mo3.a.o(bVarB.getContributions()), mo3.a.o(bVarB.getWithdrawals()))));
        }
        return arrayList;
    }

    public static final kl4.b R(mn4.b bVar) throws Throwable {
        Object objA;
        kl4.a aVar;
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        boolean zE = bVar.getIsEligible();
        dj0.d dVarO = mo3.a.o(bVar.getMinCreditLimit());
        dj0.d dVarO2 = mo3.a.o(bVar.getMaxCreditLimit());
        dj0.d dVarO3 = mo3.a.o(bVar.getNonSelectableMinCreditLimit());
        String strA = bVar.getIneligibilityReason();
        kl4.a aVar2 = null;
        if (strA != null) {
            try {
                m.Companion companion = yhm.m.INSTANCE;
                kl4.a[] aVarArrValues = kl4.a.values();
                int length = aVarArrValues.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        aVar = null;
                        break;
                    }
                    kl4.a aVar3 = aVarArrValues[i];
                    if (a0.z(aVar3.name(), strA, true)) {
                        aVar = aVar3;
                        break;
                    }
                    i++;
                }
            } catch (CancellationException e) {
                throw e;
            } catch (Throwable th10) {
                m.Companion companion2 = yhm.m.INSTANCE;
                objA = o.a(th10);
            }
            if (aVar == null) {
                throw new IllegalStateException("Unsupported enum value: " + strA + " for " + o0.f186429a.b(kl4.a.class).m());
            }
            objA = aVar;
            Throwable thA = yhm.m.a(objA);
            if (thA != null) {
                e.n(thA);
            }
            aVar2 = (kl4.a) ((Enum) (objA instanceof n ? null : objA));
        }
        return new kl4.b(zE, dVarO, dVarO2, dVarO3, aVar2);
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, java.util.Map] */
    public static final i S(Coordinates coordinates) {
        a9g.m mVar;
        Intrinsics.checkNotNullParameter(coordinates, "<this>");
        double d = coordinates.f97948a;
        double d5 = coordinates.f97949b;
        Distance distance = coordinates.f97950c;
        if (distance != null) {
            Intrinsics.checkNotNullParameter(distance, "<this>");
            mVar = new a9g.m(distance.f97971a, u1.g(distance.f97972b, lfi.a.f194930b));
        } else {
            mVar = null;
        }
        return new i(d, d5, mVar);
    }

    public static final n0 T(HotelsLocation hotelsLocation, boolean z) {
        Intrinsics.checkNotNullParameter(hotelsLocation, "<this>");
        String str = hotelsLocation.f97953a;
        String strName = hotelsLocation.f97954b.name();
        String str2 = hotelsLocation.f97955c;
        String str3 = hotelsLocation.d;
        String str4 = hotelsLocation.e;
        Country country = hotelsLocation.f;
        Intrinsics.checkNotNullParameter(country, "<this>");
        return new n0(str, strName, str2, str3, str4, new a9g.k(country.f97951a, country.f97952b), hotelsLocation.f97956g, S(hotelsLocation.f97957h), hotelsLocation.i, z);
    }

    public static final la6.h U(ba6.l lVar) {
        la6.a aVar;
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        String str = lVar.f13938a;
        String str2 = lVar.f13939b;
        String str3 = lVar.d;
        String str4 = lVar.e;
        String str5 = lVar.f;
        String str6 = lVar.f13941g;
        jo3.b bVarA = hx7.a.A(lVar.f13942h);
        jo3.b bVarA2 = hx7.a.A(lVar.i);
        String str7 = lVar.f13940c;
        ba6.d dVar = lVar.f13943j;
        if (dVar != null) {
            Intrinsics.checkNotNullParameter(dVar, "<this>");
            String str8 = dVar.f13924a;
            String strG = u1.g(dVar.f13925b, q0.c(new Pair("CHARITY_CARD", c.CHARITY_CARD)));
            String str9 = dVar.f13926c.f13615a;
            String strG2 = u1.g(dVar.d, p());
            ArrayList arrayList = dVar.e;
            ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
            Iterator it8 = arrayList.iterator();
            while (it8.hasNext()) {
                arrayList2.add(hx7.a.A((dj0.d) it8.next()));
            }
            aVar = new la6.a(str8, strG, str9, strG2, arrayList2);
        } else {
            aVar = null;
        }
        return new la6.h(str, str2, str7, str3, str4, str5, str6, bVarA, bVarA2, aVar, lVar.k, lVar.f13944l, u1.g(lVar.f13945m, n()), lVar.f13946n, lVar.f13947p, lVar.o, u1.g(lVar.f13948q, o()), lVar.f13949r);
    }

    public static final bq0.a V(GradientDrawable.Orientation orientation, float f, float f4) {
        Intrinsics.checkNotNullParameter(orientation, "<this>");
        switch (bq0.b.f17663a[orientation.ordinal()]) {
            case 1:
                return new bq0.a(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f, BitmapDescriptorFactory.HUE_RED);
            case 2:
                return new bq0.a(f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
            case 3:
                return new bq0.a(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f4);
            case 4:
                return new bq0.a(BitmapDescriptorFactory.HUE_RED, f4, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
            case 5:
                return new bq0.a(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f, f4);
            case 6:
                return new bq0.a(f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f4);
            case 7:
                return new bq0.a(BitmapDescriptorFactory.HUE_RED, f4, f, BitmapDescriptorFactory.HUE_RED);
            case 8:
                return new bq0.a(f, f4, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static ArrayList W(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            Object objY = jSONArray.get(i);
            if (objY instanceof JSONArray) {
                objY = W((JSONArray) objY);
            } else if (objY instanceof JSONObject) {
                objY = Y((JSONObject) objY);
            }
            arrayList.add(objY);
        }
        return arrayList;
    }

    public static final LocationType X(HotelsLocation hotelsLocation) {
        Intrinsics.checkNotNullParameter(hotelsLocation, "<this>");
        return new LocationType(hotelsLocation.f97953a, hotelsLocation.f97954b, hotelsLocation.f97955c, hotelsLocation.d, hotelsLocation.f97957h, hotelsLocation.f.f97951a);
    }

    public static ArrayMap Y(JSONObject jSONObject) throws JSONException {
        ArrayMap arrayMap = new ArrayMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objY = jSONObject.get(next);
            if (objY instanceof JSONArray) {
                objY = W((JSONArray) objY);
            } else if (objY instanceof JSONObject) {
                objY = Y((JSONObject) objY);
            } else if (objY.equals(JSONObject.NULL)) {
                objY = null;
            }
            arrayMap.put(next, objY);
        }
        return arrayMap;
    }

    public static final dj0.d Z(va6.h hVar) {
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        long amount = hVar.getAmount();
        xi0.a aVar = xi0.b.Companion;
        String currency = hVar.getCurrency();
        aVar.getClass();
        return new dj0.d(amount, xi0.a.a(currency));
    }

    public static final z1 a(int i) {
        return q.a(i, 16, ukm.f.DROP_OLDEST);
    }

    public static final TextLocalisedClause a0(int i) {
        return new TextLocalisedClause(i, u.c(new TextLocalisedClause(R$string.feature_corporate_events_bubble_structured_note_see_details, null, new Click(30, (Integer) null, (Object) null, "CORPORATE_EVENT_NOTE_PAYOUT_SCENARIOS_LINK_ID", false), 10)), null, 12);
    }

    public static final zm3.j b0(JuniorBankingProfile juniorBankingProfile) {
        Intrinsics.checkNotNullParameter(juniorBankingProfile, "<this>");
        String str = juniorBankingProfile.f77099b;
        String str2 = juniorBankingProfile.f77100c;
        String str3 = juniorBankingProfile.f77101g;
        String strT = t(juniorBankingProfile);
        zm3.k kVar = zm3.k.JUNIOR;
        do3.b bVar = do3.b.FULL;
        String country = juniorBankingProfile.k.getCountry();
        String str4 = juniorBankingProfile.f77102h;
        if (str4 == null) {
            return null;
        }
        return new zm3.j(strT, str, str2, null, kVar, str3, str4, country, bVar, null, null);
    }

    public static final String c(wvg.a aVar) {
        String strQ = kotlin.jvm.internal.s.Q(aVar.f300321b);
        boolean z = aVar.f300322c;
        String str = aVar.e;
        String str2 = aVar.d.f306286a;
        StringBuilder sb6 = new StringBuilder("complex_analytics_allocations_");
        sb6.append(strQ);
        sb6.append("_");
        sb6.append(z);
        sb6.append("_");
        return a0.d.u(sb6, str, "_", str2);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final a3 c0(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        String upperCase = str.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        switch (upperCase.hashCode()) {
            case -1970868200:
                if (upperCase.equals("CASH_AND_DERIVATIVES")) {
                    return a3.CASH_AND_DERIVATIVES;
                }
                break;
            case -1381851446:
                if (upperCase.equals("CONSUMER_DEFENSIVE")) {
                    return a3.CONSUMER_DEFENSIVE;
                }
                break;
            case -1194233588:
                if (upperCase.equals("TECHNOLOGY")) {
                    return a3.TECHNOLOGY;
                }
                break;
            case -1150817175:
                if (upperCase.equals("FINANCIAL")) {
                    return a3.FINANCIAL;
                }
                break;
            case -827240436:
                if (upperCase.equals("MATERIALS")) {
                    return a3.MATERIALS;
                }
                break;
            case -626550410:
                if (upperCase.equals("CORPORATE_BONDS")) {
                    return a3.CORPORATE_BONDS;
                }
                break;
            case -592353975:
                if (upperCase.equals("SECURITIZED")) {
                    return a3.SECURITIZED;
                }
                break;
            case -333527318:
                if (upperCase.equals("UTILITIES")) {
                    return a3.UTILITIES;
                }
                break;
            case -244878382:
                if (upperCase.equals("CRYPTOCURRENCY")) {
                    return a3.CRYPTOCURRENCY;
                }
                break;
            case -48864149:
                if (upperCase.equals("COMMODITIES")) {
                    return a3.COMMODITIES;
                }
                break;
            case 2065458:
                if (upperCase.equals("CFDS")) {
                    return a3.CFDS;
                }
                break;
            case 2520906:
                if (upperCase.equals("ROBO")) {
                    return a3.ROBO;
                }
                break;
            case 75532016:
                if (upperCase.equals("OTHER")) {
                    return a3.OTHER;
                }
                break;
            case 75601607:
                if (upperCase.equals("COMMUNICATION_SERVICES")) {
                    return a3.COMMUNICATION_SERVICES;
                }
                break;
            case 556625165:
                if (upperCase.equals("REAL_ESTATE")) {
                    return a3.REAL_ESTATE;
                }
                break;
            case 1197082829:
                if (upperCase.equals("CONSUMER_CYCLICAL")) {
                    return a3.CONSUMER_CYCLICAL;
                }
                break;
            case 1393351533:
                if (upperCase.equals("HEALTHCARE")) {
                    return a3.HEALTHCARE;
                }
                break;
            case 1629869602:
                if (upperCase.equals("GOVERNMENT_BONDS")) {
                    return a3.GOVERNMENT_BONDS;
                }
                break;
            case 2049582728:
                if (upperCase.equals("ENERGY")) {
                    return a3.ENERGY;
                }
                break;
            case 2116735226:
                if (upperCase.equals("INDUSTRIALS")) {
                    return a3.INDUSTRIALS;
                }
                break;
        }
        return a3.UNSPECIFIED;
    }

    public static final oji.f d(Flow flow1, Flow flow2, Flow flow3, Flow flow4, Flow flow5, Flow flow6, oim.q transform) {
        Intrinsics.checkNotNullParameter(flow1, "flow1");
        Intrinsics.checkNotNullParameter(flow2, "flow2");
        Intrinsics.checkNotNullParameter(flow3, "flow3");
        Intrinsics.checkNotNullParameter(flow4, "flow4");
        Intrinsics.checkNotNullParameter(flow5, "flow5");
        Intrinsics.checkNotNullParameter(flow6, "flow6");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return new oji.f(new Flow[]{flow1, flow2, flow3, flow4, flow5, flow6}, transform, 0);
    }

    public static final oji.f e(Flow flow, Flow flow2, Flow flow3, Flow flow4, Flow flow5, oim.p pVar) {
        return new oji.f(new Flow[]{flow, flow2, flow3, flow4, flow5}, pVar, 1);
    }

    public static final t38.e f(Flow flow, Flow flow2, Function3 function3) {
        return new t38.e(flow, 24, flow2, function3);
    }

    public static final v0b.b g(Flow flow, Flow flow2, Flow flow3, Flow flow4, oim.o oVar) {
        return new v0b.b(new Flow[]{flow, flow2, flow3, flow4}, oVar, 15);
    }

    public static final v0b.b h(Flow flow, Flow flow2, Flow flow3, oim.n nVar) {
        return new v0b.b(new Flow[]{flow, flow2, flow3}, nVar, 14);
    }

    public static byte[] i(ArrayDeque arrayDeque, int i) {
        if (arrayDeque.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) arrayDeque.remove();
        if (bArr.length == i) {
            return bArr;
        }
        int length = i - bArr.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, i);
        while (length > 0) {
            byte[] bArr2 = (byte[]) arrayDeque.remove();
            int iMin = Math.min(length, bArr2.length);
            System.arraycopy(bArr2, 0, bArrCopyOf, i - length, iMin);
            length -= iMin;
        }
        return bArrCopyOf;
    }

    public static final v1 j(RuntimeException exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        return new v1(new ocb.d(exception, null, 10));
    }

    public static final CashbackDetails k(List list, vei.a pricingPlanCode) {
        Object next;
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(pricingPlanCode, "pricingPlanCode");
        Iterator it8 = list.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (((CashbackDetails) next).f97896a == pricingPlanCode) {
                break;
            }
        }
        return (CashbackDetails) next;
    }

    public static final ArrayList l(List list, List plansAvailableToUpgrade) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(plansAvailableToUpgrade, "plansAvailableToUpgrade");
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            int i = h9g.a.f150247a[((CashbackDetails) obj2).f97896a.ordinal()];
            if (i == 1) {
                List list2 = plansAvailableToUpgrade;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator it8 = list2.iterator();
                    while (it8.hasNext()) {
                        if (((hha.d) it8.next()).f152296p) {
                            arrayList.add(obj2);
                            break;
                            break;
                        }
                    }
                }
            } else if (i == 2) {
                List list3 = plansAvailableToUpgrade;
                if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                    Iterator it9 = list3.iterator();
                    while (it9.hasNext()) {
                        if (hha.s.m((hha.d) it9.next())) {
                            arrayList.add(obj2);
                            break;
                            break;
                        }
                    }
                }
            } else if (i == 3) {
                List list4 = plansAvailableToUpgrade;
                if (!(list4 instanceof Collection) || !list4.isEmpty()) {
                    Iterator it10 = list4.iterator();
                    while (it10.hasNext()) {
                        if (hha.s.n((hha.d) it10.next())) {
                            arrayList.add(obj2);
                            break;
                            break;
                        }
                    }
                }
            } else if (i == 4) {
                List list5 = plansAvailableToUpgrade;
                if (!(list5 instanceof Collection) || !list5.isEmpty()) {
                    Iterator it11 = list5.iterator();
                    while (it11.hasNext()) {
                        if (hha.s.j((hha.d) it11.next())) {
                            arrayList.add(obj2);
                            break;
                            break;
                        }
                    }
                }
            } else {
                if (i != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                List list6 = plansAvailableToUpgrade;
                if (!(list6 instanceof Collection) || !list6.isEmpty()) {
                    Iterator it12 = list6.iterator();
                    while (it12.hasNext()) {
                        if (hha.s.p((hha.d) it12.next())) {
                            arrayList.add(obj2);
                            break;
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public static final BackendScreen m(BackendFlow backendFlow, String id10) {
        Object next;
        Intrinsics.checkNotNullParameter(backendFlow, "<this>");
        Intrinsics.checkNotNullParameter(id10, "id");
        Iterator it8 = backendFlow.e.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(((BackendScreen) next).getF63704a(), id10)) {
                break;
            }
        }
        return (BackendScreen) next;
    }

    public static final Map n() {
        return r0.k(new Pair("GLOBAL", ba6.i.GLOBAL), new Pair("LOCAL", ba6.i.LOCAL));
    }

    public static final Map o() {
        return r0.k(new Pair("AVAILABLE", ba6.j.AVAILABLE), new Pair("NOT_AVAILABLE", ba6.j.NOT_AVAILABLE), new Pair("NOT_AVAILABLE_IN_USER_COUNTRY", ba6.j.NOT_AVAILABLE_IN_USER_COUNTRY));
    }

    public static final Map p() {
        return r0.k(new Pair("LOCKED", ba6.b.LOCKED), new Pair("UNLOCKED", ba6.b.UNLOCKED), new Pair("CARD_ORDERED", ba6.b.CARD_ORDERED));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final m5l.b q(t61.h hVar, String str) {
        String strR;
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        if (str != null) {
            Locale locale = Locale.UK;
            strR = p.a.r(locale, "UK", str, locale, "toLowerCase(...)");
        } else {
            strR = null;
        }
        if (strR == null) {
            return null;
        }
        switch (strR.hashCode()) {
            case -2038717326:
                if (strR.equals("mastercard")) {
                    return m5l.b.MASTERCARD;
                }
                return null;
            case -1824927385:
                if (!strR.equals("diners club international")) {
                    return null;
                }
                return m5l.b.DINERS;
            case -1331704771:
                if (!strR.equals("diners")) {
                    return null;
                }
                return m5l.b.DINERS;
            case -1120637072:
                if (!strR.equals("american express")) {
                    return null;
                }
                return m5l.b.AMEX;
            case -991669788:
                if (strR.equals("airplus")) {
                    return m5l.b.AIRPLUS;
                }
                return null;
            case -604073001:
                if (!strR.equals("union pay")) {
                    return null;
                }
                return m5l.b.UNION_PAY;
            case 105033:
                if (strR.equals("jcb")) {
                    return m5l.b.JCB;
                }
                return null;
            case 2997727:
                if (!strR.equals("amex")) {
                    return null;
                }
                return m5l.b.AMEX;
            case 3619905:
                if (strR.equals("visa")) {
                    return m5l.b.VISA;
                }
                return null;
            case 108877701:
                if (strR.equals("rupay")) {
                    return m5l.b.RU_PAY;
                }
                return null;
            case 273184745:
                if (strR.equals("discover")) {
                    return m5l.b.DISCOVER;
                }
                return null;
            case 827497775:
                if (strR.equals("maestro")) {
                    return m5l.b.MAESTRO;
                }
                return null;
            case 1634264761:
                if (!strR.equals("diners club")) {
                    return null;
                }
                return m5l.b.DINERS;
            case 1943743566:
                if (!strR.equals("china union pay")) {
                    return null;
                }
                return m5l.b.UNION_PAY;
            default:
                return null;
        }
    }

    public static final BackendScreen r(BackendFlow backendFlow) {
        Intrinsics.checkNotNullParameter(backendFlow, "<this>");
        BackendScreen backendScreenM = m(backendFlow, s(backendFlow));
        if (backendScreenM != null) {
            return backendScreenM;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public static final String s(BackendFlow backendFlow) {
        Intrinsics.checkNotNullParameter(backendFlow, "<this>");
        String str = backendFlow.f63266g;
        if (str != null) {
            return str;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public static final String t(JuniorBankingProfile juniorBankingProfile) {
        Intrinsics.checkNotNullParameter(juniorBankingProfile, "<this>");
        return com.google.android.gms.internal.mlkit_vision_face.a.o(juniorBankingProfile.f77099b, " ", juniorBankingProfile.f77100c);
    }

    public static final double u(CashbackDetails cashbackDetails) {
        Intrinsics.checkNotNullParameter(cashbackDetails, "<this>");
        Intrinsics.checkNotNullParameter(cashbackDetails, "<this>");
        return new BigDecimal(a0.D(d0.F0(cashbackDetails.f97897b).toString(), "%", "", false)).doubleValue();
    }

    public static final ffi.a v(LocationData locationData) {
        Intrinsics.checkNotNullParameter(locationData, "<this>");
        if (locationData instanceof LocationType) {
            return ((LocationType) locationData).f98135c;
        }
        if (Intrinsics.f(locationData, EmptyLocation.f98126b) || (locationData instanceof LocationMapBoundaries) || (locationData instanceof PropertyType)) {
            return null;
        }
        if (locationData instanceof SimplifiedLocationType) {
            return ((SimplifiedLocationType) locationData).f98140c;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final boolean w(List list, vei.a pricingPlanCode) {
        Double dValueOf;
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(pricingPlanCode, "pricingPlanCode");
        Iterator it8 = list.iterator();
        if (it8.hasNext()) {
            double dU = u((CashbackDetails) it8.next());
            while (it8.hasNext()) {
                dU = Math.max(dU, u((CashbackDetails) it8.next()));
            }
            dValueOf = Double.valueOf(dU);
        } else {
            dValueOf = null;
        }
        CashbackDetails cashbackDetailsK = k(list, pricingPlanCode);
        return Intrinsics.c(dValueOf, cashbackDetailsK != null ? Double.valueOf(u(cashbackDetailsK)) : null);
    }

    public static final boolean x(JuniorBankingProfile juniorBankingProfile) {
        Intrinsics.checkNotNullParameter(juniorBankingProfile, "<this>");
        return juniorBankingProfile.f77104l == ij8.h.ACTIVE;
    }

    public static final boolean y(psg.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return aVar.f239486c == fo3.e.ACTIVE;
    }

    public static final boolean z(dl7.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return aVar == dl7.a.TRIP_CANCELLATION || aVar == dl7.a.EVENT_CANCELLATION;
    }
}
