package m20;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\bB\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0006\u001a\u0004\b\u0019\u0010\u0004R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0006\u001a\u0004\b\u001c\u0010\u0004R\u001c\u0010 \u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0006\u001a\u0004\b\u001f\u0010\u0004R\u001c\u0010#\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u0006\u001a\u0004\b\"\u0010\u0004R\u001c\u0010&\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\u0006\u001a\u0004\b%\u0010\u0004R\u001c\u0010)\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010\u0006\u001a\u0004\b(\u0010\u0004R\u001c\u0010,\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010\u0006\u001a\u0004\b+\u0010\u0004R\u001c\u0010/\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010\u0006\u001a\u0004\b.\u0010\u0004R\u001c\u00102\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b0\u0010\u0006\u001a\u0004\b1\u0010\u0004R\u001c\u00105\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b3\u0010\u0006\u001a\u0004\b4\u0010\u0004R\u001c\u00108\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b6\u0010\u0006\u001a\u0004\b7\u0010\u0004R\u001c\u0010;\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b9\u0010\u0006\u001a\u0004\b:\u0010\u0004R\u001c\u0010>\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b<\u0010\u0006\u001a\u0004\b=\u0010\u0004R\u001c\u0010A\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b?\u0010\u0006\u001a\u0004\b@\u0010\u0004R\u001c\u0010D\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bB\u0010\u0006\u001a\u0004\bC\u0010\u0004R\u001c\u0010G\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bE\u0010\u0006\u001a\u0004\bF\u0010\u0004R\u001c\u0010J\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bH\u0010\u0006\u001a\u0004\bI\u0010\u0004R\u001c\u0010M\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bK\u0010\u0006\u001a\u0004\bL\u0010\u0004R\u001c\u0010P\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bN\u0010\u0006\u001a\u0004\bO\u0010\u0004R\u001c\u0010S\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bQ\u0010\u0006\u001a\u0004\bR\u0010\u0004¨\u0006T"}, d2 = {"Lm20/r;", "Lm20/k;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getCategory", "category", "b", "getTag", "tag", "c", "getType", "type", "d", "getState", "state", "Lmf0/a;", "e", "Lmf0/a;", "getFee", "()Lmf0/a;", "fee", "f", "getReason", "reason", "g", "getDescription", "description", "h", "getAccountType", "accountType", "i", "getStrategy", "strategy", "j", "getRecipientType", "recipientType", "k", "getPro", "pro", "l", "getDisposable", "disposable", "m", "getCredit", "credit", "n", "getScheme", "scheme", "o", "getMerchantCategory", "merchantCategory", "p", "getTopupMethod", "topupMethod", "q", "getComment", "comment", "r", "getExpenseState", "expenseState", "s", "getTransferCardOwnerId", "transferCardOwnerId", "t", "getBillMoneyBoxId", "billMoneyBoxId", "u", "getRecipientId", "recipientId", "v", "getVaultId", "vaultId", "w", "getPocketId", "pocketId", "x", "getRecipientCode", "recipientCode", "y", "getRecipientUsername", "recipientUsername", "chat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class r implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("category")
    private final String category;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("tag")
    private final String tag;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("type")
    private final String type;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("state")
    private final String state;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("fee")
    private final mf0.a fee;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("reason")
    private final String reason;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("description")
    private final String description;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("accountType")
    private final String accountType;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("strategy")
    private final String strategy;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("recipientType")
    private final String recipientType;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("pro")
    private final String pro;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("disposable")
    private final String disposable;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("credit")
    private final String credit;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @lg.b("scheme")
    private final String scheme;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @lg.b("merchantCategory")
    private final String merchantCategory;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @lg.b("topupMethod")
    private final String topupMethod;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @lg.b("comment")
    private final String comment;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @lg.b("expenseState")
    private final String expenseState;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @lg.b("transferCardOwnerId")
    private final String transferCardOwnerId;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @lg.b("billMoneyBoxId")
    private final String billMoneyBoxId;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @lg.b("recipientId")
    private final String recipientId;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @lg.b("vaultId")
    private final String vaultId;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @lg.b("pocketId")
    private final String pocketId;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    @lg.b("recipientCode")
    private final String recipientCode;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    @lg.b("recipientUsername")
    private final String recipientUsername;

    public r(String str, String str2, String str3, String str4, mf0.a aVar, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24) {
        this.category = str;
        this.tag = str2;
        this.type = str3;
        this.state = str4;
        this.fee = aVar;
        this.reason = str5;
        this.description = str6;
        this.accountType = str7;
        this.strategy = str8;
        this.recipientType = str9;
        this.pro = str10;
        this.disposable = str11;
        this.credit = str12;
        this.scheme = str13;
        this.merchantCategory = str14;
        this.topupMethod = str15;
        this.comment = str16;
        this.expenseState = str17;
        this.transferCardOwnerId = str18;
        this.billMoneyBoxId = str19;
        this.recipientId = str20;
        this.vaultId = str21;
        this.pocketId = str22;
        this.recipientCode = str23;
        this.recipientUsername = str24;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.category, rVar.category) && Intrinsics.f(this.tag, rVar.tag) && Intrinsics.f(this.type, rVar.type) && Intrinsics.f(this.state, rVar.state) && Intrinsics.f(this.fee, rVar.fee) && Intrinsics.f(this.reason, rVar.reason) && Intrinsics.f(this.description, rVar.description) && Intrinsics.f(this.accountType, rVar.accountType) && Intrinsics.f(this.strategy, rVar.strategy) && Intrinsics.f(this.recipientType, rVar.recipientType) && Intrinsics.f(this.pro, rVar.pro) && Intrinsics.f(this.disposable, rVar.disposable) && Intrinsics.f(this.credit, rVar.credit) && Intrinsics.f(this.scheme, rVar.scheme) && Intrinsics.f(this.merchantCategory, rVar.merchantCategory) && Intrinsics.f(this.topupMethod, rVar.topupMethod) && Intrinsics.f(this.comment, rVar.comment) && Intrinsics.f(this.expenseState, rVar.expenseState) && Intrinsics.f(this.transferCardOwnerId, rVar.transferCardOwnerId) && Intrinsics.f(this.billMoneyBoxId, rVar.billMoneyBoxId) && Intrinsics.f(this.recipientId, rVar.recipientId) && Intrinsics.f(this.vaultId, rVar.vaultId) && Intrinsics.f(this.pocketId, rVar.pocketId) && Intrinsics.f(this.recipientCode, rVar.recipientCode) && Intrinsics.f(this.recipientUsername, rVar.recipientUsername);
    }

    public final int hashCode() {
        String str = this.category;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.tag;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.type;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.state;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        mf0.a aVar = this.fee;
        int iHashCode5 = (iHashCode4 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        String str5 = this.reason;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.description;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.accountType;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.strategy;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.recipientType;
        int iHashCode10 = (iHashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.pro;
        int iHashCode11 = (iHashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.disposable;
        int iHashCode12 = (iHashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.credit;
        int iHashCode13 = (iHashCode12 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.scheme;
        int iHashCode14 = (iHashCode13 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.merchantCategory;
        int iHashCode15 = (iHashCode14 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.topupMethod;
        int iHashCode16 = (iHashCode15 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.comment;
        int iHashCode17 = (iHashCode16 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.expenseState;
        int iHashCode18 = (iHashCode17 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.transferCardOwnerId;
        int iHashCode19 = (iHashCode18 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.billMoneyBoxId;
        int iHashCode20 = (iHashCode19 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.recipientId;
        int iHashCode21 = (iHashCode20 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.vaultId;
        int iHashCode22 = (iHashCode21 + (str21 == null ? 0 : str21.hashCode())) * 31;
        String str22 = this.pocketId;
        int iHashCode23 = (iHashCode22 + (str22 == null ? 0 : str22.hashCode())) * 31;
        String str23 = this.recipientCode;
        int iHashCode24 = (iHashCode23 + (str23 == null ? 0 : str23.hashCode())) * 31;
        String str24 = this.recipientUsername;
        return iHashCode24 + (str24 != null ? str24.hashCode() : 0);
    }
}
