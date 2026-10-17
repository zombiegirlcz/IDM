package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.models.MoneyClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class x5 implements y5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MoneyClause f55594a;

    public x5(MoneyClause text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f55594a = text;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof x5) && this.f55594a.equals(((x5) obj2).f55594a);
    }

    public final int hashCode() {
        return this.f55594a.hashCode();
    }
}
