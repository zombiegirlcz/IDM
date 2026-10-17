package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.ContextualSegmentedBarDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class m4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ContextualSegmentedBarDelegate.Model f54457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f54458b;

    public m4(ContextualSegmentedBarDelegate.Model model, String str) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f54457a = model;
        this.f54458b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m4)) {
            return false;
        }
        m4 m4Var = (m4) obj2;
        return Intrinsics.f(this.f54457a, m4Var.f54457a) && Intrinsics.f(this.f54458b, m4Var.f54458b);
    }

    public final int hashCode() {
        int iHashCode = this.f54457a.hashCode() * 31;
        String str = this.f54458b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
