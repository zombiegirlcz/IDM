package com.revolut.core.ui_kit.delegates.widgets;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f55478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f55479b;

    public q1(Clause mainValue, TextLocalisedClause textLocalisedClause) {
        Intrinsics.checkNotNullParameter(mainValue, "mainValue");
        this.f55478a = mainValue;
        this.f55479b = textLocalisedClause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q1)) {
            return false;
        }
        q1 q1Var = (q1) obj2;
        return this.f55478a.equals(q1Var.f55478a) && Intrinsics.f(this.f55479b, q1Var.f55479b);
    }

    public final int hashCode() {
        int iHashCode = this.f55478a.hashCode() * 31;
        Clause clause = this.f55479b;
        return iHashCode + (clause == null ? 0 : clause.hashCode());
    }
}
