package com.revolut.core.ui_kit.delegates.widgets;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class f0 implements i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e0 f55350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e0 f55351b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e0 f55352c;

    public f0(e0 firstItem, e0 e0Var, e0 e0Var2) {
        Intrinsics.checkNotNullParameter(firstItem, "firstItem");
        this.f55350a = firstItem;
        this.f55351b = e0Var;
        this.f55352c = e0Var2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj2;
        return Intrinsics.f(this.f55350a, f0Var.f55350a) && Intrinsics.f(this.f55351b, f0Var.f55351b) && Intrinsics.f(this.f55352c, f0Var.f55352c);
    }

    public final int hashCode() {
        int iHashCode = this.f55350a.hashCode() * 31;
        e0 e0Var = this.f55351b;
        int iHashCode2 = (iHashCode + (e0Var == null ? 0 : e0Var.hashCode())) * 31;
        e0 e0Var2 = this.f55352c;
        return iHashCode2 + (e0Var2 != null ? e0Var2.hashCode() : 0);
    }
}
