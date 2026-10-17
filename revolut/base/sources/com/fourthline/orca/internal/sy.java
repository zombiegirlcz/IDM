package com.fourthline.orca.internal;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class sy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f33161a;

    public sy(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f33161a = name;
    }

    public final String a() {
        return this.f33161a;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof sy) && Intrinsics.f(this.f33161a, ((sy) obj2).f33161a);
    }

    public int hashCode() {
        return this.f33161a.hashCode();
    }

    public String toString() {
        return "FlowDestination(name=" + this.f33161a + ")";
    }
}
