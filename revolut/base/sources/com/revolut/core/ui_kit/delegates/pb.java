package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.models.TextClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class pb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextClause f54580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ob f54581b;

    public pb(TextClause clause, ob style) {
        Intrinsics.checkNotNullParameter(clause, "clause");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f54580a = clause;
        this.f54581b = style;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof pb)) {
            return false;
        }
        pb pbVar = (pb) obj2;
        return this.f54580a.equals(pbVar.f54580a) && this.f54581b == pbVar.f54581b;
    }

    public final int hashCode() {
        return this.f54581b.hashCode() + (this.f54580a.hashCode() * 31);
    }
}
