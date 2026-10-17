package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.SmallStockCardDelegate;
import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class tg extends SmallStockCardDelegate.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f54784a;

    public tg(Clause descriptionClause) {
        Intrinsics.checkNotNullParameter(descriptionClause, "descriptionClause");
        this.f54784a = descriptionClause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof tg) && Intrinsics.f(this.f54784a, ((tg) obj2).f54784a);
    }

    public final int hashCode() {
        return this.f54784a.hashCode() * 31;
    }
}
