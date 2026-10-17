package com.fourthline.orca.internal;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class y6 implements b5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a4 f35172a;

    public y6(a4 flowAction) {
        Intrinsics.checkNotNullParameter(flowAction, "flowAction");
        this.f35172a = flowAction;
    }

    public final a4 c() {
        return this.f35172a;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof y6) && Intrinsics.f(this.f35172a, ((y6) obj2).f35172a);
    }

    public int hashCode() {
        return this.f35172a.hashCode();
    }

    public String toString() {
        return "BavTypeSelectForward(flowAction=" + this.f35172a + ")";
    }
}
