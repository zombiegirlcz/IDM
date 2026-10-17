package com.revolut.core.ui_kit.delegates.widgets;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f55390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f55391b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f55392c;

    public j1(int i, long j2, Clause title) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f55390a = title;
        this.f55391b = j2;
        this.f55392c = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j1)) {
            return false;
        }
        j1 j1Var = (j1) obj2;
        return this.f55390a.equals(j1Var.f55390a) && this.f55391b == j1Var.f55391b && this.f55392c == j1Var.f55392c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f55392c) + a0.d.c(this.f55390a.hashCode() * 31, 31, this.f55391b);
    }
}
