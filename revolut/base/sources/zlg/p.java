package zlg;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class p extends q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f323263b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(String username) {
        super(username);
        Intrinsics.checkNotNullParameter(username, "username");
        this.f323263b = username;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof p) && Intrinsics.f(this.f323263b, ((p) obj2).f323263b);
    }

    public final int hashCode() {
        return this.f323263b.hashCode();
    }
}
