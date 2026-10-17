package cz9;

import com.revolut.feature.payments.send_from_clipboard.api.model.SendFromClipboardPaymentOption;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class d implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SendFromClipboardPaymentOption f110166a;

    public d(SendFromClipboardPaymentOption paymentOption) {
        Intrinsics.checkNotNullParameter(paymentOption, "paymentOption");
        this.f110166a = paymentOption;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f110166a, ((d) obj2).f110166a);
    }

    public final int hashCode() {
        return this.f110166a.hashCode();
    }
}
