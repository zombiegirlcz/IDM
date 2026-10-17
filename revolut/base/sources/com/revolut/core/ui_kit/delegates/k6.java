package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class k6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextClause f54370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextClause f54371b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f54372c;

    public k6(TextClause airlineName, TextClause flightNumber, TextClause textClause) {
        Intrinsics.checkNotNullParameter(airlineName, "airlineName");
        Intrinsics.checkNotNullParameter(flightNumber, "flightNumber");
        this.f54370a = airlineName;
        this.f54371b = flightNumber;
        this.f54372c = textClause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k6)) {
            return false;
        }
        k6 k6Var = (k6) obj2;
        return this.f54370a.equals(k6Var.f54370a) && this.f54371b.equals(k6Var.f54371b) && Intrinsics.f(this.f54372c, k6Var.f54372c);
    }

    public final int hashCode() {
        int iB = ip0.v7.b(this.f54370a.hashCode() * 31, 31, this.f54371b);
        Clause clause = this.f54372c;
        return iB + (clause == null ? 0 : clause.hashCode());
    }
}
