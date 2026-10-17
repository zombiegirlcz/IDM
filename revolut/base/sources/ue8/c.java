package ue8;

import android.content.Context;
import android.content.ContextWrapper;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.backend_flow.domain.models.EntitiesSelectionItem;
import com.revolut.feature.backend_flow.domain.models.FormScreen;
import com.revolut.feature.crypto.withdraw.api.models.CryptoAddressHostingPreCheckInput;
import com.revolut.feature.crypto.withdraw.impl.ui_v3.walletslist.CryptoSendWalletsListControllerContract$InputData;
import com.revolut.feature.travel.experiences.models.TravelExperiencesCashback;
import com.revolut.feature.travel.flights.api.R$string;
import com.revolut.feature_travel_hotels_models.dropoff.TravelHotelsDropoffSearchParameters;
import com.revolut.feature_travel_hotels_models.property.search.LocationData;
import com.revolut.feature_travel_hotels_models.property.search.LocationType;
import com.revolut.retail.core.ui.activity.BaseDelegatesActivity;
import com.revolut.retail.feature.pricing_plans.waitlist.api.model.PricingPlanWaitlistEntry;
import df8.j;
import dp5.o;
import fz1.g;
import gim.i;
import io3.k;
import io3.l;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kl7.b0;
import kl7.z;
import ko5.p;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.reflect.KClass;
import kotlin.text.CharsKt;
import kotlin.text.a0;
import kotlin.text.d0;
import kotlinx.coroutines.flow.Flow;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import o02.e;
import pwa.q;
import qlm.q1;
import ulm.s0;
import ulm.u0;
import vkm.v1;
import vkm.y;
import vlm.h;
import wk5.m;
import yji.n;
import z92.f;
import zhm.f0;
import zhm.h0;
import zhm.q0;
import zhm.w;
import zhm.y0;

/* JADX INFO: loaded from: classes4.dex */
public abstract class c {
    public static final tri.c A(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Object obj2 = context;
        while (obj2 instanceof ContextWrapper) {
            if (obj2 instanceof qy0.a) {
                return ((BaseDelegatesActivity) ((qy0.a) obj2)).f98687h0;
            }
            Context baseContext = ((ContextWrapper) obj2).getBaseContext();
            Intrinsics.checkNotNullExpressionValue(baseContext, "getBaseContext(...)");
            obj2 = baseContext;
        }
        return null;
    }

