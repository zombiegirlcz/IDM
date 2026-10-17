package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f55612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f55613b;

    public y0(Clause primary, Clause clause) {
        Intrinsics.checkNotNullParameter(primary, "primary");
        this.f55612a = primary;
        this.f55613b = clause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj2;
        return Intrinsics.f(this.f55612a, y0Var.f55612a) && Intrinsics.f(this.f55613b, y0Var.f55613b);
    }

    public final int hashCode() {
        int iHashCode = this.f55612a.hashCode() * 31;
        Clause clause = this.f55613b;
        return iHashCode + (clause == null ? 0 : clause.hashCode());
    }
}
