package com.fourthline.orca.internal;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class v70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f34262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f34263b;

    public v70(String signature, String nonce) {
        Intrinsics.checkNotNullParameter(signature, "signature");
        Intrinsics.checkNotNullParameter(nonce, "nonce");
        this.f34262a = signature;
        this.f34263b = nonce;
    }

    public final String a() {
        return this.f34263b;
    }

    public final String b() {
        return this.f34262a;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v70)) {
            return false;
        }
        v70 v70Var = (v70) obj2;
        return Intrinsics.f(this.f34262a, v70Var.f34262a) && Intrinsics.f(this.f34263b, v70Var.f34263b);
    }

    public int hashCode() {
        return (this.f34262a.hashCode() * 31) + this.f34263b.hashCode();
    }

    public String toString() {
        return "MediaSignature(signature=" + this.f34262a + ", nonce=" + this.f34263b + ")";
    }
}
