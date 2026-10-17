package com.fourthline.orca.internal;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class n80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l80 f31348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l80 f31349b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f31350c;

    public n80(l80 l80Var, l80 l80Var2, boolean z) {
        this.f31348a = l80Var;
        this.f31349b = l80Var2;
        this.f31350c = z;
    }

    public final l80 a() {
        return this.f31348a;
    }

    public final boolean b() {
        return this.f31350c;
    }

    public final l80 c() {
        return this.f31349b;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n80)) {
            return false;
        }
        n80 n80Var = (n80) obj2;
        return Intrinsics.f(this.f31348a, n80Var.f31348a) && Intrinsics.f(this.f31349b, n80Var.f31349b) && this.f31350c == n80Var.f31350c;
    }

    public int hashCode() {
        l80 l80Var = this.f31348a;
        int iHashCode = (l80Var == null ? 0 : l80Var.hashCode()) * 31;
        l80 l80Var2 = this.f31349b;
        return ((iHashCode + (l80Var2 != null ? l80Var2.hashCode() : 0)) * 31) + Boolean.hashCode(this.f31350c);
    }

    public String toString() {
        return "NavigationButtonsState(primaryButtonState=" + this.f31348a + ", secondaryButtonState=" + this.f31349b + ", reserveSecondaryButtonSpaceIfButtonIsMissing=" + this.f31350c + ")";
    }

    public /* synthetic */ n80(l80 l80Var, l80 l80Var2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l80Var, (i & 2) != 0 ? null : l80Var2, (i & 4) != 0 ? false : z);
    }
}
