package com.revolut.core.ui_kit.delegates.widgets;

import com.revolut.core.ui_kit.delegates.widgets.GoalProgressWidgetDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class d1 extends GoalProgressWidgetDelegate.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f55324b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ty0.a f55325c;

    public d1(String widgetListId, ty0.a model) {
        Intrinsics.checkNotNullParameter(widgetListId, "widgetListId");
        Intrinsics.checkNotNullParameter(model, "model");
        this.f55324b = widgetListId;
        this.f55325c = model;
    }

    @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.a
    public final String a() {
        return this.f55324b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d1)) {
            return false;
        }
        d1 d1Var = (d1) obj2;
        return Intrinsics.f(this.f55324b, d1Var.f55324b) && Intrinsics.f(this.f55325c, d1Var.f55325c);
    }

    public final int hashCode() {
        return this.f55325c.hashCode() + (this.f55324b.hashCode() * 31);
    }
}
