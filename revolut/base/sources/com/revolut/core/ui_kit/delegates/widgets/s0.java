package com.revolut.core.ui_kit.delegates.widgets;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f55499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ms0.h4 f55500b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f55501c;

    public s0(TextLocalisedClause textLocalisedClause) {
        ms0.h4 style = ms0.h4.SEMIACCENT;
        Intrinsics.checkNotNullParameter(style, "style");
        this.f55499a = textLocalisedClause;
        this.f55500b = style;
        this.f55501c = true;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj2;
        return Intrinsics.f(this.f55499a, s0Var.f55499a) && this.f55500b == s0Var.f55500b && this.f55501c == s0Var.f55501c;
    }

    public final int hashCode() {
        TextLocalisedClause textLocalisedClause = this.f55499a;
        return j6.a.c(j6.a.c((this.f55500b.hashCode() + ((textLocalisedClause == null ? 0 : textLocalisedClause.hashCode()) * 961)) * 31, 31, this.f55501c), 961, false);
    }
}
