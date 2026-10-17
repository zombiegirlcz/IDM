package fg3;

import com.revolut.feature.check_topup.api.data.SDKScanResult;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class a implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f134884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SDKScanResult f134885b;

    public a(dj0.d amount, SDKScanResult scanResult) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(scanResult, "scanResult");
        this.f134884a = amount;
        this.f134885b = scanResult;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f134884a, aVar.f134884a) && Intrinsics.f(this.f134885b, aVar.f134885b);
    }

    public final int hashCode() {
        return this.f134885b.hashCode() + (this.f134884a.hashCode() * 31);
    }
}
