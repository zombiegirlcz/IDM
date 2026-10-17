package fc7;

import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.feature.home_feed.api.models.HomeFeedWidgetContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class c implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f133649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HomeFeedWidgetContext f133650b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BaseDraggableWidgetDelegate.a f133651c;

    public c(String widgetType, HomeFeedWidgetContext context, BaseDraggableWidgetDelegate.a event) {
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(event, "event");
        this.f133649a = widgetType;
        this.f133650b = context;
        this.f133651c = event;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f133649a, cVar.f133649a) && Intrinsics.f(this.f133650b, cVar.f133650b) && Intrinsics.f(this.f133651c, cVar.f133651c);
    }

    public final int hashCode() {
        return this.f133651c.hashCode() + ((this.f133650b.hashCode() + (this.f133649a.hashCode() * 31)) * 31);
    }
}
