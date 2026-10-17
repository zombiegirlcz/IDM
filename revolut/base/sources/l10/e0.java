package l10;

import aw0.y4;
import com.google.android.gms.location.GeofenceStatusCodes;
import com.revolut.cards.shared.ui.screen.catalogue.models.CatalogueToolbarButton;
import com.revolut.core.ui_kit.delegates.CardDesignCatalogueDelegate;
import com.revolut.core.ui_kit.delegates.gg;
import com.revolut.core.ui_kit.delegates.hg;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarMenuItem;
import com.revolut.core.ui_kit.views.navbar.TextNavBarMenuItem;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.feature.cards_core.R$string;
import ip0.gu;
import ip0.m5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kye.l0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class e0 implements cli.n {

    @NotNull
    public static final c0 Companion = new c0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c90.c f191373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ay2.j f191374b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j10.a f191375c;
    public final ay2.s d;
    public final ay2.l e;
    public final ay2.m f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final zjh.f f191376g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f191377h;

    public e0(c90.c uiResources, ay2.j cardsStringProvider, j10.a cardsIconsProvider, ay2.s taxDisclaimerProvider, ay2.l catalogueLabelProvider, ay2.m deliveryFeeDisclaimerProvider, zjh.f revPointsMenuItemProvider) {
        Intrinsics.checkNotNullParameter(uiResources, "uiResources");
        Intrinsics.checkNotNullParameter(cardsStringProvider, "cardsStringProvider");
        Intrinsics.checkNotNullParameter(cardsIconsProvider, "cardsIconsProvider");
        Intrinsics.checkNotNullParameter(taxDisclaimerProvider, "taxDisclaimerProvider");
        Intrinsics.checkNotNullParameter(catalogueLabelProvider, "catalogueLabelProvider");
        Intrinsics.checkNotNullParameter(deliveryFeeDisclaimerProvider, "deliveryFeeDisclaimerProvider");
        Intrinsics.checkNotNullParameter(revPointsMenuItemProvider, "revPointsMenuItemProvider");
        this.f191373a = uiResources;
        this.f191374b = cardsStringProvider;
        this.f191375c = cardsIconsProvider;
        this.d = taxDisclaimerProvider;
        this.e = catalogueLabelProvider;
        this.f = deliveryFeeDisclaimerProvider;
        this.f191376g = revPointsMenuItemProvider;
        int i = d0.f191372b[uiResources.a().ordinal()];
        this.f191377h = i != 1 ? (i == 2 || i == 3) ? "@2x" : "@3x" : "@1x";
    }

    public static aim.e a() {
        aim.e eVarB = zhm.u.b();
        IntRange intRangeO = kotlin.ranges.f.o(0, 3);
        ArrayList arrayList = new ArrayList(zhm.w.t(intRangeO, 10));
        vim.f it8 = intRangeO.iterator();
        while (it8.f289625c) {
            int iNextInt = it8.nextInt();
            eVarB.add(new gu("SUBHEADER_LOADING_LIST_ID", 0, 0, 30));
            String strN = a0.d.n("SCROLLER_LIST_ID", iNextInt);
            IntRange intRangeO2 = kotlin.ranges.f.o(0, 3);
            ArrayList arrayList2 = new ArrayList(zhm.w.t(intRangeO2, 10));
            vim.f it9 = intRangeO2.iterator();
            while (it9.f289625c) {
                arrayList2.add(new m5(a0.d.n("CARD_DESIGN_CATALOGUE_LOADING_LIST_ID", it9.nextInt())));
            }
            gg.c cVar = new gg.c(0);
            CardDesignCatalogueDelegate.INSTANCE.getClass();
            eVarB.add(new hg(strN, arrayList2, 2, new y4(CardDesignCatalogueDelegate.e), null, cVar, false, false, null, null, R$attr.uikit_dp8, R$attr.uikit_dp24, 0, 0, 26576));
            arrayList.add(Boolean.TRUE);
        }
        return zhm.u.a(eVarB);
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        TextLocalisedClause textLocalisedClause;
        String str;
        final p domainState = (p) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        final int i = 0;
        List list = (List) iii.c.f(domainState.f191388b, new l0g.a(this, 8), new l0(11), new Function3() { // from class: l10.a0
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                Data data;
                Data data2;
                switch (i) {
                    case 0:
                        n10.a cardCatalogueDesigns = (n10.a) obj2;
                        ((Boolean) obj3).getClass();
                        Intrinsics.checkNotNullParameter(cardCatalogueDesigns, "cardCatalogueDesigns");
                        p pVar = domainState;
                        final n10.b bVar = pVar.f191387a;
                        final Data data3 = cardCatalogueDesigns.f211197a;
                        final Data data4 = cardCatalogueDesigns.f211198b;
                        final Data data5 = cardCatalogueDesigns.f211199c;
                        final LinkedHashMap linkedHashMap = cardCatalogueDesigns.d;
                        final ay2.d dVar = cardCatalogueDesigns.f;
                        final boolean z = pVar.f191389c;
                        final o5l.u uVar = pVar.f;
                        final boolean z3 = pVar.d;
                        final boolean z4 = pVar.e;
                        final Set set = pVar.f191390g;
                        final wi0.b bVar2 = pVar.f191391h;
                        int i2 = d0.f191371a[bVar.ordinal()];
                        if (i2 == 1) {
                            data = data3;
                        } else if (i2 == 2) {
                            data = data4;
                        } else {
                            if (i2 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            data = data5;
                        }
                        final e0 e0Var = this;
                        return (List) iii.c.f(data, new l0g.a(e0Var, 9), new l0(12), new Function3() { // from class: l10.b0
                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Removed duplicated region for block: B:130:0x03be A[ADDED_TO_REGION] */
                            /* JADX WARN: Removed duplicated region for block: B:135:0x040c  */
                            /* JADX WARN: Removed duplicated region for block: B:136:0x040e  */
                            /* JADX WARN: Removed duplicated region for block: B:137:0x0411  */
                            /* JADX WARN: Removed duplicated region for block: B:28:0x00d5 A[PHI: r1
                              0x00d5: PHI (r1v51 dj0.d) = (r1v15 dj0.d), (r1v16 dj0.d) binds: [B:27:0x00d3, B:316:0x00d5] A[DONT_GENERATE, DONT_INLINE]] */
                            /* JADX WARN: Removed duplicated region for block: B:29:0x00d9  */
                            /* JADX WARN: Removed duplicated region for block: B:303:0x0670 A[SYNTHETIC] */
                            /* JADX WARN: Removed duplicated region for block: B:39:0x0115 A[LOOP:2: B:37:0x010f->B:39:0x0115, LOOP_END] */
                            /* JADX WARN: Removed duplicated region for block: B:42:0x012e  */
                            /* JADX WARN: Removed duplicated region for block: B:43:0x0130  */
                            /* JADX WARN: Removed duplicated region for block: B:46:0x0166  */
                            /* JADX WARN: Removed duplicated region for block: B:78:0x01dc A[PHI: r13
                              0x01dc: PHI (r13v55 boolean) = (r13v28 boolean), (r13v29 boolean) binds: [B:77:0x01da, B:311:0x01dc] A[DONT_GENERATE, DONT_INLINE]] */
                            /* JADX WARN: Removed duplicated region for block: B:79:0x01e0  */
                            /* JADX WARN: Removed duplicated region for block: B:91:0x0213  */
                            /* JADX WARN: Removed duplicated region for block: B:93:0x0238  */
                            /* JADX WARN: Type inference failed for: r13v10 */
                            /* JADX WARN: Type inference failed for: r13v8 */
                            /* JADX WARN: Type inference failed for: r13v9, types: [com.revolut.core.ui_kit_core.displayers.image.models.CdnImage, ip0.yj0] */
                            /* JADX WARN: Type inference failed for: r14v0 */
                            /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Object] */
                            /* JADX WARN: Type inference failed for: r14v23 */
                            /* JADX WARN: Type inference failed for: r14v5 */
                            /* JADX WARN: Type inference failed for: r2v5, types: [aim.e, java.util.List] */
                            /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, kotlin.Lazy] */
                            /* JADX WARN: Type inference failed for: r8v10, types: [com.revolut.core.ui_kit_core.displayers.image.models.CdnImage, ip0.yj0] */
                            /* JADX WARN: Type inference failed for: r8v11 */
                            /* JADX WARN: Type inference failed for: r8v9 */
                            @Override // kotlin.jvm.functions.Function3
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct add '--show-bad-code' argument
                            */
                            public final java.lang.Object invoke(java.lang.Object r63, java.lang.Object r64, java.lang.Object r65) {
                                /*
                                    Method dump skipped, instruction units count: 2492
                                    To view this dump add '--comments-level debug' option
                                */
                                throw new UnsupportedOperationException("Method not decompiled: l10.b0.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
                            }
                        });
                    default:
                        n10.a cardCatalogueDesigns2 = (n10.a) obj2;
                        ((Boolean) obj3).getClass();
                        Intrinsics.checkNotNullParameter(cardCatalogueDesigns2, "cardCatalogueDesigns");
                        dj0.d revPointsBalance = cardCatalogueDesigns2.e;
                        if (revPointsBalance != null) {
                            int i3 = d0.f191371a[domainState.f191387a.ordinal()];
                            if (i3 == 1) {
                                data2 = cardCatalogueDesigns2.f211197a;
                            } else if (i3 == 2) {
                                data2 = cardCatalogueDesigns2.f211198b;
                            } else {
                                if (i3 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                data2 = cardCatalogueDesigns2.f211199c;
                            }
                            List list2 = (List) data2.getContent();
                            if (list2 != null) {
                                ArrayList arrayList = new ArrayList();
                                Iterator it8 = list2.iterator();
                                while (it8.hasNext()) {
                                    zhm.a0.x(((o5l.n) it8.next()).d, arrayList);
                                }
                                if (!arrayList.isEmpty()) {
                                    Iterator it9 = arrayList.iterator();
                                    while (it9.hasNext()) {
                                        if (((o5l.i) it9.next()).f.f222475a.d != null) {
                                            zjh.f fVar = this.f191376g;
                                            Intrinsics.checkNotNullParameter("REV_POINTS_MENU_ITEM_LIST_ID", "listId");
                                            Intrinsics.checkNotNullParameter(revPointsBalance, "revPointsBalance");
                                            return ((ryb.c) ((jub.b) fVar.f322835b)).a(revPointsBalance, "REV_POINTS_MENU_ITEM_LIST_ID");
                                        }
                                    }
                                }
                            }
                        }
                        return null;
                }
            }
        });
        n10.b cardType = domainState.f191387a;
        Intrinsics.checkNotNullParameter(cardType, "cardType");
        int i2 = ay2.i.f11040a[cardType.ordinal()];
        if (i2 == 1) {
            textLocalisedClause = new TextLocalisedClause(R$string.card_design_catalogue_title_physical, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10);
        } else if (i2 == 2) {
            textLocalisedClause = new TextLocalisedClause(R$string.card_design_catalogue_title_virtual, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10);
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause = new TextLocalisedClause(R$string.card_order_disposable_title, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10);
        }
        TagViewData tagViewData = new TagViewData(null, textLocalisedClause, null, R$attr.uikit_colorTransparent, null, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION);
        ArrayList arrayList = new ArrayList();
        CatalogueToolbarButton catalogueToolbarButton = domainState.i;
        if (catalogueToolbarButton != null) {
            if (catalogueToolbarButton instanceof CatalogueToolbarButton.GoVirtual) {
                str = "LIST_ID_MENU_ITEM_GO_VIRTUAL";
            } else {
                if (!(catalogueToolbarButton instanceof CatalogueToolbarButton.GoPhysical)) {
                    throw new NoWhenBranchMatchedException();
                }
                str = "LIST_ID_MENU_ITEM_GO_PHYSICAL";
            }
            arrayList.add(new TextNavBarMenuItem(str, catalogueToolbarButton.getF50957a(), null, null, 12));
        }
        if (domainState.e) {
            final int i3 = 1;
            NavBarMenuItem navBarMenuItem = (NavBarMenuItem) iii.c.f(domainState.f191388b, new l0g.a(10), new l0(13), new Function3() { // from class: l10.a0
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    Data data;
                    Data data2;
                    switch (i3) {
                        case 0:
                            n10.a cardCatalogueDesigns = (n10.a) obj2;
                            ((Boolean) obj3).getClass();
                            Intrinsics.checkNotNullParameter(cardCatalogueDesigns, "cardCatalogueDesigns");
                            p pVar = domainState;
                            final n10.b bVar = pVar.f191387a;
                            final Data data3 = cardCatalogueDesigns.f211197a;
                            final Data data4 = cardCatalogueDesigns.f211198b;
                            final Data data5 = cardCatalogueDesigns.f211199c;
                            final LinkedHashMap linkedHashMap = cardCatalogueDesigns.d;
                            final ay2.d dVar = cardCatalogueDesigns.f;
                            final boolean z = pVar.f191389c;
                            final o5l.u uVar = pVar.f;
                            final boolean z3 = pVar.d;
                            final boolean z4 = pVar.e;
                            final Set set = pVar.f191390g;
                            final wi0.b bVar2 = pVar.f191391h;
                            int i22 = d0.f191371a[bVar.ordinal()];
                            if (i22 == 1) {
                                data = data3;
                            } else if (i22 == 2) {
                                data = data4;
                            } else {
                                if (i22 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                data = data5;
                            }
                            final e0 e0Var = this;
                            return (List) iii.c.f(data, new l0g.a(e0Var, 9), new l0(12), new Function3() { // from class: l10.b0
                                /* JADX WARN: Multi-variable type inference failed */
                                /* JADX WARN: Removed duplicated region for block: B:130:0x03be A[ADDED_TO_REGION] */
                                /* JADX WARN: Removed duplicated region for block: B:135:0x040c  */
                                /* JADX WARN: Removed duplicated region for block: B:136:0x040e  */
                                /* JADX WARN: Removed duplicated region for block: B:137:0x0411  */
                                /* JADX WARN: Removed duplicated region for block: B:28:0x00d5 A[PHI: r1
                                  0x00d5: PHI (r1v51 dj0.d) = (r1v15 dj0.d), (r1v16 dj0.d) binds: [B:27:0x00d3, B:316:0x00d5] A[DONT_GENERATE, DONT_INLINE]] */
                                /* JADX WARN: Removed duplicated region for block: B:29:0x00d9  */
                                /* JADX WARN: Removed duplicated region for block: B:303:0x0670 A[SYNTHETIC] */
                                /* JADX WARN: Removed duplicated region for block: B:39:0x0115 A[LOOP:2: B:37:0x010f->B:39:0x0115, LOOP_END] */
                                /* JADX WARN: Removed duplicated region for block: B:42:0x012e  */
                                /* JADX WARN: Removed duplicated region for block: B:43:0x0130  */
                                /* JADX WARN: Removed duplicated region for block: B:46:0x0166  */
                                /* JADX WARN: Removed duplicated region for block: B:78:0x01dc A[PHI: r13
                                  0x01dc: PHI (r13v55 boolean) = (r13v28 boolean), (r13v29 boolean) binds: [B:77:0x01da, B:311:0x01dc] A[DONT_GENERATE, DONT_INLINE]] */
                                /* JADX WARN: Removed duplicated region for block: B:79:0x01e0  */
                                /* JADX WARN: Removed duplicated region for block: B:91:0x0213  */
                                /* JADX WARN: Removed duplicated region for block: B:93:0x0238  */
                                /* JADX WARN: Type inference failed for: r13v10 */
                                /* JADX WARN: Type inference failed for: r13v8 */
                                /* JADX WARN: Type inference failed for: r13v9, types: [com.revolut.core.ui_kit_core.displayers.image.models.CdnImage, ip0.yj0] */
                                /* JADX WARN: Type inference failed for: r14v0 */
                                /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Object] */
                                /* JADX WARN: Type inference failed for: r14v23 */
                                /* JADX WARN: Type inference failed for: r14v5 */
                                /* JADX WARN: Type inference failed for: r2v5, types: [aim.e, java.util.List] */
                                /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, kotlin.Lazy] */
                                /* JADX WARN: Type inference failed for: r8v10, types: [com.revolut.core.ui_kit_core.displayers.image.models.CdnImage, ip0.yj0] */
                                /* JADX WARN: Type inference failed for: r8v11 */
                                /* JADX WARN: Type inference failed for: r8v9 */
                                @Override // kotlin.jvm.functions.Function3
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                    To view partially-correct add '--show-bad-code' argument
                                */
                                public final java.lang.Object invoke(java.lang.Object r63, java.lang.Object r64, java.lang.Object r65) {
                                    /*
                                        Method dump skipped, instruction units count: 2492
                                        To view this dump add '--comments-level debug' option
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: l10.b0.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
                                }
                            });
                        default:
                            n10.a cardCatalogueDesigns2 = (n10.a) obj2;
                            ((Boolean) obj3).getClass();
                            Intrinsics.checkNotNullParameter(cardCatalogueDesigns2, "cardCatalogueDesigns");
                            dj0.d revPointsBalance = cardCatalogueDesigns2.e;
                            if (revPointsBalance != null) {
                                int i32 = d0.f191371a[domainState.f191387a.ordinal()];
                                if (i32 == 1) {
                                    data2 = cardCatalogueDesigns2.f211197a;
                                } else if (i32 == 2) {
                                    data2 = cardCatalogueDesigns2.f211198b;
                                } else {
                                    if (i32 != 3) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    data2 = cardCatalogueDesigns2.f211199c;
                                }
                                List list2 = (List) data2.getContent();
                                if (list2 != null) {
                                    ArrayList arrayList2 = new ArrayList();
                                    Iterator it8 = list2.iterator();
                                    while (it8.hasNext()) {
                                        zhm.a0.x(((o5l.n) it8.next()).d, arrayList2);
                                    }
                                    if (!arrayList2.isEmpty()) {
                                        Iterator it9 = arrayList2.iterator();
                                        while (it9.hasNext()) {
                                            if (((o5l.i) it9.next()).f.f222475a.d != null) {
                                                zjh.f fVar = this.f191376g;
                                                Intrinsics.checkNotNullParameter("REV_POINTS_MENU_ITEM_LIST_ID", "listId");
                                                Intrinsics.checkNotNullParameter(revPointsBalance, "revPointsBalance");
                                                return ((ryb.c) ((jub.b) fVar.f322835b)).a(revPointsBalance, "REV_POINTS_MENU_ITEM_LIST_ID");
                                            }
                                        }
                                    }
                                }
                            }
                            return null;
                    }
                }
            });
            if (navBarMenuItem != null) {
                arrayList.add(navBarMenuItem);
            }
        }
        return new v(list, tagViewData, cardType, arrayList);
    }
}
