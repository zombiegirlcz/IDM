package iu6;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.ActionNavBarMenuItem;
import com.revolut.core.ui_kit.views.navbar.NavBarMenuItem;
import com.revolut.core.ui_kit.views.navbar.PlusActionNavBarMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.freelancer.impl.R$string;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements b {

    @NotNull
    public static final g Companion = new g();

    public static RowDelegate.Model e(int i, TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2, String str) {
        LayeredImage layeredImageB = LayeredImage.Companion.b(LayeredImage.INSTANCE, i, Integer.valueOf(R$attr.uikit_colorForeground), R$attr.uikit_colorForeground_10, 8.0f, Float.valueOf(24.0f), null, 32);
        yy0.i iVar = yy0.l.Companion;
        ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_16_chevron_right_small, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246);
        iVar.getClass();
        return new RowDelegate.Model(str, layeredImageB, null, null, textLocalisedClause, textLocalisedClause2, null, null, 0, new tf(yy0.i.a(resourceImage)), false, false, null, null, null, null, null, null, null, 0, 0, 0, 0, 1073739628);
    }

    @Override // iu6.b
    public final List a(Set availableSaleTypes, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(availableSaleTypes, "availableSaleTypes");
        if (z3) {
            return f0.f322471a;
        }
        ActionNavBarMenuItem actionNavBarMenuItemA = d.a();
        ActionNavBarMenuItem actionNavBarMenuItem = new ActionNavBarMenuItem("MENU_CARD_READER_SETTINGS_LIST_ID", new ResourceImage(R$drawable.uikit_icn_24_card_reader, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        PlusActionNavBarMenuItem plusActionNavBarMenuItem = null;
        if (!z) {
            actionNavBarMenuItem = null;
        }
        PlusActionNavBarMenuItem plusActionNavBarMenuItemC = PlusActionNavBarMenuItem.Companion.c(PlusActionNavBarMenuItem.INSTANCE, "MENU_NEW_SALE_LIST_ID", new TextLocalisedClause(R$string.freelancer_common_action_new, null, null, 14), null, 60);
        Set set = availableSaleTypes;
        if (!(set instanceof Collection) || !set.isEmpty()) {
            Iterator it8 = set.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    break;
                }
                cs6.c cVar = (cs6.c) it8.next();
                cs6.c.Companion.getClass();
                if (cs6.c.inPersonSaleTypes.contains(cVar)) {
                    plusActionNavBarMenuItem = plusActionNavBarMenuItemC;
                    break;
                }
            }
        }
        NavBarMenuItem[] elements = {actionNavBarMenuItemA, actionNavBarMenuItem, plusActionNavBarMenuItem};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return kotlin.collections.d.L(elements);
    }

    @Override // iu6.b
    public final Clause b(boolean z, boolean z3) {
        if (z && z3) {
            return new TextLocalisedClause(R$string.freelancer_sale_in_person_selector_header_caption, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10);
        }
        return null;
    }

    @Override // iu6.b
    public final List c(a context) {
        RowDelegate.Model modelE;
        RowDelegate.Model modelE2;
        Intrinsics.checkNotNullParameter(context, "context");
        if (context.f168521c) {
            modelE = e(R$drawable.uikit_icn_24_card_terminal, new TextLocalisedClause(R$string.freelancer_sale_in_person_selector_v2_item_revolut_terminal_order_title, null, null, 14), new TextLocalisedClause(R$string.freelancer_sale_in_person_selector_v2_item_revolut_terminal_order_subtitle, null, null, 14), "PRODUCT_CREATE_TERMINAL_SALE_LIST_ID");
        } else {
            modelE = null;
        }
        if (context.f168519a.contains(cs6.c.CARD_READER) && context.f168520b) {
            modelE2 = e(R$drawable.uikit_icn_24_card_reader, new TextLocalisedClause(R$string.freelancer_sale_in_person_selector_v2_item_card_reader_create_title, null, null, 14), new TextLocalisedClause(R$string.freelancer_sale_in_person_selector_v2_item_card_reader_subtitle, null, null, 14), "PRODUCT_CREATE_CARD_READER_SALE_LIST_ID");
        } else {
            modelE2 = null;
        }
        RowDelegate.Model[] elements = {modelE, modelE2};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        yp0.b.k(listL, 0, 0, 0, 0, 31);
        if (listL.isEmpty()) {
            FullScreenStateDelegate.Model model = new FullScreenStateDelegate.Model("IN_PERSON_SALES_UNAVAILABLE_LIST_ID", new TextLocalisedClause(com.revolut.kompot.common.R$string.common_error_state_title, null, null, 14), null, new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D018", null, null, null, 30)), null, null, false, null, null, false, 0, 0, 31732);
            yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
            listL = u.c(model);
        }
        return listL;
    }

    @Override // iu6.b
    public final TextLocalisedClause d() {
        return new TextLocalisedClause(R$string.freelancer_sales_header_title_in_person, null, null, 14);
    }
}
