package com.revolut.core.ui_kit.delegates.widgets;

import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class i extends BaseDraggableWidgetDelegate.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f55374b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BaseDraggableWidgetDelegate.Model f55375c;

    public i(String widgetListId, BaseDraggableWidgetDelegate.Model model) {
        Intrinsics.checkNotNullParameter(widgetListId, "widgetListId");
        Intrinsics.checkNotNullParameter(model, "model");
        this.f55374b = widgetListId;
        this.f55375c = model;
    }

    @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.a
    public final String a() {
        return this.f55374b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f55374b, iVar.f55374b) && Intrinsics.f(this.f55375c, iVar.f55375c);
    }

    public final int hashCode() {
        return this.f55375c.hashCode() + (this.f55374b.hashCode() * 31);
    }
}
