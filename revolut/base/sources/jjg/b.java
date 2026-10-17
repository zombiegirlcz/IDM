package jjg;

import com.revolut.feature.trusted_merchants.api.model.TrustedMerchant;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class b implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TrustedMerchant.Approved f174942a;

    public b(TrustedMerchant.Approved merchant) {
        Intrinsics.checkNotNullParameter(merchant, "merchant");
        this.f174942a = merchant;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f174942a, ((b) obj2).f174942a);
    }

    public final int hashCode() {
        return this.f174942a.hashCode();
    }
}
