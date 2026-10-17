package com.revolut.core.ui_kit.delegates.widgets;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f55462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f55463b;

    public p0(Clause value, TextLocalisedClause label) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(label, "label");
        this.f55462a = value;
        this.f55463b = label;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj2;
        return this.f55462a.equals(p0Var.f55462a) && this.f55463b.equals(p0Var.f55463b);
    }

    public final int hashCode() {
        return this.f55463b.hashCode() + (this.f55462a.hashCode() * 31);
    }
}
