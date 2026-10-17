package com.revolut.core.ui_kit.delegates.widgets;

import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class d2 extends BaseDraggableWidgetDelegate.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f55326b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f55327c;

    public d2(String widgetListId, String selectedTabId) {
        Intrinsics.checkNotNullParameter(widgetListId, "widgetListId");
        Intrinsics.checkNotNullParameter(selectedTabId, "selectedTabId");
        this.f55326b = widgetListId;
        this.f55327c = selectedTabId;
    }

    @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.a
    public final String a() {
        return this.f55326b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d2)) {
            return false;
        }
        d2 d2Var = (d2) obj2;
        return Intrinsics.f(this.f55326b, d2Var.f55326b) && Intrinsics.f(this.f55327c, d2Var.f55327c);
    }

    public final int hashCode() {
        return this.f55327c.hashCode() + (this.f55326b.hashCode() * 31);
    }
}
