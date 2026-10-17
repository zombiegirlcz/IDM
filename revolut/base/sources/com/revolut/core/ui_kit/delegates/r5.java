package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class r5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f54658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f54659b;

    public r5(Clause endLabel, TextLocalisedClause startLabel) {
        Intrinsics.checkNotNullParameter(startLabel, "startLabel");
        Intrinsics.checkNotNullParameter(endLabel, "endLabel");
        this.f54658a = startLabel;
        this.f54659b = endLabel;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r5)) {
            return false;
        }
        r5 r5Var = (r5) obj2;
        return this.f54658a.equals(r5Var.f54658a) && this.f54659b.equals(r5Var.f54659b);
    }

    public final int hashCode() {
        return p.a.b(this.f54658a.hashCode() * 31, 961, this.f54659b);
    }
}
