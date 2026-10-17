package akl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class v1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6104a;

    public v1(String clientId) {
        Intrinsics.checkNotNullParameter(clientId, "clientId");
        this.f6104a = clientId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof v1) && Intrinsics.f(this.f6104a, ((v1) obj2).f6104a);
    }

    public final int hashCode() {
        return this.f6104a.hashCode();
    }
}
