package e08;

import kotlin.jvm.internal.Intrinsics;
import zw7.w;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements mm.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f121461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w f121462b;

    public d(String quoteId) {
        w paymentFrequency = w.MONTHLY;
        Intrinsics.checkNotNullParameter(quoteId, "quoteId");
        Intrinsics.checkNotNullParameter(paymentFrequency, "paymentFrequency");
        this.f121461a = quoteId;
        this.f121462b = paymentFrequency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f121461a, dVar.f121461a) && this.f121462b == dVar.f121462b;
    }

    public final int hashCode() {
        return this.f121462b.hashCode() + (this.f121461a.hashCode() * 31);
    }
}
