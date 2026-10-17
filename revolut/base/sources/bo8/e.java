package bo8;

import com.revolut.feature.junior_payment_links.api.model.PaymentLinkCustomAmountBundle;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PaymentLinkCustomAmountBundle f17312a;

    public e(PaymentLinkCustomAmountBundle customAmountBundle) {
        Intrinsics.checkNotNullParameter(customAmountBundle, "customAmountBundle");
        this.f17312a = customAmountBundle;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f17312a, ((e) obj2).f17312a);
    }

    public final int hashCode() {
        return this.f17312a.hashCode();
    }
}
