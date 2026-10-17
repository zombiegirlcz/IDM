package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class db implements fb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f54031a;

    public db(Clause titleClause) {
        Intrinsics.checkNotNullParameter(titleClause, "titleClause");
        this.f54031a = titleClause;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    @Override // com.revolut.core.ui_kit.delegates.fb
    public final Clause a() {
        return this.f54031a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof db) && this.f54031a.equals(((db) obj2).f54031a);
    }

    public final int hashCode() {
        return this.f54031a.hashCode();
    }
}
