package xya;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class o implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f309692a;

    public o(String inviteId) {
        Intrinsics.checkNotNullParameter(inviteId, "inviteId");
        this.f309692a = inviteId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o) && Intrinsics.f(this.f309692a, ((o) obj2).f309692a);
    }

    public final int hashCode() {
        return this.f309692a.hashCode();
    }
}
