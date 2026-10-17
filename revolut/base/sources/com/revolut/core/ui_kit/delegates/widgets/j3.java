package com.revolut.core.ui_kit.delegates.widgets;

import com.revolut.core.ui_kit.delegates.vh;
import com.revolut.core.ui_kit.delegates.widgets.RowsWidgetDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class j3 extends RowsWidgetDelegate.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f55395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vh f55396c;

    public j3(String widgetListId, vh clickData) {
        Intrinsics.checkNotNullParameter(widgetListId, "widgetListId");
        Intrinsics.checkNotNullParameter(clickData, "clickData");
        this.f55395b = widgetListId;
        this.f55396c = clickData;
    }

    @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.a
    public final String a() {
        return this.f55395b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j3)) {
            return false;
        }
        j3 j3Var = (j3) obj2;
        return Intrinsics.f(this.f55395b, j3Var.f55395b) && Intrinsics.f(this.f55396c, j3Var.f55396c);
    }

    public final int hashCode() {
        return this.f55396c.hashCode() + (this.f55395b.hashCode() * 31);
    }
}
