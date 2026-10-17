package awd;

import abd.d;
import adk.e1;
import adk.f0;
import adk.h1;
import adk.i0;
import adk.l0;
import adk.r0;
import adk.u0;
import adk.v0;
import android.location.Address;
import androidx.room.util.DBUtil;
import auc.d0;
import auc.g0;
import auc.p;
import auc.s0;
import ayf.n;
import b4g.j;
import b6a.e;
import b97.l;
import ble.b0;
import bwb.p;
import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.data.model.Data;
import com.revolut.feature.globalsearch.models.GlobalSearchContext;
import com.revolut.feature.globalsearch.models.RetailGlobalSearchContext;
import com.revolut.feature.location.api.domain.models.location.LocationDomain;
import com.revolut.feature.rev_points.giftcards.api.model.VoucherProductGroup;
import com.revolut.feature.rev_points.giftcards.api.model.VoucherProductGroupResponse;
import com.revolut.feature.rev_points.models.RevPoints;
import com.revolut.feature.sca_prompt.api.models.TrustedCompanyBeneficiary;
import com.revolut.feature.security_hub.api.models.DigitizedCard;
import com.revolut.feature.security_hub.api.models.DigitizedCards;
import com.revolut.feature.security_hub.api.models.Enrollment;
import com.revolut.feature.security_hub.api.models.SecurityDelayInfo;
import com.revolut.feature.security_hub.api.models.StreetModeDelayDuration;
import com.revolut.feature.security_hub.api.models.StreetModeDelayDurationDisclaimer;
import com.revolut.feature.security_hub.api.models.StreetModeInfo;
import com.revolut.feature.security_hub.api.models.StreetModeMinimumAmount;
import com.revolut.feature.security_hub.api.models.StreetModeTrustedLocation;
import com.revolut.feature.security_hub.api.models.StreetModeTrustedWifi;
import com.revolut.feature.security_hub.impl.interactor.FeatureItem;
import com.revolut.feature.security_hub.impl.repository.LimitValue;
import com.revolut.feature.security_hub.impl.repository.OutboundTransactionLimit;
import com.revolut.feature.security_hub.impl.repository.OutboundTransactionLimitDeviceCooldown;
import com.revolut.feature.security_hub.impl.repository.OutboundTransactionLimitGroupConfig;
import com.revolut.feature.security_hub.impl.repository.ReadOnlyDialog;
import com.revolut.feature.shared.order_initiation.api.domain.OrderInitiationPage;
import com.revolut.feature.staking.api.model.StakingModes;
import com.revolut.feature.staking.api.model.StakingProduct;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import com.revolut.feature.wealth.api.domain.model.WealthAccount;
import com.revolut.retail.feature.plan_rewards.api.model.AdditionalReward;
import com.revolut.retail.feature.plan_rewards.api.model.RewardInfo;
import com.revolut.retail.feature.plan_rewards.api.model.RewardInfoItem;
import com.revolut.tracking.v3.InvestTabContext;
import cuc.e0;
import cuc.r;
import cuc.t;
import cuc.z;
import d7j.k1;
import dbd.g;
import de9.x;
import gim.i;
import grl.he;
import ie9.h;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KTypeProjection;
import o97.a0;
import o97.c0;
import o97.m0;
import o97.s;
import s7g.h2;
import w5a.f;
import xck.m;
import yhm.m;
import yhm.o;
import yte.k;
import zhm.h0;
import zhm.q0;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final class b extends i implements Function3 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f10759w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i, int i2, Continuation continuation) {
        super(i, continuation);
        this.u = i2;
    }

    private final Object b(Object obj2) {
        OrderInitiationPage orderInitiationPage = (OrderInitiationPage) this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        xad.a aVar2 = ((g) this.f10759w).d;
        d dVarB = zad.a.b(orderInitiationPage);
        aVar2.getClass();
        DBUtil.performBlocking(aVar2.f303870a, false, true, new x52.a(aVar2, dVarB, 19));
        return Unit.f186387a;
    }

    private final Object c(Object obj2) {
        List list = (List) this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        xad.a aVar2 = ((g) this.f10759w).d;
        List list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            arrayList.add(zad.a.b((OrderInitiationPage) it8.next()));
        }
        aVar2.getClass();
        DBUtil.performBlocking(aVar2.f303870a, false, true, new x52.a(aVar2, arrayList, 20));
        return Unit.f186387a;
    }

    private final Object n(Object obj2) {
        Throwable th10 = (Throwable) this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        if (th10 == null) {
            x xVar = (x) this.f10759w;
            ((h) xVar.f113343s).f160679a.I0("KEY_LAST_VERIFICATION_ATTEMPT_TIME");
            xVar.x2(new dak.c(26));
        }
        return Unit.f186387a;
    }

    private final Object o(Object obj2) {
        ArrayList arrayList;
        Data data = (Data) this.v;
        xi0.b bVar = (xi0.b) this.f10759w;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        try {
            Object content = data.getContent();
            if (content != null) {
                List list = (List) content;
                arrayList = new ArrayList(w.t(list, 10));
                Iterator it8 = list.iterator();
                while (it8.hasNext()) {
                    arrayList.add(new Pair(((StakingProduct) it8.next()).d, bVar));
                }
            } else {
                arrayList = null;
            }
            return new Data(arrayList, data.getError(), data.getLoading());
        } catch (Throwable th10) {
            return new Data(null, th10, data.getLoading());
        }
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        switch (this.u) {
            case 0:
                b bVar = new b((c) this.f10759w, (Continuation) obj4, 0);
                bVar.v = (List) obj3;
                return bVar.invokeSuspend(Unit.f186387a);
            case 1:
                b bVar2 = new b((axe.b) this.f10759w, (Continuation) obj4, 1);
                bVar2.v = (k) obj3;
                return bVar2.invokeSuspend(Unit.f186387a);
            case 2:
                return new b((n) this.v, (hxf.c) this.f10759w, (Continuation) obj4).invokeSuspend(Unit.f186387a);
            case 3:
                b bVar3 = new b((j) this.f10759w, (Continuation) obj4, 3);
                bVar3.v = (h2) obj3;
                return bVar3.invokeSuspend(Unit.f186387a);
            case 4:
                b bVar4 = new b((e) this.f10759w, (Continuation) obj4, 4);
                bVar4.v = (f) obj3;
                return bVar4.invokeSuspend(Unit.f186387a);
            case 5:
                b bVar5 = new b((b97.f) this.f10759w, (Continuation) obj4, 5);
                bVar5.v = (Map) obj3;
                return bVar5.invokeSuspend(Unit.f186387a);
            case 6:
                b bVar6 = new b((b97.f) this.f10759w, (Continuation) obj4, 6);
                bVar6.v = (a0) obj3;
                return bVar6.invokeSuspend(Unit.f186387a);
            case 7:
                b bVar7 = new b((l) this.f10759w, (Continuation) obj4, 7);
                bVar7.v = (List) obj3;
                return bVar7.invokeSuspend(Unit.f186387a);
            case 8:
                b bVar8 = new b((bb.b) this.f10759w, (Continuation) obj4, 8);
                bVar8.v = (ta.j) obj3;
                return bVar8.invokeSuspend(Unit.f186387a);
            case 9:
                b bVar9 = new b((bdk.c) this.f10759w, (Continuation) obj4, 9);
                bVar9.v = (xck.b) obj3;
                return bVar9.invokeSuspend(Unit.f186387a);
            case 10:
                b bVar10 = new b((bdk.f) this.f10759w, (Continuation) obj4, 10);
                bVar10.v = (m) obj3;
                return bVar10.invokeSuspend(Unit.f186387a);
            case 11:
                b bVar11 = new b((com.revolut.feature.tab.invest.impl.ui.home.f) this.f10759w, (Continuation) obj4, 11);
                bVar11.v = (List) obj3;
                return bVar11.invokeSuspend(Unit.f186387a);
            case 12:
                b bVar12 = new b((bsc.b) this.f10759w, (Continuation) obj4, 12);
                bVar12.v = (List) obj3;
                return bVar12.invokeSuspend(Unit.f186387a);
            case 13:
                b bVar13 = new b((bva.d) this.f10759w, (Continuation) obj4, 13);
                bVar13.v = (Set) obj3;
                return bVar13.invokeSuspend(Unit.f186387a);
            case 14:
                b bVar14 = new b((p) this.f10759w, (Continuation) obj4, 14);
                bVar14.v = (VoucherProductGroupResponse) obj3;
                return bVar14.invokeSuspend(Unit.f186387a);
            case 15:
                b bVar15 = new b((c48.g) this.f10759w, (Continuation) obj4, 15);
                bVar15.v = (List) obj3;
                return bVar15.invokeSuspend(Unit.f186387a);
            case 16:
                b bVar16 = new b((c49.d) this.f10759w, (Continuation) obj4, 16);
                bVar16.v = (String) obj3;
                return bVar16.invokeSuspend(Unit.f186387a);
            case 17:
                b bVar17 = new b((cf6.e) this.f10759w, (Continuation) obj4, 17);
                bVar17.v = (se6.e) obj3;
                return bVar17.invokeSuspend(Unit.f186387a);
            case 18:
                ((Boolean) obj3).getClass();
                b bVar18 = new b((com.revolut.feature.tab.accounts.impl.ui.tab.d) this.f10759w, (Continuation) obj4, 18);
                bVar18.v = (ProductAccountDescriptor$Value) obj2;
                return bVar18.invokeSuspend(Unit.f186387a);
            case 19:
                b bVar19 = new b((cuc.d) this.f10759w, (Continuation) obj4, 19);
                bVar19.v = (DigitizedCards) obj3;
                return bVar19.invokeSuspend(Unit.f186387a);
            case 20:
                b bVar20 = new b((r) this.f10759w, (Continuation) obj4, 20);
                bVar20.v = (SecurityDelayInfo) obj3;
                return bVar20.invokeSuspend(Unit.f186387a);
            case 21:
                b bVar21 = new b((t) this.f10759w, (Continuation) obj4, 21);
                bVar21.v = (List) obj3;
                return bVar21.invokeSuspend(Unit.f186387a);
            case 22:
                b bVar22 = new b((z) this.f10759w, (Continuation) obj4, 22);
                bVar22.v = (List) obj3;
                return bVar22.invokeSuspend(Unit.f186387a);
            case 23:
                b bVar23 = new b((e0) this.f10759w, (Continuation) obj4, 23);
                bVar23.v = (StreetModeInfo) obj3;
                return bVar23.invokeSuspend(Unit.f186387a);
            case 24:
                b bVar24 = new b((com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.g) this.f10759w, (Continuation) obj4, 24);
                bVar24.v = (Throwable) obj3;
                return bVar24.invokeSuspend(Unit.f186387a);
            case 25:
                b bVar25 = new b((g) this.f10759w, (Continuation) obj4, 25);
                bVar25.v = (OrderInitiationPage) obj3;
                return bVar25.invokeSuspend(Unit.f186387a);
            case 26:
                b bVar26 = new b((g) this.f10759w, (Continuation) obj4, 26);
                bVar26.v = (List) obj3;
                return bVar26.invokeSuspend(Unit.f186387a);
            case 27:
                b bVar27 = new b((x) this.f10759w, (Continuation) obj4, 27);
                bVar27.v = (Throwable) obj3;
                return bVar27.invokeSuspend(Unit.f186387a);
            case 28:
                b bVar28 = new b(3, 28, (Continuation) obj4);
                bVar28.v = (Data) obj2;
                bVar28.f10759w = (xi0.b) obj3;
                return bVar28.invokeSuspend(Unit.f186387a);
            default:
                b bVar29 = new b(3, 29, (Continuation) obj4);
                bVar29.v = (pdh.c) obj2;
                bVar29.f10759w = (doc.d) obj3;
                return bVar29.invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Type inference failed for: r0v43, types: [java.lang.Object, java.util.Map] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        Iterator it8;
        nwd.c cVar;
        nwd.a aVar;
        ab.c cVar2;
        String str;
        r0 r0Var;
        ArrayList arrayList;
        Object next;
        Object next2;
        Object next3;
        Object next4;
        String str2;
        auc.l lVar;
        Iterator it9;
        String str3;
        long j2;
        ArrayList arrayList2;
        Integer num;
        Integer num2;
        ArrayList arrayList3;
        auc.f fVar;
        Boolean bool;
        boolean z;
        String str4;
        auc.p pVar;
        ArrayList arrayList4;
        ArrayList arrayList5;
        Iterator it10;
        auc.x xVar;
        switch (this.u) {
            case 0:
                List stakingProducts = (List) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ue0.c cVar3 = ((c) this.f10759w).f10761b;
                Intrinsics.checkNotNullParameter(stakingProducts, "stakingProducts");
                List list = stakingProducts;
                ArrayList arrayList6 = new ArrayList(w.t(list, 10));
                Iterator it11 = list.iterator();
                while (it11.hasNext()) {
                    StakingProduct stakingProduct = (StakingProduct) it11.next();
                    Intrinsics.checkNotNullParameter(stakingProduct, "stakingProduct");
                    String str5 = stakingProduct.f88086a;
                    String str6 = stakingProduct.d.f306286a;
                    StakingModes stakingModes = stakingProduct.f88088c;
                    StakingModes.Manual manual = stakingModes.f88071a;
                    if (manual != null) {
                        BigDecimal bigDecimal = manual.f88076a;
                        int i = manual.f88077b;
                        TimeUnit timeUnit = TimeUnit.DAYS;
                        it8 = it11;
                        cVar = new nwd.c(bigDecimal, timeUnit.toMillis(manual.f88078c), timeUnit.toMillis(manual.d), timeUnit.toMillis(i), mo3.a.p(manual.e), mo3.a.p(manual.f), mo3.a.p(manual.f88079g), mo3.a.p(manual.f88080h));
                    } else {
                        it8 = it11;
                        cVar = null;
                    }
                    StakingModes.Auto auto = stakingModes.f88072b;
                    if (auto != null) {
                        BigDecimal bigDecimal2 = auto.f88073a;
                        boolean z3 = auto.d;
                        int i2 = auto.f88074b;
                        TimeUnit timeUnit2 = TimeUnit.DAYS;
                        aVar = new nwd.a(bigDecimal2, z3, timeUnit2.toMillis(auto.f88075c), timeUnit2.toMillis(i2));
                    } else {
                        aVar = null;
                    }
                    arrayList6.add(new nwd.d(str5, str6, new nwd.b(cVar, aVar)));
                    it11 = it8;
                }
                cVar3.G(arrayList6, "STORAGE_KEY_STAKING_PRODUCTS_V2", kii.e.o(nwd.d.class, KTypeProjection.INSTANCE, List.class));
                return Unit.f186387a;
            case 1:
                k kVar = (k) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((axe.b) this.f10759w).f10932c.G(kVar, "POST_ACTIVATION_CONFIG_KEY", wim.z.d(o0.b(k.class)));
                return Unit.f186387a;
            case 2:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ConcurrentHashMap concurrentHashMap = ((n) this.v).f11176c;
                hxf.c cVar4 = (hxf.c) this.f10759w;
                Object atomicInteger = concurrentHashMap.get(cVar4);
                if (atomicInteger == null) {
                    atomicInteger = new AtomicInteger();
                    concurrentHashMap.put(cVar4, atomicInteger);
                }
                ((AtomicInteger) atomicInteger).decrementAndGet();
                return Unit.f186387a;
            case 3:
                h2 h2Var = (h2) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                j jVar = (j) this.f10759w;
                try {
                    m.Companion companion = yhm.m.INSTANCE;
                    jVar.f12340c.G(h2Var, "TRAVEL_FLIGHTS_BOOKINGS_STORAGE", wim.z.d(o0.b(h2.class)));
                    Unit unit = Unit.f186387a;
                    break;
                } catch (Throwable th10) {
                    m.Companion companion2 = yhm.m.INSTANCE;
                    o.a(th10);
                }
                return Unit.f186387a;
            case 4:
                f fVar2 = (f) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((e) this.f10759w).f12554c.G(fVar2, "payments_migration_cache_key", wim.z.d(o0.b(f.class)));
                return Unit.f186387a;
            case 5:
                Map map = (Map) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                b97.f fVar3 = (b97.f) this.f10759w;
                ArrayList arrayList7 = new ArrayList(map.size());
                for (Map.Entry entry : map.entrySet()) {
                    GlobalSearchContext context = (GlobalSearchContext) entry.getKey();
                    o97.i preferences = (o97.i) entry.getValue();
                    fVar3.d.getClass();
                    Intrinsics.checkNotNullParameter(context, "context");
                    Intrinsics.checkNotNullParameter(preferences, "preferences");
                    String strName = ((RetailGlobalSearchContext) context).name();
                    Set set = preferences.f223109b;
                    ArrayList arrayList8 = new ArrayList(w.t(set, 10));
                    Iterator it12 = set.iterator();
                    while (it12.hasNext()) {
                        arrayList8.add(((o97.r) ((m0) it12.next())).name());
                    }
                    Set set2 = preferences.f223108a;
                    ArrayList arrayList9 = new ArrayList(w.t(set2, 10));
                    Iterator it13 = set2.iterator();
                    while (it13.hasNext()) {
                        arrayList9.add(((o97.r) ((m0) it13.next())).name());
                    }
                    arrayList7.add(new c97.c(strName, preferences.f223110c, arrayList8, arrayList9));
                }
                fVar3.f13686c.G(arrayList7, "global_search_preferences_v2", kii.e.o(c97.c.class, KTypeProjection.INSTANCE, List.class));
                return Unit.f186387a;
            case 6:
                a0 settings = (a0) this.v;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                b97.f fVar4 = (b97.f) this.f10759w;
                Intrinsics.checkNotNullParameter(settings, "settings");
                c0 c0Var = settings.f223086a;
                c97.l lVar2 = new c97.l(c0Var.f223092a, c0Var.f223093b, c0Var.f223094c);
                o97.t tVar = settings.f223087b;
                s sVar = tVar.f223129a;
                Integer numValueOf = Integer.valueOf(sVar.f223127a);
                o97.p pVar2 = sVar.f223128b;
                c97.m mVar = new c97.m(numValueOf, pVar2 != null ? new c97.o(pVar2.f223125a, pVar2.f223126b) : null);
                ?? r06 = tVar.f223130b;
                LinkedHashMap linkedHashMap = new LinkedHashMap(q0.b(r06.size()));
                for (Map.Entry entry2 : r06.entrySet()) {
                    linkedHashMap.put(((o97.r) ((m0) entry2.getKey())).name(), entry2.getValue());
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(q0.b(linkedHashMap.size()));
                for (Map.Entry entry3 : linkedHashMap.entrySet()) {
                    Object key = entry3.getKey();
                    s sVar2 = (s) entry3.getValue();
                    Integer numValueOf2 = Integer.valueOf(sVar2.f223127a);
                    o97.p pVar3 = sVar2.f223128b;
                    linkedHashMap2.put(key, new c97.m(numValueOf2, pVar3 != null ? new c97.o(pVar3.f223125a, pVar3.f223126b) : null));
                }
                fVar4.f13686c.G(new c97.d(lVar2, new c97.n(mVar, linkedHashMap2)), "global_search_setting_v3", wim.z.d(o0.b(c97.d.class)));
                return Unit.f186387a;
            case 7:
                List list2 = (List) this.v;
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                l lVar3 = (l) this.f10759w;
                ue0.c cVar5 = lVar3.f13695b;
                List<j97.a> list3 = list2;
                ArrayList arrayList10 = new ArrayList(w.t(list3, 10));
                for (j97.a aVar10 : list3) {
                    Intrinsics.checkNotNullParameter(aVar10, "<this>");
                    arrayList10.add(new c97.j(aVar10.f172309a, aVar10.f172310b));
                }
                Type recordsType = lVar3.f;
                Intrinsics.checkNotNullExpressionValue(recordsType, "recordsType");
                cVar5.G(arrayList10, "global_search_recent_queries_v1", recordsType);
                return Unit.f186387a;
            case 8:
                ta.j domain = (ta.j) this.v;
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                bb.b bVar = (bb.b) this.f10759w;
                ue0.c cVar6 = bVar.f14119a;
                bVar.f14120b.getClass();
                Intrinsics.checkNotNullParameter(domain, "domain");
                String str7 = domain.f269075a;
                ta.b bVar2 = domain.f;
                String str8 = domain.f269076b;
                boolean z4 = domain.f269077c;
                boolean z6 = domain.d;
                ArrayList arrayList11 = domain.e;
                int i3 = 10;
                ArrayList arrayList12 = new ArrayList(w.t(arrayList11, 10));
                Iterator it14 = arrayList11.iterator();
                while (it14.hasNext()) {
                    ta.i iVar = (ta.i) it14.next();
                    String str9 = iVar.f269073a;
                    ArrayList arrayList13 = iVar.f269074b;
                    ArrayList arrayList14 = new ArrayList(w.t(arrayList13, i3));
                    Iterator it15 = arrayList13.iterator();
                    while (it15.hasNext()) {
                        ta.h hVar = (ta.h) it15.next();
                        String str10 = hVar.f269070a;
                        String strName2 = hVar.f269071b.name();
                        String str11 = hVar.f269072c;
                        Iterator it16 = it14;
                        ArrayList arrayList15 = hVar.e;
                        Iterator it17 = it15;
                        String str12 = str7;
                        String str13 = str8;
                        ArrayList arrayList16 = new ArrayList(w.t(arrayList15, 10));
                        for (Iterator it18 = arrayList15.iterator(); it18.hasNext(); it18 = it18) {
                            ta.g gVar = (ta.g) it18.next();
                            arrayList16.add(new ab.g(gVar.f269068a, gVar.f269069b.name()));
                        }
                        arrayList14.add(new ab.d(str10, strName2, str11, hVar.d, arrayList16));
                        it14 = it16;
                        it15 = it17;
                        str7 = str12;
                        str8 = str13;
                    }
                    arrayList12.add(new ab.e(str9, arrayList14));
                    it14 = it14;
                    i3 = 10;
                }
                String str14 = str7;
                String str15 = str8;
                ab.a aVar12 = new ab.a(bVar2.f269062a.name(), bVar2.f269063b);
                ta.d dVar = domain.f269078g;
                if (dVar != null) {
                    ArrayList<ta.c> arrayList17 = dVar.f269066a;
                    ArrayList arrayList18 = new ArrayList(w.t(arrayList17, 10));
                    for (ta.c cVar7 : arrayList17) {
                        arrayList18.add(new ab.b(cVar7.f269064a, cVar7.f269065b));
                    }
                    cVar2 = new ab.c(dVar.f269067b, arrayList18);
                } else {
                    cVar2 = null;
                }
                cVar6.G(new ab.f(str14, str15, z4, z6, arrayList12, aVar12, cVar2), "USER_DETAILS_STORAGE_KEY", wim.z.d(o0.b(ab.f.class)));
                return Unit.f186387a;
            case 9:
                xck.b bVar3 = (xck.b) this.v;
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ue0.c cVar8 = ((bdk.c) this.f10759w).f14610c;
                Intrinsics.checkNotNullParameter(bVar3, "<this>");
                ArrayList arrayList19 = bVar3.f304142a;
                ArrayList arrayList20 = new ArrayList(w.t(arrayList19, 10));
                Iterator it19 = arrayList19.iterator();
                while (it19.hasNext()) {
                    xck.a aVar14 = (xck.a) it19.next();
                    String str16 = aVar14.f304139a;
                    String str17 = aVar14.f304140b;
                    String str18 = aVar14.f304141c;
                    RewardInfo rewardInfo = aVar14.d;
                    String str19 = rewardInfo.f102531a;
                    String str20 = rewardInfo.f102532b;
                    String str21 = rewardInfo.f102533c;
                    ArrayList arrayList21 = rewardInfo.d;
                    Iterator it20 = it19;
                    ArrayList arrayList22 = new ArrayList(w.t(arrayList21, 10));
                    for (Iterator it21 = arrayList21.iterator(); it21.hasNext(); it21 = it21) {
                        RewardInfoItem rewardInfoItem = (RewardInfoItem) it21.next();
                        arrayList22.add(new h1(rewardInfoItem.f102534a, rewardInfoItem.f102535b));
                    }
                    arrayList20.add(new adk.f(str16, str17, str18, new e1(str19, str20, str21, rewardInfo.e, rewardInfo.f, arrayList22)));
                    it19 = it20;
                }
                ArrayList<AdditionalReward> arrayList23 = bVar3.f304143b;
                ArrayList arrayList24 = new ArrayList(w.t(arrayList23, 10));
                for (AdditionalReward additionalReward : arrayList23) {
                    arrayList24.add(new adk.c(additionalReward.f102522a, additionalReward.f102523b));
                }
                String string = bVar3.f304144c.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                cVar8.G(new adk.i(string, bVar3.d, bVar3.e, bVar3.f, arrayList20, arrayList24), "MILESTONE_REWARDS_KEY", wim.z.d(o0.b(adk.i.class)));
                return Unit.f186387a;
            case 10:
                xck.m mVar2 = (xck.m) this.v;
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ue0.c cVar9 = ((bdk.f) this.f10759w).f14614c;
                Intrinsics.checkNotNullParameter(mVar2, "<this>");
                String str22 = mVar2.f304168a;
                String str23 = mVar2.f304169b;
                Instant instant = mVar2.f304170c;
                String string2 = instant != null ? instant.toString() : null;
                Integer num3 = mVar2.d;
                String strName3 = mVar2.e.name();
                ArrayList<xck.i> arrayList25 = mVar2.f;
                ArrayList arrayList26 = new ArrayList(w.t(arrayList25, 10));
                for (xck.i iVar2 : arrayList25) {
                    xck.d dVar2 = iVar2.f304157a;
                    arrayList26.add(new l0(dVar2 != null ? new adk.s(dVar2.f304148a, dVar2.f304149b) : null, iVar2.f304158b, iVar2.f304159c, iVar2.d, xam.a.x(iVar2.e)));
                }
                xck.f fVar5 = mVar2.f304171g;
                String str24 = fVar5.f304150a;
                ArrayList<xck.j> arrayList27 = fVar5.f304151b;
                ArrayList arrayList28 = new ArrayList(w.t(arrayList27, 10));
                for (xck.j jVar2 : arrayList27) {
                    arrayList28.add(new adk.o0(jVar2.f304160a, jVar2.f304161b, jVar2.f304162c, xam.a.x(jVar2.d)));
                }
                adk.c0 c0Var2 = new adk.c0(str24, arrayList28);
                xck.g gVar2 = mVar2.f304172h;
                String str25 = gVar2.f304152a;
                ArrayList<xck.j> arrayList29 = gVar2.f304153b;
                ArrayList arrayList30 = new ArrayList(w.t(arrayList29, 10));
                for (xck.j jVar3 : arrayList29) {
                    arrayList30.add(new adk.o0(jVar3.f304160a, jVar3.f304161b, jVar3.f304162c, xam.a.x(jVar3.d)));
                }
                f0 f0Var = new f0(str25, arrayList30);
                xck.k kVar2 = mVar2.i;
                if (kVar2 != null) {
                    String str26 = kVar2.f304163a;
                    ArrayList<xck.l> arrayList31 = kVar2.f304164b;
                    ArrayList arrayList32 = new ArrayList(w.t(arrayList31, 10));
                    for (xck.l lVar4 : arrayList31) {
                        arrayList32.add(new u0(lVar4.f304165a, lVar4.f304166b, lVar4.f304167c, lVar4.e, lVar4.d));
                        str22 = str22;
                    }
                    str = str22;
                    r0Var = new r0(str26, arrayList32);
                } else {
                    str = str22;
                    r0Var = null;
                }
                List list4 = mVar2.f304173j;
                if (list4 != null) {
                    List list5 = list4;
                    ArrayList arrayList33 = new ArrayList(w.t(list5, 10));
                    for (Iterator it22 = list5.iterator(); it22.hasNext(); it22 = it22) {
                        xck.h hVar2 = (xck.h) it22.next();
                        arrayList33.add(new i0(hVar2.f304154a, hVar2.f304155b, hVar2.f304156c, hVar2.d, hVar2.e, xam.a.x(hVar2.f)));
                    }
                    arrayList = arrayList33;
                } else {
                    arrayList = null;
                }
                String str27 = mVar2.k;
                String str28 = mVar2.f304174l;
                String str29 = mVar2.f304175m;
                xck.d dVar3 = mVar2.f304176n;
                adk.s sVar3 = dVar3 != null ? new adk.s(dVar3.f304148a, dVar3.f304149b) : null;
                xck.c cVar10 = mVar2.o;
                cVar9.G(new v0(str, str23, string2, num3, strName3, arrayList26, c0Var2, f0Var, r0Var, arrayList, str27, str28, str29, sVar3, cVar10 != null ? new adk.p(cVar10.f304145a, cVar10.f304146b, cVar10.f304147c) : null, mVar2.f304177p), "MONTHLY_DRAW_HUB_KEY", wim.z.d(o0.b(v0.class)));
                return Unit.f186387a;
            case 11:
                List list6 = (List) this.v;
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                b0 b0Var = com.revolut.feature.tab.invest.impl.ui.home.f.Companion;
                InvestTabContext.a aVarNewBuilder = InvestTabContext.newBuilder();
                List list7 = list6;
                Iterator it23 = list7.iterator();
                while (true) {
                    if (it23.hasNext()) {
                        next = it23.next();
                        if (((WealthAccount) next) instanceof WealthAccount.Commodities) {
                        }
                    } else {
                        next = null;
                    }
                }
                WealthAccount wealthAccount = (WealthAccount) next;
                he heVarU = ngm.n.u(wealthAccount != null ? wealthAccount.getF95255c() : null);
                aVarNewBuilder.c();
                ((InvestTabContext) aVarNewBuilder.f49761b).setCommoditiesStatus(heVarU);
                Iterator it24 = list7.iterator();
                while (true) {
                    if (it24.hasNext()) {
                        next2 = it24.next();
                        if (((WealthAccount) next2) instanceof WealthAccount.Robo) {
                        }
                    } else {
                        next2 = null;
                    }
                }
                WealthAccount wealthAccount2 = (WealthAccount) next2;
                he heVarU2 = ngm.n.u(wealthAccount2 != null ? wealthAccount2.getF95255c() : null);
                aVarNewBuilder.c();
                ((InvestTabContext) aVarNewBuilder.f49761b).setRoboStatus(heVarU2);
                Iterator it25 = list7.iterator();
                while (true) {
                    if (it25.hasNext()) {
                        next3 = it25.next();
                        if (((WealthAccount) next3) instanceof WealthAccount.Securities) {
                        }
                    } else {
                        next3 = null;
                    }
                }
                WealthAccount wealthAccount3 = (WealthAccount) next3;
                he heVarU3 = ngm.n.u(wealthAccount3 != null ? wealthAccount3.getF95255c() : null);
                aVarNewBuilder.c();
                ((InvestTabContext) aVarNewBuilder.f49761b).setStocksStatus(heVarU3);
                Iterator it26 = list7.iterator();
                while (true) {
                    if (it26.hasNext()) {
                        next4 = it26.next();
                        if (((WealthAccount) next4) instanceof WealthAccount.Margin) {
                        }
                    } else {
                        next4 = null;
                    }
                }
                WealthAccount wealthAccount4 = (WealthAccount) next4;
                he heVarU4 = ngm.n.u(wealthAccount4 != null ? wealthAccount4.getF95255c() : null);
                aVarNewBuilder.c();
                ((InvestTabContext) aVarNewBuilder.f49761b).setCfdStatus(heVarU4);
                AnalyticsContext.Companion companion3 = AnalyticsContext.INSTANCE;
                w0 w0VarA = aVarNewBuilder.a();
                companion3.getClass();
                return new AnalyticsContext(AnalyticsContext.Companion.a(w0VarA));
            case 12:
                List list8 = (List) this.v;
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ue0.c cVar11 = ((bsc.b) this.f10759w).f18158a;
                List<TrustedCompanyBeneficiary> list9 = list8;
                ArrayList arrayList34 = new ArrayList(w.t(list9, 10));
                for (TrustedCompanyBeneficiary trustedCompanyBeneficiary : list9) {
                    Intrinsics.checkNotNullParameter(trustedCompanyBeneficiary, "<this>");
                    arrayList34.add(new asc.l(trustedCompanyBeneficiary.f85335a));
                }
                cVar11.G(arrayList34, "CRYPTO_TRUSTED_BENEFICIARIES_STORAGE_KEY", kii.e.o(asc.l.class, KTypeProjection.INSTANCE, List.class));
                return Unit.f186387a;
            case 13:
                Set set3 = (Set) this.v;
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((bva.d) this.f10759w).f18976b.G(set3, "HIDDEN_PAYMENT_IDS", kii.e.o(String.class, KTypeProjection.INSTANCE, Set.class));
                return Unit.f186387a;
            case 14:
                VoucherProductGroupResponse voucherProductGroupResponse = (VoucherProductGroupResponse) this.v;
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ue0.c cVar12 = ((p) this.f10759w).f19306c;
                Intrinsics.checkNotNullParameter(voucherProductGroupResponse, "<this>");
                List list10 = voucherProductGroupResponse.f83651a;
                ArrayList<VoucherProductGroup> arrayList35 = voucherProductGroupResponse.f83652b;
                ArrayList arrayList36 = new ArrayList(w.t(arrayList35, 10));
                for (VoucherProductGroup voucherProductGroup : arrayList35) {
                    Intrinsics.checkNotNullParameter(voucherProductGroup, "<this>");
                    String str30 = voucherProductGroup.f83642a;
                    String strName4 = voucherProductGroup.f83643b.name();
                    String str31 = voucherProductGroup.f83644c;
                    String str32 = voucherProductGroup.d;
                    RevPoints revPoints = voucherProductGroup.e;
                    arrayList36.add(new ewb.f(str30, strName4, str31, str32, revPoints != null ? Double.valueOf(revPoints.J()) : null, voucherProductGroup.f, voucherProductGroup.f83645g));
                }
                cVar12.G(new ewb.g(arrayList36, list10), "REV_POINTS_GIFTCARDS_VOUCHER_PRODUCT_GROUP_RESPONSE_STORAGE_KEY", wim.z.d(o0.b(ewb.g.class)));
                return Unit.f186387a;
            case 15:
                List cards = (List) this.v;
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ue0.c cVar13 = ((c48.g) this.f10759w).f;
                Intrinsics.checkNotNullParameter(cards, "cards");
                List<n38.a0> list11 = cards;
                int i5 = 10;
                ArrayList arrayList37 = new ArrayList(w.t(list11, 10));
                for (n38.a0 a0Var : list11) {
                    String str33 = a0Var.f211926a;
                    ArrayList<n38.b0> arrayList38 = a0Var.f211927b;
                    ArrayList arrayList39 = new ArrayList(w.t(arrayList38, i5));
                    for (n38.b0 b0Var2 : arrayList38) {
                        arrayList39.add(new a48.g(b0Var2.f211931a, b0Var2.f211932b));
                    }
                    String str34 = a0Var.f211928c;
                    LocalDate localDate = a0Var.d;
                    arrayList37.add(new a48.f(str33, str34, localDate != null ? localDate.toString() : null, a0Var.e, a0Var.f, a0Var.f211929g, arrayList39));
                    i5 = 10;
                }
                cVar13.G(new a48.h(arrayList37), "PARTNER_LINKED_CARDS_CACHE_KEY", wim.z.d(o0.b(a48.h.class)));
                return Unit.f186387a;
            case 16:
                String str35 = (String) this.v;
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                Address addressA = ((c49.d) this.f10759w).d.a(str35);
                if (addressA != null) {
                    return new LocationDomain(addressA.getLatitude(), addressA.getLongitude());
                }
                throw new IllegalStateException("Geocoder couldn't get address");
            case 17:
                se6.e eVar = (se6.e) this.v;
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                cf6.e eVar2 = (cf6.e) this.f10759w;
                try {
                    eVar2.f.G(eVar2.f23566c.d(eVar), "INSTITUTIONS_STORAGE_KEY", wim.z.d(o0.b(af6.b.class)));
                    Unit unit2 = Unit.f186387a;
                    break;
                } catch (Exception e) {
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
                }
                return Unit.f186387a;
            case 18:
                ProductAccountDescriptor$Value productAccountDescriptor$Value = (ProductAccountDescriptor$Value) this.v;
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                String id10 = productAccountDescriptor$Value.getF89727a().getId();
                Intrinsics.checkNotNullParameter(id10, "id");
                return ((com.revolut.feature.tab.accounts.impl.ui.tab.d) this.f10759w).f89708q.Z2(new j49.i(id10, productAccountDescriptor$Value.getF89728b().f89729a));
            case 19:
                DigitizedCards domain2 = (DigitizedCards) this.v;
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ue0.c cVar14 = ((cuc.d) this.f10759w).f108948b;
                Intrinsics.checkNotNullParameter(domain2, "domain");
                List list12 = domain2.f85404a;
                ArrayList arrayList40 = new ArrayList(w.t(list12, 10));
                Iterator it27 = list12.iterator();
                while (it27.hasNext()) {
                    DigitizedCard digitizedCard = (DigitizedCard) it27.next();
                    String str36 = digitizedCard.f85395a;
                    String str37 = digitizedCard.f85396b;
                    Boolean bool2 = digitizedCard.f85397c;
                    long j3 = digitizedCard.d;
                    String strName5 = digitizedCard.e.name();
                    String strName6 = digitizedCard.f.name();
                    String str38 = digitizedCard.f85398g;
                    String strName7 = digitizedCard.i.name();
                    String strName8 = digitizedCard.f85400j.name();
                    String str39 = digitizedCard.k;
                    Iterator it28 = it27;
                    DigitizedCard.Merchant merchant = digitizedCard.f85399h;
                    if (merchant != null) {
                        str2 = str36;
                        lVar = new auc.l(merchant.f85402a, merchant.f85403b);
                    } else {
                        str2 = str36;
                        lVar = null;
                    }
                    qtc.c cVar15 = digitizedCard.f85401l;
                    arrayList40.add(new auc.g(str2, str37, bool2, j3, strName5, strName6, str38, strName7, strName8, str39, lVar, cVar15 != null ? cVar15.name() : null));
                    it27 = it28;
                }
                List<Enrollment> list13 = domain2.f85405b;
                ArrayList arrayList41 = new ArrayList(w.t(list13, 10));
                for (Enrollment enrollment : list13) {
                    arrayList41.add(new auc.j(enrollment.f85408a, enrollment.f85409b, enrollment.f85410c.name(), enrollment.d));
                }
                cVar14.G(new auc.h(arrayList40, arrayList41, new auc.i(domain2.f85406c.f85407a)), "LINKED_WALLETS_KEY", wim.z.d(o0.b(auc.h.class)));
                return Unit.f186387a;
            case 20:
                SecurityDelayInfo securityDelayInfo = (SecurityDelayInfo) this.v;
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((r) this.f10759w).f108968a.G(cuc.i.b(securityDelayInfo), "WEALTH_PROTECTION_SECURITY_DELAY_INFO_KEY", wim.z.d(o0.b(auc.s.class)));
                return Unit.f186387a;
            case 21:
                List list14 = (List) this.v;
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((t) this.f10759w).f108971a.G(list14, "SECURITY_HUB_CHECKLIST_COMPLETION_KEY", kii.e.o(qtc.e.class, KTypeProjection.INSTANCE, List.class));
                return Unit.f186387a;
            case 22:
                List domainList = (List) this.v;
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ue0.c cVar16 = ((z) this.f10759w).f108982a;
                Intrinsics.checkNotNullParameter(domainList, "domainList");
                List list15 = domainList;
                ArrayList arrayList42 = new ArrayList(w.t(list15, 10));
                Iterator it29 = list15.iterator();
                while (it29.hasNext()) {
                    OutboundTransactionLimit outboundTransactionLimit = (OutboundTransactionLimit) it29.next();
                    String strName9 = outboundTransactionLimit.f85475a.name();
                    LimitValue limitValue = outboundTransactionLimit.f85476b;
                    long j5 = limitValue.f85471a;
                    long j16 = outboundTransactionLimit.f85477c.f85471a;
                    xi0.b bVar4 = limitValue.f85472b;
                    String str40 = bVar4 != null ? bVar4.f306286a : null;
                    cuc.g gVar3 = outboundTransactionLimit.d;
                    String strName10 = gVar3 != null ? gVar3.name() : null;
                    String str41 = outboundTransactionLimit.e;
                    String str42 = outboundTransactionLimit.f;
                    String str43 = outboundTransactionLimit.f85478g;
                    String str44 = outboundTransactionLimit.f85479h;
                    String strName11 = outboundTransactionLimit.f85480j.name();
                    List list16 = outboundTransactionLimit.k;
                    if (list16 != null) {
                        List<FeatureItem> list17 = list16;
                        it9 = it29;
                        str3 = str41;
                        j2 = j5;
                        ArrayList arrayList43 = new ArrayList(w.t(list17, 10));
                        for (FeatureItem featureItem : list17) {
                            arrayList43.add(new auc.a(featureItem.f85469a, featureItem.f85470b));
                        }
                        arrayList2 = arrayList43;
                    } else {
                        it9 = it29;
                        str3 = str41;
                        j2 = j5;
                        arrayList2 = null;
                    }
                    LimitValue limitValue2 = outboundTransactionLimit.f85481l;
                    Long lValueOf = limitValue2 != null ? Long.valueOf(limitValue2.f85471a) : null;
                    Integer num4 = outboundTransactionLimit.f85482m;
                    Integer num5 = outboundTransactionLimit.f85483n;
                    String strName12 = outboundTransactionLimit.i.name();
                    boolean z11 = outboundTransactionLimit.o;
                    List list18 = outboundTransactionLimit.f85484p;
                    if (list18 != null) {
                        List list19 = list18;
                        num = num4;
                        num2 = num5;
                        ArrayList arrayList44 = new ArrayList(w.t(list19, 10));
                        Iterator it30 = list19.iterator();
                        while (it30.hasNext()) {
                            OutboundTransactionLimitGroupConfig outboundTransactionLimitGroupConfig = (OutboundTransactionLimitGroupConfig) it30.next();
                            arrayList44.add(new auc.o(outboundTransactionLimitGroupConfig.f85491a, outboundTransactionLimitGroupConfig.f85492b.name(), outboundTransactionLimitGroupConfig.d, outboundTransactionLimitGroupConfig.f85493c));
                            it30 = it30;
                            z11 = z11;
                            j16 = j16;
                        }
                        arrayList3 = arrayList44;
                    } else {
                        num = num4;
                        num2 = num5;
                        arrayList3 = null;
                    }
                    boolean z12 = z11;
                    long j22 = j16;
                    OutboundTransactionLimitDeviceCooldown outboundTransactionLimitDeviceCooldown = outboundTransactionLimit.f85485q;
                    if (outboundTransactionLimitDeviceCooldown != null) {
                        String string3 = outboundTransactionLimitDeviceCooldown.f85489a.toString();
                        Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
                        fVar = new auc.f(string3, oi0.d.R(outboundTransactionLimitDeviceCooldown.f85490b));
                    } else {
                        fVar = null;
                    }
                    Boolean bool3 = outboundTransactionLimit.f85486r;
                    boolean z29 = outboundTransactionLimit.f85488t;
                    String str45 = outboundTransactionLimit.u;
                    ReadOnlyDialog readOnlyDialog = outboundTransactionLimit.f85487s;
                    if (readOnlyDialog != null) {
                        String str46 = readOnlyDialog.f85494a;
                        String str47 = readOnlyDialog.f85495b;
                        ArrayList arrayList45 = readOnlyDialog.f85496c;
                        bool = bool3;
                        z = z29;
                        ArrayList arrayList46 = new ArrayList(w.t(arrayList45, 10));
                        Iterator it31 = arrayList45.iterator();
                        while (it31.hasNext()) {
                            ReadOnlyDialog.Item item = (ReadOnlyDialog.Item) it31.next();
                            arrayList46.add(new p.b(item.f85499a, item.f85500b, item.f85501c));
                            it31 = it31;
                            str45 = str45;
                        }
                        str4 = str45;
                        ReadOnlyDialog.Button button = readOnlyDialog.d;
                        pVar = new auc.p(str46, str47, arrayList46, button != null ? new p.a(button.f85497a, button.f85498b) : null);
                    } else {
                        bool = bool3;
                        z = z29;
                        str4 = str45;
                        pVar = null;
                    }
                    arrayList42.add(new auc.n(strName9, Long.valueOf(j2), Long.valueOf(j22), str40, strName10, str3, str42, str43, str44, strName11, strName12, arrayList2, lValueOf, num, num2, Boolean.valueOf(z12), arrayList3, bool, fVar, pVar, Boolean.valueOf(z), str4));
                    it29 = it9;
                }
                cVar16.G(arrayList42, "TRANSACTIONS_DAY_NIGHT_LIMITS_KEY", kii.e.o(auc.n.class, KTypeProjection.INSTANCE, List.class));
                return Unit.f186387a;
            case 23:
                StreetModeInfo domain3 = (StreetModeInfo) this.v;
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ue0.c cVar17 = ((e0) this.f10759w).f108953a;
                Intrinsics.checkNotNullParameter(domain3, "domain");
                boolean z31 = domain3.f85423a;
                String str48 = domain3.f85424b;
                StreetModeMinimumAmount streetModeMinimumAmount = domain3.f85425c;
                g0 g0Var = new g0(streetModeMinimumAmount.f85426a, streetModeMinimumAmount.f85427b.f306286a);
                ArrayList<StreetModeTrustedLocation> arrayList47 = domain3.d;
                ArrayList arrayList48 = new ArrayList(w.t(arrayList47, 10));
                for (StreetModeTrustedLocation streetModeTrustedLocation : arrayList47) {
                    String str49 = streetModeTrustedLocation.f85428a;
                    String str50 = streetModeTrustedLocation.f85429b;
                    LocationDomain locationDomain = streetModeTrustedLocation.f85430c;
                    arrayList48.add(new auc.m0(locationDomain.f78066a, locationDomain.f78067b, streetModeTrustedLocation.d, str49, str50));
                }
                List list20 = domain3.e;
                if (list20 != null) {
                    List<StreetModeTrustedWifi> list21 = list20;
                    ArrayList arrayList49 = new ArrayList(w.t(list21, 10));
                    for (StreetModeTrustedWifi streetModeTrustedWifi : list21) {
                        String str51 = streetModeTrustedWifi.f85431a;
                        String str52 = streetModeTrustedWifi.f85432b;
                        LocationDomain locationDomain2 = streetModeTrustedWifi.f85433c;
                        arrayList49.add(new s0(str51, str52, locationDomain2.f78066a, locationDomain2.f78067b));
                    }
                    arrayList4 = arrayList49;
                } else {
                    arrayList4 = null;
                }
                List list22 = domain3.f;
                if (list22 != null) {
                    List list23 = list22;
                    ArrayList arrayList50 = new ArrayList(w.t(list23, 10));
                    Iterator it32 = list23.iterator();
                    while (it32.hasNext()) {
                        StreetModeDelayDuration streetModeDelayDuration = (StreetModeDelayDuration) it32.next();
                        String str53 = streetModeDelayDuration.f85418a;
                        String str54 = streetModeDelayDuration.f85419b;
                        String str55 = streetModeDelayDuration.f85420c;
                        String str56 = streetModeDelayDuration.d;
                        StreetModeDelayDurationDisclaimer streetModeDelayDurationDisclaimer = streetModeDelayDuration.e;
                        if (streetModeDelayDurationDisclaimer != null) {
                            it10 = it32;
                            xVar = new auc.x(streetModeDelayDurationDisclaimer.f85421a, streetModeDelayDurationDisclaimer.f85422b);
                        } else {
                            it10 = it32;
                            xVar = null;
                        }
                        arrayList50.add(new auc.a0(str53, str54, str55, str56, xVar, streetModeDelayDuration.f));
                        it32 = it10;
                    }
                    arrayList5 = arrayList50;
                } else {
                    arrayList5 = null;
                }
                cVar17.G(new d0(z31, str48, g0Var, arrayList48, arrayList4, arrayList5), "STREET_MODE_INFO_KEY", wim.z.d(o0.b(d0.class)));
                return Unit.f186387a;
            case 24:
                Throwable th11 = (Throwable) this.v;
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                boolean z41 = (th11 instanceof Exception) && !(th11 instanceof RuntimeException);
                com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.g gVar4 = (com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.g) this.f10759w;
                gVar4.H2(gVar4.T, new k1(z41, th11));
                if (z41) {
                    return Unit.f186387a;
                }
                throw th11;
            case 25:
                return b(obj2);
            case 26:
                return c(obj2);
            case 27:
                return n(obj2);
            case 28:
                return o(obj2);
            default:
                pdh.c cVar18 = (pdh.c) this.v;
                doc.d dVar4 = (doc.d) this.f10759w;
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                return new Pair(cVar18, dVar4);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(n nVar, hxf.c cVar, Continuation continuation) {
        super(3, continuation);
        this.u = 2;
        this.v = nVar;
        this.f10759w = cVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Object obj2, Continuation continuation, int i) {
        super(3, continuation);
        this.u = i;
        this.f10759w = obj2;
    }
}
