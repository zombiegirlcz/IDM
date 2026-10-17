package tt4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class k implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f274221a;

    public k(dj0.d approvedLimit) {
        Intrinsics.checkNotNullParameter(approvedLimit, "approvedLimit");
        this.f274221a = approvedLimit;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f274221a, ((k) obj2).f274221a);
    }

    public final int hashCode() {
        return this.f274221a.hashCode();
    }
}
