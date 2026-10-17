package com.revolut.core.ui_kit.delegates.widgets;

import com.revolut.core.ui_kit.delegates.NewsDelegate;
import com.revolut.core.ui_kit.delegates.widgets.NewsWidgetDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class o2 extends NewsWidgetDelegate.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f55449b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NewsDelegate.Model f55450c;

    public o2(String widgetListId, NewsDelegate.Model model) {
        Intrinsics.checkNotNullParameter(widgetListId, "widgetListId");
        Intrinsics.checkNotNullParameter(model, "model");
        this.f55449b = widgetListId;
        this.f55450c = model;
    }

    @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.a
    public final String a() {
        return this.f55449b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o2)) {
            return false;
        }
        o2 o2Var = (o2) obj2;
        return Intrinsics.f(this.f55449b, o2Var.f55449b) && Intrinsics.f(this.f55450c, o2Var.f55450c);
    }

    public final int hashCode() {
        return this.f55450c.hashCode() + (this.f55449b.hashCode() * 31);
    }
}
