package tof;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class wa extends i7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final io3.i f273149a;

    public wa(io3.i originType) {
        Intrinsics.checkNotNullParameter(originType, "originType");
        this.f273149a = originType;
    }

    public final io3.i a() {
        return this.f273149a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof wa) && this.f273149a == ((wa) obj2).f273149a;
    }

    public final int hashCode() {
        return this.f273149a.hashCode();
    }
}
