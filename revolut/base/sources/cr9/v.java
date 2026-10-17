package cr9;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\t\u0010\u0019R\u001a\u0010\u001f\u001a\u00020\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010$\u001a\u00020 8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010!\u001a\u0004\b\"\u0010#R\u001c\u0010(\u001a\u0004\u0018\u00010 8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b\u0017\u0010'R\u001a\u0010,\u001a\u00020)8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010*\u001a\u0004\b%\u0010+R\u001a\u00100\u001a\u00020-8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010.\u001a\u0004\b\u0005\u0010/¨\u00061"}, d2 = {"Lcr9/v;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "d", "id", "b", "h", "name", "c", "e", "imageUrl", "", "Lcr9/y;", "Ljava/util/List;", "g", "()Ljava/util/List;", "members", "currencyCode", "Lcr9/h;", "f", "Lcr9/h;", "()Lcr9/h;", "balance", "", "Z", "k", "()Z", "isTrusted", "", "J", "j", "()J", "updatedDate", "i", "Ljava/lang/Long;", "()Ljava/lang/Long;", "lastFullSettlementDate", "Lcr9/d;", "Lcr9/d;", "()Lcr9/d;", "settings", "Lcr9/a;", "Lcr9/a;", "()Lcr9/a;", "analytics", "feature_payments_groups_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("name")
    @NotNull
    private final String name;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("picture")
    private final String imageUrl;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("members")
    @NotNull
    private final List<y> members;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("currency")
    private final String currencyCode;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("balance")
    private final h balance;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("trusted")
    private final boolean isTrusted;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("updatedDate")
    private final long updatedDate;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("lastFullSettlementDate")
    private final Long lastFullSettlementDate;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("settings")
    @NotNull
    private final d settings;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("analytics")
    @NotNull
    private final a analytics;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final a getAnalytics() {
        return this.analytics;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final h getBalance() {
        return this.balance;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getCurrencyCode() {
        return this.currencyCode;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return Intrinsics.f(this.id, vVar.id) && Intrinsics.f(this.name, vVar.name) && Intrinsics.f(this.imageUrl, vVar.imageUrl) && Intrinsics.f(this.members, vVar.members) && Intrinsics.f(this.currencyCode, vVar.currencyCode) && Intrinsics.f(this.balance, vVar.balance) && this.isTrusted == vVar.isTrusted && this.updatedDate == vVar.updatedDate && Intrinsics.f(this.lastFullSettlementDate, vVar.lastFullSettlementDate) && Intrinsics.f(this.settings, vVar.settings) && Intrinsics.f(this.analytics, vVar.analytics);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Long getLastFullSettlementDate() {
        return this.lastFullSettlementDate;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final List getMembers() {
        return this.members;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final int hashCode() {
        int iC = p.a.c(this.id.hashCode() * 31, 31, this.name);
        String str = this.imageUrl;
        int iD = p.a.d((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.members);
        String str2 = this.currencyCode;
        int iHashCode = (iD + (str2 == null ? 0 : str2.hashCode())) * 31;
        h hVar = this.balance;
        int iC2 = a0.d.c(j6.a.c((iHashCode + (hVar == null ? 0 : hVar.hashCode())) * 31, 31, this.isTrusted), 31, this.updatedDate);
        Long l2 = this.lastFullSettlementDate;
        return this.analytics.hashCode() + ((this.settings.hashCode() + ((iC2 + (l2 != null ? l2.hashCode() : 0)) * 31)) * 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final d getSettings() {
        return this.settings;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final long getUpdatedDate() {
        return this.updatedDate;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final boolean getIsTrusted() {
        return this.isTrusted;
    }
}
