package com.revolut.core.ui_kit.delegates.widgets;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.widgets.CalendarListWidgetDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class n extends CalendarListWidgetDelegate.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f55434b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LargeActionButtonDelegate.Model f55435c;

    public n(String widgetListId, LargeActionButtonDelegate.Model model) {
        Intrinsics.checkNotNullParameter(widgetListId, "widgetListId");
        Intrinsics.checkNotNullParameter(model, "model");
        this.f55434b = widgetListId;
        this.f55435c = model;
    }

    @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.a
    public final String a() {
        return this.f55434b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f55434b, nVar.f55434b) && Intrinsics.f(this.f55435c, nVar.f55435c);
    }

    public final int hashCode() {
        return this.f55435c.hashCode() + (this.f55434b.hashCode() * 31);
    }
}
