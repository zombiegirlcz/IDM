package zq5;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f324384a;

    public i(String address) {
        Intrinsics.checkNotNullParameter(address, "address");
        this.f324384a = address;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f324384a, ((i) obj2).f324384a);
    }

    public final int hashCode() {
        return this.f324384a.hashCode();
    }
}
