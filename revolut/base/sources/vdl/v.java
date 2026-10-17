package vdl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class v implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f288051a;

    public v(String securityRef) {
        Intrinsics.checkNotNullParameter(securityRef, "securityRef");
        this.f288051a = securityRef;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof v) && Intrinsics.f(this.f288051a, ((v) obj2).f288051a);
    }

    public final int hashCode() {
        return this.f288051a.hashCode();
    }
}
