package u4a;

import com.revolut.feature.freelancer.common.models.ProPaymentLinkEligibility;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProPaymentLinkEligibility f277279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f277280b;

    public a(ProPaymentLinkEligibility isProPaymentLinkAllowed, boolean z) {
        Intrinsics.checkNotNullParameter(isProPaymentLinkAllowed, "isProPaymentLinkAllowed");
        this.f277279a = isProPaymentLinkAllowed;
        this.f277280b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f277279a, aVar.f277279a) && this.f277280b == aVar.f277280b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f277280b) + (this.f277279a.hashCode() * 31);
    }
}
