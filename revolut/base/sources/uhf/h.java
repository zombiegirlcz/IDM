package uhf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class h extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f280226a;

    public h(String groupId) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        this.f280226a = groupId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f280226a, ((h) obj2).f280226a);
    }

    public final int hashCode() {
        return this.f280226a.hashCode();
    }
}
