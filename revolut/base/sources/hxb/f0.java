package hxb;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0016\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\t\u0010\u0015R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0006\u001a\u0004\b\u001a\u0010\u0004R\u001a\u0010\u001e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0006\u001a\u0004\b\u001d\u0010\u0004R\u001a\u0010 \u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\"\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u0006\u001a\u0004\b\u001f\u0010\u0004R\u001c\u0010'\u001a\u0004\u0018\u00010#8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b\u001c\u0010&R\u001c\u0010+\u001a\u0004\u0018\u00010(8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010)\u001a\u0004\b\u0017\u0010*R\u001c\u0010/\u001a\u0004\u0018\u00010,8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b\u0019\u0010.R\u001c\u00100\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0006\u001a\u0004\b!\u0010\u0004R\u001c\u00102\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010\u0006\u001a\u0004\b$\u0010\u0004R\u001c\u00103\u001a\u0004\u0018\u00010(8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010)\u001a\u0004\b1\u0010*R\u001c\u00104\u001a\u0004\u0018\u00010(8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010)\u001a\u0004\b\u0013\u0010*¨\u00065"}, d2 = {"Lhxb/f0;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "l", "pointsTransactionId", "b", "p", "type", "", "c", "D", "k", "()D", "points", "", "d", "J", "()J", "createdDate", "e", "coreTransactionId", "f", "m", "product", "g", "o", "state", "h", "description", "i", "name", "Lhxb/j0;", "j", "Lhxb/j0;", "()Lhxb/j0;", "iconsUrl", "Lhxb/h0;", "Lhxb/h0;", "()Lhxb/h0;", "exchangeDetails", "Lhxb/g0;", "Lhxb/g0;", "()Lhxb/g0;", "exchangedAmount", "originId", "n", "originResource", "receivedExchangeDetails", "earningDetails", "feature_rev_points_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("pointsTransactionId")
    @NotNull
    private final String pointsTransactionId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("type")
    @NotNull
    private final String type;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("points")
    private final double points;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("createdDate")
    private final long createdDate;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("coreTransactionId")
    private final String coreTransactionId;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("product")
    private final String product;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("state")
    @NotNull
    private final String state;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("description")
    @NotNull
    private final String description;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("name")
    private final String name;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("iconsUrl")
    private final j0 iconsUrl;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("exchangeDetails")
    private final h0 exchangeDetails;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("exchangedAmount")
    private final g0 exchangedAmount;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("originId")
    private final String originId;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @lg.b("originResource")
    private final String originResource;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @lg.b("receivedExchangeDetails")
    private final h0 receivedExchangeDetails;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @lg.b("earningDetails")
    private final h0 earningDetails;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCoreTransactionId() {
        return this.coreTransactionId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getCreatedDate() {
        return this.createdDate;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final h0 getEarningDetails() {
        return this.earningDetails;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final h0 getExchangeDetails() {
        return this.exchangeDetails;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj2;
        return Intrinsics.f(this.pointsTransactionId, f0Var.pointsTransactionId) && Intrinsics.f(this.type, f0Var.type) && Double.compare(this.points, f0Var.points) == 0 && this.createdDate == f0Var.createdDate && Intrinsics.f(this.coreTransactionId, f0Var.coreTransactionId) && Intrinsics.f(this.product, f0Var.product) && Intrinsics.f(this.state, f0Var.state) && Intrinsics.f(this.description, f0Var.description) && Intrinsics.f(this.name, f0Var.name) && Intrinsics.f(this.iconsUrl, f0Var.iconsUrl) && Intrinsics.f(this.exchangeDetails, f0Var.exchangeDetails) && Intrinsics.f(this.exchangedAmount, f0Var.exchangedAmount) && Intrinsics.f(this.originId, f0Var.originId) && Intrinsics.f(this.originResource, f0Var.originResource) && Intrinsics.f(this.receivedExchangeDetails, f0Var.receivedExchangeDetails) && Intrinsics.f(this.earningDetails, f0Var.earningDetails);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final g0 getExchangedAmount() {
        return this.exchangedAmount;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final j0 getIconsUrl() {
        return this.iconsUrl;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final int hashCode() {
        int iC = a0.d.c(m72.b.c(p.a.c(this.pointsTransactionId.hashCode() * 31, 31, this.type), this.points, 31), 31, this.createdDate);
        String str = this.coreTransactionId;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.product;
        int iC2 = p.a.c(p.a.c((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.state), 31, this.description);
        String str3 = this.name;
        int iHashCode2 = (iC2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        j0 j0Var = this.iconsUrl;
        int iHashCode3 = (iHashCode2 + (j0Var == null ? 0 : j0Var.hashCode())) * 31;
        h0 h0Var = this.exchangeDetails;
        int iHashCode4 = (iHashCode3 + (h0Var == null ? 0 : h0Var.hashCode())) * 31;
        g0 g0Var = this.exchangedAmount;
        int iHashCode5 = (iHashCode4 + (g0Var == null ? 0 : g0Var.hashCode())) * 31;
        String str4 = this.originId;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.originResource;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        h0 h0Var2 = this.receivedExchangeDetails;
        int iHashCode8 = (iHashCode7 + (h0Var2 == null ? 0 : h0Var2.hashCode())) * 31;
        h0 h0Var3 = this.earningDetails;
        return iHashCode8 + (h0Var3 != null ? h0Var3.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getOriginId() {
        return this.originId;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getOriginResource() {
        return this.originResource;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final double getPoints() {
        return this.points;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getPointsTransactionId() {
        return this.pointsTransactionId;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getProduct() {
        return this.product;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final h0 getReceivedExchangeDetails() {
        return this.receivedExchangeDetails;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final String getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final String getType() {
        return this.type;
    }
}
