package xyh;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class d implements aii.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wd6.h f309729a;

    public d(wd6.h orderType) {
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        this.f309729a = orderType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && this.f309729a == ((d) obj2).f309729a;
    }

    public final int hashCode() {
        return this.f309729a.hashCode();
    }
}
