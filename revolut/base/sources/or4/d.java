package or4;

import kotlin.jvm.internal.Intrinsics;
import ll4.r;

/* JADX INFO: loaded from: classes22.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ux4.b f228055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f228056b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xw4.a f228057c;

    public d(ux4.b documents, r rates, xw4.a paymentState) {
        Intrinsics.checkNotNullParameter(documents, "documents");
        Intrinsics.checkNotNullParameter(rates, "rates");
        Intrinsics.checkNotNullParameter(paymentState, "paymentState");
        this.f228055a = documents;
        this.f228056b = rates;
        this.f228057c = paymentState;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f228055a, dVar.f228055a) && Intrinsics.f(this.f228056b, dVar.f228056b) && this.f228057c == dVar.f228057c;
    }

    public final int hashCode() {
        return this.f228057c.hashCode() + ((this.f228056b.hashCode() + (this.f228055a.f283864a.hashCode() * 31)) * 31);
    }
}
