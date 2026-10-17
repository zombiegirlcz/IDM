package uwa;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f283578a;

    public i(String inviteId) {
        Intrinsics.checkNotNullParameter(inviteId, "inviteId");
        this.f283578a = inviteId;
    }

    public final String a() {
        return this.f283578a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f283578a, ((i) obj2).f283578a);
    }

    public final int hashCode() {
        return this.f283578a.hashCode();
    }
}
