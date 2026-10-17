package oyd;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\bE\n\u0002\u0018\u0002\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004R\u001a\u0010\u0014\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0013\u0010\u0004R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0016\u0010\u0004R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0006\u001a\u0004\b\u0019\u0010\u0004R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0006\u001a\u0004\b\u001c\u0010\u0004R\u001c\u0010 \u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0006\u001a\u0004\b\u001f\u0010\u0004R\u001c\u0010#\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u0006\u001a\u0004\b\"\u0010\u0004R\u001c\u0010&\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\u0006\u001a\u0004\b%\u0010\u0004R\u001c\u0010)\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010\u0006\u001a\u0004\b(\u0010\u0004R\u001c\u0010,\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010\u0006\u001a\u0004\b+\u0010\u0004R\u001c\u0010/\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010\u0006\u001a\u0004\b.\u0010\u0004R\u001c\u00102\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b0\u0010\u0006\u001a\u0004\b1\u0010\u0004R\u001c\u00105\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b3\u0010\u0006\u001a\u0004\b4\u0010\u0004R\u001c\u00108\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b6\u0010\u0006\u001a\u0004\b7\u0010\u0004R\u001c\u0010;\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b9\u0010\u0006\u001a\u0004\b:\u0010\u0004R\u001c\u0010>\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b<\u0010\u0006\u001a\u0004\b=\u0010\u0004R\u001c\u0010A\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b?\u0010\u0006\u001a\u0004\b@\u0010\u0004R\u001c\u0010D\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bB\u0010\u0006\u001a\u0004\bC\u0010\u0004R\u001c\u0010G\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bE\u0010\u0006\u001a\u0004\bF\u0010\u0004R\u001a\u0010M\u001a\u00020H8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR\u001c\u0010P\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bN\u0010\u0006\u001a\u0004\bO\u0010\u0004¨\u0006Q"}, d2 = {"Loyd/u;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getState", "state", "b", "getAmount", "amount", "c", "getAcquirer", "acquirer", "d", "getTransactionTimestamp", "transactionTimestamp", "e", "getValueDate", "valueDate", "f", "getCvdResult", "cvdResult", "g", "getFailReason", "failReason", "h", "getMaskedPan", "maskedPan", "i", "getUser", "user", "j", "getUsage", "usage", "k", "getAuthorizationCode", "authorizationCode", "l", "getEntryMode", "entryMode", "m", "getEci", "eci", "n", "getCardholderAuthenticationValue", "cardholderAuthenticationValue", "o", "getCardholderAuthenticationStatus", "cardholderAuthenticationStatus", "p", "getAuthorisationId", "authorisationId", "q", "getTransactionIdentifier", "transactionIdentifier", "r", "getSchemeId", "schemeId", "s", "getAcquirerTransactionId", "acquirerTransactionId", "t", "getRetrievalReferenceNumber", "retrievalReferenceNumber", "u", "getCavv", "cavv", "v", "getXid", "xid", "Loyd/m;", "w", "Loyd/m;", "getInternational", "()Loyd/m;", "international", "x", "getSurchargeFee", "surchargeFee", "retail_feature_statements_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("state")
    @NotNull
    private final String state;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("amount")
    @NotNull
    private final String amount;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("acquirer")
    @NotNull
    private final String acquirer;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("transactionTimestamp")
    @NotNull
    private final String transactionTimestamp;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("valueDate")
    @NotNull
    private final String valueDate;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("cvdResult")
    private final String cvdResult;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("failReason")
    private final String failReason;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("maskedPan")
    private final String maskedPan;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("user")
    private final String user;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("usage")
    private final String usage;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("authorizationCode")
    private final String authorizationCode;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("entryMode")
    private final String entryMode;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("eci")
    private final String eci;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @lg.b("cardholderAuthenticationValue")
    private final String cardholderAuthenticationValue;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @lg.b("cardholderAuthenticationStatus")
    private final String cardholderAuthenticationStatus;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @lg.b("authorisationId")
    private final String authorisationId;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @lg.b("transactionIdentifier")
    private final String transactionIdentifier;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @lg.b("schemeId")
    private final String schemeId;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @lg.b("acquirerTransactionId")
    private final String acquirerTransactionId;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @lg.b("retrievalReferenceNumber")
    private final String retrievalReferenceNumber;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @lg.b("cavv")
    private final String cavv;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @lg.b("xid")
    private final String xid;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @lg.b("international")
    @NotNull
    private final m international;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    @lg.b("surchargeFee")
    private final String surchargeFee;

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return Intrinsics.f(this.state, uVar.state) && Intrinsics.f(this.amount, uVar.amount) && Intrinsics.f(this.acquirer, uVar.acquirer) && Intrinsics.f(this.transactionTimestamp, uVar.transactionTimestamp) && Intrinsics.f(this.valueDate, uVar.valueDate) && Intrinsics.f(this.cvdResult, uVar.cvdResult) && Intrinsics.f(this.failReason, uVar.failReason) && Intrinsics.f(this.maskedPan, uVar.maskedPan) && Intrinsics.f(this.user, uVar.user) && Intrinsics.f(this.usage, uVar.usage) && Intrinsics.f(this.authorizationCode, uVar.authorizationCode) && Intrinsics.f(this.entryMode, uVar.entryMode) && Intrinsics.f(this.eci, uVar.eci) && Intrinsics.f(this.cardholderAuthenticationValue, uVar.cardholderAuthenticationValue) && Intrinsics.f(this.cardholderAuthenticationStatus, uVar.cardholderAuthenticationStatus) && Intrinsics.f(this.authorisationId, uVar.authorisationId) && Intrinsics.f(this.transactionIdentifier, uVar.transactionIdentifier) && Intrinsics.f(this.schemeId, uVar.schemeId) && Intrinsics.f(this.acquirerTransactionId, uVar.acquirerTransactionId) && Intrinsics.f(this.retrievalReferenceNumber, uVar.retrievalReferenceNumber) && Intrinsics.f(this.cavv, uVar.cavv) && Intrinsics.f(this.xid, uVar.xid) && Intrinsics.f(this.international, uVar.international) && Intrinsics.f(this.surchargeFee, uVar.surchargeFee);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(p.a.c(p.a.c(this.state.hashCode() * 31, 31, this.amount), 31, this.acquirer), 31, this.transactionTimestamp), 31, this.valueDate);
        String str = this.cvdResult;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.failReason;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.maskedPan;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.user;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.usage;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.authorizationCode;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.entryMode;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.eci;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.cardholderAuthenticationValue;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.cardholderAuthenticationStatus;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.authorisationId;
        int iHashCode11 = (iHashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.transactionIdentifier;
        int iHashCode12 = (iHashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.schemeId;
        int iHashCode13 = (iHashCode12 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.acquirerTransactionId;
        int iHashCode14 = (iHashCode13 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.retrievalReferenceNumber;
        int iHashCode15 = (iHashCode14 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.cavv;
        int iHashCode16 = (iHashCode15 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.xid;
        int iHashCode17 = (this.international.hashCode() + ((iHashCode16 + (str17 == null ? 0 : str17.hashCode())) * 31)) * 31;
        String str18 = this.surchargeFee;
        return iHashCode17 + (str18 != null ? str18.hashCode() : 0);
    }
}
