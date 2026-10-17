package q4a;

import com.revolut.feature.payments.who_to_transfer.api.common.WhoToTransferFilter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t4a.l f242104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WhoToTransferFilter f242105b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f242106c;

    public j(t4a.l results, WhoToTransferFilter whoToTransferFilter, String str) {
        Intrinsics.checkNotNullParameter(results, "results");
        this.f242104a = results;
        this.f242105b = whoToTransferFilter;
        this.f242106c = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f242104a, jVar.f242104a) && Intrinsics.f(this.f242105b, jVar.f242105b) && Intrinsics.f(this.f242106c, jVar.f242106c);
    }

    public final int hashCode() {
        int iHashCode = this.f242104a.hashCode() * 31;
        WhoToTransferFilter whoToTransferFilter = this.f242105b;
        int iHashCode2 = (iHashCode + (whoToTransferFilter == null ? 0 : whoToTransferFilter.hashCode())) * 31;
        String str = this.f242106c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }
}
