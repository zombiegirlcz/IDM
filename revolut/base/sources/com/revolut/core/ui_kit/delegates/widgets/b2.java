package com.revolut.core.ui_kit.delegates.widgets;

import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class b2 extends BaseDraggableWidgetDelegate.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f55301b;

    public b2(String widgetListId) {
        Intrinsics.checkNotNullParameter(widgetListId, "widgetListId");
        this.f55301b = widgetListId;
    }

    @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.a
    public final String a() {
        return this.f55301b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b2) && Intrinsics.f(this.f55301b, ((b2) obj2).f55301b);
    }

    public final int hashCode() {
        return this.f55301b.hashCode();
    }
}
