package a5k;

import com.revolut.feature.transfer.core.models.FundingSource;
import kotlin.jvm.internal.Intrinsics;
import tof.a3;

/* JADX INFO: loaded from: classes11.dex */
public final class h implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kq2.b f1457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a3 f1458b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FundingSource f1459c;

    public h(kq2.b bankTransferDetails, a3 transaction, FundingSource fundingSource) {
        Intrinsics.checkNotNullParameter(bankTransferDetails, "bankTransferDetails");
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(fundingSource, "fundingSource");
        this.f1457a = bankTransferDetails;
        this.f1458b = transaction;
        this.f1459c = fundingSource;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f1457a, hVar.f1457a) && Intrinsics.f(this.f1458b, hVar.f1458b) && Intrinsics.f(this.f1459c, hVar.f1459c);
    }

    public final int hashCode() {
        return this.f1459c.hashCode() + wp5.y.f(this.f1458b, this.f1457a.hashCode() * 31, 31);
    }
}
