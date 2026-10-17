package rob;

import aii.r;
import kotlin.jvm.internal.Intrinsics;
import pcd.s;

/* JADX INFO: loaded from: classes6.dex */
public final class h implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f255954a;

    public h(s account) {
        Intrinsics.checkNotNullParameter(account, "account");
        this.f255954a = account;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f255954a, ((h) obj2).f255954a);
    }

    public final int hashCode() {
        return this.f255954a.hashCode();
    }
}
