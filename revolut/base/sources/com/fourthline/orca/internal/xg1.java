package com.fourthline.orca.internal;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class xg1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f34990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f34991b;

    public xg1(String preSADToken, String signatureVerifier) {
        Intrinsics.checkNotNullParameter(preSADToken, "preSADToken");
        Intrinsics.checkNotNullParameter(signatureVerifier, "signatureVerifier");
        this.f34990a = preSADToken;
        this.f34991b = signatureVerifier;
    }

    public final String a() {
        return this.f34990a;
    }

    public final String b() {
        return this.f34991b;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof xg1)) {
            return false;
        }
        xg1 xg1Var = (xg1) obj2;
        return Intrinsics.f(this.f34990a, xg1Var.f34990a) && Intrinsics.f(this.f34991b, xg1Var.f34991b);
    }

    public int hashCode() {
        return (this.f34990a.hashCode() * 31) + this.f34991b.hashCode();
    }

    public String toString() {
        return "WorkflowQtspChallengeData(preSADToken=" + this.f34990a + ", signatureVerifier=" + this.f34991b + ")";
    }
}
