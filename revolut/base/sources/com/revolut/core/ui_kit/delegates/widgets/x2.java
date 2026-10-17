package com.revolut.core.ui_kit.delegates.widgets;

import com.revolut.core.ui_kit.delegates.widgets.PhotoBannerWidgetDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class x2 extends PhotoBannerWidgetDelegate.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f55551b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f55552c;
    public final Object d;

    public x2(Object obj2, String widgetListId, String itemListId) {
        Intrinsics.checkNotNullParameter(widgetListId, "widgetListId");
        Intrinsics.checkNotNullParameter(itemListId, "itemListId");
        this.f55551b = widgetListId;
        this.f55552c = itemListId;
        this.d = obj2;
    }

    @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.a
    public final String a() {
        return this.f55551b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x2)) {
            return false;
        }
        x2 x2Var = (x2) obj2;
        return Intrinsics.f(this.f55551b, x2Var.f55551b) && Intrinsics.f(this.f55552c, x2Var.f55552c) && Intrinsics.f(this.d, x2Var.d);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f55551b.hashCode() * 31, 31, this.f55552c);
        Object obj2 = this.d;
        return iC + (obj2 == null ? 0 : obj2.hashCode());
    }
}