    public static final void B(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (name.length() <= 0) {
            throw new IllegalArgumentException("name is empty");
        }
        int length = name.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = name.charAt(i);
            if ('!' > cCharAt || cCharAt >= 127) {
                StringBuilder sb6 = new StringBuilder("Unexpected char 0x");
                String string = Integer.toString(cCharAt, CharsKt.checkRadix(16));
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                if (string.length() < 2) {
                    string = "0".concat(string);
                }
                sb6.append(string);
                sb6.append(" at ");
                sb6.append(i);
                sb6.append(" in header name: ");
                sb6.append(name);
                throw new IllegalArgumentException(sb6.toString().toString());
            }
        }
    }

    public static final void C(String value, String name) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(name, "name");
        int length = value.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = value.charAt(i);
            if (cCharAt != '\t' && (' ' > cCharAt || cCharAt >= 127)) {
                StringBuilder sb6 = new StringBuilder("Unexpected char 0x");
                String string = Integer.toString(cCharAt, CharsKt.checkRadix(16));
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                if (string.length() < 2) {
                    string = "0".concat(string);
                }
                sb6.append(string);
                sb6.append(" at ");
                sb6.append(i);
                sb6.append(" in ");
                sb6.append(name);
                sb6.append(" value");
                sb6.append(h.v(name) ? "" : ": ".concat(value));
                throw new IllegalArgumentException(sb6.toString().toString());
            }
        }
    }

    public static final ArrayList D(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            arrayList.add(E((Pair) it8.next()));
        }
        return arrayList;
    }

    public static final Pair E(Pair pair) {
        k kVar;
        Intrinsics.checkNotNullParameter(pair, "<this>");
        Iterable iterable = (Iterable) pair.f186386b;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : iterable) {
            io3.d dVar = (io3.d) obj2;
            l lVar = dVar.e;
            if ((lVar == l.CURRENT || lVar == l.MERCHANT) && ((kVar = dVar.f) == k.DELISTED || (kVar == k.INACTIVE && f.j(dVar).k()))) {
                String str = dVar.f163147c;
                xi0.b.Companion.getClass();
                if (!Intrinsics.f(str, xi0.b.f306279q.f306286a)) {
                }
            }
            arrayList.add(obj2);
        }
        return Pair.a(pair, null, arrayList, 1);
    }

    public static final boolean F(CryptoSendWalletsListControllerContract$InputData cryptoSendWalletsListControllerContract$InputData, wk5.k addressType) {
        Intrinsics.checkNotNullParameter(cryptoSendWalletsListControllerContract$InputData, "<this>");
        Intrinsics.checkNotNullParameter(addressType, "addressType");
        int i = br5.a.f17929a[cryptoSendWalletsListControllerContract$InputData.f71336c.ordinal()];
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return addressType == wk5.k.EVM || addressType == wk5.k.SPL;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final boolean G(CryptoSendWalletsListControllerContract$InputData cryptoSendWalletsListControllerContract$InputData) {
        Intrinsics.checkNotNullParameter(cryptoSendWalletsListControllerContract$InputData, "<this>");
        return Intrinsics.f(cryptoSendWalletsListControllerContract$InputData.f71335b, y0.b(p.BANK_BENEFICIARY));
    }

    public static final boolean H(CryptoSendWalletsListControllerContract$InputData cryptoSendWalletsListControllerContract$InputData, wk5.a blockchain) {
        Intrinsics.checkNotNullParameter(cryptoSendWalletsListControllerContract$InputData, "<this>");
        Intrinsics.checkNotNullParameter(blockchain, "blockchain");
        return F(cryptoSendWalletsListControllerContract$InputData, m.a(blockchain));
    }

    public static final boolean I(String str, z type) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        int i = mp7.l.f207778a[type.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return !d0.W(str);
            }
            throw new NoWhenBranchMatchedException();
        }
        int i2 = 0;
        while (true) {
            if (i2 < str.length()) {
                if (!Character.isDigit(str.charAt(i2))) {
                    break;
                }
                i2++;
            } else if (!d0.W(str)) {
                return true;
            }
        }
        return false;
    }

    public static final EntitiesSelectionItem J(FormScreen formScreen) {
        Intrinsics.checkNotNullParameter(formScreen, "<this>");
        Object objB0 = zhm.d0.b0(formScreen.f63468b);
        Intrinsics.i(objB0, "null cannot be cast to non-null type com.revolut.feature.backend_flow.domain.models.EntitiesSelectionItem");
        return (EntitiesSelectionItem) objB0;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|2|(2:4|(1:6)(1:7))(0)|8|(1:(1:(3:12|29|30)(2:13|14))(1:15))(3:16|(0)|28)|19|32|20|(1:22)(1:23)|24|25|26) */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0088, code lost:
    
        if (r7.i(r2, r8, r0) == r1) goto L28;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object K(dam.s r7, org.json.JSONObject r8, gim.c r9) throws org.json.JSONException {
        /*
            boolean r0 = r9 instanceof z9m.m
            if (r0 == 0) goto L13
            r0 = r9
            z9m.m r0 = (z9m.m) r0
            int r1 = r0.f320543x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f320543x = r1
            goto L18
        L13:
            z9m.m r0 = new z9m.m
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f320542w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f320543x
            r3 = 2
            r4 = 1
            java.lang.String r5 = "key"
            if (r2 == 0) goto L3f
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            yhm.o.b(r9)
            goto L8b
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            java.lang.String r7 = r0.v
            dam.s r8 = r0.u
            yhm.o.b(r9)
            r6 = r8
            r8 = r7
            r7 = r6
            goto L5e
        L3f:
            yhm.o.b(r9)
            java.lang.String r8 = r8.getString(r5)
            kotlin.Lazy r9 = r7.k
            java.lang.Object r9 = r9.getValue()
            y9m.e r9 = (y9m.e) r9
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r5)
            r0.u = r7
            r0.v = r8
            r0.f320543x = r4
            java.lang.Object r9 = r9.a(r8, r0)
            if (r9 != r1) goto L5e
            goto L8a
        L5e:
            java.lang.String r9 = (java.lang.String) r9
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: org.json.JSONException -> L6c
            if (r9 != 0) goto L67
            java.lang.String r4 = ""
            goto L68
        L67:
            r4 = r9
        L68:
            r2.<init>(r4)     // Catch: org.json.JSONException -> L6c
            r9 = r2
        L6c:
            dam.m r2 = dam.m.STORAGE_RESPONSE
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>()
            org.json.JSONObject r8 = r4.put(r5, r8)
            java.lang.String r4 = "value"
            org.json.JSONObject r8 = r8.put(r4, r9)
            r9 = 0
            r0.u = r9
            r0.v = r9
            r0.f320543x = r3
            java.lang.Object r7 = r7.i(r2, r8, r0)
            if (r7 != r1) goto L8b
        L8a:
            return r1
        L8b:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ue8.c.K(dam.s, org.json.JSONObject, gim.c):java.lang.Object");
    }

    public static final boolean L(CryptoSendWalletsListControllerContract$InputData cryptoSendWalletsListControllerContract$InputData) {
        Intrinsics.checkNotNullParameter(cryptoSendWalletsListControllerContract$InputData, "<this>");
        return M(cryptoSendWalletsListControllerContract$InputData) && N(cryptoSendWalletsListControllerContract$InputData);
    }

    public static final boolean M(CryptoSendWalletsListControllerContract$InputData cryptoSendWalletsListControllerContract$InputData) {
        Intrinsics.checkNotNullParameter(cryptoSendWalletsListControllerContract$InputData, "<this>");
        return cryptoSendWalletsListControllerContract$InputData.f71335b.contains(p.BANK_BENEFICIARY);
    }

    public static final boolean N(CryptoSendWalletsListControllerContract$InputData cryptoSendWalletsListControllerContract$InputData) {
        Intrinsics.checkNotNullParameter(cryptoSendWalletsListControllerContract$InputData, "<this>");
        return cryptoSendWalletsListControllerContract$InputData.f71335b.contains(p.WALLET);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, java.util.Map] */
    public static final r61.c O(zk5.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        ?? r06 = cVar.f322908a;
        LinkedHashMap linkedHashMap = new LinkedHashMap(q0.b(r06.size()));
        for (Map.Entry entry : r06.entrySet()) {
            Object key = entry.getKey();
            zk5.a aVar = (zk5.a) entry.getValue();
            linkedHashMap.put(key, new r61.a(aVar.f322905a, aVar.f322906b, aVar.f322907c));
        }
        ?? r72 = cVar.f322909b;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(q0.b(r72.size()));
        for (Map.Entry entry2 : r72.entrySet()) {
            Object key2 = entry2.getKey();
            zk5.a aVar2 = (zk5.a) entry2.getValue();
            linkedHashMap2.put(key2, new r61.a(aVar2.f322905a, aVar2.f322906b, aVar2.f322907c));
        }
        return new r61.c(linkedHashMap, linkedHashMap2);
    }

    public static final Integer P(int i) {
        if (i == 0) {
            return Integer.valueOf(R$attr.uikit_colorDeepPurple);
        }
        if (i == 1) {
            return Integer.valueOf(R$attr.uikit_colorLightBlue);
        }
        if (i == 2) {
            return Integer.valueOf(R$attr.uikit_colorOrange);
        }
        r6.b.D("We should only display 3 main indexes");
        return null;
    }

    public static final TextLocalisedClause Q(m7g.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        int i = g4g.a.f140521a[dVar.ordinal()];
        if (i == 1) {
            return new TextLocalisedClause(R$string.travel_flights_passengers_info_cabin_class_economy, null, null, 14);
        }
        if (i == 2) {
            return new TextLocalisedClause(R$string.travel_flights_passengers_info_cabin_class_premium_economy, null, null, 14);
        }
        if (i == 3) {
            return new TextLocalisedClause(R$string.travel_flights_passengers_info_cabin_class_business, null, null, 14);
        }
        if (i == 4) {
            return new TextLocalisedClause(R$string.travel_flights_passengers_info_cabin_class_first, null, null, 14);
        }
        if (i == 5) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final TravelExperiencesCashback R(kzf.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return new TravelExperiencesCashback(aVar.getPercentage(), mo3.a.o(aVar.getValue()));
    }

    public static final TravelExperiencesCashback S(lzf.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return new TravelExperiencesCashback(aVar.getPercentage(), hx7.a.v(aVar.getValue()));
    }

    public static final PricingPlanWaitlistEntry T(mok.b bVar) {
        gok.b bVar2;
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        String strA = bVar.getId();
        String strD = bVar.getState();
        gok.b[] bVarArrValues = gok.b.values();
        int length = bVarArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                bVar2 = null;
                break;
            }
            bVar2 = bVarArrValues[i];
            if (a0.z(bVar2.name(), strD, true)) {
                break;
            }
            i++;
        }
        if (bVar2 == null) {
            bVar2 = gok.b.PENDING;
        }
        return new PricingPlanWaitlistEntry(strA, bVar2, bVar.getPlanTier(), bVar.getPlanTierDisplayName());
    }

    public static final o02.f U(g gVar) {
        e eVar;
        o02.d dVar;
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        List<fz1.f> settings = gVar.getSettings();
        ArrayList arrayList = new ArrayList();
        for (fz1.f fVar : settings) {
            Intrinsics.checkNotNullParameter(fVar, "<this>");
            String name = fVar.getName();
            o02.d[] dVarArrValues = o02.d.values();
            int length = dVarArrValues.length;
            int i = 0;
            while (true) {
                eVar = null;
                if (i >= length) {
                    dVar = null;
                    break;
                }
                dVar = dVarArrValues[i];
                if (a0.z(dVar.name(), name, true)) {
                    break;
                }
                i++;
            }
            if (dVar == null) {
                IllegalStateException illegalStateException = new IllegalStateException(j6.a.q("Can't map ApmSettings name: ", fVar.getName()));
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
            } else if (fVar instanceof fz1.b) {
                eVar = new e(dVar, new o02.a(((fz1.b) fVar).getValue()));
            } else if (fVar instanceof fz1.d) {
                eVar = new e(dVar, new o02.b(((fz1.d) fVar).getValue()));
            } else {
                if (!(fVar instanceof fz1.e)) {
                    throw new NoWhenBranchMatchedException();
                }
                fz1.e eVar2 = (fz1.e) fVar;
                IllegalStateException illegalStateException2 = new IllegalStateException(j6.a.s("Can't map ApmSettings type: ", eVar2.getType(), " (name: ", eVar2.getName(), ")"));
                h0 h0Var2 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, illegalStateException2, h0Var2);
            }
            if (eVar != null) {
                arrayList.add(eVar);
            }
        }
        return new o02.f(arrayList);
    }

    public static final pf8.m V(j jVar) {
        of8.a aVar;
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        String state = jVar.getState();
        of8.a[] aVarArrValues = of8.a.values();
        int length = aVarArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                aVar = null;
                break;
            }
            aVar = aVarArrValues[i];
            if (a0.z(aVar.name(), state, true)) {
                break;
            }
            i++;
        }
        if (aVar == null) {
            return null;
        }
        return new pf8.m(aVar);
    }

    public static final pf8.m W(ye8.j jVar) {
        of8.a aVar;
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        String state = jVar.getState();
        of8.a[] aVarArrValues = of8.a.values();
        int length = aVarArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                aVar = null;
                break;
            }
            aVar = aVarArrValues[i];
            if (a0.z(aVar.name(), state, true)) {
                break;
            }
            i++;
        }
        if (aVar == null) {
            return null;
        }
        return new pf8.m(aVar);
    }

    public static final ph6.d X(ye6.e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        String strB = eVar.getTitle();
        ye6.d dVarA = eVar.getInstitution();
        Intrinsics.checkNotNullParameter(dVarA, "<this>");
        return new ph6.d(strB, new ph6.c(dVarA.getInstitutionId(), dVarA.getName(), new io3.b(io3.a.valueOf(dVarA.getLogo().getType()), dVarA.getLogo().getValue()), dVarA.getAccountTypes()));
    }

    public static final ph6.e Y(ye6.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        String strB = fVar.getTitle();
        List<ye6.a> listA = fVar.getPermissions();
        ArrayList arrayList = new ArrayList(w.t(listA, 10));
        for (ye6.a aVar : listA) {
            Intrinsics.checkNotNullParameter(aVar, "<this>");
            arrayList.add(new oh6.b(aVar.getId(), aVar.getValue()));
        }
        return new ph6.e(strB, arrayList);
    }

    public static final wfi.a Z(sfi.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        return new wfi.a(bVar.getId(), bVar.getName(), bVar.getDescription(), bVar.getImageUrl(), lfi.a.m(bVar.getPointsRewardRate()));
    }

    public static final fo3.f a(Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "<this>");
        fo3.c cVar = (fo3.c) pair.f186385a;
        List list = (List) pair.f186386b;
        String str = cVar.f136801a;
        List<io3.d> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (io3.d dVar : list2) {
            Intrinsics.checkNotNullParameter(dVar, "<this>");
            arrayList.add(new fo3.a(dVar.f163145a, Long.valueOf(dVar.i), dVar.u));
        }
        return new fo3.f(str, arrayList);
    }

    public static final int a0(pwa.p pVar) {
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        switch (q.f240374a[pVar.ordinal()]) {
            case 1:
                return R$drawable.uikit_icn_24_link;
            case 2:
                return R$drawable.uikit_icn_24_cash_income;
            case 3:
                return R$drawable.uikit_icn_24_card;
            case 4:
                return R$drawable.uikit_icn_24_cart;
            case 5:
                return R$drawable.uikit_icn_24_link;
            case 6:
                return R$drawable.uikit_icn_24_cash_income;
            case 7:
                return R$drawable.uikit_icn_24_profile;
            case 8:
                return R$drawable.uikit_icn_24_services;
            case 9:
                return R$drawable.uikit_icn_24_cash_income;
            case 10:
                return R$drawable.uikit_icn_24_card;
            case 11:
                return R$drawable.uikit_icn_24_payments;
            case 12:
                return R$drawable.uikit_icn_24_price_tag;
            case 13:
                return R$drawable.uikit_icn_24_link;
            case 14:
                return R$drawable.uikit_icn_24_check_verification;
            case 15:
                return R$drawable.uikit_icn_24_calendar_date;
            case 16:
                return R$drawable.uikit_icn_24_cart;
            case 17:
                return R$drawable.uikit_icn_24_cart;
            case 18:
                return R$drawable.uikit_icn_24_revolut;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final void b(s0 s0Var, String name, String value) {
        Intrinsics.checkNotNullParameter(s0Var, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        B(name);
        C(value, name);
        d(s0Var, name, value);
    }

    public static final TravelHotelsDropoffSearchParameters b0(dgi.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        LocationData locationData = cVar.f114671a;
        return new TravelHotelsDropoffSearchParameters(locationData instanceof LocationType ? ((LocationType) locationData).f98134b : null, ta6.a.v(locationData), cVar.f114672b, cVar.f114673c, hx7.a.F(cVar.d), null, null, null, null, null, null, Boolean.TRUE, null, null, null, null, cVar.i, null, null, null);
    }

    public static final void c(s0 s0Var, u0 headers) {
        Intrinsics.checkNotNullParameter(s0Var, "<this>");
        Intrinsics.checkNotNullParameter(headers, "headers");
        int size = headers.size();
        for (int i = 0; i < size; i++) {
            d(s0Var, l(headers, i), q(headers, i));
        }
    }

    public static final o c0(CryptoAddressHostingPreCheckInput cryptoAddressHostingPreCheckInput) {
        Intrinsics.checkNotNullParameter(cryptoAddressHostingPreCheckInput, "<this>");
        String str = cryptoAddressHostingPreCheckInput.f71081a;
        dj0.d dVar = cryptoAddressHostingPreCheckInput.f71082b;
        return new o(str, mo3.a.p(dVar).getAmount(), mo3.a.p(dVar).getCurrency(), cryptoAddressHostingPreCheckInput.f71083c.name());
    }

    public static final void d(s0 s0Var, String name, String value) {
        Intrinsics.checkNotNullParameter(s0Var, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        s0Var.f281134a.add(name);
        s0Var.f281134a.add(d0.F0(value).toString());
    }

    public static final j d0(pf8.m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        return new j(mVar.f235520a.name());
    }

    public static final u0 e(s0 s0Var) {
        Intrinsics.checkNotNullParameter(s0Var, "<this>");
        return new u0((String[]) s0Var.f281134a.toArray(new String[0]));
    }

    public static final lzf.a e0(TravelExperiencesCashback travelExperiencesCashback) {
        Intrinsics.checkNotNullParameter(travelExperiencesCashback, "<this>");
        return new lzf.a(travelExperiencesCashback.f93194b, hx7.a.A(travelExperiencesCashback.f93193a));
    }

    public static final boolean f(Object obj2, u0 u0Var) {
        Intrinsics.checkNotNullParameter(u0Var, "<this>");
        return (obj2 instanceof u0) && Arrays.equals(u0Var.f281142a, ((u0) obj2).f281142a);
    }

    public static final Object f0(yji.l lVar, Function1 function1, Continuation continuation) {
        return vkm.q.x(i0(new v1(new iji.d(0, (Continuation) null, function1)), lVar), continuation);
    }

    public static final String g(s0 s0Var, String name) {
        Intrinsics.checkNotNullParameter(s0Var, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        ArrayList arrayList = s0Var.f281134a;
        int size = arrayList.size() - 2;
        int iA = iim.b.a(size, 0, -2);
        if (iA > size) {
            return null;
        }
        while (!a0.z(name, (String) arrayList.get(size), true)) {
            if (size == iA) {
                return null;
            }
            size -= 2;
        }
        return (String) arrayList.get(size + 1);
    }

    public static final Object g0(n controllerModelExtension, Function1 function1, i iVar) {
        v1 v1Var = new v1(new iji.d(1, (Continuation) null, function1));
        Intrinsics.checkNotNullParameter(v1Var, "<this>");
        Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
        return vkm.q.x(h0(v1Var, controllerModelExtension.r2()), iVar);
    }

    public static final int h(u0 u0Var) {
        Intrinsics.checkNotNullParameter(u0Var, "<this>");
        return Arrays.hashCode(u0Var.f281142a);
    }

    public static final Flow h0(Flow flow, aii.o oVar) {
        aii.n nVarM0 = oVar.M0(new iji.a(flow));
        Continuation continuation = null;
        iji.b bVar = nVarM0 instanceof iji.b ? (iji.b) nVarM0 : null;
        if (bVar != null) {
            return new y(new hd2.b(2, 1, continuation), bVar.f161799a);
        }
        return flow;
    }

    public static final String i(String name, String[] namesAndValues) {
        Intrinsics.checkNotNullParameter(namesAndValues, "namesAndValues");
        Intrinsics.checkNotNullParameter(name, "name");
        int length = namesAndValues.length - 2;
        int iA = iim.b.a(length, 0, -2);
        if (iA > length) {
            return null;
        }
        while (!a0.z(name, namesAndValues[length], true)) {
            if (length == iA) {
                return null;
            }
            length -= 2;
        }
        return namesAndValues[length + 1];
    }

    public static final Flow i0(Flow flow, yji.l controllerModel) {
        Intrinsics.checkNotNullParameter(flow, "<this>");
        Intrinsics.checkNotNullParameter(controllerModel, "controllerModel");
        return h0(flow, controllerModel.l1());
    }

    public static final u0 j(String... inputNamesAndValues) {
        Intrinsics.checkNotNullParameter(inputNamesAndValues, "inputNamesAndValues");
        if (inputNamesAndValues.length % 2 != 0) {
            throw new IllegalArgumentException("Expected alternating header names and values");
        }
        String[] strArr = (String[]) Arrays.copyOf(inputNamesAndValues, inputNamesAndValues.length);
        int length = strArr.length;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (strArr[i2] == null) {
                throw new IllegalArgumentException("Headers cannot be null");
            }
            strArr[i2] = d0.F0(inputNamesAndValues[i2]).toString();
        }
        int iA = iim.b.a(0, strArr.length - 1, 2);
        if (iA >= 0) {
            while (true) {
                String str = strArr[i];
                String str2 = strArr[i + 1];
                B(str);
                C(str2, str);
                if (i == iA) {
                    break;
                }
                i += 2;
            }
        }
        return new u0(strArr);
    }

    public static final kotlin.jvm.internal.d k(u0 u0Var) {
        Intrinsics.checkNotNullParameter(u0Var, "<this>");
        int size = u0Var.size();
        Pair[] pairArr = new Pair[size];
        for (int i = 0; i < size; i++) {
            pairArr[i] = new Pair(l(u0Var, i), q(u0Var, i));
        }
        return kotlin.jvm.internal.u0.h(pairArr);
    }

    public static final String l(u0 u0Var, int i) {
        Intrinsics.checkNotNullParameter(u0Var, "<this>");
        String str = (String) kotlin.collections.d.W(i * 2, u0Var.f281142a);
        if (str != null) {
            return str;
        }
        throw new IndexOutOfBoundsException(p.a.k(']', "name[", i));
    }

    public static final s0 m(u0 u0Var) {
        Intrinsics.checkNotNullParameter(u0Var, "<this>");
        s0 s0Var = new s0();
        zhm.a0.z(s0Var.f281134a, u0Var.f281142a);
        return s0Var;
    }

    public static final void n(s0 s0Var, String name) {
        Intrinsics.checkNotNullParameter(s0Var, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        int i = 0;
        while (true) {
            ArrayList arrayList = s0Var.f281134a;
            if (i >= arrayList.size()) {
                return;
            }
            if (a0.z(name, (String) arrayList.get(i), true)) {
                arrayList.remove(i);
                arrayList.remove(i);
                i -= 2;
            }
            i += 2;
        }
    }

    public static final void o(s0 s0Var, String name, String value) {
        Intrinsics.checkNotNullParameter(s0Var, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        B(name);
        C(value, name);
        Intrinsics.checkNotNullParameter(name, "name");
        n(s0Var, name);
        d(s0Var, name, value);
    }

    public static final String p(u0 u0Var) {
        Intrinsics.checkNotNullParameter(u0Var, "<this>");
        StringBuilder sb6 = new StringBuilder();
        int size = u0Var.size();
        for (int i = 0; i < size; i++) {
            String strL = l(u0Var, i);
            String strQ = q(u0Var, i);
            sb6.append(strL);
            sb6.append(": ");
            if (h.v(strL)) {
                strQ = "██";
            }
            sb6.append(strQ);
            sb6.append("\n");
        }
        return sb6.toString();
    }

    public static final String q(u0 u0Var, int i) {
        Intrinsics.checkNotNullParameter(u0Var, "<this>");
        String str = (String) kotlin.collections.d.W((i * 2) + 1, u0Var.f281142a);
        if (str != null) {
            return str;
        }
        throw new IndexOutOfBoundsException(p.a.k(']', "value[", i));
    }

    public static final List r(u0 u0Var, String name) {
        Intrinsics.checkNotNullParameter(u0Var, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        int size = u0Var.size();
        List listUnmodifiableList = null;
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            if (a0.z(name, l(u0Var, i), true)) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(q(u0Var, i));
            }
        }
        if (arrayList != null) {
            listUnmodifiableList = Collections.unmodifiableList(arrayList);
            Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "unmodifiableList(...)");
        }
        return listUnmodifiableList == null ? f0.f322471a : listUnmodifiableList;
    }

    public static void s(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
    }

    public static byte[] t(byte[] bArr) {
        if (bArr.length != 16) {
            throw new IllegalArgumentException("value must be a block.");
        }
        byte[] bArr2 = new byte[16];
        for (int i = 0; i < 16; i++) {
            byte b4 = (byte) ((bArr[i] << 1) & 254);
            bArr2[i] = b4;
            if (i < 15) {
                bArr2[i] = (byte) (((byte) ((bArr[i + 1] >> 7) & 1)) | b4);
            }
        }
        bArr2[15] = (byte) (((byte) ((bArr[0] >> 7) & 135)) ^ bArr2[15]);
        return bArr2;
    }

    public static final KClass u(SerialDescriptor serialDescriptor) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "<this>");
        if (serialDescriptor instanceof olm.b) {
            return ((olm.b) serialDescriptor).f226466b;
        }
        if (serialDescriptor instanceof q1) {
            return u(((q1) serialDescriptor).f247697a);
        }
        return null;
    }

    public static final SerialDescriptor v(SerialDescriptor descriptor, tlm.e eVar) {
        KSerializer kSerializerB;
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        KClass kClassU = u(descriptor);
        if (kClassU == null || (kSerializerB = eVar.b(kClassU, f0.f322471a)) == null) {
            return null;
        }
        return kSerializerB.getDescriptor();
    }

    public static final String w(b0 b0Var, Map licenceNumbers) {
        String str;
        Intrinsics.checkNotNullParameter(b0Var, "<this>");
        Intrinsics.checkNotNullParameter(licenceNumbers, "licenceNumbers");
        String str2 = b0Var.f185294a;
        int i = kl7.a0.f185290a[b0Var.e.ordinal()];
        if (i == 1) {
            str = b0Var.f185297g;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            str = b0Var.f185298h;
        }
        String str3 = (String) licenceNumbers.getOrDefault(str2, str);
        if (str3 != null) {
            return str3;
        }
        m70.a.c(t0.f186434a);
        return "";
    }

    public static final ResourceImage x(oei.b bVar, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        switch (k9g.a.f182334a[bVar.ordinal()]) {
            case 1:
                i2 = R$drawable.uikit_icn_24_communication;
                break;
            case 2:
                i2 = R$drawable.uikit_icn_24_driving_licence;
                break;
            case 3:
                i2 = R$drawable.uikit_icn_24_parking;
                break;
            case 4:
                i2 = R$drawable.uikit_icn_24_restaurants;
                break;
            case 5:
                i2 = R$drawable.uikit_icn_24_activities;
                break;
            case 6:
                i2 = R$drawable.uikit_icn_24_people;
                break;
            case 7:
                i2 = R$drawable.uikit_icn_24_concierge;
                break;
            case 8:
                i2 = R$drawable.uikit_icn_24_language;
                break;
            case 9:
                i2 = R$drawable.uikit_icn_24_services;
                break;
            case 10:
                i2 = R$drawable.uikit_icn_24_accessibility;
                break;
            case 11:
                i2 = R$drawable.uikit_icn_24_medical_bed;
                break;
            case 12:
                i2 = R$drawable.uikit_icn_24_shower;
                break;
            case 13:
                i2 = R$drawable.uikit_icn_24_entertainment;
                break;
            case 14:
                i2 = R$drawable.uikit_icn_24_insurance;
                break;
            case 15:
                i2 = R$drawable.uikit_icn_24_cleaning;
                break;
            case 16:
                i2 = R$drawable.uikit_icn_24_outdoor;
                break;
            case 17:
                i2 = R$drawable.uikit_icn_24_animals;
                break;
            case 18:
                i2 = R$drawable.uikit_icn_24_pool;
                break;
            case 19:
                i2 = R$drawable.uikit_icn_24_fitness;
                break;
            case 20:
                i2 = R$drawable.uikit_icn_24_sunrise;
                break;
            default:
                i2 = R$drawable.uikit_icn_24_more_dots;
                break;
        }
        return new ResourceImage(i2, (Integer) null, (Integer) null, Integer.valueOf(i), (List) null, (ImageTransformations) null, (Clause) null, 246);
    }

    public static final wi0.b y(b0 b0Var, Map licenceIssuingCountries) {
        Intrinsics.checkNotNullParameter(b0Var, "<this>");
        Intrinsics.checkNotNullParameter(licenceIssuingCountries, "licenceIssuingCountries");
        return (wi0.b) licenceIssuingCountries.getOrDefault(b0Var.f185294a, b0Var.f);
    }

    public static final TextLocalisedClause z(oei.b bVar) {
        int i;
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        switch (k9g.a.f182334a[bVar.ordinal()]) {
            case 1:
                i = com.revolut.feature.travel.hotels.api.R$string.hotels_property_amenities_internet_title;
                break;
            case 2:
                i = com.revolut.feature.travel.hotels.api.R$string.hotels_property_amenities_transport_title;
                break;
            case 3:
                i = com.revolut.feature.travel.hotels.api.R$string.hotels_property_amenities_parking_title;
                break;
            case 4:
                i = com.revolut.feature.travel.hotels.api.R$string.hotels_property_amenities_food_and_drink_title;
                break;
            case 5:
                i = com.revolut.feature.travel.hotels.api.R$string.hotels_property_amenities_things_to_do_title;
                break;
            case 6:
                i = com.revolut.feature.travel.hotels.api.R$string.hotels_property_amenities_family_and_children_title;
                break;
            case 7:
                i = com.revolut.feature.travel.hotels.api.R$string.hotels_property_amenities_services_and_conveniences_title;
                break;
            case 8:
                i = com.revolut.feature.travel.hotels.api.R$string.hotels_property_amenities_languages_spoken_title;
                break;
            case 9:
                i = com.revolut.feature.travel.hotels.api.R$string.hotels_property_amenities_business_services_title;
                break;
            case 10:
                i = com.revolut.feature.travel.hotels.api.R$string.hotels_property_amenities_accessibility_title;
                break;
            case 11:
                i = com.revolut.feature.travel.hotels.api.R$string.hotels_property_amenities_bedroom_title;
                break;
            case 12:
                i = com.revolut.feature.travel.hotels.api.R$string.hotels_property_amenities_bathroom_title;
                break;
            case 13:
                i = com.revolut.feature.travel.hotels.api.R$string.hotels_property_amenities_entertainment_title;
                break;
            case 14:
                i = com.revolut.feature.travel.hotels.api.R$string.hotels_property_amenities_safety_title;
                break;
            case 15:
                i = com.revolut.feature.travel.hotels.api.R$string.hotels_property_amenities_cleaning_title;
                break;
            case 16:
                i = com.revolut.feature.travel.hotels.api.R$string.hotels_property_amenities_outdoor_areas_title;
                break;
            case 17:
                i = com.revolut.feature.travel.hotels.api.R$string.hotels_property_amenities_pets_title;
                break;
            case 18:
                i = com.revolut.feature.travel.hotels.api.R$string.hotels_property_amenities_pools_and_spa_treatment_title;
                break;
            case 19:
                i = com.revolut.feature.travel.hotels.api.R$string.hotels_property_amenities_fitness_title;
                break;
            case 20:
                i = com.revolut.feature.travel.hotels.api.R$string.hotels_property_amenities_view_title;
                break;
            case 21:
                i = com.revolut.feature.travel.hotels.api.R$string.hotels_property_amenities_children_and_extra_beds_title;
                break;
            case 22:
                i = com.revolut.feature.travel.hotels.api.R$string.hotels_property_amenities_payment_types_title;
                break;
            default:
                i = com.revolut.feature.travel.hotels.api.R$string.hotels_property_amenities_more_title;
                break;
        }
        return new TextLocalisedClause(i, null, null, 14);
    }
}
