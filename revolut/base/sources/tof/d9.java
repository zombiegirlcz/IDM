package tof;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class d9 extends i7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f272697a;

    public d9(String walletAddress) {
        Intrinsics.checkNotNullParameter(walletAddress, "walletAddress");
        this.f272697a = walletAddress;
    }

    public final String a() {
        return this.f272697a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d9) && Intrinsics.f(this.f272697a, ((d9) obj2).f272697a);
    }

    public final int hashCode() {
        return this.f272697a.hashCode();
    }
}
