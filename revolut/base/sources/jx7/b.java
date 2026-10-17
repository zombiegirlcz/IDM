package jx7;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004¨\u0006\u000f"}, d2 = {"Ljx7/b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getRequestId", "requestId", "b", "getQuoteOptionId", "quoteOptionId", "c", "getPaymentFrequency", "paymentFrequency", "feature_insurance_pet_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("requestId")
    @NotNull
    private final String requestId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("quoteOptionId")
    @NotNull
    private final String quoteOptionId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("paymentFrequency")
    @NotNull
    private final String paymentFrequency;

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.requestId, bVar.requestId) && Intrinsics.f(this.quoteOptionId, bVar.quoteOptionId) && Intrinsics.f(this.paymentFrequency, bVar.paymentFrequency);
    }

    public final int hashCode() {
        return this.paymentFrequency.hashCode() + p.a.c(this.requestId.hashCode() * 31, 31, this.quoteOptionId);
    }
}
