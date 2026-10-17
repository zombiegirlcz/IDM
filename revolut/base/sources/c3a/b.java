package c3a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20921a;

    public b(String requestId) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        this.f20921a = requestId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f20921a, ((b) obj2).f20921a);
    }

    public final int hashCode() {
        return this.f20921a.hashCode();
    }
}
