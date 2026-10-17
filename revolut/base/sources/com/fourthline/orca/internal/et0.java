package com.fourthline.orca.internal;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class et0 implements ee1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final kh0 f28264a;

    public et0(kh0 error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f28264a = error;
    }

    public final kh0 c() {
        return this.f28264a;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof et0) && Intrinsics.f(this.f28264a, ((et0) obj2).f28264a);
    }

    public int hashCode() {
        return this.f28264a.hashCode();
    }

    public String toString() {
        return "QesFinishWithError(error=" + this.f28264a + ")";
    }
}
