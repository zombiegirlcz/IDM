package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class g6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f54199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FixedTabsDelegate.Model f54200b;

    public g6(String selectedId, FixedTabsDelegate.Model model) {
        Intrinsics.checkNotNullParameter(selectedId, "selectedId");
        Intrinsics.checkNotNullParameter(model, "model");
        this.f54199a = selectedId;
        this.f54200b = model;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g6)) {
            return false;
        }
        g6 g6Var = (g6) obj2;
        return Intrinsics.f(this.f54199a, g6Var.f54199a) && Intrinsics.f(this.f54200b, g6Var.f54200b);
    }

    public final int hashCode() {
        return this.f54200b.hashCode() + (this.f54199a.hashCode() * 31);
    }
}
