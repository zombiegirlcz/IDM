package l8a;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0007\u001a\u0004\b\u000b\u0010\tR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0004R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0011\u0010\u0004R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u000e\u001a\u0004\b\u0013\u0010\u0004R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0016\u001a\u0004\b\r\u0010\u0017R\"\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0006\u0010\u001dR\u001c\u0010\"\u001a\u0004\u0018\u00010\u001f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010 \u001a\u0004\b\u001b\u0010!¨\u0006#"}, d2 = {"Ll8a/a0;", "", "", "toString", "()Ljava/lang/String;", "", "a", "Ljava/lang/Long;", "b", "()Ljava/lang/Long;", "createdDate", "e", "expirationDate", "c", "Ljava/lang/String;", "f", "lastSchedulableDate", "d", "dueDate", "h", "paymentInstruction", "Ll8a/e0;", "Ll8a/e0;", "()Ll8a/e0;", "debtor", "", "Ll8a/x;", "g", "Ljava/util/List;", "()Ljava/util/List;", "additionalInformation", "Ll8a/j0;", "Ll8a/j0;", "()Ll8a/j0;", "moneyBreakdown", "feature_pix_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("createdDate")
    private final Long createdDate;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("expirationDate")
    private final Long expirationDate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("lastSchedulableDate")
    private final String lastSchedulableDate;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("dueDate")
    private final String dueDate;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("paymentInstruction")
    private final String paymentInstruction;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("debtor")
    private final e0 debtor;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("additionalInformation")
    private final List<x> additionalInformation;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("moneyBreakdown")
    private final j0 moneyBreakdown;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getAdditionalInformation() {
        return this.additionalInformation;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Long getCreatedDate() {
        return this.createdDate;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final e0 getDebtor() {
        return this.debtor;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getDueDate() {
        return this.dueDate;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Long getExpirationDate() {
        return this.expirationDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj2;
        return Intrinsics.f(this.createdDate, a0Var.createdDate) && Intrinsics.f(this.expirationDate, a0Var.expirationDate) && Intrinsics.f(this.lastSchedulableDate, a0Var.lastSchedulableDate) && Intrinsics.f(this.dueDate, a0Var.dueDate) && Intrinsics.f(this.paymentInstruction, a0Var.paymentInstruction) && Intrinsics.f(this.debtor, a0Var.debtor) && Intrinsics.f(this.additionalInformation, a0Var.additionalInformation) && Intrinsics.f(this.moneyBreakdown, a0Var.moneyBreakdown);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getLastSchedulableDate() {
        return this.lastSchedulableDate;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final j0 getMoneyBreakdown() {
        return this.moneyBreakdown;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getPaymentInstruction() {
        return this.paymentInstruction;
    }

    public final int hashCode() {
        Long l2 = this.createdDate;
        int iHashCode = (l2 == null ? 0 : l2.hashCode()) * 31;
        Long l3 = this.expirationDate;
        int iHashCode2 = (iHashCode + (l3 == null ? 0 : l3.hashCode())) * 31;
        String str = this.lastSchedulableDate;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.dueDate;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.paymentInstruction;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        e0 e0Var = this.debtor;
        int iHashCode6 = (iHashCode5 + (e0Var == null ? 0 : e0Var.hashCode())) * 31;
        List<x> list = this.additionalInformation;
        int iHashCode7 = (iHashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        j0 j0Var = this.moneyBreakdown;
        return iHashCode7 + (j0Var != null ? j0Var.hashCode() : 0);
    }
}
