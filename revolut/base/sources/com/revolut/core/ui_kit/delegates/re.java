package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.RewardProgressDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class re extends RewardProgressDelegate.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f54675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f54676b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextClause f54677c;

    public re(int i, TextClause textClause, TextClause endText) {
        Intrinsics.checkNotNullParameter(endText, "endText");
        this.f54675a = i;
        this.f54676b = textClause;
        this.f54677c = endText;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof re)) {
            return false;
        }
        re reVar = (re) obj2;
        return this.f54675a == reVar.f54675a && Intrinsics.f(this.f54676b, reVar.f54676b) && this.f54677c.equals(reVar.f54677c);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f54675a) * 31;
        Clause clause = this.f54676b;
        return this.f54677c.hashCode() + ((iHashCode + (clause == null ? 0 : clause.hashCode())) * 31);
    }
}
