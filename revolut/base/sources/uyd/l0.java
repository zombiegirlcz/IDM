package uyd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f284220a;

    public l0(String groupId) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        this.f284220a = groupId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l0) && Intrinsics.f(this.f284220a, ((l0) obj2).f284220a);
    }

    public final int hashCode() {
        return this.f284220a.hashCode();
    }
}
