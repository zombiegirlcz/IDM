package hs3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class s0 implements t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f154942a;

    public s0(String postRequestPath) {
        Intrinsics.checkNotNullParameter(postRequestPath, "postRequestPath");
        this.f154942a = postRequestPath;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof s0) && Intrinsics.f(this.f154942a, ((s0) obj2).f154942a);
    }

    public final int hashCode() {
        return this.f154942a.hashCode();
    }
}
