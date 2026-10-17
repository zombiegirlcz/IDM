package l97;

import aw0.o9;
import com.onfido.android.sdk.capture.utils.yearclass.YearClass;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.globalsearch.api.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class a {
    public static List a(String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        return zhm.u.c(new FullScreenStateDelegate.Model("no_result", new TextLocalisedClause(R$string.common_state_empty_search_title, null, null, 14), new TextLocalisedClause(R.string.search_empty_message, zhm.u.c(new TextClause(query, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D086", null, null, null, 30)), null, null, false, null, null, null, YearClass.CLASS_2016));
    }

    public static ListSubheaderDelegate.Model b(Clause clause, TextLocalisedClause textLocalisedClause, String str, o97.y yVar) {
        ListSubheaderDelegate.Model model = new ListSubheaderDelegate.Model(str, (Image) null, clause, (ResourceImage) null, false, false, (Clause) textLocalisedClause, textLocalisedClause != null, (Object) yVar, (AnalyticsContext) null, 0, 0, 0, 0, (String) null, 259898);
        yp0.b.a(model);
        return model;
    }
}
