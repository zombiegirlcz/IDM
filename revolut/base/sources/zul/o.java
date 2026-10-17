package zul;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class o implements aii.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f325549a;

    public o(dj0.d amount) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f325549a = amount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o) && Intrinsics.f(this.f325549a, ((o) obj2).f325549a);
    }

    public final int hashCode() {
        return this.f325549a.hashCode();
    }
}
