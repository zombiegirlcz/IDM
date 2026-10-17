package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.StreakStepVerticalDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class mh extends StreakStepVerticalDelegate.Model.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f54483a;

    public mh(TextLocalisedClause clause) {
        Intrinsics.checkNotNullParameter(clause, "clause");
        this.f54483a = clause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof mh) && this.f54483a.equals(((mh) obj2).f54483a);
    }

    public final int hashCode() {
        return this.f54483a.hashCode();
    }
}
