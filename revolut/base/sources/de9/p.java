package de9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f113332a;

    public final boolean equals(Object obj2) {
        if (obj2 instanceof p) {
            return Intrinsics.f(this.f113332a, ((p) obj2).f113332a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f113332a.hashCode();
    }

    public final String toString() {
        return "PinProgress(dots=" + this.f113332a + ")";
    }
}
