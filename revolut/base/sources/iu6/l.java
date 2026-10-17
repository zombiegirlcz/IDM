package iu6;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.l6;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.ActionNavBarMenuItem;
import com.revolut.core.ui_kit.views.navbar.LabelNavBarMenuItem;
import com.revolut.core.ui_kit.views.navbar.NavBarMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.freelancer.impl.R$string;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import ms0.h4;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes3.dex */
public final class l implements b {

    @NotNull
    public static final k Companion = new k();

    @Override // iu6.b
    public final List a(Set availableSaleTypes, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(availableSaleTypes, "availableSaleTypes");
        ActionNavBarMenuItem actionNavBarMenuItemA = d.a();
        if (z3) {
            actionNavBarMenuItemA = null;
        }
        NavBarMenuItem[] elements = {actionNavBarMenuItemA, new LabelNavBarMenuItem("MENU_PAYMENTS_LIST_ID", new ResourceImage(R$drawable.uikit_icn_24_repayment, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorBackground), (List) null, (ImageTransformations) null, (Clause) null, 246), new TextLocalisedClause(R$string.freelancer_sales_common_action_payments, null, null, 14), null, null, 504)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return kotlin.collections.d.L(elements);
    }

    @Override // iu6.b
    public final Clause b(boolean z, boolean z3) {
        return null;
    }

    @Override // iu6.b
    public final List c(a context) {
        Intrinsics.checkNotNullParameter(context, "context");
        FullScreenStateDelegate.Model model = new FullScreenStateDelegate.Model("LIST_ID_FULL_STATE_CREATE_NEW_SALE", new TextLocalisedClause(R$string.freelancer_sales_placeholder_no_content_title, null, null, 14), new TextLocalisedClause(R$string.freelancer_sales_placeholder_no_content_subtitle, null, null, 14), new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D086", null, null, null, 30)), !context.f168519a.isEmpty() ? new l6(12, new TextLocalisedClause(R$string.freelancer_sales_placeholder_no_content_action_create_new, null, null, 14), null, h4.WHITE_OR_BLACK_INVERTED) : null, null, false, null, null, null, 1888);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return u.c(model);
    }

    @Override // iu6.b
    public final TextLocalisedClause d() {
        return new TextLocalisedClause(R$string.freelancer_sales_header_title_regular, null, null, 14);
    }
}
