package o9l;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0005\u0010\u0011R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\f\u0010\u0016R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u0014\u0010\u0004R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u001c\u0010!\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b\u000f\u0010 ¨\u0006\""}, d2 = {"Lo9l/c;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "h", "type", "b", "f", "standingOrderId", "c", "billNumber", "Lo9l/b;", "d", "Lo9l/b;", "()Lo9l/b;", "beneficiary", "", "e", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "canBePaidNow", "nextAvailableDateForPayment", "Lo9l/e;", "g", "Lo9l/e;", "()Lo9l/e;", "thresholds", "Lo9l/d;", "Lo9l/d;", "()Lo9l/d;", "fees", "feature_shared_recurring_payments_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("type")
    private final String type = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("standingOrderId")
    private final String standingOrderId = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("billNumber")
    private final String billNumber = null;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("beneficiary")
    private final b beneficiary = null;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("canBePaidNow")
    private final Boolean canBePaidNow = null;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("nextAvailableDateForPayment")
    private final String nextAvailableDateForPayment = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("thresholds")
    private final e thresholds = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("fees")
    private final d fees = null;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final b getBeneficiary() {
        return this.beneficiary;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getBillNumber() {
        return this.billNumber;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Boolean getCanBePaidNow() {
        return this.canBePaidNow;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final d getFees() {
        return this.fees;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getNextAvailableDateForPayment() {
        return this.nextAvailableDateForPayment;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.type, cVar.type) && Intrinsics.f(this.standingOrderId, cVar.standingOrderId) && Intrinsics.f(this.billNumber, cVar.billNumber) && Intrinsics.f(this.beneficiary, cVar.beneficiary) && Intrinsics.f(this.canBePaidNow, cVar.canBePaidNow) && Intrinsics.f(this.nextAvailableDateForPayment, cVar.nextAvailableDateForPayment) && Intrinsics.f(this.thresholds, cVar.thresholds) && Intrinsics.f(this.fees, cVar.fees);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getStandingOrderId() {
        return this.standingOrderId;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final e getThresholds() {
        return this.thresholds;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public final int hashCode() {
        String str = this.type;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.standingOrderId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.billNumber;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        b bVar = this.beneficiary;
        int iHashCode4 = (iHashCode3 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        Boolean bool = this.canBePaidNow;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str4 = this.nextAvailableDateForPayment;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        e eVar = this.thresholds;
        int iHashCode7 = (iHashCode6 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        d dVar = this.fees;
        return iHashCode7 + (dVar != null ? dVar.hashCode() : 0);
    }
}
