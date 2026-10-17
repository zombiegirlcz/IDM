package tpc;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.badge.CircleIconBadge;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.retail.wealth.resources.R$string;
import java.util.List;
import jlc.w;
import kotlin.jvm.internal.Intrinsics;
import tlf.n;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes6.dex */
public final class d implements w {
    public d(b periodClauseMapper) {
        Intrinsics.checkNotNullParameter(periodClauseMapper, "periodClauseMapper");
    }

    public static List a(CircleIconBadge circleIconBadge, Clause clause, g gVar) {
        RowDelegate.Model model = new RowDelegate.Model("portfolio-recurring-deposit-widget", new RowDelegate.Model.MainImage.Image40(LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_calendar_recurring, R$attr.uikit_colorAccentNeutral, R$attr.uikit_colorAccentNeutral_10), circleIconBadge, null, false, null, false, 60), new TextLocalisedClause(R$string.wealth_robo_portfolio_recurring_transfer_widget_title, null, null, 14), null, 0, clause, null, null, 0, new tf(4, new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone20), (List) null, (ImageTransformations) null, (Clause) null, 246), false), true, null, false, null, null, null, null, null, null, gVar, null, 0, 0, 0, 0, 532673496);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return u.c(model);
    }

    public final List b(Data data) {
        List list = data != null ? (List) iii.c.f(data, new n(24), new tj9.d(23), new sr8.a(this, 19)) : null;
        return list == null ? f0.f322471a : list;
    }
}
