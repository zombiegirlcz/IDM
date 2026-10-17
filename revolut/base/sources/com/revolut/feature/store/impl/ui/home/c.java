package com.revolut.feature.store.impl.ui.home;

import aw0.e4;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.FloatingBottomBarView;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.store.api.R$string;
import com.revolut.feature.store.api.declaration.StoreApi$Toggles$StoreDealsAndBrands;
import com.revolut.feature.store.api.declaration.StoreApi$Toggles$StoreExclusives;
import com.revolut.feature.store.impl.ui.home.StoreHomeFlowContract$PagerItem;
import h30.q;
import i3e.g;
import i3e.i;
import java.util.List;
import jte.d;
import kotlin.jvm.internal.Intrinsics;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f88707a;

    public c(q storeAvailabilityInteractor) {
        Intrinsics.checkNotNullParameter(storeAvailabilityInteractor, "storeAvailabilityInteractor");
        this.f88707a = storeAvailabilityInteractor;
    }

    @Override // cli.n
    public final o c(j jVar) {
        g domainState = (g) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        FloatingBottomBarView.Item item = new FloatingBottomBarView.Item("HOME_TABS_DEALS_ID", new TextLocalisedClause(R$string.store_home_tabs_deals_title, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_shopping, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, 24);
        q qVar = this.f88707a;
        gte.a aVar = (gte.a) qVar.f148941b;
        StoreApi$Toggles$StoreDealsAndBrands storeApi$Toggles$StoreDealsAndBrands = StoreApi$Toggles$StoreDealsAndBrands.f88420c;
        if (!((d) aVar).c(storeApi$Toggles$StoreDealsAndBrands)) {
            item = null;
        }
        FloatingBottomBarView.Item item2 = new FloatingBottomBarView.Item("HOME_TABS_EXCLUSIVES_ID", new TextLocalisedClause(R$string.store_home_tabs_exclusives_title, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_revolut, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, 24);
        StoreApi$Toggles$StoreExclusives storeApi$Toggles$StoreExclusives = StoreApi$Toggles$StoreExclusives.f88421c;
        if (!((d) aVar).c(storeApi$Toggles$StoreExclusives)) {
            item2 = null;
        }
        FloatingBottomBarView.Item item3 = new FloatingBottomBarView.Item("HOME_TABS_BRANDS_ID", new TextLocalisedClause(R$string.store_home_tabs_brands_title, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_list_search, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, 24);
        if (!((d) aVar).c(storeApi$Toggles$StoreDealsAndBrands)) {
            item3 = null;
        }
        FloatingBottomBarView.Item[] elements = {item, item2, item3, (((d) aVar).c(storeApi$Toggles$StoreExclusives) || ((jwb.c) ((svb.a) qVar.d)).a()) ? new FloatingBottomBarView.Item("HOME_TABS_YOUR_ITEMS_ID", new TextLocalisedClause(R$string.store_home_tabs_orders_title, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_cart, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, 24) : null};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        String str = domainState.f158186b;
        boolean zF = Intrinsics.f(str, StoreHomeFlowContract$PagerItem.Deals.f88696a.getF94249a());
        StoreHomeFlowContract$PagerItem.Brands brands = StoreHomeFlowContract$PagerItem.Brands.f88695a;
        String str2 = "HOME_TABS_DEALS_ID";
        if (!zF) {
            if (Intrinsics.f(str, StoreHomeFlowContract$PagerItem.Exclusives.f88697a.getF94249a())) {
                str2 = "HOME_TABS_EXCLUSIVES_ID";
            } else if (Intrinsics.f(str, brands.getF94249a())) {
                str2 = "HOME_TABS_BRANDS_ID";
            } else if (Intrinsics.f(str, StoreHomeFlowContract$PagerItem.YourItems.f88698a.getF94249a())) {
                str2 = "HOME_TABS_YOUR_ITEMS_ID";
            }
        }
        return new i(listL, str2, !Intrinsics.f(domainState.f158186b, brands.getF94249a()) ? e4.GONE : domainState.f158187c ? e4.ACTIVE : e4.INACTIVE, v.l(domainState.d.getContent()));
    }
}
