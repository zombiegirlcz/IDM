package u17;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.freelancer.impl.R$string;
import java.util.List;
import zhm.u;

/* JADX INFO: loaded from: classes3.dex */
public final class l {
    public static ActionsView.Item a(int i) {
        return new ActionsView.Item("FILTERS_CHIP", mx0.d.SEMIBLACK, false, null, null, i > 0 ? new TextLocalisedClause(R$string.freelancer_sales_filters_title_selected, u.c(Integer.valueOf(i)), null, 12) : new TextLocalisedClause(R$string.freelancer_common_word_filters, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_filter, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, false, null, null, null, null, 32668);
    }
}
