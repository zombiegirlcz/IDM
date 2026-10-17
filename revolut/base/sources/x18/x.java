package x18;

import android.os.Parcelable;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.retail.wealth.resources.R$string;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a1k.a f302348a;

    public x(a1k.a marketNewsItemsMapper) {
        Intrinsics.checkNotNullParameter(marketNewsItemsMapper, "marketNewsItemsMapper");
        this.f302348a = marketNewsItemsMapper;
    }

    public static ListSubheaderDelegate.Model a() {
        return new ListSubheaderDelegate.Model("global-news-header-list-id", (Image) null, (Clause) new TextLocalisedClause(R$string.invest_smart_notifications_feed_home_global_news, null, null, 14), (Image) null, (Clause) new TextLocalisedClause(R$string.wealth_invest_common_see_all, null, null, 14), (String) null, (ListSubheaderDelegate.Model.a) new ListSubheaderDelegate.Model.a.b(false, false, true, 3), false, false, (Object) r.f302342a, (Parcelable) null, 0, 0, 0, 0, 64426);
    }
}
