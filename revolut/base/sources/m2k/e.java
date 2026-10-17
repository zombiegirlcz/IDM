package m2k;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\"\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\"\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0006\u001a\u0004\b\u0014\u0010\u0004R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0017\u001a\u0004\b\u0005\u0010\u0018R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b\u001a\u0010\u001e¨\u0006 "}, d2 = {"Lm2k/e;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "edt", "h", "transferType", "", "Lm2k/k;", "c", "Ljava/util/List;", "d", "()Ljava/util/List;", "fees", "f", "supportedStraightThroughMethods", "e", "paymentScheme", "Lm2k/u;", "Lm2k/u;", "()Lm2k/u;", "beneficiaryRequirements", "g", "edtDelayReason", "Lm2k/g;", "Lm2k/g;", "()Lm2k/g;", "transferCharges", "feature_payments_bank_transfer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("edt")
    private final String edt;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("transferType")
    private final String transferType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("fees")
    private final List<k> fees;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("supportedThroughTransferFundings")
    private final List<String> supportedStraightThroughMethods;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("paymentScheme")
    private final String paymentScheme;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("beneficiaryRequirements")
    private final u beneficiaryRequirements;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("edtDelayReason")
    private final String edtDelayReason;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("transferCharges")
    private final g transferCharges;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final u getBeneficiaryRequirements() {
        return this.beneficiaryRequirements;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getEdt() {
        return this.edt;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getEdtDelayReason() {
        return this.edtDelayReason;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final List getFees() {
        return this.fees;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getPaymentScheme() {
        return this.paymentScheme;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.edt, eVar.edt) && Intrinsics.f(this.transferType, eVar.transferType) && Intrinsics.f(this.fees, eVar.fees) && Intrinsics.f(this.supportedStraightThroughMethods, eVar.supportedStraightThroughMethods) && Intrinsics.f(this.paymentScheme, eVar.paymentScheme) && Intrinsics.f(this.beneficiaryRequirements, eVar.beneficiaryRequirements) && Intrinsics.f(this.edtDelayReason, eVar.edtDelayReason) && Intrinsics.f(this.transferCharges, eVar.transferCharges);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final List getSupportedStraightThroughMethods() {
        return this.supportedStraightThroughMethods;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final g getTransferCharges() {
        return this.transferCharges;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getTransferType() {
        return this.transferType;
    }

    public final int hashCode() {
        String str = this.edt;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.transferType;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<k> list = this.fees;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.supportedStraightThroughMethods;
        int iHashCode4 = (iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str3 = this.paymentScheme;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        u uVar = this.beneficiaryRequirements;
        int iHashCode6 = (iHashCode5 + (uVar == null ? 0 : uVar.hashCode())) * 31;
        String str4 = this.edtDelayReason;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        g gVar = this.transferCharges;
        return iHashCode7 + (gVar != null ? gVar.hashCode() : 0);
    }
}
