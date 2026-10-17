package gqf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class e implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final krf.c f145716a;

    public e(krf.c transferReason) {
        Intrinsics.checkNotNullParameter(transferReason, "transferReason");
        this.f145716a = transferReason;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f145716a, ((e) obj2).f145716a);
    }

    public final int hashCode() {
        return this.f145716a.hashCode();
    }
}
