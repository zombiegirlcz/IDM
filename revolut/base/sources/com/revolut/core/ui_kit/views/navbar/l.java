package com.revolut.core.ui_kit.views.navbar;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;
import tx0.x1;

/* JADX INFO: loaded from: classes20.dex */
public final class l extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f59539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x1 f59540b;

    public l(Clause text, x1 style) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f59539a = text;
        this.f59540b = style;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f59539a, lVar.f59539a) && this.f59540b == lVar.f59540b;
    }

    public final int hashCode() {
        return this.f59540b.hashCode() + (this.f59539a.hashCode() * 31);
    }

    public /* synthetic */ l(Clause clause) {
        this(clause, x1.DEFAULT);
    }
}
