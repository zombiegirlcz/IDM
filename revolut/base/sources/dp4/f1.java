package dp4;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.cards_core.R$string;
import com.revolut.feature.credit.card.api.models.creditcard.CreditCardSecurityDeposit;
import com.revolut.feature.junior_remote_login.api.model.RemoteLoginInvitation;
import com.revolut.feature.payments.splitbill.models.splitbilllink.SplitBillLinkDetails;
import com.revolut.feature.store.api.model.StoreAvailabilitySchedule;
import com.revolut.feature.store.api.model.StoreCampaignOffer;
import com.revolut.feature.store.api.model.StoreDealsComponent;
import com.revolut.feature.store.api.model.StoreDealsLayout;
import com.revolut.feature.store.api.model.StoreDealsTile;
import com.revolut.feature.store.api.model.StoreExclusivesFiltersResponse;
import com.revolut.feature.store.api.model.StoreGeoPoint;
import com.revolut.feature.store.api.model.StoreLogoBadge;
import com.revolut.feature.store.api.model.StoreMapBox;
import com.revolut.feature.store.api.model.StoreMegaFilter;
import com.revolut.feature.store.api.model.StoreMegaFiltersResponse;
import com.revolut.feature.store.api.model.StoreMegaOffer;
import com.revolut.feature.store.api.model.StoreMegaOfferListItem;
import com.revolut.feature.store.api.model.StoreMegaOffersResponse;
import com.revolut.feature.store.api.model.StoreMegaQuickFilter;
import com.revolut.feature.store.api.model.StoreOutlet;
import com.revolut.feature.store.api.model.StoreTimeInterval;
import f2e.g2;
import f2e.g5;
import f2e.h3;
import f2e.j2;
import f2e.k3;
import f2e.n3;
import f2e.o2;
import f2e.p2;
import f2e.q3;
import f2e.s2;
import f2e.u1;
import f2e.w3;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;
import mx0.pc;

