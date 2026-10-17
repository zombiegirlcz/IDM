package com.revolut.core.ui_kit.delegates.widgets;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.widgets.FullScreenStateWidgetDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class x0 extends FullScreenStateWidgetDelegate.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f55549b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FullScreenStateDelegate.Model f55550c;

    public x0(String widgetListId, FullScreenStateDelegate.Model model) {
        Intrinsics.checkNotNullParameter(widgetListId, "widgetListId");
        Intrinsics.checkNotNullParameter(model, "model");
        this.f55549b = widgetListId;
        this.f55550c = model;
    }

    @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.a
    public final String a() {
        return this.f55549b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj2;
        return Intrinsics.f(this.f55549b, x0Var.f55549b) && Intrinsics.f(this.f55550c, x0Var.f55550c);
    }

    public final int hashCode() {
        return this.f55550c.hashCode() + (this.f55549b.hashCode() * 31);
    }
}
