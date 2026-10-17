package m8b;

import aw0.o9;
import aw0.t0;
import aw0.u0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.pa;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import mx0.v5;

/* JADX INFO: loaded from: classes6.dex */
public final class q {
    public static List a(p pVar, String str, boolean z, d dVar) {
        PlainTextDelegate.Model model = null;
        CellDetailsDelegate.Model model2 = new CellDetailsDelegate.Model("CORPORATE_EVENT_FAQ_QUESTION_".concat(str), new t0((Clause) new TextLocalisedClause(pVar.f203468a, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10), (Image) null, 0, false, 30), new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, dVar, null, u0.SMALL, 0, new ResourceImage(z ? R$drawable.uikit_icn_24_chevron_up : R$drawable.uikit_icn_24_chevron_down, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, true, null, null, 27320);
        if (z) {
            model = new PlainTextDelegate.Model("CORPORATE_EVENT_FAQ_ANSWER_".concat(str), (Clause) null, (Clause) new TextLocalisedClause(pVar.f203469b, null, new Custom(Integer.valueOf(R$attr.uikit_colorGrey50), false, null, false, null, 254), 10), (v5) null, (UrlImage) null, false, (pa) null, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, 65518);
        }
        qv0.i[] elements = {model2, model};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return kotlin.collections.d.L(elements);
    }
}
