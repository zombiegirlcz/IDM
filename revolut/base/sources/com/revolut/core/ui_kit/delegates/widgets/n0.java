package com.revolut.core.ui_kit.delegates.widgets;

import com.revolut.core.ui_kit.delegates.ReferralContactDelegate;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class n0 extends BaseDraggableWidgetDelegate.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f55436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ReferralContactDelegate.Model f55437c;

    public n0(String widgetListId, ReferralContactDelegate.Model model) {
        Intrinsics.checkNotNullParameter(widgetListId, "widgetListId");
        Intrinsics.checkNotNullParameter(model, "model");
        this.f55436b = widgetListId;
        this.f55437c = model;
    }

    @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.a
    public final String a() {
        return this.f55436b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj2;
        return Intrinsics.f(this.f55436b, n0Var.f55436b) && Intrinsics.f(this.f55437c, n0Var.f55437c);
    }

    public final int hashCode() {
        return this.f55437c.hashCode() + (this.f55436b.hashCode() * 31);
    }
}
