package jcj;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class h implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f172828a;

    public h(String addressId) {
        Intrinsics.checkNotNullParameter(addressId, "addressId");
        this.f172828a = addressId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f172828a, ((h) obj2).f172828a);
    }

    public final int hashCode() {
        return this.f172828a.hashCode();
    }
}
