package com.revolut.core.ui_kit.delegates.widgets;

import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f55334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MoneyClause f55335b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Color.Solid f55336c;

    public e0(Clause label, MoneyClause value, Color.Solid indicatorColor) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(indicatorColor, "indicatorColor");
        this.f55334a = label;
        this.f55335b = value;
        this.f55336c = indicatorColor;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj2;
        return Intrinsics.f(this.f55334a, e0Var.f55334a) && this.f55335b.equals(e0Var.f55335b) && this.f55336c.equals(e0Var.f55336c);
    }

    public final int hashCode() {
        return Integer.hashCode(this.f55336c.f51464b) + v7.a(this.f55334a.hashCode() * 31, 31, this.f55335b);
    }
}
