package m98;

import android.os.Parcelable;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.NewRevolutCardDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.l9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.junior.card_request.impl.R$string;
import com.revolut.feature.junior.card_request.impl.ui.screen.request_review.CardRequestReviewScreenContract$InputData;
import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import com.revolut.shared.cards.model.card_config.domain.CardDetailsDesignConfig;
import ip0.dy;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
public final class s implements jki.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c90.c f203669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m93.b f203670b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CardRequestReviewScreenContract$InputData f203671c;
    public final a d;

    public s(c90.c uiResources, m93.b cardDetailsDesignConfigMapper, CardRequestReviewScreenContract$InputData inputData, a cardRequestDetailsSectionProvider) {
        Intrinsics.checkNotNullParameter(uiResources, "uiResources");
        Intrinsics.checkNotNullParameter(cardDetailsDesignConfigMapper, "cardDetailsDesignConfigMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(cardRequestDetailsSectionProvider, "cardRequestDetailsSectionProvider");
        this.f203669a = uiResources;
        this.f203670b = cardDetailsDesignConfigMapper;
        this.f203671c = inputData;
        this.d = cardRequestDetailsSectionProvider;
    }

    @Override // jki.p
    public final jki.m a(jki.i iVar) {
        f domainState = (f) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Data data = domainState.f203640c;
        Data data2 = domainState.d;
        final int i = 0;
        List list = (List) iii.c.f(t1.t(data, data2), new m62.l(24), new m56.g(21), new Function3(this) { // from class: m98.q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ s f203666b;

            {
                this.f203666b = this;
            }

            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                o5l.g gVar;
                String str;
                switch (i) {
                    case 0:
                        Pair pair = (Pair) obj2;
                        ((Boolean) obj3).getClass();
                        Intrinsics.checkNotNullParameter(pair, "<destruct>");
                        jc8.a aVar = (jc8.a) pair.f186385a;
                        CardDetailsDesignConfig cardDetailsDesignConfig = (CardDetailsDesignConfig) pair.f186386b;
                        aim.e eVarB = u.b();
                        l9 l9Var = new l9(v04.b.k(aVar.f172750c, null), null, null, null, null, 48);
                        s sVar = this.f203666b;
                        m93.b bVar = sVar.f203670b;
                        e93.b bVar2 = aVar.f172749b;
                        int i2 = r.f203668b[sVar.f203669a.a().ordinal()];
                        if (i2 == 1) {
                            gVar = o5l.g.MDPI;
                        } else if (i2 == 2) {
                            gVar = o5l.g.HDPI;
                        } else if (i2 == 3) {
                            gVar = o5l.g.XHDPI;
                        } else if (i2 == 4) {
                            gVar = o5l.g.XXHDPI;
                        } else {
                            if (i2 != 5) {
                                throw new NoWhenBranchMatchedException();
                            }
                            gVar = o5l.g.XXXHDPI;
                        }
                        dy dyVarD = ((ia3.e) bVar).d(bVar2, cardDetailsDesignConfig, gVar);
                        jc8.b bVar3 = aVar.d;
                        eVarB.add(new NewRevolutCardDelegate.Model("ID_CARD_PREVIEW", l9Var, null, dyVarD, (bVar3 == null || (str = bVar3.f172752b) == null) ? null : new UrlImage(str, null, null, null, 0L, null, null, null, null, null, true, null, null, null, false, false, 520190), 23776));
                        return u.a(eVarB);
                    default:
                        Pair pair2 = (Pair) obj2;
                        ((Boolean) obj3).getClass();
                        Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                        JuniorBankingProfile profile = (JuniorBankingProfile) pair2.f186385a;
                        Address parentAddress = (Address) pair2.f186386b;
                        s sVar2 = this.f203666b;
                        a aVar2 = sVar2.d;
                        int i3 = r.f203667a[sVar2.f203671c.f76731b.ordinal()];
                        if (i3 == 1) {
                            return yp0.b.g(v.k(new RowDelegate.Model("SHOP_ONLINE_ITEM_ID", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_globe, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, false, 6), new TextLocalisedClause(R$string.junior_card_request_virtual_item_shop_online_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.junior_card_request_virtual_item_shop_online_subtitle, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824), new RowDelegate.Model("SHOP_SECURELY_ITEM_ID", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_card_shield, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, false, 6), new TextLocalisedClause(R$string.junior_card_request_virtual_item_shop_securely_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.junior_card_request_virtual_item_shop_securely_subtitle, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824), new RowDelegate.Model("SHOP_IN_STORE_ITEM_ID", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_google_pay, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, false, 6), new TextLocalisedClause(R$string.junior_card_request_virtual_item_shop_in_store_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.junior_card_request_virtual_item_shop_in_store_subtitle, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824)), new ListSubheaderDelegate.Model("VIRTUAL_BENEFITS_SUB_HEADER_ITEM_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.junior_card_request_virtual_items_header, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126);
                        }
                        if (i3 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        Intrinsics.checkNotNullParameter(profile, "profile");
                        Intrinsics.checkNotNullParameter(parentAddress, "parentAddress");
                        return yp0.b.g(v.k(new RowDelegate.Model(profile.f77103j, new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_profile, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, false, 6), new TextLocalisedClause(R$string.junior_card_request_card_name_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.junior_card_request_item_name, u.c(ta6.a.t(profile)), null, 12), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824), new RowDelegate.Model(profile.f77103j, new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_delivery_car, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, false, 6), new TextLocalisedClause(R$string.junior_card_request_delivery_address_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.junior_card_request_item_address, u.c(o51.a.b(parentAddress, ((s80.b) aVar2.f203635a).b())), null, 12), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824)), new ListSubheaderDelegate.Model("REVIEW_DETAILS_SUB_HEADER_ITEM_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.junior_card_request_items_header, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126);
                }
            }
        });
        Data data3 = domainState.f203638a;
        final int i2 = 1;
        List list2 = (List) iii.c.f(t1.t(data3, domainState.f203639b), new m62.l(26), new m56.g(22), new Function3(this) { // from class: m98.q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ s f203666b;

            {
                this.f203666b = this;
            }

            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                o5l.g gVar;
                String str;
                switch (i2) {
                    case 0:
                        Pair pair = (Pair) obj2;
                        ((Boolean) obj3).getClass();
                        Intrinsics.checkNotNullParameter(pair, "<destruct>");
                        jc8.a aVar = (jc8.a) pair.f186385a;
                        CardDetailsDesignConfig cardDetailsDesignConfig = (CardDetailsDesignConfig) pair.f186386b;
                        aim.e eVarB = u.b();
                        l9 l9Var = new l9(v04.b.k(aVar.f172750c, null), null, null, null, null, 48);
                        s sVar = this.f203666b;
                        m93.b bVar = sVar.f203670b;
                        e93.b bVar2 = aVar.f172749b;
                        int i22 = r.f203668b[sVar.f203669a.a().ordinal()];
                        if (i22 == 1) {
                            gVar = o5l.g.MDPI;
                        } else if (i22 == 2) {
                            gVar = o5l.g.HDPI;
                        } else if (i22 == 3) {
                            gVar = o5l.g.XHDPI;
                        } else if (i22 == 4) {
                            gVar = o5l.g.XXHDPI;
                        } else {
                            if (i22 != 5) {
                                throw new NoWhenBranchMatchedException();
                            }
                            gVar = o5l.g.XXXHDPI;
                        }
                        dy dyVarD = ((ia3.e) bVar).d(bVar2, cardDetailsDesignConfig, gVar);
                        jc8.b bVar3 = aVar.d;
                        eVarB.add(new NewRevolutCardDelegate.Model("ID_CARD_PREVIEW", l9Var, null, dyVarD, (bVar3 == null || (str = bVar3.f172752b) == null) ? null : new UrlImage(str, null, null, null, 0L, null, null, null, null, null, true, null, null, null, false, false, 520190), 23776));
                        return u.a(eVarB);
                    default:
                        Pair pair2 = (Pair) obj2;
                        ((Boolean) obj3).getClass();
                        Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                        JuniorBankingProfile profile = (JuniorBankingProfile) pair2.f186385a;
                        Address parentAddress = (Address) pair2.f186386b;
                        s sVar2 = this.f203666b;
                        a aVar2 = sVar2.d;
                        int i3 = r.f203667a[sVar2.f203671c.f76731b.ordinal()];
                        if (i3 == 1) {
                            return yp0.b.g(v.k(new RowDelegate.Model("SHOP_ONLINE_ITEM_ID", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_globe, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, false, 6), new TextLocalisedClause(R$string.junior_card_request_virtual_item_shop_online_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.junior_card_request_virtual_item_shop_online_subtitle, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824), new RowDelegate.Model("SHOP_SECURELY_ITEM_ID", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_card_shield, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, false, 6), new TextLocalisedClause(R$string.junior_card_request_virtual_item_shop_securely_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.junior_card_request_virtual_item_shop_securely_subtitle, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824), new RowDelegate.Model("SHOP_IN_STORE_ITEM_ID", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_google_pay, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, false, 6), new TextLocalisedClause(R$string.junior_card_request_virtual_item_shop_in_store_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.junior_card_request_virtual_item_shop_in_store_subtitle, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824)), new ListSubheaderDelegate.Model("VIRTUAL_BENEFITS_SUB_HEADER_ITEM_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.junior_card_request_virtual_items_header, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126);
                        }
                        if (i3 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        Intrinsics.checkNotNullParameter(profile, "profile");
                        Intrinsics.checkNotNullParameter(parentAddress, "parentAddress");
                        return yp0.b.g(v.k(new RowDelegate.Model(profile.f77103j, new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_profile, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, false, 6), new TextLocalisedClause(R$string.junior_card_request_card_name_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.junior_card_request_item_name, u.c(ta6.a.t(profile)), null, 12), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824), new RowDelegate.Model(profile.f77103j, new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_delivery_car, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, false, 6), new TextLocalisedClause(R$string.junior_card_request_delivery_address_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.junior_card_request_item_address, u.c(o51.a.b(parentAddress, ((s80.b) aVar2.f203635a).b())), null, 12), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824)), new ListSubheaderDelegate.Model("REVIEW_DETAILS_SUB_HEADER_ITEM_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.junior_card_request_items_header, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126);
                }
            }
        });
        g gVar = (g) iii.c.f(data3, new m62.l(27), new m56.g(23), new ldj.g(this, 16));
        boolean zBooleanValue = ((Boolean) iii.c.f(t1.t(domainState.f203640c, data2), new m62.l(25), new m56.g(20), new ldj.g(17))).booleanValue();
        List listO = i2b.a.o(list, list2);
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        for (Object obj2 : listO) {
            boolean z3 = true;
            if (Intrinsics.f(((koi.j) obj2).getF55069b(), "ERROR_STATE_ID")) {
                if (z) {
                    z3 = false;
                } else {
                    z = true;
                }
            }
            if (z3) {
                arrayList.add(obj2);
            }
        }
        return new j(gVar, arrayList, zBooleanValue);
    }
}
