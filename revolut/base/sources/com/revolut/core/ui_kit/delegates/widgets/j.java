package com.revolut.core.ui_kit.delegates.widgets;

import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class j extends BaseDraggableWidgetDelegate.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f55385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BaseDraggableWidgetDelegate.Model f55386c;

    public j(String widgetListId, BaseDraggableWidgetDelegate.Model model) {
        Intrinsics.checkNotNullParameter(widgetListId, "widgetListId");
        Intrinsics.checkNotNullParameter(model, "model");
        this.f55385b = widgetListId;
        this.f55386c = model;
    }

    @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.a
    public final String a() {
        return this.f55385b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f55385b, jVar.f55385b) && Intrinsics.f(this.f55386c, jVar.f55386c);
    }

    public final int hashCode() {
        return this.f55386c.hashCode() + (this.f55385b.hashCode() * 31);
    }
}
