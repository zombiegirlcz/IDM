package com.revolut.core.ui_kit.delegates.widgets;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class n3 implements p3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f55440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f55441b;

    public n3(Clause text, Object obj2) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f55440a = text;
        this.f55441b = obj2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n3)) {
            return false;
        }
        n3 n3Var = (n3) obj2;
        return Intrinsics.f(this.f55440a, n3Var.f55440a) && Intrinsics.f(this.f55441b, n3Var.f55441b);
    }

    public final int hashCode() {
        int iHashCode = this.f55440a.hashCode() * 31;
        Object obj2 = this.f55441b;
        return iHashCode + (obj2 == null ? 0 : obj2.hashCode());
    }
}
