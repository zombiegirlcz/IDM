package com.fourthline.orca.internal;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class yn0 implements he1, cn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final kp0 f35394a;

    public yn0(kp0 flowAction) {
        Intrinsics.checkNotNullParameter(flowAction, "flowAction");
        this.f35394a = flowAction;
    }

    public final kp0 c() {
        return this.f35394a;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof yn0) && Intrinsics.f(this.f35394a, ((yn0) obj2).f35394a);
    }

    public int hashCode() {
        return this.f35394a.hashCode();
    }

    public String toString() {
        return "Forward(flowAction=" + this.f35394a + ")";
    }
}
