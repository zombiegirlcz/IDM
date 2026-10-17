package com.fourthline.orca.internal;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class sp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q80 f33084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f33085b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f33086c;

    public sp0(q80 destination, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        this.f33084a = destination;
        this.f33085b = z;
        this.f33086c = z3;
    }

    public final q80 a() {
        return this.f33084a;
    }

    public final boolean b() {
        return this.f33085b;
    }

    public final boolean c() {
        return this.f33086c;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof sp0)) {
            return false;
        }
        sp0 sp0Var = (sp0) obj2;
        return Intrinsics.f(this.f33084a, sp0Var.f33084a) && this.f33085b == sp0Var.f33085b && this.f33086c == sp0Var.f33086c;
    }

    public int hashCode() {
        return (((this.f33084a.hashCode() * 31) + Boolean.hashCode(this.f33085b)) * 31) + Boolean.hashCode(this.f33086c);
    }

    public String toString() {
        return "PopUpToConfig(destination=" + this.f33084a + ", inclusive=" + this.f33085b + ", saveState=" + this.f33086c + ")";
    }

    public /* synthetic */ sp0(q80 q80Var, boolean z, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(q80Var, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z3);
    }
}
