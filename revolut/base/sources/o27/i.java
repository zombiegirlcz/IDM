package o27;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f221512a;

    public i(dj0.d exchangedAmountToRefund) {
        Intrinsics.checkNotNullParameter(exchangedAmountToRefund, "exchangedAmountToRefund");
        this.f221512a = exchangedAmountToRefund;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f221512a, ((i) obj2).f221512a);
    }

    public final int hashCode() {
        return this.f221512a.hashCode();
    }
}
