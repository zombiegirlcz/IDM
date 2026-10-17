package com.revolut.core.ui_kit.delegates.widgets;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class q4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f55484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f55485b;

    public q4(Clause value, TextLocalisedClause title) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f55484a = title;
        this.f55485b = value;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q4)) {
            return false;
        }
        q4 q4Var = (q4) obj2;
        return this.f55484a.equals(q4Var.f55484a) && this.f55485b.equals(q4Var.f55485b);
    }

    public final int hashCode() {
        return this.f55485b.hashCode() + (this.f55484a.hashCode() * 31);
    }
}
