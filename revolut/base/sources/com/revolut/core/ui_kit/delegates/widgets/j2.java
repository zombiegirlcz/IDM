package com.revolut.core.ui_kit.delegates.widgets;

import com.revolut.core.ui_kit.delegates.IconDelegate;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class j2 extends BaseDraggableWidgetDelegate.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f55393b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IconDelegate.Model f55394c;

    public j2(String widgetListId, IconDelegate.Model model) {
        Intrinsics.checkNotNullParameter(widgetListId, "widgetListId");
        Intrinsics.checkNotNullParameter(model, "model");
        this.f55393b = widgetListId;
        this.f55394c = model;
    }

    @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.a
    public final String a() {
        return this.f55393b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j2)) {
            return false;
        }
        j2 j2Var = (j2) obj2;
        return Intrinsics.f(this.f55393b, j2Var.f55393b) && Intrinsics.f(this.f55394c, j2Var.f55394c);
    }

    public final int hashCode() {
        return this.f55394c.hashCode() + (this.f55393b.hashCode() * 31);
    }
}
