package fg3;

import com.revolut.feature.check_topup.api.data.SDKScanResult;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f134886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SDKScanResult f134887b;

    public b(dj0.d amount, SDKScanResult result) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(result, "result");
        this.f134886a = amount;
        this.f134887b = result;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f134886a, bVar.f134886a) && Intrinsics.f(this.f134887b, bVar.f134887b);
    }

    public final int hashCode() {
        return this.f134887b.hashCode() + (this.f134886a.hashCode() * 31);
    }
}
