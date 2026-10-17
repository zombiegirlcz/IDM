package w16;

import aii.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f293797a;

    public b(String accountId) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        this.f293797a = accountId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f293797a, ((b) obj2).f293797a);
    }

    public final int hashCode() {
        return this.f293797a.hashCode();
    }
}
