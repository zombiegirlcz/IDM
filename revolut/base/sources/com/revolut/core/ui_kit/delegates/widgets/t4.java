package com.revolut.core.ui_kit.delegates.widgets;

import com.revolut.core.ui_kit.delegates.widgets.TravelModeWidgetDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class t4 extends TravelModeWidgetDelegate.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f55515b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x4 f55516c;

    public t4(String widgetListId, x4 subtitle) {
        Intrinsics.checkNotNullParameter(widgetListId, "widgetListId");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        this.f55515b = widgetListId;
        this.f55516c = subtitle;
    }

    @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.a
    public final String a() {
        return this.f55515b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t4)) {
            return false;
        }
        t4 t4Var = (t4) obj2;
        return Intrinsics.f(this.f55515b, t4Var.f55515b) && Intrinsics.f(this.f55516c, t4Var.f55516c);
    }

    public final int hashCode() {
        return this.f55516c.hashCode() + (this.f55515b.hashCode() * 31);
    }
}
