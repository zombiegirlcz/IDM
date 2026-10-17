package me4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class i implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f204605a;

    public i(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f204605a = text;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f204605a, ((i) obj2).f204605a);
    }

    public final int hashCode() {
        return this.f204605a.hashCode();
    }
}
