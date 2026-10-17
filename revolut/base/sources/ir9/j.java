package ir9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class j implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f168036a;

    public j(String groupId) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        this.f168036a = groupId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f168036a, ((j) obj2).f168036a);
    }

    public final int hashCode() {
        return this.f168036a.hashCode();
    }
}
