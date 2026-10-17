package gfk;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0013\u0010\u0004R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u000b\u001a\u0004\b\u0016\u0010\rR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010 \u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0006\u001a\u0004\b\u001f\u0010\u0004¨\u0006!"}, d2 = {"Lgfk/d;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getBillingOption", "billingOption", "", "b", "Ljava/lang/Boolean;", "getAllowPreorder", "()Ljava/lang/Boolean;", "allowPreorder", "c", "getOfferToken", "offerToken", "d", "getReason", "reason", "e", "getBypassOnNoCardFee", "bypassOnNoCardFee", "", "f", "Ljava/lang/Integer;", "getExtraMembers", "()Ljava/lang/Integer;", "extraMembers", "g", "getSource", "source", "feature_retail_pricing_plans_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("billingOption")
    private final String billingOption;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("allowPreorder")
    private final Boolean allowPreorder;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("offerToken")
    private final String offerToken;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("reason")
    private final String reason;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("bypassOnNoCardFee")
    private final Boolean bypassOnNoCardFee;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("extraMembers")
    private final Integer extraMembers;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("source")
    private final String source;

    public d(String str, Boolean bool, String str2, String str3, Boolean bool2, Integer num, String str4) {
        this.billingOption = str;
        this.allowPreorder = bool;
        this.offerToken = str2;
        this.reason = str3;
        this.bypassOnNoCardFee = bool2;
        this.extraMembers = num;
        this.source = str4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.billingOption, dVar.billingOption) && Intrinsics.f(this.allowPreorder, dVar.allowPreorder) && Intrinsics.f(this.offerToken, dVar.offerToken) && Intrinsics.f(this.reason, dVar.reason) && Intrinsics.f(this.bypassOnNoCardFee, dVar.bypassOnNoCardFee) && Intrinsics.f(this.extraMembers, dVar.extraMembers) && Intrinsics.f(this.source, dVar.source);
    }

    public final int hashCode() {
        String str = this.billingOption;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.allowPreorder;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.offerToken;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.reason;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool2 = this.bypassOnNoCardFee;
        int iHashCode5 = (iHashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num = this.extraMembers;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.source;
        return iHashCode6 + (str4 != null ? str4.hashCode() : 0);
    }
}
