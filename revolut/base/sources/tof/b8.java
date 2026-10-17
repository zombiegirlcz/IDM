package tof;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class b8 extends i7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uof.c f272651a;

    public b8(uof.c payoutType) {
        Intrinsics.checkNotNullParameter(payoutType, "payoutType");
        this.f272651a = payoutType;
    }

    public final uof.c a() {
        return this.f272651a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b8) && this.f272651a == ((b8) obj2).f272651a;
    }

    public final int hashCode() {
        return this.f272651a.hashCode();
    }
}
