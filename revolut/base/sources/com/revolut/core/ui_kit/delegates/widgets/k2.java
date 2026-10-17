package com.revolut.core.ui_kit.delegates.widgets;

import com.revolut.core.ui_kit.delegates.NewsDelegate;
import com.revolut.core.ui_kit.delegates.widgets.NewsWidgetDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class k2 extends NewsWidgetDelegate.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f55403b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NewsDelegate.Model f55404c;

    public k2(String widgetListId, NewsDelegate.Model model) {
        Intrinsics.checkNotNullParameter(widgetListId, "widgetListId");
        Intrinsics.checkNotNullParameter(model, "model");
        this.f55403b = widgetListId;
        this.f55404c = model;
    }

    @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.a
    public final String a() {
        return this.f55403b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k2)) {
            return false;
        }
        k2 k2Var = (k2) obj2;
        return Intrinsics.f(this.f55403b, k2Var.f55403b) && Intrinsics.f(this.f55404c, k2Var.f55404c);
    }

    public final int hashCode() {
        return this.f55404c.hashCode() + (this.f55403b.hashCode() * 31);
    }
}
