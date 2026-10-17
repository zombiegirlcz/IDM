package com.revolut.core.ui_kit.delegates.widgets;

import com.revolut.core.ui_kit.models.CompositeClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class x4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CompositeClause f55553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jtd.q f55554b;

    public x4(CompositeClause clause, jtd.q qVar) {
        Intrinsics.checkNotNullParameter(clause, "clause");
        this.f55553a = clause;
        this.f55554b = qVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x4)) {
            return false;
        }
        x4 x4Var = (x4) obj2;
        return this.f55553a.equals(x4Var.f55553a) && this.f55554b.equals(x4Var.f55554b);
    }

    public final int hashCode() {
        return this.f55554b.hashCode() + (this.f55553a.hashCode() * 31);
    }
}
