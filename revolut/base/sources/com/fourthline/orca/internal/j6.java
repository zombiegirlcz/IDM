package com.fourthline.orca.internal;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class j6 implements he1, b5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final kh0 f29810a;

    public j6(kh0 error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f29810a = error;
    }

    public final kh0 c() {
        return this.f29810a;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j6) && Intrinsics.f(this.f29810a, ((j6) obj2).f29810a);
    }

    public int hashCode() {
        return this.f29810a.hashCode();
    }

    public String toString() {
        return "FinishWithError(error=" + this.f29810a + ")";
    }
}
