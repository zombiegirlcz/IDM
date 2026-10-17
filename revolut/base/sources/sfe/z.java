package sfe;

import com.revolut.feature.home_feed.api.models.HomeFeedWidgetContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class z implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HomeFeedWidgetContext f262437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dsh.s f262438b;

    public z(HomeFeedWidgetContext homeFeedWidgetContext, dsh.s widgetItemsDecoration) {
        Intrinsics.checkNotNullParameter(homeFeedWidgetContext, "homeFeedWidgetContext");
        Intrinsics.checkNotNullParameter(widgetItemsDecoration, "widgetItemsDecoration");
        this.f262437a = homeFeedWidgetContext;
        this.f262438b = widgetItemsDecoration;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z)) {
            return false;
        }
        z zVar = (z) obj2;
        return Intrinsics.f(this.f262437a, zVar.f262437a) && this.f262438b == zVar.f262438b;
    }

    public final int hashCode() {
        return this.f262438b.hashCode() + (this.f262437a.hashCode() * 31);
    }

    public /* synthetic */ z(HomeFeedWidgetContext homeFeedWidgetContext) {
        this(homeFeedWidgetContext, dsh.s.ADD_NEW_WIDGET);
    }
}
