package uyd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f284234a;

    public p(String requestId) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        this.f284234a = requestId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof p) && Intrinsics.f(this.f284234a, ((p) obj2).f284234a);
    }

    public final int hashCode() {
        return this.f284234a.hashCode();
    }
}
