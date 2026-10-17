package sfe;

import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.feature.home_feed.api.models.HomeFeedWidgetContext;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class r implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f262429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ProductAccountId f262430b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HomeFeedWidgetContext f262431c;
    public final BaseDraggableWidgetDelegate.a d;

    public r(String widgetType, ProductAccountId accountId, HomeFeedWidgetContext widgetContext, BaseDraggableWidgetDelegate.a event) {
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(widgetContext, "widgetContext");
        Intrinsics.checkNotNullParameter(event, "event");
        this.f262429a = widgetType;
        this.f262430b = accountId;
        this.f262431c = widgetContext;
        this.d = event;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f262429a, rVar.f262429a) && Intrinsics.f(this.f262430b, rVar.f262430b) && Intrinsics.f(this.f262431c, rVar.f262431c) && Intrinsics.f(this.d, rVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f262431c.hashCode() + ((this.f262430b.hashCode() + (this.f262429a.hashCode() * 31)) * 31)) * 31);
    }
}
