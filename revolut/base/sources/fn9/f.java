package fn9;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0005\u0010\fR\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\n\u0010\u0004¨\u0006\u000f"}, d2 = {"Lfn9/f;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "orderToken", "", "b", "Ljava/util/List;", "()Ljava/util/List;", "availablePaymentMethods", "merchantPublicKey", "feature_pay_in_store_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("orderToken")
    @NotNull
    private final String orderToken;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("availablePaymentMethods")
    @NotNull
    private final List<String> availablePaymentMethods;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("merchantPublicKey")
    @NotNull
    private final String merchantPublicKey;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getAvailablePaymentMethods() {
        return this.availablePaymentMethods;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getMerchantPublicKey() {
        return this.merchantPublicKey;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getOrderToken() {
        return this.orderToken;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.orderToken, fVar.orderToken) && Intrinsics.f(this.availablePaymentMethods, fVar.availablePaymentMethods) && Intrinsics.f(this.merchantPublicKey, fVar.merchantPublicKey);
    }

    public final int hashCode() {
        return this.merchantPublicKey.hashCode() + p.a.d(this.orderToken.hashCode() * 31, 31, this.availablePaymentMethods);
    }
}
