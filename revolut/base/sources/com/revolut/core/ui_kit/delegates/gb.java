package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.PlanWidgetDelegate;
import com.revolut.core.ui_kit.views.ActionsView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class gb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PlanWidgetDelegate.Model f54216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ActionsView.Item f54217b;

    public gb(PlanWidgetDelegate.Model model, ActionsView.Item item) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(item, "item");
        this.f54216a = model;
        this.f54217b = item;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof gb)) {
            return false;
        }
        gb gbVar = (gb) obj2;
        return Intrinsics.f(this.f54216a, gbVar.f54216a) && Intrinsics.f(this.f54217b, gbVar.f54217b);
    }

    public final int hashCode() {
        return this.f54217b.hashCode() + (this.f54216a.hashCode() * 31);
    }
}
