package com.revolut.core.ui_kit.delegates.widgets;

import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.QuickActionWidgetDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class f3 extends BaseDraggableWidgetDelegate.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f55355b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final QuickActionWidgetDelegate.Model f55356c;

    public f3(String widgetListId, QuickActionWidgetDelegate.Model model) {
        Intrinsics.checkNotNullParameter(widgetListId, "widgetListId");
        Intrinsics.checkNotNullParameter(model, "model");
        this.f55355b = widgetListId;
        this.f55356c = model;
    }

    @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.a
    public final String a() {
        return this.f55355b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f3)) {
            return false;
        }
        f3 f3Var = (f3) obj2;
        return Intrinsics.f(this.f55355b, f3Var.f55355b) && Intrinsics.f(this.f55356c, f3Var.f55356c);
    }

    public final int hashCode() {
        return this.f55356c.hashCode() + (this.f55355b.hashCode() * 31);
    }
}
