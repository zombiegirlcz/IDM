package zcj;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0007\u001a\u0004\b\u000f\u0010\bR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u0011\u0010\rR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0007\u001a\u0004\b\u0018\u0010\b¨\u0006\u001a"}, d2 = {"Lzcj/g;", "", "", "toString", "()Ljava/lang/String;", "Ljo3/b;", "a", "Ljo3/b;", "()Ljo3/b;", "allTimeHigh", "", "b", "Ljava/lang/Long;", "()Ljava/lang/Long;", "circulatingSupply", "c", "marketCap", "d", "maxSupply", "", "e", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "popularity", "f", "volume24Hour", "feature_cryptocommodity_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("allTimeHigh")
    private final jo3.b allTimeHigh;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("circulatingSupply")
    private final Long circulatingSupply;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("marketCap")
    private final jo3.b marketCap;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("maxSupply")
    private final Long maxSupply;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("popularity")
    private final Integer popularity;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("volume24Hour")
    private final jo3.b volume24Hour;

    public g(jo3.b bVar, Long l2, jo3.b bVar2, Long l3, Integer num, jo3.b bVar3) {
        this.allTimeHigh = bVar;
        this.circulatingSupply = l2;
        this.marketCap = bVar2;
        this.maxSupply = l3;
        this.popularity = num;
        this.volume24Hour = bVar3;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final jo3.b getAllTimeHigh() {
        return this.allTimeHigh;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Long getCirculatingSupply() {
        return this.circulatingSupply;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final jo3.b getMarketCap() {
        return this.marketCap;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Long getMaxSupply() {
        return this.maxSupply;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Integer getPopularity() {
        return this.popularity;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.allTimeHigh, gVar.allTimeHigh) && Intrinsics.f(this.circulatingSupply, gVar.circulatingSupply) && Intrinsics.f(this.marketCap, gVar.marketCap) && Intrinsics.f(this.maxSupply, gVar.maxSupply) && Intrinsics.f(this.popularity, gVar.popularity) && Intrinsics.f(this.volume24Hour, gVar.volume24Hour);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final jo3.b getVolume24Hour() {
        return this.volume24Hour;
    }

    public final int hashCode() {
        jo3.b bVar = this.allTimeHigh;
        int iHashCode = (bVar == null ? 0 : bVar.hashCode()) * 31;
        Long l2 = this.circulatingSupply;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        jo3.b bVar2 = this.marketCap;
        int iHashCode3 = (iHashCode2 + (bVar2 == null ? 0 : bVar2.hashCode())) * 31;
        Long l3 = this.maxSupply;
        int iHashCode4 = (iHashCode3 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Integer num = this.popularity;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        jo3.b bVar3 = this.volume24Hour;
        return iHashCode5 + (bVar3 != null ? bVar3.hashCode() : 0);
    }
}
