package com.revolut.core.ui_kit.delegates.widgets;

import com.revolut.core.ui_kit.delegates.SmallCardDelegate;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class i4 extends BaseDraggableWidgetDelegate.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f55383b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SmallCardDelegate.Model f55384c;

    public i4(String widgetListId, SmallCardDelegate.Model model) {
        Intrinsics.checkNotNullParameter(widgetListId, "widgetListId");
        Intrinsics.checkNotNullParameter(model, "model");
        this.f55383b = widgetListId;
        this.f55384c = model;
    }

    @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.a
    public final String a() {
        return this.f55383b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i4)) {
            return false;
        }
        i4 i4Var = (i4) obj2;
        return Intrinsics.f(this.f55383b, i4Var.f55383b) && Intrinsics.f(this.f55384c, i4Var.f55384c);
    }

    public final int hashCode() {
        return this.f55384c.hashCode() + (this.f55383b.hashCode() * 31);
    }
}
