package bsf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class f implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rtf.c f18200a;

    public f(rtf.c transferReason) {
        Intrinsics.checkNotNullParameter(transferReason, "transferReason");
        this.f18200a = transferReason;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f18200a, ((f) obj2).f18200a);
    }

    public final int hashCode() {
        return this.f18200a.hashCode();
    }
}
