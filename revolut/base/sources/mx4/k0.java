package mx4;

import aw0.o9;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.credit.core.R$string;
import dx4.l2;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f210185a;

    public k0(u contentImageMapper) {
        Intrinsics.checkNotNullParameter(contentImageMapper, "contentImageMapper");
        this.f210185a = contentImageMapper;
    }

    public final List a(l2 item) {
        Intrinsics.checkNotNullParameter(item, "item");
        String str = item.f120661a;
        dx4.d1 d1Var = item.e;
        RowDelegate.Model.MainImage.Image40 image40 = d1Var != null ? new RowDelegate.Model.MainImage.Image40(this.f210185a.a(d1Var), null, null, false, null, false, 62) : null;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.credit_application_constructor_info_action_cell_title, zhm.u.c(new TextClause(item.f120662b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
        TextClause textClause = new TextClause(item.f120663c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        String str2 = item.d;
        return zhm.u.c(new RowDelegate.Model(str, image40, textLocalisedClause, null, 0, textClause, str2 != null ? new TextClause(str2, (Style) new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124) : null, null, 0, null, true, null, false, null, null, null, null, null, null, item, new AnalyticsContext(zw4.a.a(item.f120661a)), 0, 0, 0, 0, 524284824));
    }
}
