package com.fourthline.orca.internal;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class vf1 implements he1, qf1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ky f34353a;

    public vf1(ky flowAction) {
        Intrinsics.checkNotNullParameter(flowAction, "flowAction");
        this.f34353a = flowAction;
    }

    public final ky c() {
        return this.f34353a;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof vf1) && Intrinsics.f(this.f34353a, ((vf1) obj2).f34353a);
    }

    public int hashCode() {
        return this.f34353a.hashCode();
    }

    public String toString() {
        return "Forward(flowAction=" + this.f34353a + ")";
    }
}
