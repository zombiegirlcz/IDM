package vrf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class e implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final krf.c f291587a;

    public e(krf.c transferReason) {
        Intrinsics.checkNotNullParameter(transferReason, "transferReason");
        this.f291587a = transferReason;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f291587a, ((e) obj2).f291587a);
    }

    public final int hashCode() {
        return this.f291587a.hashCode();
    }
}
