package com.revolut.core.ui_kit.delegates.widgets;

import com.revolut.core.ui_kit.delegates.g6;
import com.revolut.core.ui_kit.delegates.widgets.RowsWidgetDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class k3 extends RowsWidgetDelegate.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f55405b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g6 f55406c;

    public k3(String widgetListId, g6 selectedData) {
        Intrinsics.checkNotNullParameter(widgetListId, "widgetListId");
        Intrinsics.checkNotNullParameter(selectedData, "selectedData");
        this.f55405b = widgetListId;
        this.f55406c = selectedData;
    }

    @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.a
    public final String a() {
        return this.f55405b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k3)) {
            return false;
        }
        k3 k3Var = (k3) obj2;
        return Intrinsics.f(this.f55405b, k3Var.f55405b) && Intrinsics.f(this.f55406c, k3Var.f55406c);
    }

    public final int hashCode() {
        return this.f55406c.hashCode() + (this.f55405b.hashCode() * 31);
    }
}
