package com.revolut.core.ui_kit.delegates.widgets;

import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class c2 extends BaseDraggableWidgetDelegate.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f55313b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f55314c;

    public c2(String widgetListId, List visibleItems) {
        Intrinsics.checkNotNullParameter(widgetListId, "widgetListId");
        Intrinsics.checkNotNullParameter(visibleItems, "visibleItems");
        this.f55313b = widgetListId;
        this.f55314c = visibleItems;
    }

    @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.a
    public final String a() {
        return this.f55313b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c2)) {
            return false;
        }
        c2 c2Var = (c2) obj2;
        return Intrinsics.f(this.f55313b, c2Var.f55313b) && Intrinsics.f(this.f55314c, c2Var.f55314c);
    }

    public final int hashCode() {
        return this.f55314c.hashCode() + (this.f55313b.hashCode() * 31);
    }
}
