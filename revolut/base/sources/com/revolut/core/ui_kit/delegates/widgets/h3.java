package com.revolut.core.ui_kit.delegates.widgets;

import com.revolut.core.ui_kit.delegates.widgets.RowsWidgetDelegate;
import ip0.r40;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class h3 extends RowsWidgetDelegate.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f55370b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r40 f55371c;

    public h3(String widgetListId, r40 model) {
        Intrinsics.checkNotNullParameter(widgetListId, "widgetListId");
        Intrinsics.checkNotNullParameter(model, "model");
        this.f55370b = widgetListId;
        this.f55371c = model;
    }

    @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.a
    public final String a() {
        return this.f55370b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h3)) {
            return false;
        }
        h3 h3Var = (h3) obj2;
        return Intrinsics.f(this.f55370b, h3Var.f55370b) && Intrinsics.f(this.f55371c, h3Var.f55371c);
    }

    public final int hashCode() {
        return this.f55371c.hashCode() + (this.f55370b.hashCode() * 31);
    }
}
