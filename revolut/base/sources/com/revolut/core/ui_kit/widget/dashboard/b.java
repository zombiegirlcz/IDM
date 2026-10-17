package com.revolut.core.ui_kit.widget.dashboard;

import com.revolut.core.ui_kit.widget.dashboard.DashboardBoxViewWidgetDelegate;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class b extends DashboardBoxViewWidgetDelegate.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f59773a;

    public b(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f59773a = items;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f59773a, ((b) obj2).f59773a);
    }

    public final int hashCode() {
        return this.f59773a.hashCode() * 31;
    }
}
