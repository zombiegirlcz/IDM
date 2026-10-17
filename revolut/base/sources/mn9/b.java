package mn9;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f207490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f207491b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f207492c;

    public b(String orderToken, List availablePaymentMethods, String merchantPublicKey) {
        Intrinsics.checkNotNullParameter(orderToken, "orderToken");
        Intrinsics.checkNotNullParameter(availablePaymentMethods, "availablePaymentMethods");
        Intrinsics.checkNotNullParameter(merchantPublicKey, "merchantPublicKey");
        this.f207490a = orderToken;
        this.f207491b = availablePaymentMethods;
        this.f207492c = merchantPublicKey;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f207490a, bVar.f207490a) && Intrinsics.f(this.f207491b, bVar.f207491b) && Intrinsics.f(this.f207492c, bVar.f207492c);
    }

    public final int hashCode() {
        return this.f207492c.hashCode() + p.a.d(this.f207490a.hashCode() * 31, 31, this.f207491b);
    }
}
