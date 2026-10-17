package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class bb implements cb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f53717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f53718b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f53719c;

    public bb(Clause title, Clause clause, TextLocalisedClause textLocalisedClause, int i) {
        clause = (i & 2) != 0 ? null : clause;
        textLocalisedClause = (i & 4) != 0 ? null : textLocalisedClause;
        Intrinsics.checkNotNullParameter(title, "title");
        this.f53717a = title;
        this.f53718b = clause;
        this.f53719c = textLocalisedClause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof bb)) {
            return false;
        }
        bb bbVar = (bb) obj2;
        return this.f53717a.equals(bbVar.f53717a) && Intrinsics.f(this.f53718b, bbVar.f53718b) && Intrinsics.f(this.f53719c, bbVar.f53719c);
    }

    public final int hashCode() {
        int iHashCode = this.f53717a.hashCode() * 31;
        Clause clause = this.f53718b;
        int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
        Clause clause2 = this.f53719c;
        return (iHashCode2 + (clause2 != null ? clause2.hashCode() : 0)) * 961;
    }
}
