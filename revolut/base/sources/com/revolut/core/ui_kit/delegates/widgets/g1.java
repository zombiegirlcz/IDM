package com.revolut.core.ui_kit.delegates.widgets;

import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;

/* JADX INFO: loaded from: classes19.dex */
public final class g1 implements m1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CompositeClause f55357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f55358b;

    public g1(CompositeClause compositeClause, TextLocalisedClause textLocalisedClause) {
        this.f55357a = compositeClause;
        this.f55358b = textLocalisedClause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g1)) {
            return false;
        }
        g1 g1Var = (g1) obj2;
        return this.f55357a.equals(g1Var.f55357a) && this.f55358b.equals(g1Var.f55358b);
    }

    public final int hashCode() {
        return this.f55358b.hashCode() + (this.f55357a.hashCode() * 31);
    }
}
