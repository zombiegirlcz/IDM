package ro3;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001a\u0010\u0013\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\t\u0010\u0012R\"\u0010\u0018\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0006\u001a\u0004\b\u0015\u0010\u0004\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0006\u001a\u0004\b\u001a\u0010\u0004R\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0019\u0010\u001eR\u001c\u0010 \u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u001d\u001a\u0004\b\u0010\u0010\u001eR\u001c\u0010!\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u0014\u0010\u001eR\u001c\u0010#\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR\u001c\u0010&\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\u001d\u001a\u0004\b%\u0010\u001eR\u001c\u0010+\u001a\u0004\u0018\u00010'8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b(\u0010*R\u001c\u0010,\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\"\u0010\u0004R\u001c\u0010.\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010\u0006\u001a\u0004\b$\u0010\u0004R\u001c\u00103\u001a\u0004\u0018\u00010/8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u00100\u001a\u0004\b1\u00102R\"\u00108\u001a\n\u0012\u0004\u0012\u000205\u0018\u0001048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u00106\u001a\u0004\b\u0005\u00107R\u001c\u0010=\u001a\u0004\u0018\u0001098\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010:\u001a\u0004\b;\u0010<R\u001c\u0010>\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b;\u0010\u0006\u001a\u0004\b-\u0010\u0004R\u001c\u0010@\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b?\u0010\u001d\u001a\u0004\b\f\u0010\u001eR\u001c\u0010A\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001d\u001a\u0004\b?\u0010\u001eR\u001c\u0010C\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bB\u0010\u001d\u001a\u0004\bB\u0010\u001e¨\u0006D"}, d2 = {"Lro3/e;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "i", "id", "b", "m", "name", "c", "h", "currency", "", "d", "J", "()J", "balance", "e", "q", "setState", "(Ljava/lang/String;)V", "state", "f", "t", "type", "g", "Ljava/lang/Long;", "()Ljava/lang/Long;", "createdDate", "blockedAmount", "blockedByOpenRevXOrder", "j", "creditLimit", "k", "o", "overdraftLimit", "Lro3/a;", "l", "Lro3/a;", "()Lro3/a;", "logo", "institutionId", "n", "institutionName", "", "Ljava/lang/Boolean;", "p", "()Ljava/lang/Boolean;", "paymentInitiation", "", "Lro3/c;", "Ljava/util/List;", "()Ljava/util/List;", "accountsDetails", "Lro3/j;", "Lro3/j;", "r", "()Lro3/j;", "topupSettings", "origin", "s", "balanceUpdatedDate", "transferLimit", "u", "updatedDate", "feature_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("name")
    private final String name;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("currency")
    @NotNull
    private final String currency;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("balance")
    private final long balance;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("state")
    @NotNull
    private String state;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("type")
    @NotNull
    private final String type;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("createdDate")
    private final Long createdDate;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("blockedAmount")
    private final Long blockedAmount;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("blockedByOpenRevxOrder")
    private final Long blockedByOpenRevXOrder;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("creditLimit")
    private final Long creditLimit;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("overdraftLimit")
    private final Long overdraftLimit;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("logo")
    private final a logo;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("institutionId")
    private final String institutionId;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @lg.b("institutionName")
    private final String institutionName;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @lg.b("paymentInitiation")
    private final Boolean paymentInitiation;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @lg.b("accountsDetails")
    private final List<c> accountsDetails;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @lg.b("topupSettings")
    private final j topupSettings;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @lg.b("origin")
    private final String origin;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @lg.b("balanceUpdatedDate")
    private final Long balanceUpdatedDate;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @lg.b("transferLimit")
    private final Long transferLimit;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @lg.b("updatedDate")
    private final Long updatedDate;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getAccountsDetails() {
        return this.accountsDetails;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getBalance() {
        return this.balance;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Long getBalanceUpdatedDate() {
        return this.balanceUpdatedDate;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Long getBlockedAmount() {
        return this.blockedAmount;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Long getBlockedByOpenRevXOrder() {
        return this.blockedByOpenRevXOrder;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.id, eVar.id) && Intrinsics.f(this.name, eVar.name) && Intrinsics.f(this.currency, eVar.currency) && this.balance == eVar.balance && Intrinsics.f(this.state, eVar.state) && Intrinsics.f(this.type, eVar.type) && Intrinsics.f(this.createdDate, eVar.createdDate) && Intrinsics.f(this.blockedAmount, eVar.blockedAmount) && Intrinsics.f(this.blockedByOpenRevXOrder, eVar.blockedByOpenRevXOrder) && Intrinsics.f(this.creditLimit, eVar.creditLimit) && Intrinsics.f(this.overdraftLimit, eVar.overdraftLimit) && Intrinsics.f(this.logo, eVar.logo) && Intrinsics.f(this.institutionId, eVar.institutionId) && Intrinsics.f(this.institutionName, eVar.institutionName) && Intrinsics.f(this.paymentInitiation, eVar.paymentInitiation) && Intrinsics.f(this.accountsDetails, eVar.accountsDetails) && Intrinsics.f(this.topupSettings, eVar.topupSettings) && Intrinsics.f(this.origin, eVar.origin) && Intrinsics.f(this.balanceUpdatedDate, eVar.balanceUpdatedDate) && Intrinsics.f(this.transferLimit, eVar.transferLimit) && Intrinsics.f(this.updatedDate, eVar.updatedDate);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Long getCreatedDate() {
        return this.createdDate;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Long getCreditLimit() {
        return this.creditLimit;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    public final int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.name;
        int iC = p.a.c(p.a.c(a0.d.c(p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.currency), 31, this.balance), 31, this.state), 31, this.type);
        Long l2 = this.createdDate;
        int iHashCode2 = (iC + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.blockedAmount;
        int iHashCode3 = (iHashCode2 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.blockedByOpenRevXOrder;
        int iHashCode4 = (iHashCode3 + (l4 == null ? 0 : l4.hashCode())) * 31;
        Long l5 = this.creditLimit;
        int iHashCode5 = (iHashCode4 + (l5 == null ? 0 : l5.hashCode())) * 31;
        Long l22 = this.overdraftLimit;
        int iHashCode6 = (iHashCode5 + (l22 == null ? 0 : l22.hashCode())) * 31;
        a aVar = this.logo;
        int iHashCode7 = (iHashCode6 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        String str2 = this.institutionId;
        int iHashCode8 = (iHashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.institutionName;
        int iHashCode9 = (iHashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.paymentInitiation;
        int iHashCode10 = (iHashCode9 + (bool == null ? 0 : bool.hashCode())) * 31;
        List<c> list = this.accountsDetails;
        int iHashCode11 = (iHashCode10 + (list == null ? 0 : list.hashCode())) * 31;
        j jVar = this.topupSettings;
        int iHashCode12 = (iHashCode11 + (jVar == null ? 0 : jVar.hashCode())) * 31;
        String str4 = this.origin;
        int iHashCode13 = (iHashCode12 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l31 = this.balanceUpdatedDate;
        int iHashCode14 = (iHashCode13 + (l31 == null ? 0 : l31.hashCode())) * 31;
        Long l37 = this.transferLimit;
        int iHashCode15 = (iHashCode14 + (l37 == null ? 0 : l37.hashCode())) * 31;
        Long l39 = this.updatedDate;
        return iHashCode15 + (l39 != null ? l39.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getInstitutionId() {
        return this.institutionId;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getInstitutionName() {
        return this.institutionName;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final a getLogo() {
        return this.logo;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final String getOrigin() {
        return this.origin;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final Long getOverdraftLimit() {
        return this.overdraftLimit;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final Boolean getPaymentInitiation() {
        return this.paymentInitiation;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final String getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final j getTopupSettings() {
        return this.topupSettings;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final Long getTransferLimit() {
        return this.transferLimit;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final Long getUpdatedDate() {
        return this.updatedDate;
    }
}
