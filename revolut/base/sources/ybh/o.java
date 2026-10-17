package ybh;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f312337a;

    public o(dj0.d missingAmount) {
        Intrinsics.checkNotNullParameter(missingAmount, "missingAmount");
        this.f312337a = missingAmount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o) && Intrinsics.f(this.f312337a, ((o) obj2).f312337a);
    }

    public final int hashCode() {
        return this.f312337a.hashCode();
    }
}
