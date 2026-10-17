package zq5;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f324383a;

    public h(String address) {
        Intrinsics.checkNotNullParameter(address, "address");
        this.f324383a = address;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f324383a, ((h) obj2).f324383a);
    }

    public final int hashCode() {
        return this.f324383a.hashCode();
    }
}
