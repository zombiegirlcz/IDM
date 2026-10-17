package com.revolut.core.ui_kit.delegates.widgets;

import com.revolut.core.ui_kit.delegates.widgets.TravelModeWidgetDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class s4 extends TravelModeWidgetDelegate.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f55507b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v4 f55508c;

    public s4(String widgetListId, v4 product) {
        Intrinsics.checkNotNullParameter(widgetListId, "widgetListId");
        Intrinsics.checkNotNullParameter(product, "product");
        this.f55507b = widgetListId;
        this.f55508c = product;
    }

    @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.a
    public final String a() {
        return this.f55507b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s4)) {
            return false;
        }
        s4 s4Var = (s4) obj2;
        return Intrinsics.f(this.f55507b, s4Var.f55507b) && Intrinsics.f(this.f55508c, s4Var.f55508c);
    }

    public final int hashCode() {
        return this.f55508c.hashCode() + (this.f55507b.hashCode() * 31);
    }
}
