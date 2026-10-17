package com.revolut.core.ui_kit.delegates.widgets;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class d0 implements i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c0 f55321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c0 f55322b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c0 f55323c;

    public d0(c0 firstItem, c0 c0Var, c0 c0Var2) {
        Intrinsics.checkNotNullParameter(firstItem, "firstItem");
        this.f55321a = firstItem;
        this.f55322b = c0Var;
        this.f55323c = c0Var2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj2;
        return Intrinsics.f(this.f55321a, d0Var.f55321a) && Intrinsics.f(this.f55322b, d0Var.f55322b) && Intrinsics.f(this.f55323c, d0Var.f55323c);
    }

    public final int hashCode() {
        int iHashCode = this.f55321a.hashCode() * 31;
        c0 c0Var = this.f55322b;
        int iHashCode2 = (iHashCode + (c0Var == null ? 0 : c0Var.hashCode())) * 31;
        c0 c0Var2 = this.f55323c;
        return iHashCode2 + (c0Var2 != null ? c0Var2.hashCode() : 0);
    }
}
