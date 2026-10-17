package com.fourthline.orca.internal;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class m3 implements k3, b5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final kh0 f30973a;

    public m3(kh0 error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f30973a = error;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m3) && Intrinsics.f(this.f30973a, ((m3) obj2).f30973a);
    }

    public int hashCode() {
        return this.f30973a.hashCode();
    }

    public String toString() {
        return "FinishWithError(error=" + this.f30973a + ")";
    }
}
