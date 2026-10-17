package com.revolut.core.ui_kit.delegates.widgets;

import com.revolut.core.ui_kit.delegates.widgets.TilePaginatedGridWidgetDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class l4 extends TilePaginatedGridWidgetDelegate.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f55420b;

    public l4(String widgetListId) {
        Intrinsics.checkNotNullParameter(widgetListId, "widgetListId");
        this.f55420b = widgetListId;
    }

    @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.a
    public final String a() {
        return this.f55420b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l4) && Intrinsics.f(this.f55420b, ((l4) obj2).f55420b);
    }

    public final int hashCode() {
        return this.f55420b.hashCode();
    }
}
