package com.fourthline.orca.internal;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class hs0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f29397a;

    public hs0(String filePath) {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        this.f29397a = filePath;
    }

    public final String a() {
        return this.f29397a;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof hs0) && Intrinsics.f(this.f29397a, ((hs0) obj2).f29397a);
    }

    public int hashCode() {
        return this.f29397a.hashCode();
    }

    public String toString() {
        return "Output(filePath=" + this.f29397a + ")";
    }
}
