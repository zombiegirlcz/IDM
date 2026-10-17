package zh9;

import com.revolut.feature.pay_later.api.models.PayLaterPaymentMethod;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PayLaterPaymentMethod f322359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w f322360b;

    public w0(PayLaterPaymentMethod paymentMethod, w instalmentType) {
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        Intrinsics.checkNotNullParameter(instalmentType, "instalmentType");
        this.f322359a = paymentMethod;
        this.f322360b = instalmentType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj2;
        return this.f322359a == w0Var.f322359a && this.f322360b == w0Var.f322360b;
    }

    public final int hashCode() {
        return this.f322360b.hashCode() + (this.f322359a.hashCode() * 31);
    }
}
