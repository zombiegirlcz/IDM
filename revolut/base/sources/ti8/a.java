package ti8;

import com.revolut.feature.junior_payment_links.api.model.PaymentLinkCustomAmountBundle;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PaymentLinkCustomAmountBundle f271444a;

    public a(PaymentLinkCustomAmountBundle initialAmountBundle) {
        Intrinsics.checkNotNullParameter(initialAmountBundle, "initialAmountBundle");
        this.f271444a = initialAmountBundle;
    }

    public final PaymentLinkCustomAmountBundle b() {
        return this.f271444a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f271444a, ((a) obj2).f271444a);
    }

    public final int hashCode() {
        return this.f271444a.hashCode();
    }
}
