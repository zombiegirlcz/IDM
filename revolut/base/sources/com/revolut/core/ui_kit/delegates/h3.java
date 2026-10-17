package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.ChatContextualChartDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class h3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChatContextualChartDelegate.Model f54227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g6 f54228b;

    public h3(ChatContextualChartDelegate.Model model, g6 selectedData) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(selectedData, "selectedData");
        this.f54227a = model;
        this.f54228b = selectedData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h3)) {
            return false;
        }
        h3 h3Var = (h3) obj2;
        return Intrinsics.f(this.f54227a, h3Var.f54227a) && Intrinsics.f(this.f54228b, h3Var.f54228b);
    }

    public final int hashCode() {
        return this.f54228b.hashCode() + (this.f54227a.hashCode() * 31);
    }
}
