package com.revolut.core.ui_kit.delegates.widgets;

import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class k1 implements m1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f55400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Color.Solid f55401b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f55402c;
    public final Clause d;

    public k1(ArrayList steps, n1 color, Clause clause, TextLocalisedClause textLocalisedClause) {
        Intrinsics.checkNotNullParameter(steps, "steps");
        Intrinsics.checkNotNullParameter(color, "color");
        Color.Solid solid = new Color.Solid(color.a());
        this.f55400a = steps;
        this.f55401b = solid;
        this.f55402c = clause;
        this.d = textLocalisedClause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k1)) {
            return false;
        }
        k1 k1Var = (k1) obj2;
        return Intrinsics.f(this.f55400a, k1Var.f55400a) && Intrinsics.f(this.f55401b, k1Var.f55401b) && Intrinsics.f(this.f55402c, k1Var.f55402c) && Intrinsics.f(this.d, k1Var.d);
    }

    public final int hashCode() {
        int iB = j6.a.b(this.f55401b.f51464b, this.f55400a.hashCode() * 31, 31);
        Object obj2 = this.f55402c;
        int iHashCode = (iB + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Clause clause = this.d;
        return iHashCode + (clause != null ? clause.hashCode() : 0);
    }
}
