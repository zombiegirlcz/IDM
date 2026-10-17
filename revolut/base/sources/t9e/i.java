package t9e;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class i extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qua.p f268988a;

    public i(qua.p recurringPayment) {
        Intrinsics.checkNotNullParameter(recurringPayment, "recurringPayment");
        this.f268988a = recurringPayment;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f268988a, ((i) obj2).f268988a);
    }

    public final int hashCode() {
        return this.f268988a.hashCode();
    }
}
