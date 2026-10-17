package m0a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class c implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f201113a;

    public c(String groupId) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        this.f201113a = groupId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f201113a, ((c) obj2).f201113a);
    }

    public final int hashCode() {
        return this.f201113a.hashCode();
    }
}
