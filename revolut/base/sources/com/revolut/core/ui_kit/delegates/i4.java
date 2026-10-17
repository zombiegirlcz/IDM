package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.ContextualBarChartDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class i4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ContextualBarChartDelegate.Model f54275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f54276b;

    public i4(ContextualBarChartDelegate.Model model, String str) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f54275a = model;
        this.f54276b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i4)) {
            return false;
        }
        i4 i4Var = (i4) obj2;
        return Intrinsics.f(this.f54275a, i4Var.f54275a) && Intrinsics.f(this.f54276b, i4Var.f54276b);
    }

    public final int hashCode() {
        int iHashCode = this.f54275a.hashCode() * 31;
        String str = this.f54276b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
