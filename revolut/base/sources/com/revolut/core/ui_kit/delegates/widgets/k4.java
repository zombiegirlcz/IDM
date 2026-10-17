package com.revolut.core.ui_kit.delegates.widgets;

import com.revolut.core.ui_kit.delegates.widgets.TilePaginatedGridWidgetDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class k4 extends TilePaginatedGridWidgetDelegate.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f55407b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f55408c;

    public k4(String widgetListId, bme.a aVar) {
        Intrinsics.checkNotNullParameter(widgetListId, "widgetListId");
        this.f55407b = widgetListId;
        this.f55408c = aVar;
    }

    @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.a
    public final String a() {
        return this.f55407b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k4)) {
            return false;
        }
        k4 k4Var = (k4) obj2;
        return Intrinsics.f(this.f55407b, k4Var.f55407b) && Intrinsics.f(this.f55408c, k4Var.f55408c);
    }

    public final int hashCode() {
        int iHashCode = this.f55407b.hashCode() * 31;
        Object obj2 = this.f55408c;
        return iHashCode + (obj2 == null ? 0 : obj2.hashCode());
    }
}
