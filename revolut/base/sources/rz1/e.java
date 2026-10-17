package rz1;

import com.revolut.feature.apm.core.models.transfers.ApmTransferDestination;
import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0013\u0010\u0004R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0016\u0010\u0004R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0006\u001a\u0004\b\u0019\u0010\u0004R\u001a\u0010\u001d\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0006\u001a\u0004\b\u001c\u0010\u0004R\u001c\u0010 \u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0006\u001a\u0004\b\u001f\u0010\u0004R\u001a\u0010&\u001a\u00020!8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001c\u0010)\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010\u0006\u001a\u0004\b(\u0010\u0004R\u001c\u0010/\u001a\u0004\u0018\u00010*8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.¨\u00060"}, d2 = {"Lrz1/e;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getOrigin", "origin", "Lcom/revolut/feature/apm/core/models/transfers/ApmTransferDestination;", "b", "Lcom/revolut/feature/apm/core/models/transfers/ApmTransferDestination;", "getDestination", "()Lcom/revolut/feature/apm/core/models/transfers/ApmTransferDestination;", "destination", "c", "getBeneficiaryId", "beneficiaryId", "d", "getPayerAlias", "payerAlias", "e", "getPayerAliasType", "payerAliasType", "f", "getAccountNumber", "accountNumber", "g", "getReceiverName", "receiverName", "h", "getReceiverPhone", "receiverPhone", "Ljo3/a;", "i", "Ljo3/a;", "getAmount", "()Ljo3/a;", "amount", "j", "getComment", "comment", "", "k", "Ljava/lang/Long;", "getValidTillDate", "()Ljava/lang/Long;", "validTillDate", "feature_apm_core_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("origin")
    @NotNull
    private final String origin;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("destination")
    private final ApmTransferDestination destination;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("beneficiaryId")
    private final String beneficiaryId;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("payerAlias")
    private final String payerAlias;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("payerAliasType")
    private final String payerAliasType;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("accountNumber")
    private final String accountNumber;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("receiverName")
    @NotNull
    private final String receiverName;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("receiverPhone")
    private final String receiverPhone;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("amount")
    @NotNull
    private final jo3.a amount;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("comment")
    private final String comment;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("validTillDate")
    private final Long validTillDate;

    public e(String origin, ApmTransferDestination apmTransferDestination, String str, String str2, String str3, String str4, String receiverName, String str5, jo3.a amount, String str6, Long l2) {
        Intrinsics.checkNotNullParameter(origin, "origin");
        Intrinsics.checkNotNullParameter(receiverName, "receiverName");
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.origin = origin;
        this.destination = apmTransferDestination;
        this.beneficiaryId = str;
        this.payerAlias = str2;
        this.payerAliasType = str3;
        this.accountNumber = str4;
        this.receiverName = receiverName;
        this.receiverPhone = str5;
        this.amount = amount;
        this.comment = str6;
        this.validTillDate = l2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.origin, eVar.origin) && Intrinsics.f(this.destination, eVar.destination) && Intrinsics.f(this.beneficiaryId, eVar.beneficiaryId) && Intrinsics.f(this.payerAlias, eVar.payerAlias) && Intrinsics.f(this.payerAliasType, eVar.payerAliasType) && Intrinsics.f(this.accountNumber, eVar.accountNumber) && Intrinsics.f(this.receiverName, eVar.receiverName) && Intrinsics.f(this.receiverPhone, eVar.receiverPhone) && Intrinsics.f(this.amount, eVar.amount) && Intrinsics.f(this.comment, eVar.comment) && Intrinsics.f(this.validTillDate, eVar.validTillDate);
    }

    public final int hashCode() {
        int iHashCode = this.origin.hashCode() * 31;
        ApmTransferDestination apmTransferDestination = this.destination;
        int iHashCode2 = (iHashCode + (apmTransferDestination == null ? 0 : apmTransferDestination.hashCode())) * 31;
        String str = this.beneficiaryId;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.payerAlias;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.payerAliasType;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.accountNumber;
        int iC = p.a.c((iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.receiverName);
        String str5 = this.receiverPhone;
        int iJ = v7.j(this.amount, (iC + (str5 == null ? 0 : str5.hashCode())) * 31, 31);
        String str6 = this.comment;
        int iHashCode6 = (iJ + (str6 == null ? 0 : str6.hashCode())) * 31;
        Long l2 = this.validTillDate;
        return iHashCode6 + (l2 != null ? l2.hashCode() : 0);
    }
}
