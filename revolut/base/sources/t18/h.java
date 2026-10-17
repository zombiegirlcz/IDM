package t18;

import com.revolut.feature.invest.smart_notifications.api.domain.models.FeedFilter;
import com.revolut.feature.invest.smart_notifications.impl.ui.screen.all_insights.AllInsightsScreenContract$InputData;
import java.time.Instant;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import zhm.d0;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends tzl.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final jt0.b f267218g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AllInsightsScreenContract$InputData f267219h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(jt0.b internalSmartNotificationsInteractor, AllInsightsScreenContract$InputData inputData) {
        super(0);
        Intrinsics.checkNotNullParameter(internalSmartNotificationsInteractor, "internalSmartNotificationsInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f267218g = internalSmartNotificationsInteractor;
        this.f267219h = inputData;
    }

    @Override // tzl.l
    public final boolean b(Object obj2, Object obj3, Object obj4) {
        g key = (g) obj2;
        List list = (List) obj3;
        Intrinsics.checkNotNullParameter(key, "key");
        return (list != null ? list.size() : 0) >= 50;
    }

    @Override // tzl.l
    public final Object c(Object obj2) {
        FeedFilter feedFilter = (FeedFilter) obj2;
        List listK = zhm.v.k(x08.c.REV_INSIGHT, x08.c.PRICE_ALERT);
        if (feedFilter == null) {
            feedFilter = this.f267219h.f76427a;
        }
        return new g(listK, feedFilter, null);
    }

    @Override // tzl.l
    public final Object e(Object obj2, Object obj3) {
        x08.f fVar;
        g currentKey = (g) obj2;
        List list = (List) obj3;
        Intrinsics.checkNotNullParameter(currentKey, "currentKey");
        Instant instant = (list == null || (fVar = (x08.f) d0.o0(list)) == null) ? null : fVar.f301534c;
        List feedElementTypes = currentKey.f267215a;
        FeedFilter feedFilter = currentKey.f267216b;
        Intrinsics.checkNotNullParameter(feedElementTypes, "feedElementTypes");
        Intrinsics.checkNotNullParameter(feedFilter, "feedFilter");
        return new g(feedElementTypes, feedFilter, instant);
    }

    @Override // tzl.l
    public final Flow g(Object obj2, Object obj3, Object obj4) {
        g key = (g) obj2;
        Intrinsics.checkNotNullParameter(key, "key");
        FeedFilter feedFilter = key.f267216b;
        Instant instant = key.f267217c;
        List list = key.f267215a;
        boolean z = feedFilter instanceof FeedFilter.ByAssetFilter;
        jt0.b bVar = this.f267218g;
        if (z) {
            return bVar.y0(list, ((FeedFilter.ByAssetFilter) feedFilter).f76423a, instant);
        }
        if (feedFilter instanceof FeedFilter.ByRef) {
            return bVar.x0(list, ((FeedFilter.ByRef) feedFilter).f76424a, instant);
        }
        throw new NoWhenBranchMatchedException();
    }
}
