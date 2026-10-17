package a4b;

import android.os.Parcelable;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.BasketDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ReferralContactDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.j1;
import com.revolut.core.ui_kit.delegates.widgets.ContactsWidgetDelegate;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.internal.views.ProgressStyle;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.NewBadgeContent;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.avatar.AvatarModel;
import com.revolut.core.ui_kit.models.badge.CircleBadgeModel;
import com.revolut.core.ui_kit.models.badge.CircleIconBadge;
import com.revolut.core.ui_kit.models.badge.DangerCircleBadge;
import com.revolut.core.ui_kit.models.badge.FlagCircleBadge;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.StylableContactImage$Style;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UserAvatarImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UserNamePlaceholder;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.profile.api.R$string;
import com.revolut.feature.wealth.analytics.widgetised.navigation.WidgetisedAnalyticsType;
import com.revolut.feature.wealth_discovery.impl.screener.screens.all_collections_redesign.ScreenerAllCollectionsRedesignContract$CollectionsPagerItem;
import com.revolut.shared.feature.wealth.models.screener.ScreenerCollection;
import hha.w0;
import ia3.t;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import k8d.s;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import ku1.f0;
import o97.m0;
import te0.w;
import zhm.u;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class i implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f1241b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1242c;
    public final /* synthetic */ Object d;

    public /* synthetic */ i(Object obj2, Object obj3, boolean z, int i) {
        this.f1240a = i;
        this.f1242c = obj2;
        this.d = obj3;
        this.f1241b = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object a(java.lang.Object r40, java.lang.Object r41, java.lang.Object r42) {
        /*
            Method dump skipped, instruction units count: 393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a4b.i.a(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private final Object b(Object obj2, Object obj3, Object obj4) {
        final kbb.f fVar = (kbb.f) this.f1242c;
        Data data = (Data) this.d;
        do3.n user = (do3.n) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(user, "user");
        final int i = 1;
        AvatarModel.BadgeModel badgeModel = null;
        UserAvatarImage userAvatarImage = new UserAvatarImage(new UserNamePlaceholder.Animated(w.I(user)), (StylableContactImage$Style) iii.c.f(data, new k9h.d(14), new s(14), new Function3() { // from class: kbb.d
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj5, Object obj6, Object obj7) {
                int i2 = i;
                w0 tier = (w0) obj5;
                ((Boolean) obj6).getClass();
                switch (i2) {
                    case 0:
                        Intrinsics.checkNotNullParameter(tier, "tier");
                        return fVar.f182553a.c(tier);
                    default:
                        Intrinsics.checkNotNullParameter(tier, "tier");
                        return fVar.f182553a.d(tier);
                }
            }
        }), new TextLocalisedClause(R$string.profile_entryPoint_accessibility_title, null, null, 14));
        final int i2 = 0;
        AvatarModel.Border border = (AvatarModel.Border) iii.c.f(data, new k9h.d(13), new s(13), new Function3() { // from class: kbb.d
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj5, Object obj6, Object obj7) {
                int i22 = i2;
                w0 tier = (w0) obj5;
                ((Boolean) obj6).getClass();
                switch (i22) {
                    case 0:
                        Intrinsics.checkNotNullParameter(tier, "tier");
                        return fVar.f182553a.c(tier);
                    default:
                        Intrinsics.checkNotNullParameter(tier, "tier");
                        return fVar.f182553a.d(tier);
                }
            }
        });
        if (this.f1241b) {
            badgeModel = new AvatarModel.BadgeModel(new DangerCircleBadge(dw0.a.Suspicious), com.revolut.core.ui_kit.models.avatar.b.BOTTOM);
        } else {
            Address address = user.k;
            String country = address != null ? address.getCountry() : null;
            if (fVar.f182554b.E() && country != null && !d0.W(country)) {
                badgeModel = new AvatarModel.BadgeModel(new FlagCircleBadge(country), com.revolut.core.ui_kit.models.avatar.b.BOTTOM);
            }
        }
        return new itb.a(new AvatarModel.Default(userAvatarImage, null, border, null, badgeModel, null, 106));
    }

    private final Object c(Object obj2, Object obj3, Object obj4) {
        kwg.l lVar = (kwg.l) this.f1242c;
        WidgetisedAnalyticsType widgetisedAnalyticsType = (WidgetisedAnalyticsType) this.d;
        String userId = (String) obj2;
        xi0.b currency = (xi0.b) obj3;
        iwg.a analyticsProductType = (iwg.a) obj4;
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(analyticsProductType, "analyticsProductType");
        wvg.h hVar = lVar.d;
        iwg.a analyticsProductType2 = kwg.l.a(analyticsProductType);
        String strB = kwg.l.b(widgetisedAnalyticsType);
        hVar.getClass();
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(analyticsProductType2, "analyticsProductType");
        Intrinsics.checkNotNullParameter(currency, "currency");
        return nim.a.w(nim.a.w(hVar.d.f(new wvg.a(userId, analyticsProductType2, this.f1241b, currency, strB), true), new kp0.q(analyticsProductType, new f0(21), 18)), new kv7.g(analyticsProductType, 7));
    }

    private final Object d(Object obj2, Object obj3, Object obj4) {
        ArrayList arrayList;
        int i;
        oph.o oVar = (oph.o) this.f1242c;
        oph.a aVar = (oph.a) this.d;
        List collections = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(collections, "collections");
        ScreenerAllCollectionsRedesignContract$CollectionsPagerItem screenerAllCollectionsRedesignContract$CollectionsPagerItem = aVar.f227658a;
        ScreenerAllCollectionsRedesignContract$CollectionsPagerItem.Custom custom = ScreenerAllCollectionsRedesignContract$CollectionsPagerItem.Custom.f96203a;
        if (Intrinsics.f(screenerAllCollectionsRedesignContract$CollectionsPagerItem, custom)) {
            arrayList = new ArrayList();
            for (Object obj5 : collections) {
                if (((ScreenerCollection) obj5).f105158h == zel.d.USER) {
                    arrayList.add(obj5);
                }
            }
        } else {
            if (!(screenerAllCollectionsRedesignContract$CollectionsPagerItem instanceof ScreenerAllCollectionsRedesignContract$CollectionsPagerItem.RevolutGroup)) {
                throw new NoWhenBranchMatchedException();
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj6 : collections) {
                ScreenerCollection screenerCollection = (ScreenerCollection) obj6;
                if (screenerCollection.f105158h == zel.d.REVOLUT && oVar.f227676a.a(screenerCollection.f105157g) == ((ScreenerAllCollectionsRedesignContract$CollectionsPagerItem.RevolutGroup) screenerAllCollectionsRedesignContract$CollectionsPagerItem).f96204a) {
                    arrayList2.add(obj6);
                }
            }
            arrayList = arrayList2;
        }
        ArrayList arrayList3 = new ArrayList(zhm.w.t(arrayList, 10));
        Iterator it8 = arrayList.iterator();
        while (true) {
            if (!it8.hasNext()) {
                break;
            }
            ScreenerCollection screenerCollection2 = (ScreenerCollection) it8.next();
            Map map = (Map) aVar.e.getContent();
            List list = map != null ? (List) map.get(screenerCollection2.f105154a) : null;
            if (list == null) {
                list = zhm.f0.f322471a;
            }
            String str = screenerCollection2.f105154a;
            j1 j1Var = screenerCollection2.f105158h == zel.d.USER ? j1.VERTICAL : j1.HORIZONTAL;
            LayeredImage layeredImageA = oVar.f227677b.a(screenerCollection2);
            TextClause textClause = new TextClause(screenerCollection2.f105156c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            String str2 = screenerCollection2.d;
            BasketDelegate.Model model = new BasketDelegate.Model(str, j1Var, layeredImageA, textClause, str2 != null ? new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, oVar.f227678c.a(list), new oph.b(screenerCollection2), 320);
            yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
            arrayList3.add(model);
        }
        List listA = oph.o.a(arrayList3, this.f1241b);
        boolean z = aVar.f227660c;
        aim.e eVarB = u.b();
        ScreenerAllCollectionsRedesignContract$CollectionsPagerItem pagerItem = aVar.f227658a;
        int size = ((ArrayList) listA).size();
        String strQ = j6.a.q("screener-collections-page-header-", pagerItem.getF94249a());
        Intrinsics.checkNotNullParameter(pagerItem, "pagerItem");
        if (pagerItem.equals(custom)) {
            i = com.revolut.retail.wealth.resources.R$string.screener_collections_section_collection_user_created_title;
        } else {
            if (!(pagerItem instanceof ScreenerAllCollectionsRedesignContract$CollectionsPagerItem.RevolutGroup)) {
                throw new NoWhenBranchMatchedException();
            }
            int i2 = nph.c.f218219a[((ScreenerAllCollectionsRedesignContract$CollectionsPagerItem.RevolutGroup) pagerItem).f96204a.ordinal()];
            if (i2 == 1) {
                i = com.revolut.retail.wealth.resources.R$string.screener_collections_section_collection_stocks_title;
            } else if (i2 == 2) {
                i = z ? com.revolut.retail.wealth.resources.R$string.screener_collections_section_collection_etps_title : com.revolut.retail.wealth.resources.R$string.screener_collections_section_collection_etfs_title;
            } else if (i2 == 3) {
                i = com.revolut.retail.wealth.resources.R$string.screener_collections_section_collection_bonds_title;
            } else {
                if (i2 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                i = com.revolut.retail.wealth.resources.R$string.screener_collections_section_collection_cfds_title;
            }
        }
        eVarB.add(new ListSubheaderDelegate.Model(strQ, (Image) null, (Clause) new TextLocalisedClause(i, u.c(Integer.valueOf(size)), null, 12), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530));
        eVarB.addAll(listA);
        Data data = aVar.d;
        List listB = data != null ? ((aah.m) oVar.d).b(data) : null;
        if (listB == null) {
            listB = zhm.f0.f322471a;
        }
        eVarB.addAll(listB);
        return u.a(eVarB);
    }

    private final Object e(Object obj2, Object obj3, Object obj4) {
        os5.d dVar = (os5.d) this.f1242c;
        ia3.r rVar = dVar.f229231c;
        os5.a aVar = dVar.f229232g;
        String str = (String) this.d;
        Pair content = (Pair) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        List list = (List) content.f186385a;
        yt8.c cVar = (yt8.c) content.f186386b;
        if (list.isEmpty()) {
            return dVar.i(str, op0.q.MEDIUM, aVar.a(), this.f1241b);
        }
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.feature.crypto_feed.impl.R$string.crypto_home_feed_widget_cards_header_title, null, null, 14);
        List<h93.f0> list2 = list;
        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
        for (h93.f0 f0Var : list2) {
            String str2 = f0Var.f150110a;
            com.revolut.core.ui_kit.models.avatar.d dVar2 = com.revolut.core.ui_kit.models.avatar.d.LARGE;
            Image imageE = ((t) dVar.d).e(true, f0Var, cVar.f316662a);
            yt8.i iVar = cVar.f316662a;
            CircleIconBadge circleIconBadgeL = rVar.l(f0Var, iVar);
            n93.a aVarP = rVar.p(f0Var, iVar);
            arrayList.add(new ReferralContactDelegate.Model(str2, new AvatarModel.Card(imageE, aVarP != null ? new AvatarModel.Border.AnimatedGradient(aVarP.f213546a, com.revolut.core.ui_kit.models.avatar.c.RECTANGLE) : null, circleIconBadgeL, dVar2, 34), m93.f.a(rVar, f0Var, null, 26), rVar.q(f0Var), null, null, f0Var, null, 6128));
        }
        List listA = aVar.a();
        return new ContactsWidgetDelegate.Model(str, zhm.d0.F0(new ReferralContactDelegate.Model("ADD_NEW_CARD_LIST_ID", new AvatarModel.AddCard((Image) listA.get(0), (Image) listA.get(1)), new TextLocalisedClause(com.revolut.feature.crypto_feed.impl.R$string.crypto_home_feed_widget_cards_get_card, null, new Custom(new Custom.Color.Solid(R$attr.uikit_colorAccentNeutral), false, false, 254), 10), null, null, null, null, null, 8184), arrayList), textLocalisedClause, false, null, null, 56);
    }

    /* JADX WARN: Removed duplicated region for block: B:89:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x021f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object g(java.lang.Object r51, java.lang.Object r52, java.lang.Object r53) {
        /*
            Method dump skipped, instruction units count: 797
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a4b.i.g(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private final Object h(Object obj2, Object obj3, Object obj4) {
        vk5.c cVar = (vk5.c) this.f1242c;
        String str = (String) this.d;
        xj5.a content = (xj5.a) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        ArrayList arrayListF1 = zhm.d0.f1(content.f306502a);
        arrayListF1.addAll(content.f306503b);
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (Object obj5 : arrayListF1) {
            if (hashSet.add(((zm3.l) obj5).N0())) {
                arrayList.add(obj5);
            }
        }
        List contacts = zhm.d0.P0(arrayList, new vk5.b());
        aim.e eVarB = u.b();
        if (!this.f1241b && str.length() == 0) {
            CircleBadgeModel circleBadgeModel = null;
            ProgressStyle progressStyle = null;
            boolean z = false;
            NewBadgeContent newBadgeContent = null;
            RowDelegate.Model model = new RowDelegate.Model("REVOLUT_FRIENDS_PERMISSION_ITEM_ID", new RowDelegate.Model.MainImage.Image40(LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_profile, Integer.valueOf(R$attr.uikit_colorAccent), R$attr.uikit_colorAccent_10, 12.0f, null, null, 48), circleBadgeModel, progressStyle, z, newBadgeContent, false, 62), new TextLocalisedClause(com.revolut.feature.crypto.remittance.impl.R$string.crypto_withdrawals_common_action_enable_permission_title, null, null, 14), null, 0, new TextLocalisedClause(com.revolut.feature.crypto.remittance.impl.R$string.crypto_withdrawals_common_action_enable_permission_subtitle, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872);
            yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
            eVarB.add(model);
        }
        if (str.length() == 0) {
            CircleBadgeModel circleBadgeModel2 = null;
            ProgressStyle progressStyle2 = null;
            boolean z3 = false;
            NewBadgeContent newBadgeContent2 = null;
            RowDelegate.Model model2 = new RowDelegate.Model("REVOLUT_FRIENDS_ADD_NEW_CONTACT_ITEM_ID", new RowDelegate.Model.MainImage.Image40(LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_plus, Integer.valueOf(R$attr.uikit_colorAccent), R$attr.uikit_colorAccent_10, 12.0f, null, null, 48), circleBadgeModel2, progressStyle2, z3, newBadgeContent2, false, 62), new TextLocalisedClause(com.revolut.feature.crypto.remittance.impl.R$string.crypto_withdrawals_common_action_add_contact_title, null, new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), 10), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870904);
            yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
            eVarB.add(model2);
        }
        if (!contacts.isEmpty()) {
            ListSubheaderDelegate.Model model3 = new ListSubheaderDelegate.Model("REVOLUT_FRIENDS_HEADER_ID", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.crypto.remittance.impl.R$string.crypto_receive_screen_deposit_destination_tabs_friends, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, R$attr.uikit_dp8, 0, 0, 57338);
            xl3.d dVar = (xl3.d) cVar.f289861a;
            Intrinsics.checkNotNullParameter(contacts, "contacts");
            List list = contacts;
            ArrayList arrayList2 = new ArrayList(zhm.w.t(list, 10));
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                arrayList2.add(dVar.m((zm3.a) it8.next()));
            }
            yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
            eVarB.addAll(i2b.a.q(model3, arrayList2));
        } else if (!d0.W(str)) {
            FullScreenStateDelegate.Model model4 = new FullScreenStateDelegate.Model("NO_SEARCH_RESULT_LIST_ID", new TextLocalisedClause(com.revolut.feature.crypto.remittance.impl.R$string.crypto_withdrawals_common_search_no_results_title, null, null, 14), new TextLocalisedClause(com.revolut.retail.feature.balance.picker.api.R$string.balance_picker_search_no_result_title, u.c(str), null, 12), new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D086", null, null, null, 30)), null, null, false, null, null, false, 0, 0, 32752);
            yp0.b.l(model4, 0, 0, 0, 0, null, false, 63);
            eVarB.add(model4);
        }
        return u.a(eVarB);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:215:0x07ec  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0807  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0840  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x085c  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0880  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x08a4  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x08e9  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0931  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0961  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x097a  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0bc5  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0c01  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x0c04  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0c17  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x0c1b  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x0c3d  */
    /* JADX WARN: Type inference failed for: r12v0, types: [com.revolut.core.ui_kit.models.TextLocalisedClause, com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v3 */
    @Override // kotlin.jvm.functions.Function3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r81, java.lang.Object r82, java.lang.Object r83) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 3526
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a4b.i.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ i(Object obj2, boolean z, Object obj3, int i) {
        this.f1240a = i;
        this.f1242c = obj2;
        this.f1241b = z;
        this.d = obj3;
    }

    public /* synthetic */ i(Object obj2, boolean z, Object obj3, Object obj4, int i) {
        this.f1240a = i;
        this.f1241b = z;
        this.f1242c = obj3;
        this.d = obj4;
    }

    public /* synthetic */ i(boolean z, Data data, clh.b bVar, m0 m0Var) {
        this.f1240a = 3;
        this.f1241b = z;
        this.f1242c = data;
        this.d = m0Var;
    }

    public /* synthetic */ i(boolean z, Object obj2, Object obj3, int i) {
        this.f1240a = i;
        this.f1241b = z;
        this.f1242c = obj2;
        this.d = obj3;
    }
}
