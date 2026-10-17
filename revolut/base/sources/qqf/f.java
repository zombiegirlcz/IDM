package qqf;

import com.revolut.feature.transfer.core.api.reason.ReasonTransferDetails;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class f implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReasonTransferDetails f248535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final krf.f f248536b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final krf.c f248537c;

    public f(ReasonTransferDetails transferDetails, krf.f reasonConfig, krf.c cVar) {
        Intrinsics.checkNotNullParameter(transferDetails, "transferDetails");
        Intrinsics.checkNotNullParameter(reasonConfig, "reasonConfig");
        this.f248535a = transferDetails;
        this.f248536b = reasonConfig;
        this.f248537c = cVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f248535a, fVar.f248535a) && Intrinsics.f(this.f248536b, fVar.f248536b) && Intrinsics.f(this.f248537c, fVar.f248537c);
    }

    public final int hashCode() {
        int iHashCode = (this.f248536b.hashCode() + (this.f248535a.hashCode() * 31)) * 31;
        krf.c cVar = this.f248537c;
        return iHashCode + (cVar == null ? 0 : cVar.hashCode());
    }
}
