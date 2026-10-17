package klf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class i0 implements l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j0 f185510a;

    public i0(j0 linkedTransaction) {
        Intrinsics.checkNotNullParameter(linkedTransaction, "linkedTransaction");
        this.f185510a = linkedTransaction;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i0) && Intrinsics.f(this.f185510a, ((i0) obj2).f185510a);
    }

    public final int hashCode() {
        return this.f185510a.hashCode();
    }
}
