package tof;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class x8 extends i7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f273165a;

    public x8(String address) {
        Intrinsics.checkNotNullParameter(address, "address");
        this.f273165a = address;
    }

    public final String a() {
        return this.f273165a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof x8) && Intrinsics.f(this.f273165a, ((x8) obj2).f273165a);
    }

    public final int hashCode() {
        return this.f273165a.hashCode();
    }
}
