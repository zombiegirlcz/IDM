package com.revolut.core.ui_kit.delegates.widgets;

import aw0.o9;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.DotDividerClause;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.ImageClauseTint;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class p1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f55464a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CompositeClause f55465b;

    public p1(Clause clause, o1 o1Var) {
        Clause compositeClause;
        CompositeClause compositeClause2 = null;
        if (clause == null || o1Var == null) {
            compositeClause = clause;
        } else {
            GoalProgressWidgetDelegate.INSTANCE.getClass();
            compositeClause = new CompositeClause(zhm.v.k(clause, new DotDividerClause((Integer) null)), null, null, null, 14);
        }
        if (o1Var != null) {
            Float fValueOf = Float.valueOf(16.0f);
            Integer num = o1Var.f55448c;
            n1 n1Var = o1Var.f55447b;
            Custom custom = n1Var != null ? new Custom(Integer.valueOf(n1Var.a()), false, null, false, null, 254) : null;
            Clause[] elements = {new ImageClause(num.intValue(), n1Var == null ? ImageClauseTint.TextColor.f57790a : new ImageClauseTint.Color(new Color.Solid(n1Var.a())), fValueOf, fValueOf, 16), o1Var.f55446a};
            Intrinsics.checkNotNullParameter(elements, "elements");
            List listL = kotlin.collections.d.L(elements);
            m70.a.t(kotlin.jvm.internal.t0.f186434a);
            compositeClause2 = new CompositeClause(listL, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), custom, null, 8);
        }
        this.f55464a = compositeClause;
        this.f55465b = compositeClause2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p1)) {
            return false;
        }
        p1 p1Var = (p1) obj2;
        return Intrinsics.f(this.f55464a, p1Var.f55464a) && Intrinsics.f(this.f55465b, p1Var.f55465b);
    }

    public final int hashCode() {
        Clause clause = this.f55464a;
        int iHashCode = (clause == null ? 0 : clause.hashCode()) * 31;
        CompositeClause compositeClause = this.f55465b;
        return iHashCode + (compositeClause != null ? compositeClause.hashCode() : 0);
    }
}
