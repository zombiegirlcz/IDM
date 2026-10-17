package yg1;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\u0010"}, d2 = {"Lyg1/c;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "d", "paymentAppProviderId", "b", "c", "paymentAppInstanceId", "e", "tokenUniqueReference", "accountPanSuffix", "accountExpiry", "feature_add_card_to_google_pay_shared_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("paymentAppProviderId")
    @NotNull
    private final String paymentAppProviderId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("paymentAppInstanceId")
    @NotNull
    private final String paymentAppInstanceId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("tokenUniqueReference")
    @NotNull
    private final String tokenUniqueReference;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("accountPanSuffix")
    @NotNull
    private final String accountPanSuffix;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("accountExpiry")
    @NotNull
    private final String accountExpiry;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAccountExpiry() {
        return this.accountExpiry;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getAccountPanSuffix() {
        return this.accountPanSuffix;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getPaymentAppInstanceId() {
        return this.paymentAppInstanceId;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getPaymentAppProviderId() {
        return this.paymentAppProviderId;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getTokenUniqueReference() {
        return this.tokenUniqueReference;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.paymentAppProviderId, cVar.paymentAppProviderId) && Intrinsics.f(this.paymentAppInstanceId, cVar.paymentAppInstanceId) && Intrinsics.f(this.tokenUniqueReference, cVar.tokenUniqueReference) && Intrinsics.f(this.accountPanSuffix, cVar.accountPanSuffix) && Intrinsics.f(this.accountExpiry, cVar.accountExpiry);
    }

    public final int hashCode() {
        return this.accountExpiry.hashCode() + p.a.c(p.a.c(p.a.c(this.paymentAppProviderId.hashCode() * 31, 31, this.paymentAppInstanceId), 31, this.tokenUniqueReference), 31, this.accountPanSuffix);
    }
}
