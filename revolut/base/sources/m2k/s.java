package m2k;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000f"}, d2 = {"Lm2k/s;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "transactionShareUri", "transactionId", "", "c", "Ljava/lang/Long;", "()Ljava/lang/Long;", "validUntil", "feature_payments_bank_transfer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("transactionShareUri")
    private final String transactionShareUri;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("transactionId")
    private final String transactionId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("validUntil")
    private final Long validUntil;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getTransactionId() {
        return this.transactionId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getTransactionShareUri() {
        return this.transactionShareUri;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Long getValidUntil() {
        return this.validUntil;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.transactionShareUri, sVar.transactionShareUri) && Intrinsics.f(this.transactionId, sVar.transactionId) && Intrinsics.f(this.validUntil, sVar.validUntil);
    }

    public final int hashCode() {
        String str = this.transactionShareUri;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.transactionId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l2 = this.validUntil;
        return iHashCode2 + (l2 != null ? l2.hashCode() : 0);
    }
}
