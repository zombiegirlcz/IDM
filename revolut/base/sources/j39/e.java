package j39;

import com.revolut.feature.lifestyle_feed.api.models.LifestyleWidgetContext;
import com.revolut.feature.nearby.rewards.api.widget.NearbyRewardsWidgetContext;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements bsh.a {
    @Override // bsh.a
    public final WidgetContext b(WidgetContext widgetContext) {
        LifestyleWidgetContext widgetContext2 = (LifestyleWidgetContext) widgetContext;
        Intrinsics.checkNotNullParameter(widgetContext2, "widgetContext");
        return new NearbyRewardsWidgetContext(widgetContext2.getContextKey());
    }
}
