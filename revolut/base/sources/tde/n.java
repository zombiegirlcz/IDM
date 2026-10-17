package tde;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class n implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kq2.l f269993a;

    public n(kq2.l bankTransferType) {
        Intrinsics.checkNotNullParameter(bankTransferType, "bankTransferType");
        this.f269993a = bankTransferType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n) && this.f269993a == ((n) obj2).f269993a;
    }

    public final int hashCode() {
        return this.f269993a.hashCode();
    }
}
