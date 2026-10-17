package vkh;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class d implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f289941a;

    public d(String accountId) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        this.f289941a = accountId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f289941a, ((d) obj2).f289941a);
    }

    public final int hashCode() {
        return this.f289941a.hashCode();
    }
}
