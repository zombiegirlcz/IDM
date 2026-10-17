package m4c;

import aii.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f202694a;

    public e(String accountId) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        this.f202694a = accountId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f202694a, ((e) obj2).f202694a);
    }

    public final int hashCode() {
        return this.f202694a.hashCode();
    }
}
