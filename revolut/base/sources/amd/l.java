package amd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class l implements l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f6337a;

    public l(dj0.d balance) {
        Intrinsics.checkNotNullParameter(balance, "balance");
        this.f6337a = balance;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f6337a, ((l) obj2).f6337a);
    }

    public final int hashCode() {
        return this.f6337a.hashCode();
    }
}
