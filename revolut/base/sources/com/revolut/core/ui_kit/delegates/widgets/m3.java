package com.revolut.core.ui_kit.delegates.widgets;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.widgets.RowsWidgetDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class m3 extends RowsWidgetDelegate.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f55430b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RowDelegate.Model f55431c;

    public m3(String widgetListId, RowDelegate.Model model) {
        Intrinsics.checkNotNullParameter(widgetListId, "widgetListId");
        Intrinsics.checkNotNullParameter(model, "model");
        this.f55430b = widgetListId;
        this.f55431c = model;
    }

    @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.a
    public final String a() {
        return this.f55430b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m3)) {
            return false;
        }
        m3 m3Var = (m3) obj2;
        return Intrinsics.f(this.f55430b, m3Var.f55430b) && Intrinsics.f(this.f55431c, m3Var.f55431c);
    }

    public final int hashCode() {
        return this.f55431c.hashCode() + (this.f55430b.hashCode() * 31);
    }
}
