package com.revolut.core.ui_kit.delegates.widgets;

import com.revolut.core.ui_kit.delegates.ExtraSmallCardDelegate;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class v0 extends BaseDraggableWidgetDelegate.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f55528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ExtraSmallCardDelegate.Model f55529c;

    public v0(String widgetListId, ExtraSmallCardDelegate.Model model) {
        Intrinsics.checkNotNullParameter(widgetListId, "widgetListId");
        Intrinsics.checkNotNullParameter(model, "model");
        this.f55528b = widgetListId;
        this.f55529c = model;
    }

    @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.a
    public final String a() {
        return this.f55528b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj2;
        return Intrinsics.f(this.f55528b, v0Var.f55528b) && Intrinsics.f(this.f55529c, v0Var.f55529c);
    }

    public final int hashCode() {
        return this.f55529c.hashCode() + (this.f55528b.hashCode() * 31);
    }
}
