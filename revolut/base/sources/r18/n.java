package r18;

import android.os.Parcelable;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.retail.wealth.resources.R$string;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class n implements a18.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q18.c f250925a;

    public n(q18.c feedElementMapper) {
        Intrinsics.checkNotNullParameter(feedElementMapper, "feedElementMapper");
        this.f250925a = feedElementMapper;
    }

    public static ListSubheaderDelegate.Model b(boolean z) {
        return new ListSubheaderDelegate.Model("WIDGET_LIST_ID_RECENT_INSIGHTS_HEADER", (Image) null, (Clause) new TextLocalisedClause(R$string.invest_smart_notifications_feed_home_recent_insights, null, null, 14), (Image) null, (Clause) (z ? new TextLocalisedClause(R$string.wealth_invest_common_see_all, null, null, 14) : null), (String) null, (ListSubheaderDelegate.Model.a) (z ? new ListSubheaderDelegate.Model.a.b(false, false, true, 3) : null), false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 64426);
    }
}
