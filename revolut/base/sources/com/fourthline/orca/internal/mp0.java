package com.fourthline.orca.internal;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class mp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private gp0 f31241a;

    public mp0(gp0 gp0Var) {
        this.f31241a = gp0Var;
    }

    public final gp0 a() {
        return this.f31241a;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof mp0) && Intrinsics.f(this.f31241a, ((mp0) obj2).f31241a);
    }

    public int hashCode() {
        gp0 gp0Var = this.f31241a;
        if (gp0Var == null) {
            return 0;
        }
        return gp0Var.hashCode();
    }

    public String toString() {
        return "PoaFlowDataBundle(file=" + this.f31241a + ")";
    }

    public final void a(gp0 gp0Var) {
        this.f31241a = gp0Var;
    }

    public /* synthetic */ mp0(gp0 gp0Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : gp0Var);
    }
}
