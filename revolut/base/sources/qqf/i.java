package qqf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class i implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final krf.e f248540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mrf.a f248541b;

    public i(krf.e transferReason, mrf.a goodsDetails) {
        Intrinsics.checkNotNullParameter(transferReason, "transferReason");
        Intrinsics.checkNotNullParameter(goodsDetails, "goodsDetails");
        this.f248540a = transferReason;
        this.f248541b = goodsDetails;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f248540a, iVar.f248540a) && Intrinsics.f(this.f248541b, iVar.f248541b);
    }

    public final int hashCode() {
        return this.f248541b.hashCode() + (this.f248540a.hashCode() * 31);
    }
}
