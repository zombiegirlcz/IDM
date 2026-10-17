package tof;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class fa extends i7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f272756a;

    public fa(String brandId) {
        Intrinsics.checkNotNullParameter(brandId, "brandId");
        this.f272756a = brandId;
    }

    public final String a() {
        return this.f272756a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof fa) && Intrinsics.f(this.f272756a, ((fa) obj2).f272756a);
    }

    public final int hashCode() {
        return this.f272756a.hashCode();
    }
}
