package com.fourthline.orca.internal;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class jb implements rb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f29848a;

    public jb(String newInput) {
        Intrinsics.checkNotNullParameter(newInput, "newInput");
        this.f29848a = newInput;
    }

    public final String a() {
        return this.f29848a;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof jb) && Intrinsics.f(this.f29848a, ((jb) obj2).f29848a);
    }

    public int hashCode() {
        return this.f29848a.hashCode();
    }

    public String toString() {
        return "OnChanged(newInput=" + this.f29848a + ")";
    }
}
