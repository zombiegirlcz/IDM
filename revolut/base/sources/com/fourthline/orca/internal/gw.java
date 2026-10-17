package com.fourthline.orca.internal;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class gw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f29036a;

    public gw(String url2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f29036a = url2;
    }

    public final String a() {
        return this.f29036a;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof gw) && Intrinsics.f(this.f29036a, ((gw) obj2).f29036a);
    }

    public int hashCode() {
        return this.f29036a.hashCode();
    }

    public String toString() {
        return "Endpoint(url=" + this.f29036a + ")";
    }
}
