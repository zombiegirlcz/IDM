package com.revolut.core.ui_kit.delegates.widgets;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f55287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f55288b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f55289c;

    public a1(Clause title, TextLocalisedClause topLabel, TextLocalisedClause textLocalisedClause) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(topLabel, "topLabel");
        this.f55287a = title;
        this.f55288b = topLabel;
        this.f55289c = textLocalisedClause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a1)) {
            return false;
        }
        a1 a1Var = (a1) obj2;
        return this.f55287a.equals(a1Var.f55287a) && this.f55288b.equals(a1Var.f55288b) && Intrinsics.f(this.f55289c, a1Var.f55289c);
    }

    public final int hashCode() {
        int iA = t61.a.a(this.f55287a.hashCode() * 31, 31, this.f55288b);
        Clause clause = this.f55289c;
        return iA + (clause == null ? 0 : clause.hashCode());
    }
}
