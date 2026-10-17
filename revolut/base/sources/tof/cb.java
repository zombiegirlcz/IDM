package tof;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class cb extends i7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f272673a;

    public cb(String pocketId) {
        Intrinsics.checkNotNullParameter(pocketId, "pocketId");
        this.f272673a = pocketId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof cb) && Intrinsics.f(this.f272673a, ((cb) obj2).f272673a);
    }

    public final String getPocketId() {
        return this.f272673a;
    }

    public final int hashCode() {
        return this.f272673a.hashCode();
    }
}
