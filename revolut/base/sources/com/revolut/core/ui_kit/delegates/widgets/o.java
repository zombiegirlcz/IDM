package com.revolut.core.ui_kit.delegates.widgets;

import com.revolut.core.ui_kit.delegates.CalendarRowDelegate;
import com.revolut.core.ui_kit.delegates.widgets.CalendarListWidgetDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class o extends CalendarListWidgetDelegate.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f55443b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CalendarRowDelegate.Model f55444c;

    public o(String widgetListId, CalendarRowDelegate.Model model) {
        Intrinsics.checkNotNullParameter(widgetListId, "widgetListId");
        Intrinsics.checkNotNullParameter(model, "model");
        this.f55443b = widgetListId;
        this.f55444c = model;
    }

    @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.a
    public final String a() {
        return this.f55443b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f55443b, oVar.f55443b) && Intrinsics.f(this.f55444c, oVar.f55444c);
    }

    public final int hashCode() {
        return this.f55444c.hashCode() + (this.f55443b.hashCode() * 31);
    }
}
