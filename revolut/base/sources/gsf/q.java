package gsf;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\r\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0005\u0010\fR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\n\u0010\u0010¨\u0006\u0012"}, d2 = {"Lgsf/q;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "transactionId", "", "b", "Ljava/lang/Long;", "()Ljava/lang/Long;", "createdAt", "Lgsf/l;", "Lgsf/l;", "()Lgsf/l;", "reasons", "feature_transfer_reasons_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("transactionId")
    private final String transactionId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("createdAt")
    private final Long createdAt;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("reasons")
    private final l reasons;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Long getCreatedAt() {
        return this.createdAt;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final l getReasons() {
        return this.reasons;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getTransactionId() {
        return this.transactionId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.transactionId, qVar.transactionId) && Intrinsics.f(this.createdAt, qVar.createdAt) && Intrinsics.f(this.reasons, qVar.reasons);
    }

    public final int hashCode() {
        String str = this.transactionId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l2 = this.createdAt;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        l lVar = this.reasons;
        return iHashCode2 + (lVar != null ? lVar.hashCode() : 0);
    }
}
