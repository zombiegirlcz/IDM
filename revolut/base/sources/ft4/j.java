package ft4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class j implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f137915a;

    public j(dj0.d minTransactionAmount) {
        Intrinsics.checkNotNullParameter(minTransactionAmount, "minTransactionAmount");
        this.f137915a = minTransactionAmount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f137915a, ((j) obj2).f137915a);
    }

    public final int hashCode() {
        return this.f137915a.hashCode();
    }
}
