package qrb;

import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f248681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Amount f248682b;

    public a(dj0.d availableBalance, Amount availableQuantity) {
        Intrinsics.checkNotNullParameter(availableBalance, "availableBalance");
        Intrinsics.checkNotNullParameter(availableQuantity, "availableQuantity");
        this.f248681a = availableBalance;
        this.f248682b = availableQuantity;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f248681a, aVar.f248681a) && Intrinsics.f(this.f248682b, aVar.f248682b);
    }

    public final int hashCode() {
        return this.f248682b.hashCode() + (this.f248681a.hashCode() * 31);
    }
}
