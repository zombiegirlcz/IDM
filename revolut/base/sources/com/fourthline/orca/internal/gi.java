package com.fourthline.orca.internal;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class gi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c81 f28893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f28894b;

    public gi(c81 label, boolean z) {
        Intrinsics.checkNotNullParameter(label, "label");
        this.f28893a = label;
        this.f28894b = z;
    }

    public final gi a(c81 label, boolean z) {
        Intrinsics.checkNotNullParameter(label, "label");
        return new gi(label, z);
    }

    public final boolean b() {
        return this.f28894b;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof gi)) {
            return false;
        }
        gi giVar = (gi) obj2;
        return Intrinsics.f(this.f28893a, giVar.f28893a) && this.f28894b == giVar.f28894b;
    }

    public int hashCode() {
        return (this.f28893a.hashCode() * 31) + Boolean.hashCode(this.f28894b);
    }

    public String toString() {
        return "CheckboxState(label=" + this.f28893a + ", isSelected=" + this.f28894b + ")";
    }

    public static /* synthetic */ gi a(gi giVar, c81 c81Var, boolean z, int i, Object obj2) {
        if ((i & 1) != 0) {
            c81Var = giVar.f28893a;
        }
        if ((i & 2) != 0) {
            z = giVar.f28894b;
        }
        return giVar.a(c81Var, z);
    }

    public final c81 a() {
        return this.f28893a;
    }
}
