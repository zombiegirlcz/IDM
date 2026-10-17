package iig;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class j extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f161617a;

    public j(String accountId) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        this.f161617a = accountId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f161617a, ((j) obj2).f161617a);
    }

    public final int hashCode() {
        return this.f161617a.hashCode();
    }
}
