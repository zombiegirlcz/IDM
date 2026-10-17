package com.revolut.core.ui_kit.delegates.widgets;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class h0 implements i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f55364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f55365b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f55366c;
    public final g0 d;

    public h0(TextLocalisedClause title, TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2, g0 valueStyle) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(valueStyle, "valueStyle");
        this.f55364a = title;
        this.f55365b = textLocalisedClause;
        this.f55366c = textLocalisedClause2;
        this.d = valueStyle;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj2;
        return this.f55364a.equals(h0Var.f55364a) && Intrinsics.f(this.f55365b, h0Var.f55365b) && Intrinsics.f(this.f55366c, h0Var.f55366c) && this.d == h0Var.d;
    }

    public final int hashCode() {
        int iHashCode = this.f55364a.hashCode() * 31;
        Clause clause = this.f55365b;
        int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
        Clause clause2 = this.f55366c;
        return this.d.hashCode() + ((iHashCode2 + (clause2 != null ? clause2.hashCode() : 0)) * 31);
    }
}
