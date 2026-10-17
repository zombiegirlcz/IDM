package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class p0 implements q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f54567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f54568b;

    public p0(Clause clause, Clause clause2) {
        this.f54567a = clause;
        this.f54568b = clause2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj2;
        return this.f54567a.equals(p0Var.f54567a) && Intrinsics.f(this.f54568b, p0Var.f54568b);
    }

    public final int hashCode() {
        int iHashCode = this.f54567a.hashCode() * 31;
        Clause clause = this.f54568b;
        return iHashCode + (clause == null ? 0 : clause.hashCode());
    }
}
