package iqf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class c implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final krf.c f167828a;

    public c(krf.c transferReason) {
        Intrinsics.checkNotNullParameter(transferReason, "transferReason");
        this.f167828a = transferReason;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f167828a, ((c) obj2).f167828a);
    }

    public final int hashCode() {
        return this.f167828a.hashCode();
    }
}
