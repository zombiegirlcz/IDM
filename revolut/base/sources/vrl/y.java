package vrl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class y extends a0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bfl.g f291689b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(bfl.g tradeSide) {
        super(false);
        Intrinsics.checkNotNullParameter(tradeSide, "tradeSide");
        this.f291689b = tradeSide;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof y) && this.f291689b == ((y) obj2).f291689b;
    }

    public final int hashCode() {
        return this.f291689b.hashCode();
    }
}
