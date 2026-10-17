package njg;

import com.revolut.feature.trusted_merchants.api.model.TrustedMerchant;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class d implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TrustedMerchant.Approved f216510a;

    public d(TrustedMerchant.Approved merchant) {
        Intrinsics.checkNotNullParameter(merchant, "merchant");
        this.f216510a = merchant;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f216510a, ((d) obj2).f216510a);
    }

    public final int hashCode() {
        return this.f216510a.hashCode();
    }
}
