package h39;

import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import csh.j;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements j {
    @Override // csh.j
    public final List a(WidgetContext widgetContext) {
        Intrinsics.checkNotNullParameter(widgetContext, "widgetContext");
        return v.k("transactions", "rev_points_rim", "nearby_rewards", "esim_medium", "giftcards", "airport_fast_track_pass", "airport_lounges", "trip_itinerary");
    }
}
