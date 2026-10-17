package ri8;

import com.revolut.feature.junior_payment_links.api.model.PaymentLinkCustomAmountBundle;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PaymentLinkCustomAmountBundle f254567a;

    public b(PaymentLinkCustomAmountBundle initialCustomAmountBundle) {
        Intrinsics.checkNotNullParameter(initialCustomAmountBundle, "initialCustomAmountBundle");
        this.f254567a = initialCustomAmountBundle;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f254567a, ((b) obj2).f254567a);
    }

    public final int hashCode() {
        return this.f254567a.hashCode();
    }
}
