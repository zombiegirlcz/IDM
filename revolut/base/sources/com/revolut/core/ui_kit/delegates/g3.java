package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.ChatContextualChartDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class g3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChatContextualChartDelegate.Model f54177a;

    public g3(ChatContextualChartDelegate.Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f54177a = model;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g3) && Intrinsics.f(this.f54177a, ((g3) obj2).f54177a);
    }

    public final int hashCode() {
        return this.f54177a.hashCode();
    }
}