/* JADX INFO: loaded from: classes22.dex */
public final class f1 extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f116643w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f116644x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f1(Object obj2, Continuation continuation, int i) {
        super(3, continuation);
        this.u = i;
        this.f116644x = obj2;
    }

    private final Object b(Object obj2) {
        RowDelegate.Model modelB;
        pc pcVarC;
        do3.n user = (do3.n) this.v;
        List list = (List) this.f116643w;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        g23.o oVar = (g23.o) this.f116644x;
        g23.l0 l0Var = oVar.f139821m;
        List list2 = list;
        ArrayList arrayList = new ArrayList();
        for (Object obj3 : list2) {
            if (obj3 instanceof e93.e) {
                arrayList.add(obj3);
            }
        }
        ArrayList cardDesigns = new ArrayList();
        for (Object obj4 : arrayList) {
            if (!ce9.m.s((e93.e) obj4)) {
                cardDesigns.add(obj4);
            }
        }
        ArrayList cardDesigns2 = new ArrayList();
        for (Object obj5 : list2) {
            if (obj5 instanceof e93.d) {
                cardDesigns2.add(obj5);
            }
        }
        Intrinsics.checkNotNullParameter(cardDesigns2, "cardDesigns");
        Intrinsics.checkNotNullParameter(user, "user");
        pc pcVarC2 = null;
        if (cardDesigns2.isEmpty()) {
            modelB = null;
        } else {
            boolean zY = hx7.i.y(cardDesigns2);
            g23.l0 l0Var2 = oVar.f139821m;
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.card_order_physical_title, null, null, 14);
            wi0.b.Companion.getClass();
            TextLocalisedClause textLocalisedClause2 = te0.w.S(user, wi0.b.M0) ? new TextLocalisedClause(R$string.card_order_physical_debit_subtitle, null, null, 14) : new TextLocalisedClause(R$string.card_order_physical_subtitle, null, null, 14);
            int i = R$drawable.uikit_icn_24_card;
            int i2 = R$attr.uikit_colorDeepGrey;
            if (zY) {
                l0Var.getClass();
                pcVarC = g23.l0.c();
            } else {
                pcVarC = null;
            }
            modelB = g23.l0.b(l0Var2, "NEW_CRYPTO_PHYSICAL_CARD_LIST_ID", textLocalisedClause, textLocalisedClause2, i, i2, zhm.v.l(pcVarC), 192);
        }
        Intrinsics.checkNotNullParameter(cardDesigns, "cardDesigns");
        Intrinsics.checkNotNullParameter(user, "user");
        boolean zY2 = hx7.i.y(cardDesigns);
        g23.l0 l0Var3 = oVar.f139821m;
        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.card_order_virtual_crypto_title, null, null, 14);
        wi0.b.Companion.getClass();
        TextLocalisedClause textLocalisedClause4 = te0.w.S(user, wi0.b.M0) ? new TextLocalisedClause(R$string.card_order_virtual_debit_subtitle_crypto, null, null, 14) : new TextLocalisedClause(R$string.card_order_crypto_virtual_card_description, null, null, 14);
        int i3 = R$drawable.uikit_icn_24_smartphone;
        int i5 = R$attr.uikit_colorDeepGrey;
        if (zY2) {
            l0Var.getClass();
            pcVarC2 = g23.l0.c();
        }
        koi.j[] elements = {modelB, g23.l0.b(l0Var3, "NEW_CRYPTO_VIRTUAL_CARD_LIST_ID", textLocalisedClause3, textLocalisedClause4, i3, i5, zhm.v.l(pcVarC2), 192)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return kotlin.collections.d.L(elements);
    }

    private final Object c(Object obj2) {
        g2e.k kVar = (g2e.k) this.v;
        StoreMegaOffersResponse storeMegaOffersResponse = (StoreMegaOffersResponse) this.f116643w;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        g2e.r rVar = (g2e.r) this.f116644x;
        if (g2e.r.a(rVar, kVar)) {
            ue0.c cVar = rVar.f140023c;
            String str = "STORE_MEGA_OFFERS_STORAGE_KEY_" + g2e.r.e(kVar);
            Intrinsics.checkNotNullParameter(storeMegaOffersResponse, "<this>");
            ArrayList<StoreMegaOfferListItem> arrayList = storeMegaOffersResponse.f88564a;
            ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
            for (StoreMegaOfferListItem storeMegaOfferListItem : arrayList) {
                Intrinsics.checkNotNullParameter(storeMegaOfferListItem, "<this>");
                String str2 = storeMegaOfferListItem.f88561a;
                String str3 = storeMegaOfferListItem.f88562b;
                String str4 = storeMegaOfferListItem.f88563c;
                String str5 = storeMegaOfferListItem.d;
                StoreLogoBadge storeLogoBadge = storeMegaOfferListItem.e;
                h3 h3VarB = null;
                g2 g2VarG = storeLogoBadge != null ? g4i.a.G(storeLogoBadge) : null;
                StoreMegaOffer storeMegaOffer = storeMegaOfferListItem.f;
                if (storeMegaOffer != null) {
                    h3VarB = d2e.j.b(storeMegaOffer);
                }
                arrayList2.add(new k3(str2, str3, str4, str5, g2VarG, h3VarB));
            }
            cVar.G(new n3(arrayList2), str, wim.z.d(kotlin.jvm.internal.o0.b(n3.class)));
        }
        return Unit.f186387a;
    }

    private final Object n(Object obj2) {
        ArrayList arrayList;
        String lowerCase;
        String strName;
        String lowerCase2;
        String strName2;
        g2e.j jVar = (g2e.j) this.v;
        StoreMegaFiltersResponse storeMegaFiltersResponse = (StoreMegaFiltersResponse) this.f116643w;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        ue0.c cVar = ((g2e.r) this.f116644x).f140023c;
        String str = "STORE_MEGA_OFFERS_FILTERS_STORAGE_KEY" + g2e.r.d(jVar);
        Intrinsics.checkNotNullParameter(storeMegaFiltersResponse, "<this>");
        ArrayList<StoreMegaFilter> arrayList2 = storeMegaFiltersResponse.f88545a;
        int i = 10;
        ArrayList arrayList3 = new ArrayList(zhm.w.t(arrayList2, 10));
        for (StoreMegaFilter storeMegaFilter : arrayList2) {
            Intrinsics.checkNotNullParameter(storeMegaFilter, "<this>");
            String str2 = storeMegaFilter.f88537a;
            String str3 = storeMegaFilter.f88538b;
            ArrayList<StoreMegaFilter.StoreMegaFilterValue> arrayList4 = storeMegaFilter.f88539c;
            ArrayList arrayList5 = new ArrayList(zhm.w.t(arrayList4, i));
            for (StoreMegaFilter.StoreMegaFilterValue storeMegaFilterValue : arrayList4) {
                String str4 = storeMegaFilterValue.f88540a;
                String str5 = storeMegaFilterValue.f88541b;
                t1e.x xVar = storeMegaFilterValue.f88542c;
                if (xVar == null || (strName2 = xVar.name()) == null) {
                    lowerCase2 = null;
                } else {
                    lowerCase2 = strName2.toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
                }
                arrayList5.add(new o2(str4, str5, lowerCase2));
            }
            arrayList3.add(new p2(str2, str3, arrayList5));
            i = 10;
        }
        List list = storeMegaFiltersResponse.f88546b;
        if (list != null) {
            List<StoreMegaQuickFilter> list2 = list;
            ArrayList arrayList6 = new ArrayList(zhm.w.t(list2, 10));
            for (StoreMegaQuickFilter storeMegaQuickFilter : list2) {
                Intrinsics.checkNotNullParameter(storeMegaQuickFilter, "<this>");
                String str6 = storeMegaQuickFilter.f88565a;
                String str7 = storeMegaQuickFilter.f88566b;
                t1e.x xVar2 = storeMegaQuickFilter.f88567c;
                if (xVar2 == null || (strName = xVar2.name()) == null) {
                    lowerCase = null;
                } else {
                    lowerCase = strName.toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                }
                arrayList6.add(new q3(str6, str7, lowerCase));
            }
            arrayList = arrayList6;
        } else {
            arrayList = null;
        }
        cVar.G(new s2(arrayList3, arrayList), str, wim.z.d(kotlin.jvm.internal.o0.b(s2.class)));
        return Unit.f186387a;
    }

    private final Object o(Object obj2) {
        Iterator it8;
        f2e.p0 p0Var;
        g2e.v vVar = (g2e.v) this.v;
        StoreDealsLayout storeDealsLayout = (StoreDealsLayout) this.f116643w;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        String strQ = j6.a.q("STORE_DEALS_LAYOUT_STORAGE_KEY_", g2e.c0.b(vVar));
        ue0.c cVar = ((g2e.c0) this.f116644x).f139978c;
        Intrinsics.checkNotNullParameter(storeDealsLayout, "<this>");
        ArrayList arrayList = storeDealsLayout.f88485a;
        int i = 10;
        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
        Iterator it9 = arrayList.iterator();
        while (it9.hasNext()) {
            StoreDealsComponent storeDealsComponent = (StoreDealsComponent) it9.next();
            Intrinsics.checkNotNullParameter(storeDealsComponent, "<this>");
            if (storeDealsComponent instanceof StoreDealsComponent.HeroCarousel) {
                StoreDealsComponent.HeroCarousel heroCarousel = (StoreDealsComponent.HeroCarousel) storeDealsComponent;
                String str = heroCarousel.f88474a;
                ArrayList arrayList3 = heroCarousel.f88475b;
                ArrayList arrayList4 = new ArrayList(zhm.w.t(arrayList3, i));
                Iterator it10 = arrayList3.iterator();
                while (it10.hasNext()) {
                    arrayList4.add(d2e.f.e((StoreDealsTile) it10.next()));
                }
                p0Var = new f2e.p0(str, "HERO_CAROUSEL", (String) null, arrayList4, (j2) null, (ArrayList) null, (ArrayList) null, 116);
            } else if (storeDealsComponent instanceof StoreDealsComponent.LogosGrid) {
                StoreDealsComponent.LogosGrid logosGrid = (StoreDealsComponent.LogosGrid) storeDealsComponent;
                String str2 = logosGrid.f88476a;
                String str3 = logosGrid.f88477b;
                ArrayList arrayList5 = logosGrid.f88478c;
                ArrayList arrayList6 = new ArrayList(zhm.w.t(arrayList5, i));
                Iterator it11 = arrayList5.iterator();
                while (it11.hasNext()) {
                    arrayList6.add(d2e.f.e((StoreDealsTile) it11.next()));
                }
                p0Var = new f2e.p0(str2, "LOGOS_GRID", str3, arrayList6, (j2) null, (ArrayList) null, (ArrayList) null, 112);
            } else if (storeDealsComponent instanceof StoreDealsComponent.RegularCarousel) {
                StoreDealsComponent.RegularCarousel regularCarousel = (StoreDealsComponent.RegularCarousel) storeDealsComponent;
                String str4 = regularCarousel.f88479a;
                String str5 = regularCarousel.f88480b;
                ArrayList arrayList7 = regularCarousel.f88481c;
                ArrayList arrayList8 = new ArrayList(zhm.w.t(arrayList7, i));
                Iterator it12 = arrayList7.iterator();
                while (it12.hasNext()) {
                    arrayList8.add(d2e.f.e((StoreDealsTile) it12.next()));
                }
                p0Var = new f2e.p0(str4, "REGULAR_CAROUSEL", str5, arrayList8, (j2) null, (ArrayList) null, (ArrayList) null, 112);
            } else if (storeDealsComponent instanceof StoreDealsComponent.DiscoverMore) {
                StoreDealsComponent.DiscoverMore discoverMore = (StoreDealsComponent.DiscoverMore) storeDealsComponent;
                String str6 = discoverMore.f88471a;
                String str7 = discoverMore.f88472b;
                ArrayList arrayList9 = discoverMore.f88473c;
                ArrayList arrayList10 = new ArrayList(zhm.w.t(arrayList9, i));
                Iterator it13 = arrayList9.iterator();
                while (it13.hasNext()) {
                    arrayList10.add(d2e.f.e((StoreDealsTile) it13.next()));
                }
                p0Var = new f2e.p0(str6, "DISCOVER_MORE", str7, arrayList10, (j2) null, (ArrayList) null, (ArrayList) null, 112);
            } else {
                if (!(storeDealsComponent instanceof StoreDealsComponent.RewardsNearby)) {
                    throw new NoWhenBranchMatchedException();
                }
                StoreDealsComponent.RewardsNearby rewardsNearby = (StoreDealsComponent.RewardsNearby) storeDealsComponent;
                String str8 = rewardsNearby.f88482a;
                String str9 = rewardsNearby.f88483b;
                StoreMapBox storeMapBox = rewardsNearby.f88484c;
                Intrinsics.checkNotNullParameter(storeMapBox, "<this>");
                StoreGeoPoint storeGeoPoint = storeMapBox.f88535a;
                Intrinsics.checkNotNullParameter(storeGeoPoint, "<this>");
                u1 u1Var = new u1(storeGeoPoint.f88525a, storeGeoPoint.f88526b);
                StoreGeoPoint storeGeoPoint2 = storeMapBox.f88536b;
                Intrinsics.checkNotNullParameter(storeGeoPoint2, "<this>");
                String str10 = str9;
                j2 j2Var = new j2(u1Var, new u1(storeGeoPoint2.f88525a, storeGeoPoint2.f88526b));
                ArrayList arrayList11 = rewardsNearby.d;
                ArrayList arrayList12 = new ArrayList(zhm.w.t(arrayList11, 10));
                Iterator it14 = arrayList11.iterator();
                while (it14.hasNext()) {
                    StoreOutlet storeOutlet = (StoreOutlet) it14.next();
                    Intrinsics.checkNotNullParameter(storeOutlet, "<this>");
                    String str11 = storeOutlet.f88570a;
                    String str12 = storeOutlet.f88571b;
                    StoreGeoPoint storeGeoPoint3 = storeOutlet.f88572c;
                    Intrinsics.checkNotNullParameter(storeGeoPoint3, "<this>");
                    String str13 = str10;
                    j2 j2Var2 = j2Var;
                    u1 u1Var2 = new u1(storeGeoPoint3.f88525a, storeGeoPoint3.f88526b);
                    Long l2 = storeOutlet.d;
                    String str14 = storeOutlet.e;
                    ArrayList arrayList13 = storeOutlet.f;
                    ArrayList arrayList14 = new ArrayList(zhm.w.t(arrayList13, 10));
                    Iterator it15 = arrayList13.iterator();
                    while (it15.hasNext()) {
                        StoreAvailabilitySchedule storeAvailabilitySchedule = (StoreAvailabilitySchedule) it15.next();
                        Intrinsics.checkNotNullParameter(storeAvailabilitySchedule, "<this>");
                        List list = storeAvailabilitySchedule.f88425a;
                        Iterator it16 = it9;
                        ArrayList arrayList15 = storeAvailabilitySchedule.f88426b;
                        Iterator it17 = it14;
                        Iterator it18 = it15;
                        Long l3 = l2;
                        ArrayList arrayList16 = new ArrayList(zhm.w.t(arrayList15, 10));
                        for (Iterator it19 = arrayList15.iterator(); it19.hasNext(); it19 = it19) {
                            StoreTimeInterval storeTimeInterval = (StoreTimeInterval) it19.next();
                            Intrinsics.checkNotNullParameter(storeTimeInterval, "<this>");
                            arrayList16.add(new g5(storeTimeInterval.f88606a, storeTimeInterval.f88607b));
                        }
                        arrayList14.add(new f2e.h(list, storeAvailabilitySchedule.f88427c, arrayList16));
                        it15 = it18;
                        l2 = l3;
                        it9 = it16;
                        it14 = it17;
                    }
                    arrayList12.add(new w3(str11, str12, u1Var2, l2, str14, arrayList14));
                    j2Var = j2Var2;
                    str10 = str13;
                    it9 = it9;
                }
                it8 = it9;
                String str15 = str10;
                j2 j2Var3 = j2Var;
                ArrayList arrayList17 = rewardsNearby.e;
                ArrayList arrayList18 = new ArrayList(zhm.w.t(arrayList17, 10));
                Iterator it20 = arrayList17.iterator();
                while (it20.hasNext()) {
                    arrayList18.add(d9.t0.A((StoreCampaignOffer) it20.next()));
                }
                p0Var = new f2e.p0(str8, "REWARDS_NEARBY", str15, (ArrayList) null, j2Var3, arrayList12, arrayList18, 8);
                arrayList2.add(p0Var);
                it9 = it8;
                i = 10;
            }
            it8 = it9;
            arrayList2.add(p0Var);
            it9 = it8;
            i = 10;
        }
        cVar.G(new f2e.s0(arrayList2), strQ, wim.z.d(kotlin.jvm.internal.o0.b(f2e.s0.class)));
        g2e.c0 c0Var = (g2e.c0) this.f116644x;
        synchronized (c0Var) {
            try {
                Collection collection = (List) c0Var.f139978c.T2("STORE_DEALS_LAYOUT_STORAGE_KEY_INDEX", g2e.c0.f139975h);
                if (collection == null) {
                    collection = zhm.f0.f322471a;
                }
                ArrayList arrayListF1 = zhm.d0.f1(collection);
                arrayListF1.remove(strQ);
                arrayListF1.add(strQ);
                if (arrayListF1.size() > 10) {
                    c0Var.f139978c.I0((String) arrayListF1.remove(0));
                }
                ue0.c cVar2 = c0Var.f139978c;
                KTypeProjection.Companion companion = KTypeProjection.INSTANCE;
                KType kTypeB = kotlin.jvm.internal.o0.b(String.class);
                companion.getClass();
                cVar2.G(arrayListF1, "STORE_DEALS_LAYOUT_STORAGE_KEY_INDEX", wim.z.d(kotlin.jvm.internal.o0.f186429a.d(kotlin.jvm.internal.o0.c(List.class, KTypeProjection.Companion.a(kTypeB)))));
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return Unit.f186387a;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        switch (this.u) {
            case 0:
                f1 f1Var = new f1((a5h.g) this.f116644x, (Continuation) obj4, 0);
                f1Var.v = (cp4.k0) obj2;
                f1Var.f116643w = (CreditCardSecurityDeposit) obj3;
                return f1Var.invokeSuspend(Unit.f186387a);
            case 1:
                f1 f1Var2 = new f1((dwd.a) this.f116644x, (Continuation) obj4, 1);
                f1Var2.v = (String) obj2;
                f1Var2.f116643w = (ewd.a) obj3;
                return f1Var2.invokeSuspend(Unit.f186387a);
            case 2:
                f1 f1Var3 = new f1((e1a.f) this.f116644x, (Continuation) obj4, 2);
                f1Var3.v = (String) obj2;
                f1Var3.f116643w = (SplitBillLinkDetails) obj3;
                return f1Var3.invokeSuspend(Unit.f186387a);
            case 3:
                f1 f1Var4 = new f1((e76.d) this.f116644x, (Continuation) obj4, 3);
                f1Var4.v = (e76.b) obj2;
                f1Var4.f116643w = (e8l.d) obj3;
                return f1Var4.invokeSuspend(Unit.f186387a);
            case 4:
                f1 f1Var5 = new f1((com.revolut.feature.wealth.impl.data.repositories.a) this.f116644x, (Continuation) obj4, 4);
                f1Var5.v = (o7h.x) obj2;
                f1Var5.f116643w = (zzg.r) obj3;
                return f1Var5.invokeSuspend(Unit.f186387a);
            case 5:
                f1 f1Var6 = new f1((e8h.y) this.f116644x, (Continuation) obj4, 5);
                f1Var6.v = (String) obj2;
                f1Var6.f116643w = (b0h.a) obj3;
                return f1Var6.invokeSuspend(Unit.f186387a);
            case 6:
                f1 f1Var7 = new f1((e9d.z) this.f116644x, (Continuation) obj4, 6);
                f1Var7.v = (Data) obj2;
                f1Var7.f116643w = (Data) obj3;
                return f1Var7.invokeSuspend(Unit.f186387a);
            case 7:
                f1 f1Var8 = new f1((eg0.h) this.f116644x, (Continuation) obj4, 7);
                f1Var8.v = (eg0.c) obj2;
                f1Var8.f116643w = (aj0.c) obj3;
                return f1Var8.invokeSuspend(Unit.f186387a);
            case 8:
                f1 f1Var9 = new f1((eg0.h) this.f116644x, (Continuation) obj4, 8);
                f1Var9.v = (zf0.c) obj2;
                f1Var9.f116643w = (List) obj3;
                return f1Var9.invokeSuspend(Unit.f186387a);
            case 9:
                f1 f1Var10 = new f1((enb.g) this.f116644x, (Continuation) obj4, 9);
                f1Var10.v = (List) obj2;
                f1Var10.f116643w = (List) obj3;
                return f1Var10.invokeSuspend(Unit.f186387a);
            case 10:
                f1 f1Var11 = new f1((eqb.b) this.f116644x, (Continuation) obj4, 10);
                f1Var11.v = (String) obj2;
                f1Var11.f116643w = (pjb.c) obj3;
                return f1Var11.invokeSuspend(Unit.f186387a);
            case 11:
                f1 f1Var12 = new f1((er9.x) this.f116644x, (Continuation) obj4, 11);
                f1Var12.v = (String) obj2;
                f1Var12.f116643w = (st9.f) obj3;
                return f1Var12.invokeSuspend(Unit.f186387a);
            case 12:
                f1 f1Var13 = new f1((er9.x) this.f116644x, (Continuation) obj4, 12);
                f1Var13.v = (String) obj2;
                f1Var13.f116643w = (cr9.b) obj3;
                return f1Var13.invokeSuspend(Unit.f186387a);
            case 13:
                f1 f1Var14 = new f1((eve.b) this.f116644x, (Continuation) obj4, 13);
                f1Var14.v = (eve.a) obj2;
                f1Var14.f116643w = (List) obj3;
                return f1Var14.invokeSuspend(Unit.f186387a);
            case 14:
                f1 f1Var15 = new f1((f5h.c) this.f116644x, (Continuation) obj4, 14);
                f1Var15.v = (xi0.b) obj2;
                f1Var15.f116643w = (List) obj3;
                return f1Var15.invokeSuspend(Unit.f186387a);
            case 15:
                f1 f1Var16 = new f1((ff8.i) this.f116644x, (Continuation) obj4, 15);
                f1Var16.v = (String) obj2;
                f1Var16.f116643w = (qf8.a) obj3;
                return f1Var16.invokeSuspend(Unit.f186387a);
            case 16:
                f1 f1Var17 = new f1((fg0.e) this.f116644x, (Continuation) obj4, 16);
                f1Var17.v = (fg0.c) obj2;
                f1Var17.f116643w = (aj0.m0) obj3;
                return f1Var17.invokeSuspend(Unit.f186387a);
            case 17:
                f1 f1Var18 = new f1((fg0.k) this.f116644x, (Continuation) obj4, 17);
                f1Var18.v = (zf0.c) obj2;
                f1Var18.f116643w = (List) obj3;
                return f1Var18.invokeSuspend(Unit.f186387a);
            case 18:
                f1 f1Var19 = new f1((fl8.d) this.f116644x, (Continuation) obj4, 18);
                f1Var19.v = (String) obj2;
                f1Var19.f116643w = (RemoteLoginInvitation) obj3;
                return f1Var19.invokeSuspend(Unit.f186387a);
            case 19:
                f1 f1Var20 = new f1((frk.b) this.f116644x, (Continuation) obj4, 19);
                f1Var20.v = (String) obj2;
                f1Var20.f116643w = (mel.f) obj3;
                return f1Var20.invokeSuspend(Unit.f186387a);
            case 20:
                f1 f1Var21 = new f1((frk.d) this.f116644x, (Continuation) obj4, 20);
                f1Var21.v = (cel.b) obj2;
                f1Var21.f116643w = (Map) obj3;
                return f1Var21.invokeSuspend(Unit.f186387a);
            case 21:
                f1 f1Var22 = new f1((g18.c) this.f116644x, (Continuation) obj4, 21);
                f1Var22.v = (String) obj2;
                f1Var22.f116643w = (od0.i) obj3;
                return f1Var22.invokeSuspend(Unit.f186387a);
            case 22:
                f1 f1Var23 = new f1((r10.q) this.f116644x, (Continuation) obj4, 22);
                f1Var23.v = (j18.o) obj2;
                f1Var23.f116643w = (o18.e) obj3;
                return f1Var23.invokeSuspend(Unit.f186387a);
            case 23:
                f1 f1Var24 = new f1((g23.o) this.f116644x, (Continuation) obj4, 23);
                f1Var24.v = (do3.n) obj2;
                f1Var24.f116643w = (List) obj3;
                return f1Var24.invokeSuspend(Unit.f186387a);
            case 24:
                f1 f1Var25 = new f1((g2e.r) this.f116644x, (Continuation) obj4, 24);
                f1Var25.v = (g2e.h) obj2;
                f1Var25.f116643w = (StoreCampaignOffer) obj3;
                return f1Var25.invokeSuspend(Unit.f186387a);
            case 25:
                f1 f1Var26 = new f1((g2e.r) this.f116644x, (Continuation) obj4, 25);
                f1Var26.v = (g2e.i) obj2;
                f1Var26.f116643w = (StoreMegaOffer) obj3;
                return f1Var26.invokeSuspend(Unit.f186387a);
            case 26:
                f1 f1Var27 = new f1((g2e.r) this.f116644x, (Continuation) obj4, 26);
                f1Var27.v = (g2e.k) obj2;
                f1Var27.f116643w = (StoreMegaOffersResponse) obj3;
                return f1Var27.invokeSuspend(Unit.f186387a);
            case 27:
                f1 f1Var28 = new f1((g2e.r) this.f116644x, (Continuation) obj4, 27);
                f1Var28.v = (g2e.j) obj2;
                f1Var28.f116643w = (StoreMegaFiltersResponse) obj3;
                return f1Var28.invokeSuspend(Unit.f186387a);
            case 28:
                f1 f1Var29 = new f1((g2e.c0) this.f116644x, (Continuation) obj4, 28);
                f1Var29.v = (g2e.v) obj2;
                f1Var29.f116643w = (StoreDealsLayout) obj3;
                return f1Var29.invokeSuspend(Unit.f186387a);
            default:
                f1 f1Var30 = new f1((g2e.n0) this.f116644x, (Continuation) obj4, 29);
                f1Var30.v = (g2e.d0) obj2;
                f1Var30.f116643w = (StoreExclusivesFiltersResponse) obj3;
                return f1Var30.invokeSuspend(Unit.f186387a);
        }
    }

    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException
        */
    @Override // gim.a
    public final java.lang.Object invokeSuspend(
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r31v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:224)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:169)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:407)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:337)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:303)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:299)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:288)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:272)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:159)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
        	at jadx.core.ProcessClass.process(ProcessClass.java:88)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:126)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
        */
    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException
        */
}
