package iu2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f168458a;

    public b(String token) {
        Intrinsics.checkNotNullParameter(token, "token");
        this.f168458a = token;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f168458a, ((b) obj2).f168458a);
    }

    public final int hashCode() {
        return this.f168458a.hashCode();
    }
}
