package com.revolut.core.ui_kit.delegates.widgets;

import com.revolut.core.ui_kit.delegates.widgets.RowsWidgetDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class g3 extends RowsWidgetDelegate.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f55359b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f55360c;

    public g3(String widgetListId, Object obj2) {
        Intrinsics.checkNotNullParameter(widgetListId, "widgetListId");
        this.f55359b = widgetListId;
        this.f55360c = obj2;
    }

    @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.a
    public final String a() {
        return this.f55359b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g3)) {
            return false;
        }
        g3 g3Var = (g3) obj2;
        return Intrinsics.f(this.f55359b, g3Var.f55359b) && Intrinsics.f(this.f55360c, g3Var.f55360c);
    }

    public final int hashCode() {
        int iHashCode = this.f55359b.hashCode() * 31;
        Object obj2 = this.f55360c;
        return iHashCode + (obj2 == null ? 0 : obj2.hashCode());
    }
}
