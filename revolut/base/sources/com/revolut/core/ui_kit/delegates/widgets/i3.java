package com.revolut.core.ui_kit.delegates.widgets;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.widgets.RowsWidgetDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class i3 extends RowsWidgetDelegate.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f55381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RowDelegate.Model f55382c;

    public i3(String widgetListId, RowDelegate.Model model) {
        Intrinsics.checkNotNullParameter(widgetListId, "widgetListId");
        Intrinsics.checkNotNullParameter(model, "model");
        this.f55381b = widgetListId;
        this.f55382c = model;
    }

    @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.a
    public final String a() {
        return this.f55381b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i3)) {
            return false;
        }
        i3 i3Var = (i3) obj2;
        return Intrinsics.f(this.f55381b, i3Var.f55381b) && Intrinsics.f(this.f55382c, i3Var.f55382c);
    }

    public final int hashCode() {
        return this.f55382c.hashCode() + (this.f55381b.hashCode() * 31);
    }
}
