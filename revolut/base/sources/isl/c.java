package isl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f168307a;

    public c(String securityRef) {
        Intrinsics.checkNotNullParameter(securityRef, "securityRef");
        this.f168307a = securityRef;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f168307a, ((c) obj2).f168307a);
    }

    public final int hashCode() {
        return this.f168307a.hashCode();
    }
}
