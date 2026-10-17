package wdc;

import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PayWithAnyFundingOptions;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PayWithAnyFundingOptions f296542a;

    public a(PayWithAnyFundingOptions fundingOptions) {
        Intrinsics.checkNotNullParameter(fundingOptions, "fundingOptions");
        this.f296542a = fundingOptions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f296542a, ((a) obj2).f296542a);
    }

    public final int hashCode() {
        return this.f296542a.hashCode();
    }
}
