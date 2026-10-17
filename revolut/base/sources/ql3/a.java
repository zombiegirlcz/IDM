package ql3;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000f\u0010\u0004R\u001a\u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001a\u0010\u0018\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u001a\u001a\u0004\b\u0014\u0010\u001bR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\u001f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010 \u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u001d\u0010\u0004R\u001c\u0010\"\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u0006\u001a\u0004\b\u0011\u0010\u0004¨\u0006#"}, d2 = {"Lql3/a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "i", "registeredAs", "b", "d", "country", "c", "getLegalName", "legalName", "j", "username", "e", "code", "", "f", "Z", "g", "()Z", "newlyJoined", "", "Ljava/lang/Long;", "()Ljava/lang/Long;", "joinDate", "h", "birthday", "appMode", "pricePlan", "k", "customerType", "retail_feature_contacts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("registeredAs")
    @NotNull
    private final String registeredAs;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("country")
    @NotNull
    private final String country;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("legalName")
    private final String legalName;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("username")
    @NotNull
    private final String username;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("code")
    @NotNull
    private final String code;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("newlyJoined")
    private final boolean newlyJoined;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("joinDate")
    private final Long joinDate;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("birthday")
    private final String birthday;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("appMode")
    @NotNull
    private final String appMode;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("pricingPlanTier")
    private final String pricePlan;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("customerType")
    private final String customerType;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAppMode() {
        return this.appMode;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getBirthday() {
        return this.birthday;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getCountry() {
        return this.country;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getCustomerType() {
        return this.customerType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.registeredAs, aVar.registeredAs) && Intrinsics.f(this.country, aVar.country) && Intrinsics.f(this.legalName, aVar.legalName) && Intrinsics.f(this.username, aVar.username) && Intrinsics.f(this.code, aVar.code) && this.newlyJoined == aVar.newlyJoined && Intrinsics.f(this.joinDate, aVar.joinDate) && Intrinsics.f(this.birthday, aVar.birthday) && Intrinsics.f(this.appMode, aVar.appMode) && Intrinsics.f(this.pricePlan, aVar.pricePlan) && Intrinsics.f(this.customerType, aVar.customerType);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Long getJoinDate() {
        return this.joinDate;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getNewlyJoined() {
        return this.newlyJoined;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getPricePlan() {
        return this.pricePlan;
    }

    public final int hashCode() {
        int iC = p.a.c(this.registeredAs.hashCode() * 31, 31, this.country);
        String str = this.legalName;
        int iC2 = j6.a.c(p.a.c(p.a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.username), 31, this.code), 31, this.newlyJoined);
        Long l2 = this.joinDate;
        int iHashCode = (iC2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str2 = this.birthday;
        int iC3 = p.a.c((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.appMode);
        String str3 = this.pricePlan;
        int iHashCode2 = (iC3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.customerType;
        return iHashCode2 + (str4 != null ? str4.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getRegisteredAs() {
        return this.registeredAs;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getUsername() {
        return this.username;
    }
}
