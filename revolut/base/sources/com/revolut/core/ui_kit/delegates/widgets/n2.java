package com.revolut.core.ui_kit.delegates.widgets;

import com.revolut.core.ui_kit.delegates.NewsDelegate;
import com.revolut.core.ui_kit.delegates.widgets.NewsWidgetDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class n2 extends NewsWidgetDelegate.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f55438b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NewsDelegate.Model f55439c;

    public n2(String widgetListId, NewsDelegate.Model model) {
        Intrinsics.checkNotNullParameter(widgetListId, "widgetListId");
        Intrinsics.checkNotNullParameter(model, "model");
        this.f55438b = widgetListId;
        this.f55439c = model;
    }

    @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.a
    public final String a() {
        return this.f55438b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n2)) {
            return false;
        }
        n2 n2Var = (n2) obj2;
        return Intrinsics.f(this.f55438b, n2Var.f55438b) && Intrinsics.f(this.f55439c, n2Var.f55439c);
    }

    public final int hashCode() {
        return this.f55439c.hashCode() + (this.f55438b.hashCode() * 31);
    }
}
