package nqf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class j implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final krf.c f218443a;

    public j(krf.c transferReason) {
        Intrinsics.checkNotNullParameter(transferReason, "transferReason");
        this.f218443a = transferReason;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f218443a, ((j) obj2).f218443a);
    }

    public final int hashCode() {
        return this.f218443a.hashCode();
    }
}
