package com.fourthline.orca.internal;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class h3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f29094a;

    public h3(String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        this.f29094a = accountNumber;
    }

    public final String a() {
        return this.f29094a;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h3) && Intrinsics.f(this.f29094a, ((h3) obj2).f29094a);
    }

    public int hashCode() {
        return this.f29094a.hashCode();
    }

    public String toString() {
        return "BavCaptureResult(accountNumber=" + this.f29094a + ")";
    }
}
