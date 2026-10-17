package com.fourthline.orca.internal;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class k6 implements he1, b5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a4 f30134a;

    public k6(a4 flowAction) {
        Intrinsics.checkNotNullParameter(flowAction, "flowAction");
        this.f30134a = flowAction;
    }

    public final a4 c() {
        return this.f30134a;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k6) && Intrinsics.f(this.f30134a, ((k6) obj2).f30134a);
    }

    public int hashCode() {
        return this.f30134a.hashCode();
    }

    public String toString() {
        return "Forward(flowAction=" + this.f30134a + ")";
    }
}
