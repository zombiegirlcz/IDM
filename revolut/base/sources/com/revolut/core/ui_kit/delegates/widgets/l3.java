package com.revolut.core.ui_kit.delegates.widgets;

import com.revolut.core.ui_kit.delegates.widgets.RowsWidgetDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class l3 extends RowsWidgetDelegate.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f55419b;

    public l3(String widgetListId) {
        Intrinsics.checkNotNullParameter(widgetListId, "widgetListId");
        this.f55419b = widgetListId;
    }

    @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.a
    public final String a() {
        return this.f55419b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l3) && Intrinsics.f(this.f55419b, ((l3) obj2).f55419b);
    }

    public final int hashCode() {
        return this.f55419b.hashCode();
    }
}
