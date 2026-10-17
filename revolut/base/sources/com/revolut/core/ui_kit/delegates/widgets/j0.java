package com.revolut.core.ui_kit.delegates.widgets;

import aw0.o9;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.ImageClauseTint;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MoneyClause f55387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k0 f55388b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f55389c;
    public final CompositeClause d;

    public j0(MoneyClause text, k0 style, Integer num) {
        Float fValueOf = Float.valueOf(10.0f);
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f55387a = text;
        this.f55388b = style;
        this.f55389c = num;
        Clause[] elements = {new ImageClause(num.intValue(), new ImageClauseTint.Color(new Color.Solid(style.a())), fValueOf, fValueOf, 16), text};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        m70.a.t(kotlin.jvm.internal.t0.f186434a);
        this.d = new CompositeClause(listL, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new Custom(Integer.valueOf(style.a()), false, null, false, null, 254), null, 8);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj2;
        return this.f55387a.equals(j0Var.f55387a) && this.f55388b == j0Var.f55388b && this.f55389c.equals(j0Var.f55389c);
    }

    public final int hashCode() {
        return this.f55389c.hashCode() + ((this.f55388b.hashCode() + (this.f55387a.hashCode() * 31)) * 31);
    }
}
