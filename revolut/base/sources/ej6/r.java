package ej6;

import com.revolut.feature.external_accounts.impl.ui.apptoapp.screen.payment.OutboundPaymentExtras;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class r implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OutboundPaymentExtras f126752a;

    public r(OutboundPaymentExtras extras) {
        Intrinsics.checkNotNullParameter(extras, "extras");
        this.f126752a = extras;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof r) && Intrinsics.f(this.f126752a, ((r) obj2).f126752a);
    }

    public final int hashCode() {
        return this.f126752a.hashCode();
    }
}
