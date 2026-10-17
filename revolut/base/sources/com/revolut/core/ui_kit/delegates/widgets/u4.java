package com.revolut.core.ui_kit.delegates.widgets;

import com.revolut.core.ui_kit.delegates.widgets.TravelModeWidgetDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class u4 extends TravelModeWidgetDelegate.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f55522b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TravelModeWidgetDelegate.Model f55523c;

    public u4(String widgetListId, TravelModeWidgetDelegate.Model model) {
        Intrinsics.checkNotNullParameter(widgetListId, "widgetListId");
        Intrinsics.checkNotNullParameter(model, "model");
        this.f55522b = widgetListId;
        this.f55523c = model;
    }

    @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.a
    public final String a() {
        return this.f55522b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u4)) {
            return false;
        }
        u4 u4Var = (u4) obj2;
        return Intrinsics.f(this.f55522b, u4Var.f55522b) && Intrinsics.f(this.f55523c, u4Var.f55523c);
    }

    public final int hashCode() {
        return this.f55523c.hashCode() + (this.f55522b.hashCode() * 31);
    }
}
