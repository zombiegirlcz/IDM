package fz9;

import com.revolut.feature.payments.send_from_clipboard.api.model.SendFromClipboardPaymentOption;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SendFromClipboardPaymentOption f139136a;

    public b(SendFromClipboardPaymentOption paymentOption) {
        Intrinsics.checkNotNullParameter(paymentOption, "paymentOption");
        this.f139136a = paymentOption;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f139136a, ((b) obj2).f139136a);
    }

    public final int hashCode() {
        return this.f139136a.hashCode();
    }
}
