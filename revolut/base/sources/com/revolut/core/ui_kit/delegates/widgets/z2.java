package com.revolut.core.ui_kit.delegates.widgets;

import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.QrCodeWidgetDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class z2 extends BaseDraggableWidgetDelegate.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f55575b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final QrCodeWidgetDelegate.Model f55576c;

    public z2(String widgetListId, QrCodeWidgetDelegate.Model model) {
        Intrinsics.checkNotNullParameter(widgetListId, "widgetListId");
        Intrinsics.checkNotNullParameter(model, "model");
        this.f55575b = widgetListId;
        this.f55576c = model;
    }

    @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.a
    public final String a() {
        return this.f55575b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z2)) {
            return false;
        }
        z2 z2Var = (z2) obj2;
        return Intrinsics.f(this.f55575b, z2Var.f55575b) && Intrinsics.f(this.f55576c, z2Var.f55576c);
    }

    public final int hashCode() {
        return this.f55576c.hashCode() + (this.f55575b.hashCode() * 31);
    }
}
