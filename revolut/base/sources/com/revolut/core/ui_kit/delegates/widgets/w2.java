package com.revolut.core.ui_kit.delegates.widgets;

import com.revolut.core.ui_kit.delegates.widgets.PhotoBannerWidgetDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class w2 extends PhotoBannerWidgetDelegate.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f55541b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f55542c;
    public final Object d;

    public w2(Object obj2, String widgetListId, String itemListId) {
        Intrinsics.checkNotNullParameter(widgetListId, "widgetListId");
        Intrinsics.checkNotNullParameter(itemListId, "itemListId");
        this.f55541b = widgetListId;
        this.f55542c = itemListId;
        this.d = obj2;
    }

    @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.a
    public final String a() {
        return this.f55541b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w2)) {
            return false;
        }
        w2 w2Var = (w2) obj2;
        return Intrinsics.f(this.f55541b, w2Var.f55541b) && Intrinsics.f(this.f55542c, w2Var.f55542c) && Intrinsics.f(this.d, w2Var.d);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f55541b.hashCode() * 31, 31, this.f55542c);
        Object obj2 = this.d;
        return iC + (obj2 == null ? 0 : obj2.hashCode());
    }
}
