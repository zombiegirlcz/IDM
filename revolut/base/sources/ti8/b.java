package ti8;

import aii.r;
import com.revolut.feature.junior_payment_links.api.model.PaymentLinkCustomAmountBundle;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PaymentLinkCustomAmountBundle f271445a;

    public b(PaymentLinkCustomAmountBundle customAmountBundle) {
        Intrinsics.checkNotNullParameter(customAmountBundle, "customAmountBundle");
        this.f271445a = customAmountBundle;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f271445a, ((b) obj2).f271445a);
    }

    public final int hashCode() {
        return this.f271445a.hashCode();
    }
}
