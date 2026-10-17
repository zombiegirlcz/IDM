package com.revolut.core.ui_kit.delegates.widgets;

import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.PaymentLinkWidgetDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class p2 extends BaseDraggableWidgetDelegate.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f55466b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PaymentLinkWidgetDelegate.Model f55467c;

    public p2(String widgetListId, PaymentLinkWidgetDelegate.Model model) {
        Intrinsics.checkNotNullParameter(widgetListId, "widgetListId");
        Intrinsics.checkNotNullParameter(model, "model");
        this.f55466b = widgetListId;
        this.f55467c = model;
    }

    @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.a
    public final String a() {
        return this.f55466b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p2)) {
            return false;
        }
        p2 p2Var = (p2) obj2;
        return Intrinsics.f(this.f55466b, p2Var.f55466b) && Intrinsics.f(this.f55467c, p2Var.f55467c);
    }

    public final int hashCode() {
        return this.f55467c.hashCode() + (this.f55466b.hashCode() * 31);
    }
}
