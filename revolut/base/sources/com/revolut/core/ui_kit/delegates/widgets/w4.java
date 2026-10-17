package com.revolut.core.ui_kit.delegates.widgets;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class w4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v4 f55543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v4 f55544b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v4 f55545c;
    public final v4 d;

    public w4(v4 first, v4 second, v4 v4Var, v4 v4Var2) {
        Intrinsics.checkNotNullParameter(first, "first");
        Intrinsics.checkNotNullParameter(second, "second");
        this.f55543a = first;
        this.f55544b = second;
        this.f55545c = v4Var;
        this.d = v4Var2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w4)) {
            return false;
        }
        w4 w4Var = (w4) obj2;
        return Intrinsics.f(this.f55543a, w4Var.f55543a) && Intrinsics.f(this.f55544b, w4Var.f55544b) && Intrinsics.f(this.f55545c, w4Var.f55545c) && Intrinsics.f(this.d, w4Var.d);
    }

    public final int hashCode() {
        int iHashCode = (this.f55544b.hashCode() + (this.f55543a.hashCode() * 31)) * 31;
        v4 v4Var = this.f55545c;
        int iHashCode2 = (iHashCode + (v4Var == null ? 0 : v4Var.hashCode())) * 31;
        v4 v4Var2 = this.d;
        return iHashCode2 + (v4Var2 != null ? v4Var2.hashCode() : 0);
    }
}
