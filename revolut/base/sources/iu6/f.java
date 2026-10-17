package iu6;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.l6;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.ActionNavBarMenuItem;
import com.revolut.feature.freelancer.impl.R$string;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import ms0.h4;
import org.jetbrains.annotations.NotNull;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements b {

    @NotNull
    public static final e Companion = new e();

    @Override // iu6.b
    public final List a(Set availableSaleTypes, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(availableSaleTypes, "availableSaleTypes");
        ActionNavBarMenuItem actionNavBarMenuItemA = d.a();
        if (z3) {
            actionNavBarMenuItemA = null;
        }
        return v.l(actionNavBarMenuItemA);
    }

    @Override // iu6.b
    public final Clause b(boolean z, boolean z3) {
        return null;
    }

    @Override // iu6.b
    public final List c(a context) {
        Intrinsics.checkNotNullParameter(context, "context");
        FullScreenStateDelegate.Model model = new FullScreenStateDelegate.Model("LIST_ID_FULL_STATE_EXPLORE_PLUGINS", new TextLocalisedClause(R$string.freelancer_sales_ecommerce_placeholder_no_content_title, null, null, 14), new TextLocalisedClause(R$string.freelancer_sales_ecommerce_placeholder_no_content_subtitle, null, null, 14), new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D153", null, null, null, 30)), new l6(12, new TextLocalisedClause(R$string.freelancer_sales_ecommerce_placeholder_no_content_action_explore_plugins, null, null, 14), null, h4.ACCENT), null, false, null, null, null, 1888);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return u.c(model);
    }

    @Override // iu6.b
    public final TextLocalisedClause d() {
        return new TextLocalisedClause(R$string.freelancer_sales_header_title_ecommerce, null, null, 14);
    }
}
