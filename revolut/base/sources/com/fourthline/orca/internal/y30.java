package com.fourthline.orca.internal;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class y30 implements fq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final fp f35152a;

    public y30(fp flowAction) {
        Intrinsics.checkNotNullParameter(flowAction, "flowAction");
        this.f35152a = flowAction;
    }

    public final fp c() {
        return this.f35152a;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof y30) && Intrinsics.f(this.f35152a, ((y30) obj2).f35152a);
    }

    public int hashCode() {
        return this.f35152a.hashCode();
    }

    public String toString() {
        return "IntroForward(flowAction=" + this.f35152a + ")";
    }
}
