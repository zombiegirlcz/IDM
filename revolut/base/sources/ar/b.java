package ar;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8476a;

    public b(String token) {
        Intrinsics.checkNotNullParameter(token, "token");
        this.f8476a = token;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f8476a, ((b) obj2).f8476a);
    }

    public final int hashCode() {
        return this.f8476a.hashCode();
    }
}
