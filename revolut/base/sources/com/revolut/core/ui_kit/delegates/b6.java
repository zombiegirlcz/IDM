package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class b6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f53712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f53713b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f53714c;
    public final a6 d;
    public final Clause e;

    public b6(Clause priceTitle, Clause price, int i, a6 priceStyle, Clause clause) {
        Intrinsics.checkNotNullParameter(priceTitle, "priceTitle");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(priceStyle, "priceStyle");
        this.f53712a = priceTitle;
        this.f53713b = price;
        this.f53714c = i;
        this.d = priceStyle;
        this.e = clause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b6)) {
            return false;
        }
        b6 b6Var = (b6) obj2;
        return Intrinsics.f(this.f53712a, b6Var.f53712a) && Intrinsics.f(this.f53713b, b6Var.f53713b) && this.f53714c == b6Var.f53714c && this.d == b6Var.d && Intrinsics.f(this.e, b6Var.e);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + j6.a.b(this.f53714c, p.a.a(this.f53712a.hashCode() * 31, 31, this.f53713b), 31)) * 31;
        Clause clause = this.e;
        return iHashCode + (clause == null ? 0 : clause.hashCode());
    }
}
