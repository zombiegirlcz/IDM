package wya;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class j implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f301189a;

    public j(String inviteId) {
        Intrinsics.checkNotNullParameter(inviteId, "inviteId");
        this.f301189a = inviteId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f301189a, ((j) obj2).f301189a);
    }

    public final int hashCode() {
        return this.f301189a.hashCode();
    }
}
