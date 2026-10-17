package tof;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class r9 extends i7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f273030a;

    public r9(String groupId) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        this.f273030a = groupId;
    }

    public final String a() {
        return this.f273030a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof r9) && Intrinsics.f(this.f273030a, ((r9) obj2).f273030a);
    }

    public final int hashCode() {
        return this.f273030a.hashCode();
    }
}
