package bwb;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19284a;

    public c(String groupId) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        this.f19284a = groupId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f19284a, ((c) obj2).f19284a);
    }

    public final int hashCode() {
        return this.f19284a.hashCode();
    }
}
