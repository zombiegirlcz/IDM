package yq1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class e extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f315969a;

    public e(dj0.d topUpAmount) {
        Intrinsics.checkNotNullParameter(topUpAmount, "topUpAmount");
        this.f315969a = topUpAmount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f315969a, ((e) obj2).f315969a);
    }

    public final int hashCode() {
        return this.f315969a.hashCode();
    }
}
