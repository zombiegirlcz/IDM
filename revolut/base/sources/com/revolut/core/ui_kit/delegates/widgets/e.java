package com.revolut.core.ui_kit.delegates.widgets;

import com.revolut.core.ui_kit.delegates.ReferralContactDelegate;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class e extends BaseDraggableWidgetDelegate.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f55332b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ReferralContactDelegate.Model f55333c;

    public e(String widgetListId, ReferralContactDelegate.Model model) {
        Intrinsics.checkNotNullParameter(widgetListId, "widgetListId");
        Intrinsics.checkNotNullParameter(model, "model");
        this.f55332b = widgetListId;
        this.f55333c = model;
    }

    @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.a
    public final String a() {
        return this.f55332b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f55332b, eVar.f55332b) && Intrinsics.f(this.f55333c, eVar.f55333c);
    }

    public final int hashCode() {
        return this.f55333c.hashCode() + (this.f55332b.hashCode() * 31);
    }
}
