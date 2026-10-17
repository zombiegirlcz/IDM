package dod;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class i extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f116549b;

    public i(String accountId) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        this.f116549b = accountId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f116549b, ((i) obj2).f116549b);
    }

    public final int hashCode() {
        return this.f116549b.hashCode();
    }
}
