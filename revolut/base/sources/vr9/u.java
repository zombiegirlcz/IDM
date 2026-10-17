package vr9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class u implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f291541a;

    public u(String groupId) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        this.f291541a = groupId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof u) && Intrinsics.f(this.f291541a, ((u) obj2).f291541a);
    }

    public final int hashCode() {
        return this.f291541a.hashCode();
    }
}
