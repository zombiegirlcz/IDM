package whh;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class q implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f297672a;

    public q(String str) {
        this.f297672a = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof q) && Intrinsics.f(this.f297672a, ((q) obj2).f297672a);
    }

    @Override // whh.r
    public final String getAccountId() {
        return this.f297672a;
    }

    public final int hashCode() {
        String str = this.f297672a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
