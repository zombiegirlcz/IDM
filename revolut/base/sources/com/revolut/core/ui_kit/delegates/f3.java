package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.ChatContextualChartDelegate;
import com.revolut.core.ui_kit.delegates.TrendViewDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class f3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChatContextualChartDelegate.Model f54139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TrendViewDelegate.a f54140b;

    public f3(ChatContextualChartDelegate.Model model, TrendViewDelegate.a state) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f54139a = model;
        this.f54140b = state;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f3)) {
            return false;
        }
        f3 f3Var = (f3) obj2;
        return Intrinsics.f(this.f54139a, f3Var.f54139a) && Intrinsics.f(this.f54140b, f3Var.f54140b);
    }

    public final int hashCode() {
        return this.f54140b.hashCode() + (this.f54139a.hashCode() * 31);
    }
}
