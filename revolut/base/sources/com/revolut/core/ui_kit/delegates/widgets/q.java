package com.revolut.core.ui_kit.delegates.widgets;

import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.CardWidgetDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class q extends BaseDraggableWidgetDelegate.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f55474b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CardWidgetDelegate.Model f55475c;

    public q(String widgetListId, CardWidgetDelegate.Model model) {
        Intrinsics.checkNotNullParameter(widgetListId, "widgetListId");
        Intrinsics.checkNotNullParameter(model, "model");
        this.f55474b = widgetListId;
        this.f55475c = model;
    }

    @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.a
    public final String a() {
        return this.f55474b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f55474b, qVar.f55474b) && Intrinsics.f(this.f55475c, qVar.f55475c);
    }

    public final int hashCode() {
        return this.f55475c.hashCode() + (this.f55474b.hashCode() * 31);
    }
}
