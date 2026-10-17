package mx4;

import aw0.o9;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.PlanTileDelegate;
import com.revolut.core.ui_kit.delegates.bb;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.credit.core.R$string;
import dx4.s3;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class o0 {
    public static List a(s3 item) {
        Intrinsics.checkNotNullParameter(item, "item");
        return zhm.u.c(new PlanTileDelegate.Model(item.f120764a, new bb(new TextLocalisedClause(R$string.credit_application_constructor_plan_header_title, zhm.u.c(new TextClause(item.f120765b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), null, new TextLocalisedClause(R$string.credit_application_constructor_plan_header_caption, zhm.u.c(new TextClause(item.f120766c, (Style) new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124)), null, 12), 26), null, null, false, false, null, new AnalyticsContext(zw4.a.a(item.f120764a)), 3964));
    }
}
