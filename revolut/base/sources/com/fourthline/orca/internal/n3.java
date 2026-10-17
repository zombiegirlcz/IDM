package com.fourthline.orca.internal;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class n3 implements k3, b5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a4 f31318a;

    public n3(a4 flowAction) {
        Intrinsics.checkNotNullParameter(flowAction, "flowAction");
        this.f31318a = flowAction;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n3) && Intrinsics.f(this.f31318a, ((n3) obj2).f31318a);
    }

    public int hashCode() {
        return this.f31318a.hashCode();
    }

    public String toString() {
        return "Forward(flowAction=" + this.f31318a + ")";
    }
}
