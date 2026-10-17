package rlh;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class p implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f255068a;

    public p(String securityRef) {
        Intrinsics.checkNotNullParameter(securityRef, "securityRef");
        this.f255068a = securityRef;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof p) && Intrinsics.f(this.f255068a, ((p) obj2).f255068a);
    }

    public final int hashCode() {
        return this.f255068a.hashCode();
    }
}
