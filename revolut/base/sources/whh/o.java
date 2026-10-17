package whh;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class o implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f297669a;

    public o(String str) {
        this.f297669a = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o) && Intrinsics.f(this.f297669a, ((o) obj2).f297669a);
    }

    @Override // whh.r
    public final String getAccountId() {
        return this.f297669a;
    }

    public final int hashCode() {
        String str = this.f297669a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
