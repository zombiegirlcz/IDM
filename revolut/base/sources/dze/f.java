package dze;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class f extends com.revolut.feature.topup_screen.impl.flows.topup.screen.three_ds.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f121331a;

    public f(String paymentId) {
        Intrinsics.checkNotNullParameter(paymentId, "paymentId");
        this.f121331a = paymentId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f121331a, ((f) obj2).f121331a);
    }

    public final int hashCode() {
        return this.f121331a.hashCode();
    }
}
