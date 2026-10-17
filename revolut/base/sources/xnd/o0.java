package xnd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f307431a;

    public o0(String accountId) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        this.f307431a = accountId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o0) && Intrinsics.f(this.f307431a, ((o0) obj2).f307431a);
    }

    public final int hashCode() {
        return this.f307431a.hashCode();
    }
}
