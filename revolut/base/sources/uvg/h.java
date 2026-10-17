package uvg;

import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\r\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0013\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\t\u0010\u001bR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0006\u001a\u0004\b\u001e\u0010\u0004R\u001c\u0010#\u001a\u0004\u0018\u00010 8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010!\u001a\u0004\b\u000f\u0010\"R\u001c\u0010$\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0019\u0010\u0004R\u001c\u0010%\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u001d\u0010\u0004R\u001a\u0010'\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010\u0006\u001a\u0004\b&\u0010\u0004¨\u0006("}, d2 = {"Luvg/h;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "asset", "Ljo3/a;", "b", "Ljo3/a;", "d", "()Ljo3/a;", "pnl", "", "c", "F", "i", "()F", "returns", "Ljava/lang/Float;", "h", "()Ljava/lang/Float;", "returnOnInitialMargin", "Lorg/joda/time/LocalDate;", "e", "Lorg/joda/time/LocalDate;", "()Lorg/joda/time/LocalDate;", "closedOn", "f", "g", "ref", "Lko3/a;", "Lko3/a;", "()Lko3/a;", "openingPrice", "positionId", "quantity", "j", "typesParameter", "feature_wealth_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("asset")
    @NotNull
    private final String asset;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("pnl")
    @NotNull
    private final jo3.a pnl;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("returns")
    private final float returns;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("returnOnInitialMargin")
    private final Float returnOnInitialMargin;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("closedOn")
    private final LocalDate closedOn;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("ref")
    private final String ref;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("openingPrice")
    private final ko3.a openingPrice;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("positionId")
    private final String positionId;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("quantity")
    private final String quantity;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("typesParameter")
    @NotNull
    private final String typesParameter;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAsset() {
        return this.asset;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final LocalDate getClosedOn() {
        return this.closedOn;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final ko3.a getOpeningPrice() {
        return this.openingPrice;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final jo3.a getPnl() {
        return this.pnl;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getPositionId() {
        return this.positionId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.asset, hVar.asset) && Intrinsics.f(this.pnl, hVar.pnl) && Float.compare(this.returns, hVar.returns) == 0 && Intrinsics.f(this.returnOnInitialMargin, hVar.returnOnInitialMargin) && Intrinsics.f(this.closedOn, hVar.closedOn) && Intrinsics.f(this.ref, hVar.ref) && Intrinsics.f(this.openingPrice, hVar.openingPrice) && Intrinsics.f(this.positionId, hVar.positionId) && Intrinsics.f(this.quantity, hVar.quantity) && Intrinsics.f(this.typesParameter, hVar.typesParameter);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getQuantity() {
        return this.quantity;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getRef() {
        return this.ref;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final Float getReturnOnInitialMargin() {
        return this.returnOnInitialMargin;
    }

    public final int hashCode() {
        int iB = m72.b.b(this.returns, v7.j(this.pnl, this.asset.hashCode() * 31, 31), 31);
        Float f = this.returnOnInitialMargin;
        int iHashCode = (iB + (f == null ? 0 : f.hashCode())) * 31;
        LocalDate localDate = this.closedOn;
        int iHashCode2 = (iHashCode + (localDate == null ? 0 : localDate.hashCode())) * 31;
        String str = this.ref;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        ko3.a aVar = this.openingPrice;
        int iHashCode4 = (iHashCode3 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        String str2 = this.positionId;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.quantity;
        return this.typesParameter.hashCode() + ((iHashCode5 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final float getReturns() {
        return this.returns;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getTypesParameter() {
        return this.typesParameter;
    }
}
