package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.RewardDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;

/* JADX INFO: loaded from: classes19.dex */
public final class ne extends RewardDelegate.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f54509a;

    public ne(TextLocalisedClause textLocalisedClause) {
        this.f54509a = textLocalisedClause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof ne) && this.f54509a.equals(((ne) obj2).f54509a);
    }

    public final int hashCode() {
        return this.f54509a.hashCode();
    }
}
