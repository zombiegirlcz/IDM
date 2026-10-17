package com.revolut.core.ui_kit.delegates.widgets;

import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.SimpleTileWidgetDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class z3 extends BaseDraggableWidgetDelegate.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f55577b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SimpleTileWidgetDelegate.Model f55578c;

    public z3(String widgetListId, SimpleTileWidgetDelegate.Model model) {
        Intrinsics.checkNotNullParameter(widgetListId, "widgetListId");
        Intrinsics.checkNotNullParameter(model, "model");
        this.f55577b = widgetListId;
        this.f55578c = model;
    }

    @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.a
    public final String a() {
        return this.f55577b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z3)) {
            return false;
        }
        z3 z3Var = (z3) obj2;
        return Intrinsics.f(this.f55577b, z3Var.f55577b) && Intrinsics.f(this.f55578c, z3Var.f55578c);
    }

    public final int hashCode() {
        return this.f55578c.hashCode() + (this.f55577b.hashCode() * 31);
    }
}
