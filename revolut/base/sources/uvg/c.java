package uvg;

import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u000b\u0010\u0004R\u001a\u0010\u0012\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0017\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0005\u0010\u0016R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0006\u001a\u0004\b\u0019\u0010\u0004R\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0018\u0010\u001eR\u001c\u0010 \u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001d\u001a\u0004\b\u000e\u0010\u001eR\u001c\u0010!\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0006\u001a\u0004\b\u001c\u0010\u0004R\u001c\u0010\"\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0014\u0010\u0004¨\u0006#"}, d2 = {"Luvg/c;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "assetType", "b", "asset", "h", "quantity", "Ljo3/a;", "d", "Ljo3/a;", "j", "()Ljo3/a;", "value", "", "e", "F", "()F", "allocation", "f", "i", "ref", "Lko3/a;", "g", "Lko3/a;", "()Lko3/a;", "openingPrice", "currentPrice", "positionId", "leverage", "feature_wealth_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("typesParameter")
    @NotNull
    private final String assetType;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("asset")
    @NotNull
    private final String asset;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("quantity")
    private final String quantity;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("value")
    @NotNull
    private final jo3.a value;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("allocation")
    private final float allocation;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("ref")
    private final String ref;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("openingPrice")
    private final ko3.a openingPrice;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("currentPrice")
    private final ko3.a currentPrice;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("positionId")
    private final String positionId;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("leverage")
    private final String leverage;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final float getAllocation() {
        return this.allocation;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getAsset() {
        return this.asset;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getAssetType() {
        return this.assetType;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final ko3.a getCurrentPrice() {
        return this.currentPrice;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getLeverage() {
        return this.leverage;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.assetType, cVar.assetType) && Intrinsics.f(this.asset, cVar.asset) && Intrinsics.f(this.quantity, cVar.quantity) && Intrinsics.f(this.value, cVar.value) && Float.compare(this.allocation, cVar.allocation) == 0 && Intrinsics.f(this.ref, cVar.ref) && Intrinsics.f(this.openingPrice, cVar.openingPrice) && Intrinsics.f(this.currentPrice, cVar.currentPrice) && Intrinsics.f(this.positionId, cVar.positionId) && Intrinsics.f(this.leverage, cVar.leverage);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final ko3.a getOpeningPrice() {
        return this.openingPrice;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getPositionId() {
        return this.positionId;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getQuantity() {
        return this.quantity;
    }

    public final int hashCode() {
        int iC = p.a.c(this.assetType.hashCode() * 31, 31, this.asset);
        String str = this.quantity;
        int iB = m72.b.b(this.allocation, v7.j(this.value, (iC + (str == null ? 0 : str.hashCode())) * 31, 31), 31);
        String str2 = this.ref;
        int iHashCode = (iB + (str2 == null ? 0 : str2.hashCode())) * 31;
        ko3.a aVar = this.openingPrice;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        ko3.a aVar2 = this.currentPrice;
        int iHashCode3 = (iHashCode2 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        String str3 = this.positionId;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.leverage;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getRef() {
        return this.ref;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final jo3.a getValue() {
        return this.value;
    }
}
