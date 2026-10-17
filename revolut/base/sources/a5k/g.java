package a5k;

import com.revolut.feature.transfer.core.models.FundingSource;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class g implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kq2.b f1454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f1455b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FundingSource f1456c;

    public g(kq2.b bankTransferDetails, boolean z, FundingSource fundingSource) {
        Intrinsics.checkNotNullParameter(bankTransferDetails, "bankTransferDetails");
        Intrinsics.checkNotNullParameter(fundingSource, "fundingSource");
        this.f1454a = bankTransferDetails;
        this.f1455b = z;
        this.f1456c = fundingSource;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f1454a, gVar.f1454a) && this.f1455b == gVar.f1455b && Intrinsics.f(this.f1456c, gVar.f1456c);
    }

    public final int hashCode() {
        return this.f1456c.hashCode() + j6.a.c(this.f1454a.hashCode() * 31, 31, this.f1455b);
    }
}
