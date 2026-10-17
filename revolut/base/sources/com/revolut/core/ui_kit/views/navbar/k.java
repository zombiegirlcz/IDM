package com.revolut.core.ui_kit.views.navbar;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import ip0.v7;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import tx0.x1;

/* JADX INFO: loaded from: classes20.dex */
public final class k extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f59536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f59537b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextClause f59538c;
    public final x1 d;

    public k(TextLocalisedClause text, Clause caption, x1 style) {
        m70.a.t(t0.f186434a);
        TextClause separator = new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(caption, "caption");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f59536a = text;
        this.f59537b = caption;
        this.f59538c = separator;
        this.d = style;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f59536a, kVar.f59536a) && Intrinsics.f(this.f59537b, kVar.f59537b) && Intrinsics.f(this.f59538c, kVar.f59538c) && this.d == kVar.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + v7.b(p.a.a(this.f59536a.hashCode() * 31, 31, this.f59537b), 31, this.f59538c);
    }
}
