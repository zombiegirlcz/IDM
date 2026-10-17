package com.revolut.core.ui_kit.delegates.widgets;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.widgets.NewsWidgetDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class m2 extends NewsWidgetDelegate.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f55428b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LargeActionButtonDelegate.Model f55429c;

    public m2(String widgetListId, LargeActionButtonDelegate.Model model) {
        Intrinsics.checkNotNullParameter(widgetListId, "widgetListId");
        Intrinsics.checkNotNullParameter(model, "model");
        this.f55428b = widgetListId;
        this.f55429c = model;
    }

    @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.a
    public final String a() {
        return this.f55428b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m2)) {
            return false;
        }
        m2 m2Var = (m2) obj2;
        return Intrinsics.f(this.f55428b, m2Var.f55428b) && Intrinsics.f(this.f55429c, m2Var.f55429c);
    }

    public final int hashCode() {
        return this.f55429c.hashCode() + (this.f55428b.hashCode() * 31);
    }
}
