package vr9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class t implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f291540a;

    public t(String groupId) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        this.f291540a = groupId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof t) && Intrinsics.f(this.f291540a, ((t) obj2).f291540a);
    }

    public final int hashCode() {
        return this.f291540a.hashCode();
    }
}
