package rlh;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class r implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f255071a;

    public r(String securityRef) {
        Intrinsics.checkNotNullParameter(securityRef, "securityRef");
        this.f255071a = securityRef;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof r) && Intrinsics.f(this.f255071a, ((r) obj2).f255071a);
    }

    public final int hashCode() {
        return this.f255071a.hashCode();
    }
}
