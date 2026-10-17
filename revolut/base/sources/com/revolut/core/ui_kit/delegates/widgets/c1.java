package com.revolut.core.ui_kit.delegates.widgets;

import com.revolut.core.ui_kit.delegates.widgets.GoalProgressWidgetDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class c1 extends GoalProgressWidgetDelegate.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f55311b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final GoalProgressWidgetDelegate.Model f55312c;

    public c1(String widgetListId, GoalProgressWidgetDelegate.Model model) {
        Intrinsics.checkNotNullParameter(widgetListId, "widgetListId");
        Intrinsics.checkNotNullParameter(model, "model");
        this.f55311b = widgetListId;
        this.f55312c = model;
    }

    @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.a
    public final String a() {
        return this.f55311b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c1)) {
            return false;
        }
        c1 c1Var = (c1) obj2;
        return Intrinsics.f(this.f55311b, c1Var.f55311b) && Intrinsics.f(this.f55312c, c1Var.f55312c);
    }

    public final int hashCode() {
        return this.f55312c.hashCode() + (this.f55311b.hashCode() * 31);
    }
}
