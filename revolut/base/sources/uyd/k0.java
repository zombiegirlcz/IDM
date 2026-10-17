package uyd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f284217a;

    public k0(String groupId) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        this.f284217a = groupId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k0) && Intrinsics.f(this.f284217a, ((k0) obj2).f284217a);
    }

    public final int hashCode() {
        return this.f284217a.hashCode();
    }
}
