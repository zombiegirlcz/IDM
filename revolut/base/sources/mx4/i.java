package mx4;

import aw0.o9;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.internal.views.ProgressStyle;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.feature.credit.core.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f210181a;

    public i(u contentImageMapper) {
        Intrinsics.checkNotNullParameter(contentImageMapper, "contentImageMapper");
        this.f210181a = contentImageMapper;
    }

    public final List a(dx4.r item) {
        Intrinsics.checkNotNullParameter(item, "item");
        String str = item.f120732a;
        dx4.d1 d1Var = item.d;
        com.revolut.core.ui_kit.delegates.m mVar = d1Var != null ? new com.revolut.core.ui_kit.delegates.m(this.f210181a.a(d1Var), (LayeredImage) null, (ProgressStyle) null, 6) : null;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.credit_application_constructor_action_widget_title, zhm.u.c(new TextClause(item.f120733b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
        String str2 = item.f120734c;
        ActionWidgetDelegate.Model model = new ActionWidgetDelegate.Model(str, textLocalisedClause, str2 != null ? new TextLocalisedClause(R$string.credit_application_constructor_action_widget_description, zhm.u.c(new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12) : null, mVar, null, ActionWidgetDelegate.Model.a.C0393a.f51604a, null, null, new AnalyticsContext(zw4.a.a(item.f120732a)), false, 7888);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return zhm.u.c(model);
    }
}
