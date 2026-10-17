package yj1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f314377a;

    public c(String securityRef) {
        Intrinsics.checkNotNullParameter(securityRef, "securityRef");
        this.f314377a = securityRef;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f314377a, ((c) obj2).f314377a);
    }

    public final int hashCode() {
        return this.f314377a.hashCode();
    }
}
