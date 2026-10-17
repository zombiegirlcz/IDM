package iu6;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.l6;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.freelancer.impl.R$string;
import java.util.List;
import ms0.h4;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static List a(String str, boolean z) {
        TextLocalisedClause textLocalisedClause;
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.freelancer_sales_filters_no_results_title, null, null, 14);
        if (z) {
            textLocalisedClause = new TextLocalisedClause(R$string.freelancer_sales_filters_no_results_subtitle, null, null, 14);
        } else {
            int i = R$string.freelancer_business_category_picker_search_no_results_subtitle;
            if (str == null) {
                str = "";
            }
            textLocalisedClause = new TextLocalisedClause(i, u.c(new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
        }
        FullScreenStateDelegate.Model model = new FullScreenStateDelegate.Model("LIST_ID_FULL_STATE_NO_RESULTS", textLocalisedClause2, textLocalisedClause, new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D086", null, null, null, 30)), z ? new l6(12, new TextLocalisedClause(R$string.freelancer_sales_filters_no_results_action_clear_filters, null, null, 14), null, h4.WHITE_OR_BLACK_INVERTED) : null, null, false, null, null, null, 1888);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return u.c(model);
    }
}
