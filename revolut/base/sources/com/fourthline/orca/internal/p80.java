package com.fourthline.orca.internal;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class p80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f31880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f31881b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f31882c;
    private final sp0 d;

    public p80(boolean z, boolean z3, boolean z4, sp0 sp0Var) {
        this.f31880a = z;
        this.f31881b = z3;
        this.f31882c = z4;
        this.d = sp0Var;
    }

    public final boolean a() {
        return this.f31880a;
    }

    public final sp0 b() {
        return this.d;
    }

    public final boolean c() {
        return this.f31882c;
    }

    public final boolean d() {
        return this.f31881b;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p80)) {
            return false;
        }
        p80 p80Var = (p80) obj2;
        return this.f31880a == p80Var.f31880a && this.f31881b == p80Var.f31881b && this.f31882c == p80Var.f31882c && Intrinsics.f(this.d, p80Var.d);
    }

    public int hashCode() {
        int iHashCode = ((((Boolean.hashCode(this.f31880a) * 31) + Boolean.hashCode(this.f31881b)) * 31) + Boolean.hashCode(this.f31882c)) * 31;
        sp0 sp0Var = this.d;
        return iHashCode + (sp0Var == null ? 0 : sp0Var.hashCode());
    }

    public String toString() {
        return "NavigationConfig(fullScreen=" + this.f31880a + ", singleTop=" + this.f31881b + ", shouldRestoreState=" + this.f31882c + ", popUpToConfig=" + this.d + ")";
    }

    public /* synthetic */ p80(boolean z, boolean z3, boolean z4, sp0 sp0Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z3, (i & 4) != 0 ? false : z4, (i & 8) != 0 ? null : sp0Var);
    }
}
