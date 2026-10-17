package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.ContextualLineChartDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class k4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ContextualLineChartDelegate.Model f54367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f54368b;

    public k4(ContextualLineChartDelegate.Model model, Integer num) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f54367a = model;
        this.f54368b = num;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k4)) {
            return false;
        }
        k4 k4Var = (k4) obj2;
        return Intrinsics.f(this.f54367a, k4Var.f54367a) && Intrinsics.f(this.f54368b, k4Var.f54368b);
    }

    public final int hashCode() {
        int iHashCode = this.f54367a.hashCode() * 31;
        Integer num = this.f54368b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }
}
