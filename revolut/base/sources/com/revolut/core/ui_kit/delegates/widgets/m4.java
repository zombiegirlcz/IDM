package com.revolut.core.ui_kit.delegates.widgets;

import com.revolut.core.ui_kit.delegates.widgets.TilePaginatedGridWidgetDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class m4 extends TilePaginatedGridWidgetDelegate.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f55432b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f55433c;
    public final Object d;

    public m4(Object obj2, String widgetListId, String itemListId) {
        Intrinsics.checkNotNullParameter(widgetListId, "widgetListId");
        Intrinsics.checkNotNullParameter(itemListId, "itemListId");
        this.f55432b = widgetListId;
        this.f55433c = itemListId;
        this.d = obj2;
    }

    @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.a
    public final String a() {
        return this.f55432b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m4)) {
            return false;
        }
        m4 m4Var = (m4) obj2;
        return Intrinsics.f(this.f55432b, m4Var.f55432b) && Intrinsics.f(this.f55433c, m4Var.f55433c) && Intrinsics.f(this.d, m4Var.d);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f55432b.hashCode() * 31, 31, this.f55433c);
        Object obj2 = this.d;
        return iC + (obj2 == null ? 0 : obj2.hashCode());
    }
}
