package byg;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.popup.PopupMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.wealth.analytics.R$string;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    @NotNull
    public static final C0130a Companion = new C0130a();

    /* JADX INFO: renamed from: byg.a$a, reason: collision with other inner class name */
    public static final class C0130a {
        private C0130a() {
        }
    }

    public final mw0.a a(List categories, vyg.a selectedCategory) {
        String str;
        int i;
        int i2;
        Intrinsics.checkNotNullParameter(categories, "categories");
        Intrinsics.checkNotNullParameter(selectedCategory, "selectedCategory");
        List<vyg.a> list = categories;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (vyg.a aVar : list) {
            PopupMenuItem.Companion companion = PopupMenuItem.INSTANCE;
            int[] iArr = b.f19821a;
            int i3 = iArr[aVar.ordinal()];
            if (i3 == 1) {
                str = "ALLOCATION_BY_ASSET_MENU_ITEM_ID";
            } else if (i3 == 2) {
                str = "ALLOCATION_BY_POSITIONS_MENU_ITEM_ID";
            } else if (i3 == 3) {
                str = "ALLOCATION_BY_SECTOR_MENU_ITEM_ID";
            } else {
                if (i3 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                str = "ALLOCATION_BY_PRODUCT_MENU_ITEM_ID";
            }
            int i5 = iArr[aVar.ordinal()];
            if (i5 == 1) {
                i = R$string.wealth_analytics_widgetised_allocation_allocation_by_asset_name;
            } else if (i5 == 2) {
                i = R$string.wealth_analytics_contributors_tab_positions;
            } else if (i5 == 3) {
                i = R$string.wealth_analytics_widgetised_allocation_allocation_by_sector_name;
            } else {
                if (i5 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                i = R$string.wealth_analytics_widgetised_allocation_allocation_by_product_name;
            }
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i, null, null, 14);
            boolean z = aVar == selectedCategory;
            int i6 = iArr[aVar.ordinal()];
            if (i6 == 1) {
                i2 = R$drawable.uikit_icn_24_avatar_grid;
            } else if (i6 == 2) {
                i2 = R$drawable.uikit_icn_24_view_list_medium;
            } else if (i6 == 3) {
                i2 = R$drawable.uikit_icn_24_services;
            } else {
                if (i6 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                i2 = R$drawable.uikit_icn_24_view_grid;
            }
            arrayList.add(PopupMenuItem.Companion.a(companion, str, textLocalisedClause, z, null, aVar, new ResourceImage(i2, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, 200));
        }
        return zi0.c.d(arrayList);
    }
}
