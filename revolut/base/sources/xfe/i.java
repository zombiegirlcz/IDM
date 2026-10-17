package xfe;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class i extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f305253a;

    public i(dj0.d remainingBalance) {
        Intrinsics.checkNotNullParameter(remainingBalance, "remainingBalance");
        this.f305253a = remainingBalance;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f305253a, ((i) obj2).f305253a);
    }

    public final int hashCode() {
        return this.f305253a.hashCode();
    }
}
