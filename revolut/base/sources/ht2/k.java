package ht2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class k extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f155229a;

    public k(String businessId) {
        Intrinsics.checkNotNullParameter(businessId, "businessId");
        this.f155229a = businessId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f155229a, ((k) obj2).f155229a);
    }

    public final int hashCode() {
        return this.f155229a.hashCode();
    }
}
