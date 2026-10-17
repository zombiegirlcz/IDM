package com.google.protobuf;

import org.bouncycastle.crypto.digests.Blake2xsDigest;

/* JADX INFO: loaded from: classes17.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f49689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f49690b;

    public c0(int i, d2 d2Var) {
        this.f49689a = d2Var;
        this.f49690b = i;
    }

    public final boolean equals(Object obj2) {
        if (!(obj2 instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj2;
        return this.f49689a == c0Var.f49689a && this.f49690b == c0Var.f49690b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f49689a) * Blake2xsDigest.UNKNOWN_DIGEST_LENGTH) + this.f49690b;
    }
}
