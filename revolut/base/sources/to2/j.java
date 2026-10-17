package to2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class j implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f272503a;

    public j(String requestId) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        this.f272503a = requestId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f272503a, ((j) obj2).f272503a);
    }

    public final int hashCode() {
        return this.f272503a.hashCode();
    }
}
