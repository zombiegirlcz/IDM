package com.fourthline.orca.internal;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class g30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f28742a;

    public g30(String token) {
        Intrinsics.checkNotNullParameter(token, "token");
        this.f28742a = token;
    }

    public final String a() {
        return this.f28742a;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g30) && Intrinsics.f(this.f28742a, ((g30) obj2).f28742a);
    }

    public int hashCode() {
        return this.f28742a.hashCode();
    }

    public String toString() {
        return "IntegrityTokenResult(token=" + this.f28742a + ")";
    }
}
