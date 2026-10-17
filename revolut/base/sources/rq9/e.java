package rq9;

import com.revolut.feature.payments.groups.api.models.PaymentGroup;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class e implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PaymentGroup f256510a;

    public e(PaymentGroup paymentGroup) {
        Intrinsics.checkNotNullParameter(paymentGroup, "paymentGroup");
        this.f256510a = paymentGroup;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f256510a, ((e) obj2).f256510a);
    }

    public final int hashCode() {
        return this.f256510a.hashCode();
    }
}
