package mqd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class j implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f207982a;

    public j(String accountId) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        this.f207982a = accountId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f207982a, ((j) obj2).f207982a);
    }

    public final int hashCode() {
        return this.f207982a.hashCode();
    }
}
