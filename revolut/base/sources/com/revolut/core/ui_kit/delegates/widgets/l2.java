package com.revolut.core.ui_kit.delegates.widgets;

import com.revolut.core.ui_kit.delegates.widgets.NewsWidgetDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class l2 extends NewsWidgetDelegate.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f55417b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ty0.a f55418c;

    public l2(String widgetListId, ty0.a clickData) {
        Intrinsics.checkNotNullParameter(widgetListId, "widgetListId");
        Intrinsics.checkNotNullParameter(clickData, "clickData");
        this.f55417b = widgetListId;
        this.f55418c = clickData;
    }

    @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.a
    public final String a() {
        return this.f55417b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l2)) {
            return false;
        }
        l2 l2Var = (l2) obj2;
        return Intrinsics.f(this.f55417b, l2Var.f55417b) && Intrinsics.f(this.f55418c, l2Var.f55418c);
    }

    public final int hashCode() {
        return this.f55418c.hashCode() + (this.f55417b.hashCode() * 31);
    }
}
