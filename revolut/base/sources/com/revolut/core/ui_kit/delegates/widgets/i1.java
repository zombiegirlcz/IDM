package com.revolut.core.ui_kit.delegates.widgets;

import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class i1 implements m1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f55376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Color.Solid f55377b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f55378c;
    public final Clause d;

    public i1(int i, n1 color, Clause clause, Clause clause2) {
        Intrinsics.checkNotNullParameter(color, "color");
        Color.Solid solid = new Color.Solid(color.a());
        this.f55376a = i;
        this.f55377b = solid;
        this.f55378c = clause;
        this.d = clause2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj2;
        return this.f55376a == i1Var.f55376a && Intrinsics.f(this.f55377b, i1Var.f55377b) && Intrinsics.f(this.f55378c, i1Var.f55378c) && Intrinsics.f(this.d, i1Var.d);
    }

    public final int hashCode() {
        int iB = j6.a.b(this.f55377b.f51464b, Integer.hashCode(this.f55376a) * 31, 31);
        Clause clause = this.f55378c;
        int iHashCode = (iB + (clause == null ? 0 : clause.hashCode())) * 31;
        Clause clause2 = this.d;
        return iHashCode + (clause2 != null ? clause2.hashCode() : 0);
    }
}
