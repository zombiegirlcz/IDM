package tof;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class qa extends i7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f273014a;

    public qa(String paymentCounterpartyId) {
        Intrinsics.checkNotNullParameter(paymentCounterpartyId, "paymentCounterpartyId");
        this.f273014a = paymentCounterpartyId;
    }

    public final String a() {
        return this.f273014a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof qa) && Intrinsics.f(this.f273014a, ((qa) obj2).f273014a);
    }

    public final int hashCode() {
        return this.f273014a.hashCode();
    }
}
