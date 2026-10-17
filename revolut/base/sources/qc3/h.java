package qc3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class h extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f244545a;

    public h(String storeId) {
        Intrinsics.checkNotNullParameter(storeId, "storeId");
        this.f244545a = storeId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f244545a, ((h) obj2).f244545a);
    }

    public final int hashCode() {
        return this.f244545a.hashCode();
    }
}
