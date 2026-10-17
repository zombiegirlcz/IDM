package tof;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class u4 implements v4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f273101a;

    public u4(dj0.d includedAmount) {
        Intrinsics.checkNotNullParameter(includedAmount, "includedAmount");
        this.f273101a = includedAmount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof u4) && Intrinsics.f(this.f273101a, ((u4) obj2).f273101a);
    }

    public final int hashCode() {
        return this.f273101a.hashCode();
    }
}
