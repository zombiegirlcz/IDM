package com.revolut.core.ui_kit.delegates.widgets;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class c4 implements f4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f55317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f55318b;

    public c4(Clause top, Clause clause) {
        Intrinsics.checkNotNullParameter(top, "top");
        this.f55317a = top;
        this.f55318b = clause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c4)) {
            return false;
        }
        c4 c4Var = (c4) obj2;
        return Intrinsics.f(this.f55317a, c4Var.f55317a) && Intrinsics.f(this.f55318b, c4Var.f55318b);
    }

    public final int hashCode() {
        int iHashCode = this.f55317a.hashCode() * 31;
        Clause clause = this.f55318b;
        return iHashCode + (clause == null ? 0 : clause.hashCode());
    }
}
