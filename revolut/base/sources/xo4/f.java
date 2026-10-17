package xo4;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001a\u0010\u000e\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u001a\u0010\u0010\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u000f\u0010\r¨\u0006\u0011"}, d2 = {"Lxo4/f;", "", "", "toString", "()Ljava/lang/String;", "", "a", "J", "()J", "administrationFeeMinorAmount", "", "b", "I", "()I", "purchaseCountThreshold", "c", "purchaseMinorAmountThreshold", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("administrationFeeMinorAmount")
    private final long administrationFeeMinorAmount;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("purchaseCountThreshold")
    private final int purchaseCountThreshold;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("purchaseMinorAmountThreshold")
    private final int purchaseMinorAmountThreshold;

    public f(long j2, int i, int i2) {
        this.administrationFeeMinorAmount = j2;
        this.purchaseCountThreshold = i;
        this.purchaseMinorAmountThreshold = i2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getAdministrationFeeMinorAmount() {
        return this.administrationFeeMinorAmount;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getPurchaseCountThreshold() {
        return this.purchaseCountThreshold;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getPurchaseMinorAmountThreshold() {
        return this.purchaseMinorAmountThreshold;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.administrationFeeMinorAmount == fVar.administrationFeeMinorAmount && this.purchaseCountThreshold == fVar.purchaseCountThreshold && this.purchaseMinorAmountThreshold == fVar.purchaseMinorAmountThreshold;
    }

    public final int hashCode() {
        return Integer.hashCode(this.purchaseMinorAmountThreshold) + j6.a.b(this.purchaseCountThreshold, Long.hashCode(this.administrationFeeMinorAmount) * 31, 31);
    }
}
