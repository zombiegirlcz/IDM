package com.revolut.core.ui_kit.delegates.widgets;

import com.revolut.core.ui_kit.delegates.VoucherExtraSmallTileDelegate;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class j4 extends BaseDraggableWidgetDelegate.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f55397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final VoucherExtraSmallTileDelegate.Model f55398c;

    public j4(String widgetListId, VoucherExtraSmallTileDelegate.Model model) {
        Intrinsics.checkNotNullParameter(widgetListId, "widgetListId");
        Intrinsics.checkNotNullParameter(model, "model");
        this.f55397b = widgetListId;
        this.f55398c = model;
    }

    @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.a
    public final String a() {
        return this.f55397b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j4)) {
            return false;
        }
        j4 j4Var = (j4) obj2;
        return Intrinsics.f(this.f55397b, j4Var.f55397b) && Intrinsics.f(this.f55398c, j4Var.f55398c);
    }

    public final int hashCode() {
        return this.f55398c.hashCode() + (this.f55397b.hashCode() * 31);
    }
}
