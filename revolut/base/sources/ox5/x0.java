package ox5;

import aw0.o9;
import aw0.x4;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.ActionCardDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.hg;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.cryptocommodity_invest.api.R$string;
import com.revolut.feature.staking.api.model.StakingProduct;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class x0 implements cli.n {

    @NotNull
    public static final u0 Companion = new u0();
    public static final int f = R$attr.uikit_colorAccent;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final aw0.d0 f230618g = new aw0.d0(167, 142);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ny5.e f230619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jbh.e f230620b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ttd.a f230621c;
    public final f01.c d;
    public final ifd.h e;

    public x0(ny5.e rateTilesMapper, jbh.e performanceAssetMapper, ttd.a stakingInterestRateFormatter, f01.c uiKitResources, ifd.h watchlistMapper) {
        Intrinsics.checkNotNullParameter(rateTilesMapper, "rateTilesMapper");
        Intrinsics.checkNotNullParameter(performanceAssetMapper, "performanceAssetMapper");
        Intrinsics.checkNotNullParameter(stakingInterestRateFormatter, "stakingInterestRateFormatter");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        Intrinsics.checkNotNullParameter(watchlistMapper, "watchlistMapper");
        this.f230619a = rateTilesMapper;
        this.f230620b = performanceAssetMapper;
        this.f230621c = stakingInterestRateFormatter;
        this.d = uiKitResources;
        this.e = watchlistMapper;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        List listA;
        Collection collection;
        Collection collection2;
        l domainState = (l) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        boolean z = domainState.f230591l;
        Data data = domainState.d;
        Data data2 = domainState.e;
        if (z) {
            final int i = 0;
            listA = (List) iii.c.f(domainState.f230588g, new Function1() { // from class: ox5.p0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    Function0 it8 = (Function0) obj2;
                    switch (i) {
                        case 0:
                            Intrinsics.checkNotNullParameter(it8, "it");
                            return this.f230619a.e(4, gw5.a.ROWS, "SEARCH_");
                        case 1:
                            Intrinsics.checkNotNullParameter(it8, "it");
                            return this.f230619a.e(10, gw5.a.CARDS, "TRENDING_");
                        case 2:
                            Intrinsics.checkNotNullParameter(it8, "it");
                            return this.f230619a.e(3, gw5.a.ROWS, "EARN_");
                        default:
                            Intrinsics.checkNotNullParameter(it8, "it");
                            return this.f230619a.e(4, gw5.a.ROWS, "CRYPTO_");
                    }
                }
            }, new d0(4), new ox2.d(domainState.f230592m, this, 2));
        } else {
            aim.e eVarB = zhm.u.b();
            if (!domainState.o) {
                final int i2 = 2;
                eVarB.addAll((List) iii.c.f(domainState.f230586b, new ou6.o(29), new d0(6), new Function3() { // from class: ox5.s0
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                        RowDelegate.Model modelX;
                        Object next;
                        int i3 = i2;
                        x0 x0Var = this;
                        switch (i3) {
                            case 0:
                                cw5.a content = (cw5.a) obj2;
                                ((Boolean) obj3).getClass();
                                Intrinsics.checkNotNullParameter(content, "content");
                                return gw5.b.a(x0Var.f230619a, new TextLocalisedClause(R$string.cryptocommodity_invest_collection_trending, null, null, 14), new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_invest_common_see_all, null, null, 14), content, gw5.a.CARDS, R$attr.uikit_dp16, 10, "TRENDING_SUBHEADER_ID", zhm.f0.f322471a, new ou6.o(28), null, "TRENDING_", 1024);
                            case 1:
                                m content2 = (m) obj2;
                                ((Boolean) obj3).getClass();
                                Intrinsics.checkNotNullParameter(content2, "content");
                                List list = content2.f230595a;
                                LinkedHashMap linkedHashMap = new LinkedHashMap();
                                for (Object obj5 : list) {
                                    String str = ((StakingProduct) obj5).d.f306286a;
                                    Object objO = linkedHashMap.get(str);
                                    if (objO == null) {
                                        objO = v0.a.o(linkedHashMap, str);
                                    }
                                    ((List) objO).add(obj5);
                                }
                                Collection collectionValues = linkedHashMap.values();
                                ArrayList arrayList = new ArrayList();
                                Iterator it8 = collectionValues.iterator();
                                while (it8.hasNext()) {
                                    Iterator it9 = ((List) it8.next()).iterator();
                                    if (it9.hasNext()) {
                                        next = it9.next();
                                        if (it9.hasNext()) {
                                            BigDecimal bigDecimal = ((StakingProduct) next).f88089g.f88069b;
                                            do {
                                                Object next2 = it9.next();
                                                BigDecimal bigDecimal2 = ((StakingProduct) next2).f88089g.f88069b;
                                                if (bigDecimal.compareTo(bigDecimal2) < 0) {
                                                    next = next2;
                                                    bigDecimal = bigDecimal2;
                                                }
                                            } while (it9.hasNext());
                                        }
                                    } else {
                                        next = null;
                                    }
                                    StakingProduct stakingProduct = (StakingProduct) next;
                                    if (stakingProduct != null) {
                                        arrayList.add(stakingProduct);
                                    }
                                }
                                List listV0 = zhm.d0.V0(zhm.d0.P0(arrayList, new w0()), 3);
                                if (listV0.isEmpty()) {
                                    return zhm.f0.f322471a;
                                }
                                ListSubheaderDelegate.Model model = new ListSubheaderDelegate.Model("EARN_SUBHEADER_ID", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.staking.api.R$string.staking_widget_title, null, null, 14), (ResourceImage) null, false, false, (Clause) new TextLocalisedClause(com.revolut.feature.staking.api.R$string.crypto_home_widget_earn_subheader_action_see_all, null, null, 14), true, (Object) null, (AnalyticsContext) null, R$attr.uikit_dp16, 0, 0, 0, (String) null, 253754);
                                ny5.e eVar = x0Var.f230619a;
                                List<StakingProduct> list2 = listV0;
                                ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                                Iterator it10 = list2.iterator();
                                while (it10.hasNext()) {
                                    arrayList2.add(((StakingProduct) it10.next()).d);
                                }
                                cw5.a aVar = content2.f230596b;
                                ArrayList<RowDelegate.Model> arrayListB = gw5.b.b(eVar, arrayList2, aVar.f109532b, aVar.f109533c, 56);
                                int iB = zhm.q0.b(zhm.w.t(list2, 10));
                                if (iB < 16) {
                                    iB = 16;
                                }
                                LinkedHashMap linkedHashMap2 = new LinkedHashMap(iB);
                                for (StakingProduct stakingProduct2 : list2) {
                                    linkedHashMap2.put(stakingProduct2.d.f306286a, ((wud.b) x0Var.f230621c).c(stakingProduct2.f88089g, true, null));
                                }
                                ArrayList arrayList3 = new ArrayList(zhm.w.t(arrayListB, 10));
                                for (RowDelegate.Model model2 : arrayListB) {
                                    String str2 = model2.f53228a;
                                    Clause clause = (Clause) linkedHashMap2.get(str2);
                                    if (clause != null) {
                                        String strA = ce9.m.A(str2, "EARN_");
                                        Clause clause2 = model2.f;
                                        m70.a.a(kotlin.jvm.internal.t0.f186434a);
                                        Clause[] elements = {clause2, new TextClause(" · ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), clause};
                                        Intrinsics.checkNotNullParameter(elements, "elements");
                                        modelX = RowDelegate.Model.x(model2, strA, null, null, yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), kotlin.collections.d.L(elements)), null, 0, null, false, null, null, 0, 0, 0, 0, null, -34, 15);
                                    } else {
                                        modelX = RowDelegate.Model.x(model2, ce9.m.A(str2, "EARN_"), null, null, null, null, 0, null, false, null, null, 0, 0, 0, 0, null, -2, 15);
                                    }
                                    arrayList3.add(modelX);
                                }
                                List listO = i2b.a.o(zhm.u.c(model), arrayList3);
                                yp0.b.b(R$attr.uikit_dp24, listO);
                                return listO;
                            case 2:
                                cw5.a content3 = (cw5.a) obj2;
                                ((Boolean) obj3).getClass();
                                Intrinsics.checkNotNullParameter(content3, "content");
                                if (content3.f109531a.isEmpty()) {
                                    return zhm.f0.f322471a;
                                }
                                ArrayList arrayListA = gw5.b.a(x0Var.f230619a, new TextLocalisedClause(R$string.crypto_discovery_recently_viewed, null, null, 14), null, content3, gw5.a.REWARDS, R$attr.uikit_dp16, 10, "RECENTLY_VIEWED_SUBHEADER_ID", zhm.f0.f322471a, null, null, "RECENTLY_VIEWED_", 3584);
                                yp0.b.b(R$attr.uikit_dp24, arrayListA);
                                return arrayListA;
                            default:
                                k collectionsPerformances = (k) obj2;
                                ((Boolean) obj3).getClass();
                                Intrinsics.checkNotNullParameter(collectionsPerformances, "collectionsPerformances");
                                List list3 = collectionsPerformances.f230581a;
                                ArrayList arrayList4 = new ArrayList();
                                Iterator it11 = list3.iterator();
                                while (it11.hasNext()) {
                                    zhm.a0.x(((xzg.k) it11.next()).a(), arrayList4);
                                }
                                List<xzg.d> listV02 = zhm.d0.V0(zhm.d0.P0(arrayList4, new v0()), 10);
                                ArrayList arrayList5 = new ArrayList(zhm.w.t(listV02, 10));
                                for (xzg.d dVar : listV02) {
                                    LinkedHashMap linkedHashMap3 = collectionsPerformances.f230582b;
                                    String str3 = dVar.f309976a;
                                    String str4 = dVar.f309976a;
                                    xzg.g gVar = (xzg.g) linkedHashMap3.get(str3);
                                    String strQ = j6.a.q("COLLECTION_CARD_ID_", str4);
                                    TextClause textClause = new TextClause(dVar.f309978c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                                    BigDecimal bigDecimal3 = gVar != null ? gVar.f309991c.f310002a : BigDecimal.ZERO;
                                    Intrinsics.h(bigDecimal3);
                                    com.revolut.core.ui_kit.delegates.f fVar = new com.revolut.core.ui_kit.delegates.f(xqi.a.c(bigDecimal3, false, false, false, false, false, 123), com.revolut.core.ui_kit.delegates.e.SMALL);
                                    f01.c cVar = x0Var.d;
                                    String str5 = dVar.f309979g;
                                    if (str5 == null) {
                                        str5 = "";
                                    }
                                    int iA = cVar.a(str5);
                                    LayeredImage.Companion companion = LayeredImage.INSTANCE;
                                    Integer numValueOf = Integer.valueOf(iA);
                                    if (iA == 0) {
                                        numValueOf = null;
                                    }
                                    ActionCardDelegate.Model model3 = new ActionCardDelegate.Model(strQ, textClause, companion.i(numValueOf != null ? numValueOf.intValue() : R$drawable.uikit_icn_24_apps, R$attr.uikit_colorAccentNeutral, R$attr.uikit_colorAccentNeutral_10), null, fVar, new uw5.a(str4), null, false, 16088);
                                    yp0.b.l(model3, 0, 0, 0, 0, null, false, 63);
                                    arrayList5.add(model3);
                                }
                                return arrayList5.isEmpty() ? zhm.f0.f322471a : zhm.v.k(new ListSubheaderDelegate.Model("COLLECTIONS_SUBHEADER_ID", (Image) null, (Clause) new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_trading_discovery_collections, null, null, 14), (ResourceImage) null, false, false, (Clause) new TextLocalisedClause(R.string.common_action_see_all, null, null, 14), true, (Object) null, (AnalyticsContext) null, R$attr.uikit_dp16, 0, 0, 0, (String) null, 253754), new hg("COLLECTIONS_LIST_ID", arrayList5, 3, x4.b.f10603a, null, null, false, false, null, null, 0, R$attr.uikit_dp16, 0, 0, 28656));
                        }
                    }
                }));
                Data data3 = domainState.f230587c;
                int i3 = domainState.i;
                ListSubheaderDelegate.Model model = new ListSubheaderDelegate.Model("WATCHLIST_LIST_SUBHEADER_ID", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.shared_separate_favourites.api.R$string.shared_watchlist_widget_header_title, null, null, 14), (ResourceImage) null, false, false, (Clause) new TextLocalisedClause(com.revolut.feature.shared_separate_favourites.api.R$string.shared_watchlist_widget_header_end_title_see_all, null, null, 14), true, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, (String) null, 261946);
                eVarB.addAll((List) iii.c.f(data3, new abf.n(model, i3, 24), new q0(model, 0), new r0(i3, this)));
                if (data2.getLoading() || data2.getContent() != null) {
                    final int i5 = 1;
                    final int i6 = 0;
                    eVarB.addAll((List) iii.c.f(data2, new Function1() { // from class: ox5.p0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            Function0 it8 = (Function0) obj2;
                            switch (i5) {
                                case 0:
                                    Intrinsics.checkNotNullParameter(it8, "it");
                                    return this.f230619a.e(4, gw5.a.ROWS, "SEARCH_");
                                case 1:
                                    Intrinsics.checkNotNullParameter(it8, "it");
                                    return this.f230619a.e(10, gw5.a.CARDS, "TRENDING_");
                                case 2:
                                    Intrinsics.checkNotNullParameter(it8, "it");
                                    return this.f230619a.e(3, gw5.a.ROWS, "EARN_");
                                default:
                                    Intrinsics.checkNotNullParameter(it8, "it");
                                    return this.f230619a.e(4, gw5.a.ROWS, "CRYPTO_");
                            }
                        }
                    }, new d0(2), new Function3() { // from class: ox5.s0
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                            RowDelegate.Model modelX;
                            Object next;
                            int i32 = i6;
                            x0 x0Var = this;
                            switch (i32) {
                                case 0:
                                    cw5.a content = (cw5.a) obj2;
                                    ((Boolean) obj3).getClass();
                                    Intrinsics.checkNotNullParameter(content, "content");
                                    return gw5.b.a(x0Var.f230619a, new TextLocalisedClause(R$string.cryptocommodity_invest_collection_trending, null, null, 14), new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_invest_common_see_all, null, null, 14), content, gw5.a.CARDS, R$attr.uikit_dp16, 10, "TRENDING_SUBHEADER_ID", zhm.f0.f322471a, new ou6.o(28), null, "TRENDING_", 1024);
                                case 1:
                                    m content2 = (m) obj2;
                                    ((Boolean) obj3).getClass();
                                    Intrinsics.checkNotNullParameter(content2, "content");
                                    List list = content2.f230595a;
                                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                                    for (Object obj5 : list) {
                                        String str = ((StakingProduct) obj5).d.f306286a;
                                        Object objO = linkedHashMap.get(str);
                                        if (objO == null) {
                                            objO = v0.a.o(linkedHashMap, str);
                                        }
                                        ((List) objO).add(obj5);
                                    }
                                    Collection collectionValues = linkedHashMap.values();
                                    ArrayList arrayList = new ArrayList();
                                    Iterator it8 = collectionValues.iterator();
                                    while (it8.hasNext()) {
                                        Iterator it9 = ((List) it8.next()).iterator();
                                        if (it9.hasNext()) {
                                            next = it9.next();
                                            if (it9.hasNext()) {
                                                BigDecimal bigDecimal = ((StakingProduct) next).f88089g.f88069b;
                                                do {
                                                    Object next2 = it9.next();
                                                    BigDecimal bigDecimal2 = ((StakingProduct) next2).f88089g.f88069b;
                                                    if (bigDecimal.compareTo(bigDecimal2) < 0) {
                                                        next = next2;
                                                        bigDecimal = bigDecimal2;
                                                    }
                                                } while (it9.hasNext());
                                            }
                                        } else {
                                            next = null;
                                        }
                                        StakingProduct stakingProduct = (StakingProduct) next;
                                        if (stakingProduct != null) {
                                            arrayList.add(stakingProduct);
                                        }
                                    }
                                    List listV0 = zhm.d0.V0(zhm.d0.P0(arrayList, new w0()), 3);
                                    if (listV0.isEmpty()) {
                                        return zhm.f0.f322471a;
                                    }
                                    ListSubheaderDelegate.Model model2 = new ListSubheaderDelegate.Model("EARN_SUBHEADER_ID", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.staking.api.R$string.staking_widget_title, null, null, 14), (ResourceImage) null, false, false, (Clause) new TextLocalisedClause(com.revolut.feature.staking.api.R$string.crypto_home_widget_earn_subheader_action_see_all, null, null, 14), true, (Object) null, (AnalyticsContext) null, R$attr.uikit_dp16, 0, 0, 0, (String) null, 253754);
                                    ny5.e eVar = x0Var.f230619a;
                                    List<StakingProduct> list2 = listV0;
                                    ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                                    Iterator it10 = list2.iterator();
                                    while (it10.hasNext()) {
                                        arrayList2.add(((StakingProduct) it10.next()).d);
                                    }
                                    cw5.a aVar = content2.f230596b;
                                    ArrayList<RowDelegate.Model> arrayListB = gw5.b.b(eVar, arrayList2, aVar.f109532b, aVar.f109533c, 56);
                                    int iB = zhm.q0.b(zhm.w.t(list2, 10));
                                    if (iB < 16) {
                                        iB = 16;
                                    }
                                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(iB);
                                    for (StakingProduct stakingProduct2 : list2) {
                                        linkedHashMap2.put(stakingProduct2.d.f306286a, ((wud.b) x0Var.f230621c).c(stakingProduct2.f88089g, true, null));
                                    }
                                    ArrayList arrayList3 = new ArrayList(zhm.w.t(arrayListB, 10));
                                    for (RowDelegate.Model model22 : arrayListB) {
                                        String str2 = model22.f53228a;
                                        Clause clause = (Clause) linkedHashMap2.get(str2);
                                        if (clause != null) {
                                            String strA = ce9.m.A(str2, "EARN_");
                                            Clause clause2 = model22.f;
                                            m70.a.a(kotlin.jvm.internal.t0.f186434a);
                                            Clause[] elements = {clause2, new TextClause(" · ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), clause};
                                            Intrinsics.checkNotNullParameter(elements, "elements");
                                            modelX = RowDelegate.Model.x(model22, strA, null, null, yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), kotlin.collections.d.L(elements)), null, 0, null, false, null, null, 0, 0, 0, 0, null, -34, 15);
                                        } else {
                                            modelX = RowDelegate.Model.x(model22, ce9.m.A(str2, "EARN_"), null, null, null, null, 0, null, false, null, null, 0, 0, 0, 0, null, -2, 15);
                                        }
                                        arrayList3.add(modelX);
                                    }
                                    List listO = i2b.a.o(zhm.u.c(model2), arrayList3);
                                    yp0.b.b(R$attr.uikit_dp24, listO);
                                    return listO;
                                case 2:
                                    cw5.a content3 = (cw5.a) obj2;
                                    ((Boolean) obj3).getClass();
                                    Intrinsics.checkNotNullParameter(content3, "content");
                                    if (content3.f109531a.isEmpty()) {
                                        return zhm.f0.f322471a;
                                    }
                                    ArrayList arrayListA = gw5.b.a(x0Var.f230619a, new TextLocalisedClause(R$string.crypto_discovery_recently_viewed, null, null, 14), null, content3, gw5.a.REWARDS, R$attr.uikit_dp16, 10, "RECENTLY_VIEWED_SUBHEADER_ID", zhm.f0.f322471a, null, null, "RECENTLY_VIEWED_", 3584);
                                    yp0.b.b(R$attr.uikit_dp24, arrayListA);
                                    return arrayListA;
                                default:
                                    k collectionsPerformances = (k) obj2;
                                    ((Boolean) obj3).getClass();
                                    Intrinsics.checkNotNullParameter(collectionsPerformances, "collectionsPerformances");
                                    List list3 = collectionsPerformances.f230581a;
                                    ArrayList arrayList4 = new ArrayList();
                                    Iterator it11 = list3.iterator();
                                    while (it11.hasNext()) {
                                        zhm.a0.x(((xzg.k) it11.next()).a(), arrayList4);
                                    }
                                    List<xzg.d> listV02 = zhm.d0.V0(zhm.d0.P0(arrayList4, new v0()), 10);
                                    ArrayList arrayList5 = new ArrayList(zhm.w.t(listV02, 10));
                                    for (xzg.d dVar : listV02) {
                                        LinkedHashMap linkedHashMap3 = collectionsPerformances.f230582b;
                                        String str3 = dVar.f309976a;
                                        String str4 = dVar.f309976a;
                                        xzg.g gVar = (xzg.g) linkedHashMap3.get(str3);
                                        String strQ = j6.a.q("COLLECTION_CARD_ID_", str4);
                                        TextClause textClause = new TextClause(dVar.f309978c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                                        BigDecimal bigDecimal3 = gVar != null ? gVar.f309991c.f310002a : BigDecimal.ZERO;
                                        Intrinsics.h(bigDecimal3);
                                        com.revolut.core.ui_kit.delegates.f fVar = new com.revolut.core.ui_kit.delegates.f(xqi.a.c(bigDecimal3, false, false, false, false, false, 123), com.revolut.core.ui_kit.delegates.e.SMALL);
                                        f01.c cVar = x0Var.d;
                                        String str5 = dVar.f309979g;
                                        if (str5 == null) {
                                            str5 = "";
                                        }
                                        int iA = cVar.a(str5);
                                        LayeredImage.Companion companion = LayeredImage.INSTANCE;
                                        Integer numValueOf = Integer.valueOf(iA);
                                        if (iA == 0) {
                                            numValueOf = null;
                                        }
                                        ActionCardDelegate.Model model3 = new ActionCardDelegate.Model(strQ, textClause, companion.i(numValueOf != null ? numValueOf.intValue() : R$drawable.uikit_icn_24_apps, R$attr.uikit_colorAccentNeutral, R$attr.uikit_colorAccentNeutral_10), null, fVar, new uw5.a(str4), null, false, 16088);
                                        yp0.b.l(model3, 0, 0, 0, 0, null, false, 63);
                                        arrayList5.add(model3);
                                    }
                                    return arrayList5.isEmpty() ? zhm.f0.f322471a : zhm.v.k(new ListSubheaderDelegate.Model("COLLECTIONS_SUBHEADER_ID", (Image) null, (Clause) new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_trading_discovery_collections, null, null, 14), (ResourceImage) null, false, false, (Clause) new TextLocalisedClause(R.string.common_action_see_all, null, null, 14), true, (Object) null, (AnalyticsContext) null, R$attr.uikit_dp16, 0, 0, 0, (String) null, 253754), new hg("COLLECTIONS_LIST_ID", arrayList5, 3, x4.b.f10603a, null, null, false, false, null, null, 0, R$attr.uikit_dp16, 0, 0, 28656));
                            }
                        }
                    }));
                }
                if (data.getLoading() || ((collection2 = (Collection) data.getContent()) != null && !collection2.isEmpty())) {
                    xzg.n0 n0Var = domainState.f230590j;
                    ListSubheaderDelegate.Model model2 = new ListSubheaderDelegate.Model("TOP_MOVERS_SUBHEADER", (Image) null, (Clause) new TextLocalisedClause(R$string.crypto_trade_top_movers_title, null, null, 14), (ResourceImage) null, false, false, (Clause) new TextLocalisedClause(R$string.crypto_trade_top_movers_see_all, null, null, 14), true, (Object) null, (AnalyticsContext) null, R$attr.uikit_dp16, 0, 0, 0, (String) null, 253754);
                    eVarB.addAll((List) iii.c.f(data, new lk7.o(model2, 2), new d0(5), new lk7.p(n0Var, model2, this)));
                }
                Data data4 = domainState.k;
                if (data4 == null) {
                    collection = zhm.f0.f322471a;
                } else {
                    final int i21 = 2;
                    final int i22 = 1;
                    collection = (List) iii.c.f(data4, new Function1() { // from class: ox5.p0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            Function0 it8 = (Function0) obj2;
                            switch (i21) {
                                case 0:
                                    Intrinsics.checkNotNullParameter(it8, "it");
                                    return this.f230619a.e(4, gw5.a.ROWS, "SEARCH_");
                                case 1:
                                    Intrinsics.checkNotNullParameter(it8, "it");
                                    return this.f230619a.e(10, gw5.a.CARDS, "TRENDING_");
                                case 2:
                                    Intrinsics.checkNotNullParameter(it8, "it");
                                    return this.f230619a.e(3, gw5.a.ROWS, "EARN_");
                                default:
                                    Intrinsics.checkNotNullParameter(it8, "it");
                                    return this.f230619a.e(4, gw5.a.ROWS, "CRYPTO_");
                            }
                        }
                    }, new d0(3), new Function3() { // from class: ox5.s0
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                            RowDelegate.Model modelX;
                            Object next;
                            int i32 = i22;
                            x0 x0Var = this;
                            switch (i32) {
                                case 0:
                                    cw5.a content = (cw5.a) obj2;
                                    ((Boolean) obj3).getClass();
                                    Intrinsics.checkNotNullParameter(content, "content");
                                    return gw5.b.a(x0Var.f230619a, new TextLocalisedClause(R$string.cryptocommodity_invest_collection_trending, null, null, 14), new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_invest_common_see_all, null, null, 14), content, gw5.a.CARDS, R$attr.uikit_dp16, 10, "TRENDING_SUBHEADER_ID", zhm.f0.f322471a, new ou6.o(28), null, "TRENDING_", 1024);
                                case 1:
                                    m content2 = (m) obj2;
                                    ((Boolean) obj3).getClass();
                                    Intrinsics.checkNotNullParameter(content2, "content");
                                    List list = content2.f230595a;
                                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                                    for (Object obj5 : list) {
                                        String str = ((StakingProduct) obj5).d.f306286a;
                                        Object objO = linkedHashMap.get(str);
                                        if (objO == null) {
                                            objO = v0.a.o(linkedHashMap, str);
                                        }
                                        ((List) objO).add(obj5);
                                    }
                                    Collection collectionValues = linkedHashMap.values();
                                    ArrayList arrayList = new ArrayList();
                                    Iterator it8 = collectionValues.iterator();
                                    while (it8.hasNext()) {
                                        Iterator it9 = ((List) it8.next()).iterator();
                                        if (it9.hasNext()) {
                                            next = it9.next();
                                            if (it9.hasNext()) {
                                                BigDecimal bigDecimal = ((StakingProduct) next).f88089g.f88069b;
                                                do {
                                                    Object next2 = it9.next();
                                                    BigDecimal bigDecimal2 = ((StakingProduct) next2).f88089g.f88069b;
                                                    if (bigDecimal.compareTo(bigDecimal2) < 0) {
                                                        next = next2;
                                                        bigDecimal = bigDecimal2;
                                                    }
                                                } while (it9.hasNext());
                                            }
                                        } else {
                                            next = null;
                                        }
                                        StakingProduct stakingProduct = (StakingProduct) next;
                                        if (stakingProduct != null) {
                                            arrayList.add(stakingProduct);
                                        }
                                    }
                                    List listV0 = zhm.d0.V0(zhm.d0.P0(arrayList, new w0()), 3);
                                    if (listV0.isEmpty()) {
                                        return zhm.f0.f322471a;
                                    }
                                    ListSubheaderDelegate.Model model22 = new ListSubheaderDelegate.Model("EARN_SUBHEADER_ID", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.staking.api.R$string.staking_widget_title, null, null, 14), (ResourceImage) null, false, false, (Clause) new TextLocalisedClause(com.revolut.feature.staking.api.R$string.crypto_home_widget_earn_subheader_action_see_all, null, null, 14), true, (Object) null, (AnalyticsContext) null, R$attr.uikit_dp16, 0, 0, 0, (String) null, 253754);
                                    ny5.e eVar = x0Var.f230619a;
                                    List<StakingProduct> list2 = listV0;
                                    ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                                    Iterator it10 = list2.iterator();
                                    while (it10.hasNext()) {
                                        arrayList2.add(((StakingProduct) it10.next()).d);
                                    }
                                    cw5.a aVar = content2.f230596b;
                                    ArrayList<RowDelegate.Model> arrayListB = gw5.b.b(eVar, arrayList2, aVar.f109532b, aVar.f109533c, 56);
                                    int iB = zhm.q0.b(zhm.w.t(list2, 10));
                                    if (iB < 16) {
                                        iB = 16;
                                    }
                                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(iB);
                                    for (StakingProduct stakingProduct2 : list2) {
                                        linkedHashMap2.put(stakingProduct2.d.f306286a, ((wud.b) x0Var.f230621c).c(stakingProduct2.f88089g, true, null));
                                    }
                                    ArrayList arrayList3 = new ArrayList(zhm.w.t(arrayListB, 10));
                                    for (RowDelegate.Model model222 : arrayListB) {
                                        String str2 = model222.f53228a;
                                        Clause clause = (Clause) linkedHashMap2.get(str2);
                                        if (clause != null) {
                                            String strA = ce9.m.A(str2, "EARN_");
                                            Clause clause2 = model222.f;
                                            m70.a.a(kotlin.jvm.internal.t0.f186434a);
                                            Clause[] elements = {clause2, new TextClause(" · ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), clause};
                                            Intrinsics.checkNotNullParameter(elements, "elements");
                                            modelX = RowDelegate.Model.x(model222, strA, null, null, yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), kotlin.collections.d.L(elements)), null, 0, null, false, null, null, 0, 0, 0, 0, null, -34, 15);
                                        } else {
                                            modelX = RowDelegate.Model.x(model222, ce9.m.A(str2, "EARN_"), null, null, null, null, 0, null, false, null, null, 0, 0, 0, 0, null, -2, 15);
                                        }
                                        arrayList3.add(modelX);
                                    }
                                    List listO = i2b.a.o(zhm.u.c(model22), arrayList3);
                                    yp0.b.b(R$attr.uikit_dp24, listO);
                                    return listO;
                                case 2:
                                    cw5.a content3 = (cw5.a) obj2;
                                    ((Boolean) obj3).getClass();
                                    Intrinsics.checkNotNullParameter(content3, "content");
                                    if (content3.f109531a.isEmpty()) {
                                        return zhm.f0.f322471a;
                                    }
                                    ArrayList arrayListA = gw5.b.a(x0Var.f230619a, new TextLocalisedClause(R$string.crypto_discovery_recently_viewed, null, null, 14), null, content3, gw5.a.REWARDS, R$attr.uikit_dp16, 10, "RECENTLY_VIEWED_SUBHEADER_ID", zhm.f0.f322471a, null, null, "RECENTLY_VIEWED_", 3584);
                                    yp0.b.b(R$attr.uikit_dp24, arrayListA);
                                    return arrayListA;
                                default:
                                    k collectionsPerformances = (k) obj2;
                                    ((Boolean) obj3).getClass();
                                    Intrinsics.checkNotNullParameter(collectionsPerformances, "collectionsPerformances");
                                    List list3 = collectionsPerformances.f230581a;
                                    ArrayList arrayList4 = new ArrayList();
                                    Iterator it11 = list3.iterator();
                                    while (it11.hasNext()) {
                                        zhm.a0.x(((xzg.k) it11.next()).a(), arrayList4);
                                    }
                                    List<xzg.d> listV02 = zhm.d0.V0(zhm.d0.P0(arrayList4, new v0()), 10);
                                    ArrayList arrayList5 = new ArrayList(zhm.w.t(listV02, 10));
                                    for (xzg.d dVar : listV02) {
                                        LinkedHashMap linkedHashMap3 = collectionsPerformances.f230582b;
                                        String str3 = dVar.f309976a;
                                        String str4 = dVar.f309976a;
                                        xzg.g gVar = (xzg.g) linkedHashMap3.get(str3);
                                        String strQ = j6.a.q("COLLECTION_CARD_ID_", str4);
                                        TextClause textClause = new TextClause(dVar.f309978c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                                        BigDecimal bigDecimal3 = gVar != null ? gVar.f309991c.f310002a : BigDecimal.ZERO;
                                        Intrinsics.h(bigDecimal3);
                                        com.revolut.core.ui_kit.delegates.f fVar = new com.revolut.core.ui_kit.delegates.f(xqi.a.c(bigDecimal3, false, false, false, false, false, 123), com.revolut.core.ui_kit.delegates.e.SMALL);
                                        f01.c cVar = x0Var.d;
                                        String str5 = dVar.f309979g;
                                        if (str5 == null) {
                                            str5 = "";
                                        }
                                        int iA = cVar.a(str5);
                                        LayeredImage.Companion companion = LayeredImage.INSTANCE;
                                        Integer numValueOf = Integer.valueOf(iA);
                                        if (iA == 0) {
                                            numValueOf = null;
                                        }
                                        ActionCardDelegate.Model model3 = new ActionCardDelegate.Model(strQ, textClause, companion.i(numValueOf != null ? numValueOf.intValue() : R$drawable.uikit_icn_24_apps, R$attr.uikit_colorAccentNeutral, R$attr.uikit_colorAccentNeutral_10), null, fVar, new uw5.a(str4), null, false, 16088);
                                        yp0.b.l(model3, 0, 0, 0, 0, null, false, 63);
                                        arrayList5.add(model3);
                                    }
                                    return arrayList5.isEmpty() ? zhm.f0.f322471a : zhm.v.k(new ListSubheaderDelegate.Model("COLLECTIONS_SUBHEADER_ID", (Image) null, (Clause) new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_trading_discovery_collections, null, null, 14), (ResourceImage) null, false, false, (Clause) new TextLocalisedClause(R.string.common_action_see_all, null, null, 14), true, (Object) null, (AnalyticsContext) null, R$attr.uikit_dp16, 0, 0, 0, (String) null, 253754), new hg("COLLECTIONS_LIST_ID", arrayList5, 3, x4.b.f10603a, null, null, false, false, null, null, 0, R$attr.uikit_dp16, 0, 0, 28656));
                            }
                        }
                    });
                }
                eVarB.addAll(collection);
                final int i32 = 3;
                eVarB.addAll((List) iii.c.f(domainState.f230593n, new t0(0), new d0(7), new Function3() { // from class: ox5.s0
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                        RowDelegate.Model modelX;
                        Object next;
                        int i322 = i32;
                        x0 x0Var = this;
                        switch (i322) {
                            case 0:
                                cw5.a content = (cw5.a) obj2;
                                ((Boolean) obj3).getClass();
                                Intrinsics.checkNotNullParameter(content, "content");
                                return gw5.b.a(x0Var.f230619a, new TextLocalisedClause(R$string.cryptocommodity_invest_collection_trending, null, null, 14), new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_invest_common_see_all, null, null, 14), content, gw5.a.CARDS, R$attr.uikit_dp16, 10, "TRENDING_SUBHEADER_ID", zhm.f0.f322471a, new ou6.o(28), null, "TRENDING_", 1024);
                            case 1:
                                m content2 = (m) obj2;
                                ((Boolean) obj3).getClass();
                                Intrinsics.checkNotNullParameter(content2, "content");
                                List list = content2.f230595a;
                                LinkedHashMap linkedHashMap = new LinkedHashMap();
                                for (Object obj5 : list) {
                                    String str = ((StakingProduct) obj5).d.f306286a;
                                    Object objO = linkedHashMap.get(str);
                                    if (objO == null) {
                                        objO = v0.a.o(linkedHashMap, str);
                                    }
                                    ((List) objO).add(obj5);
                                }
                                Collection collectionValues = linkedHashMap.values();
                                ArrayList arrayList = new ArrayList();
                                Iterator it8 = collectionValues.iterator();
                                while (it8.hasNext()) {
                                    Iterator it9 = ((List) it8.next()).iterator();
                                    if (it9.hasNext()) {
                                        next = it9.next();
                                        if (it9.hasNext()) {
                                            BigDecimal bigDecimal = ((StakingProduct) next).f88089g.f88069b;
                                            do {
                                                Object next2 = it9.next();
                                                BigDecimal bigDecimal2 = ((StakingProduct) next2).f88089g.f88069b;
                                                if (bigDecimal.compareTo(bigDecimal2) < 0) {
                                                    next = next2;
                                                    bigDecimal = bigDecimal2;
                                                }
                                            } while (it9.hasNext());
                                        }
                                    } else {
                                        next = null;
                                    }
                                    StakingProduct stakingProduct = (StakingProduct) next;
                                    if (stakingProduct != null) {
                                        arrayList.add(stakingProduct);
                                    }
                                }
                                List listV0 = zhm.d0.V0(zhm.d0.P0(arrayList, new w0()), 3);
                                if (listV0.isEmpty()) {
                                    return zhm.f0.f322471a;
                                }
                                ListSubheaderDelegate.Model model22 = new ListSubheaderDelegate.Model("EARN_SUBHEADER_ID", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.staking.api.R$string.staking_widget_title, null, null, 14), (ResourceImage) null, false, false, (Clause) new TextLocalisedClause(com.revolut.feature.staking.api.R$string.crypto_home_widget_earn_subheader_action_see_all, null, null, 14), true, (Object) null, (AnalyticsContext) null, R$attr.uikit_dp16, 0, 0, 0, (String) null, 253754);
                                ny5.e eVar = x0Var.f230619a;
                                List<StakingProduct> list2 = listV0;
                                ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                                Iterator it10 = list2.iterator();
                                while (it10.hasNext()) {
                                    arrayList2.add(((StakingProduct) it10.next()).d);
                                }
                                cw5.a aVar = content2.f230596b;
                                ArrayList<RowDelegate.Model> arrayListB = gw5.b.b(eVar, arrayList2, aVar.f109532b, aVar.f109533c, 56);
                                int iB = zhm.q0.b(zhm.w.t(list2, 10));
                                if (iB < 16) {
                                    iB = 16;
                                }
                                LinkedHashMap linkedHashMap2 = new LinkedHashMap(iB);
                                for (StakingProduct stakingProduct2 : list2) {
                                    linkedHashMap2.put(stakingProduct2.d.f306286a, ((wud.b) x0Var.f230621c).c(stakingProduct2.f88089g, true, null));
                                }
                                ArrayList arrayList3 = new ArrayList(zhm.w.t(arrayListB, 10));
                                for (RowDelegate.Model model222 : arrayListB) {
                                    String str2 = model222.f53228a;
                                    Clause clause = (Clause) linkedHashMap2.get(str2);
                                    if (clause != null) {
                                        String strA = ce9.m.A(str2, "EARN_");
                                        Clause clause2 = model222.f;
                                        m70.a.a(kotlin.jvm.internal.t0.f186434a);
                                        Clause[] elements = {clause2, new TextClause(" · ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), clause};
                                        Intrinsics.checkNotNullParameter(elements, "elements");
                                        modelX = RowDelegate.Model.x(model222, strA, null, null, yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), kotlin.collections.d.L(elements)), null, 0, null, false, null, null, 0, 0, 0, 0, null, -34, 15);
                                    } else {
                                        modelX = RowDelegate.Model.x(model222, ce9.m.A(str2, "EARN_"), null, null, null, null, 0, null, false, null, null, 0, 0, 0, 0, null, -2, 15);
                                    }
                                    arrayList3.add(modelX);
                                }
                                List listO = i2b.a.o(zhm.u.c(model22), arrayList3);
                                yp0.b.b(R$attr.uikit_dp24, listO);
                                return listO;
                            case 2:
                                cw5.a content3 = (cw5.a) obj2;
                                ((Boolean) obj3).getClass();
                                Intrinsics.checkNotNullParameter(content3, "content");
                                if (content3.f109531a.isEmpty()) {
                                    return zhm.f0.f322471a;
                                }
                                ArrayList arrayListA = gw5.b.a(x0Var.f230619a, new TextLocalisedClause(R$string.crypto_discovery_recently_viewed, null, null, 14), null, content3, gw5.a.REWARDS, R$attr.uikit_dp16, 10, "RECENTLY_VIEWED_SUBHEADER_ID", zhm.f0.f322471a, null, null, "RECENTLY_VIEWED_", 3584);
                                yp0.b.b(R$attr.uikit_dp24, arrayListA);
                                return arrayListA;
                            default:
                                k collectionsPerformances = (k) obj2;
                                ((Boolean) obj3).getClass();
                                Intrinsics.checkNotNullParameter(collectionsPerformances, "collectionsPerformances");
                                List list3 = collectionsPerformances.f230581a;
                                ArrayList arrayList4 = new ArrayList();
                                Iterator it11 = list3.iterator();
                                while (it11.hasNext()) {
                                    zhm.a0.x(((xzg.k) it11.next()).a(), arrayList4);
                                }
                                List<xzg.d> listV02 = zhm.d0.V0(zhm.d0.P0(arrayList4, new v0()), 10);
                                ArrayList arrayList5 = new ArrayList(zhm.w.t(listV02, 10));
                                for (xzg.d dVar : listV02) {
                                    LinkedHashMap linkedHashMap3 = collectionsPerformances.f230582b;
                                    String str3 = dVar.f309976a;
                                    String str4 = dVar.f309976a;
                                    xzg.g gVar = (xzg.g) linkedHashMap3.get(str3);
                                    String strQ = j6.a.q("COLLECTION_CARD_ID_", str4);
                                    TextClause textClause = new TextClause(dVar.f309978c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                                    BigDecimal bigDecimal3 = gVar != null ? gVar.f309991c.f310002a : BigDecimal.ZERO;
                                    Intrinsics.h(bigDecimal3);
                                    com.revolut.core.ui_kit.delegates.f fVar = new com.revolut.core.ui_kit.delegates.f(xqi.a.c(bigDecimal3, false, false, false, false, false, 123), com.revolut.core.ui_kit.delegates.e.SMALL);
                                    f01.c cVar = x0Var.d;
                                    String str5 = dVar.f309979g;
                                    if (str5 == null) {
                                        str5 = "";
                                    }
                                    int iA = cVar.a(str5);
                                    LayeredImage.Companion companion = LayeredImage.INSTANCE;
                                    Integer numValueOf = Integer.valueOf(iA);
                                    if (iA == 0) {
                                        numValueOf = null;
                                    }
                                    ActionCardDelegate.Model model3 = new ActionCardDelegate.Model(strQ, textClause, companion.i(numValueOf != null ? numValueOf.intValue() : R$drawable.uikit_icn_24_apps, R$attr.uikit_colorAccentNeutral, R$attr.uikit_colorAccentNeutral_10), null, fVar, new uw5.a(str4), null, false, 16088);
                                    yp0.b.l(model3, 0, 0, 0, 0, null, false, 63);
                                    arrayList5.add(model3);
                                }
                                return arrayList5.isEmpty() ? zhm.f0.f322471a : zhm.v.k(new ListSubheaderDelegate.Model("COLLECTIONS_SUBHEADER_ID", (Image) null, (Clause) new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_trading_discovery_collections, null, null, 14), (ResourceImage) null, false, false, (Clause) new TextLocalisedClause(R.string.common_action_see_all, null, null, 14), true, (Object) null, (AnalyticsContext) null, R$attr.uikit_dp16, 0, 0, 0, (String) null, 253754), new hg("COLLECTIONS_LIST_ID", arrayList5, 3, x4.b.f10603a, null, null, false, false, null, null, 0, R$attr.uikit_dp16, 0, 0, 28656));
                        }
                    }
                }));
            }
            final int i33 = 3;
            eVarB.addAll((List) iii.c.f(domainState.f, new Function1() { // from class: ox5.p0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    Function0 it8 = (Function0) obj2;
                    switch (i33) {
                        case 0:
                            Intrinsics.checkNotNullParameter(it8, "it");
                            return this.f230619a.e(4, gw5.a.ROWS, "SEARCH_");
                        case 1:
                            Intrinsics.checkNotNullParameter(it8, "it");
                            return this.f230619a.e(10, gw5.a.CARDS, "TRENDING_");
                        case 2:
                            Intrinsics.checkNotNullParameter(it8, "it");
                            return this.f230619a.e(3, gw5.a.ROWS, "EARN_");
                        default:
                            Intrinsics.checkNotNullParameter(it8, "it");
                            return this.f230619a.e(4, gw5.a.ROWS, "CRYPTO_");
                    }
                }
            }, new d0(1), new ox2.d(domainState.f230589h, this, 1)));
            listA = zhm.u.a(eVarB);
        }
        return new o(listA);
    }
}
