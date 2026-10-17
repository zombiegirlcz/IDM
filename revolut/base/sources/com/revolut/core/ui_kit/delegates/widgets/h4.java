package com.revolut.core.ui_kit.delegates.widgets;

import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.SimpleTileWidgetDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class h4 extends BaseDraggableWidgetDelegate.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f55372b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SimpleTileWidgetDelegate.Model f55373c;

    public h4(String widgetListId, SimpleTileWidgetDelegate.Model model) {
        Intrinsics.checkNotNullParameter(widgetListId, "widgetListId");
        Intrinsics.checkNotNullParameter(model, "model");
        this.f55372b = widgetListId;
        this.f55373c = model;
    }

    @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.a
    public final String a() {
        return this.f55372b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h4)) {
            return false;
        }
        h4 h4Var = (h4) obj2;
        return Intrinsics.f(this.f55372b, h4Var.f55372b) && Intrinsics.f(this.f55373c, h4Var.f55373c);
    }

    public final int hashCode() {
        return this.f55373c.hashCode() + (this.f55372b.hashCode() * 31);
    }
}
