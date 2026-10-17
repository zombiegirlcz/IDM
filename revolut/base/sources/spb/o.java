package spb;

import kotlin.jvm.internal.Intrinsics;
import pcd.s;

/* JADX INFO: loaded from: classes6.dex */
public final class o implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f264942a;

    public o(s account) {
        Intrinsics.checkNotNullParameter(account, "account");
        this.f264942a = account;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o) && Intrinsics.f(this.f264942a, ((o) obj2).f264942a);
    }

    public final int hashCode() {
        return this.f264942a.hashCode();
    }
}
