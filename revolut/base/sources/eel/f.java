package eel;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class f implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ej0.b f125230a;

    public final boolean equals(Object obj2) {
        if (obj2 instanceof f) {
            return Intrinsics.f(this.f125230a, ((f) obj2).f125230a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f125230a.hashCode();
    }

    public final String toString() {
        return "Money(value=" + this.f125230a + ")";
    }
}
