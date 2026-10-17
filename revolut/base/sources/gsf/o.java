package gsf;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u001b\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0013\u0010\u0004R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0016\u0010\u0004R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0006\u001a\u0004\b\u0019\u0010\u0004R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0006\u001a\u0004\b\u001c\u0010\u0004R\u001c\u0010 \u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0006\u001a\u0004\b\u001f\u0010\u0004R\u001c\u0010#\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u0006\u001a\u0004\b\"\u0010\u0004¨\u0006$"}, d2 = {"Lgsf/o;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getTransactionId", "transactionId", "", "b", "Ljava/lang/Long;", "getTransferAmount", "()Ljava/lang/Long;", "transferAmount", "c", "getTransferCurrency", "transferCurrency", "d", "getTransferType", "transferType", "e", "getFromPocketId", "fromPocketId", "f", "getRecipientCountry", "recipientCountry", "g", "getBeneficiaryId", "beneficiaryId", "h", "getCode", "code", "i", "getOriginalTransactionId", "originalTransactionId", "feature_transfer_reasons_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("transactionId")
    private final String transactionId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("transferAmount")
    private final Long transferAmount;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("transferCurrency")
    private final String transferCurrency;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("transferType")
    private final String transferType;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("fromPocketId")
    private final String fromPocketId;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("recipientCountry")
    private final String recipientCountry;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("beneficiaryId")
    private final String beneficiaryId;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("code")
    private final String code;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("originalTransactionId")
    private final String originalTransactionId;

    public o(String str, Long l2, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.transactionId = str;
        this.transferAmount = l2;
        this.transferCurrency = str2;
        this.transferType = str3;
        this.fromPocketId = str4;
        this.recipientCountry = str5;
        this.beneficiaryId = str6;
        this.code = str7;
        this.originalTransactionId = str8;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.transactionId, oVar.transactionId) && Intrinsics.f(this.transferAmount, oVar.transferAmount) && Intrinsics.f(this.transferCurrency, oVar.transferCurrency) && Intrinsics.f(this.transferType, oVar.transferType) && Intrinsics.f(this.fromPocketId, oVar.fromPocketId) && Intrinsics.f(this.recipientCountry, oVar.recipientCountry) && Intrinsics.f(this.beneficiaryId, oVar.beneficiaryId) && Intrinsics.f(this.code, oVar.code) && Intrinsics.f(this.originalTransactionId, oVar.originalTransactionId);
    }

    public final int hashCode() {
        String str = this.transactionId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l2 = this.transferAmount;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str2 = this.transferCurrency;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.transferType;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.fromPocketId;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.recipientCountry;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.beneficiaryId;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.code;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.originalTransactionId;
        return iHashCode8 + (str8 != null ? str8.hashCode() : 0);
    }
}
