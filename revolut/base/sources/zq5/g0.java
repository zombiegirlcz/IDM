package zq5;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g0 implements h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f324382a;

    public g0(String address) {
        Intrinsics.checkNotNullParameter(address, "address");
        this.f324382a = address;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g0) && Intrinsics.f(this.f324382a, ((g0) obj2).f324382a);
    }

    public final int hashCode() {
        return this.f324382a.hashCode();
    }
}
