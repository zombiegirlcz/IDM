package com.revolut.core.ui_kit.delegates.widgets;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class r1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q1 f55488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p1 f55489b;

    public r1(q1 q1Var, p1 p1Var) {
        this.f55488a = q1Var;
        this.f55489b = p1Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r1)) {
            return false;
        }
        r1 r1Var = (r1) obj2;
        return Intrinsics.f(this.f55488a, r1Var.f55488a) && Intrinsics.f(this.f55489b, r1Var.f55489b);
    }

    public final int hashCode() {
        q1 q1Var = this.f55488a;
        int iHashCode = (q1Var == null ? 0 : q1Var.hashCode()) * 31;
        p1 p1Var = this.f55489b;
        return iHashCode + (p1Var != null ? p1Var.hashCode() : 0);
    }
}
