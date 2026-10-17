package iig;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class b extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f161613a;

    public b(String accountId) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        this.f161613a = accountId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f161613a, ((b) obj2).f161613a);
    }

    public final int hashCode() {
        return this.f161613a.hashCode();
    }
}
