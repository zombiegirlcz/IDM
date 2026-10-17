package cfl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class h implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23743a;

    public h(String accountHolderId) {
        Intrinsics.checkNotNullParameter(accountHolderId, "accountHolderId");
        this.f23743a = accountHolderId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f23743a, ((h) obj2).f23743a);
    }

    public final int hashCode() {
        return this.f23743a.hashCode();
    }
}
