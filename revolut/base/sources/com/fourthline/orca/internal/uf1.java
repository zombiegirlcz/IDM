package com.fourthline.orca.internal;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class uf1 implements he1, qf1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final kh0 f34079a;

    public uf1(kh0 error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f34079a = error;
    }

    public final kh0 c() {
        return this.f34079a;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof uf1) && Intrinsics.f(this.f34079a, ((uf1) obj2).f34079a);
    }

    public int hashCode() {
        return this.f34079a.hashCode();
    }

    public String toString() {
        return "FinishWithError(error=" + this.f34079a + ")";
    }
}
