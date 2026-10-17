package ljg;

import com.revolut.feature.trusted_merchants.api.model.TrustedMerchant;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class b extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TrustedMerchant.ToReview f195664a;

    public b(TrustedMerchant.ToReview merchant) {
        Intrinsics.checkNotNullParameter(merchant, "merchant");
        this.f195664a = merchant;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f195664a, ((b) obj2).f195664a);
    }

    public final int hashCode() {
        return this.f195664a.hashCode();
    }
}
