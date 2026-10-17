package com.fourthline.orca.internal;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class n5 implements b5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a4 f31329a;

    public n5(a4 flowAction) {
        Intrinsics.checkNotNullParameter(flowAction, "flowAction");
        this.f31329a = flowAction;
    }

    public final a4 c() {
        return this.f31329a;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n5) && Intrinsics.f(this.f31329a, ((n5) obj2).f31329a);
    }

    public int hashCode() {
        return this.f31329a.hashCode();
    }

    public String toString() {
        return "BavIntroForward(flowAction=" + this.f31329a + ")";
    }
}
