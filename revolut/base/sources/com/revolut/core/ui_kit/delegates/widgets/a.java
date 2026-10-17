package com.revolut.core.ui_kit.delegates.widgets;

import com.revolut.core.ui_kit.delegates.widgets.AccessPassWidgetDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class a extends AccessPassWidgetDelegate.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f55286b;

    public a(String widgetListId) {
        Intrinsics.checkNotNullParameter(widgetListId, "widgetListId");
        this.f55286b = widgetListId;
    }

    @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.a
    public final String a() {
        return this.f55286b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f55286b, ((a) obj2).f55286b);
    }

    public final int hashCode() {
        return this.f55286b.hashCode();
    }
}
