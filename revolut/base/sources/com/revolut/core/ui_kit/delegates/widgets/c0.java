package com.revolut.core.ui_kit.delegates.widgets;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f55309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MoneyClause f55310b;

    public c0(Clause label, MoneyClause value) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f55309a = label;
        this.f55310b = value;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj2;
        return Intrinsics.f(this.f55309a, c0Var.f55309a) && this.f55310b.equals(c0Var.f55310b);
    }

    public final int hashCode() {
        return this.f55310b.hashCode() + (this.f55309a.hashCode() * 31);
    }
}
