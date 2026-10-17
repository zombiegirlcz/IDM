package hcl;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0010\n\u0002\u0010\t\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u000f\u0010\rR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0007\u001a\u0004\b\u0011\u0010\bR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0007\u001a\u0004\b\u0013\u0010\bR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0007\u001a\u0004\b\u0015\u0010\bR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\f\u001a\u0004\b\u0017\u0010\rR\u001c\u0010\u001a\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\f\u001a\u0004\b\u0019\u0010\rR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001e¨\u0006 "}, d2 = {"Lhcl/o0;", "", "", "toString", "()Ljava/lang/String;", "Ljo3/b;", "a", "Ljo3/b;", "()Ljo3/b;", "averageVolume", "", "b", "Ljava/lang/Double;", "()Ljava/lang/Double;", "beta", "c", "dividendYield", "d", "earningsPerShare", "e", "earningsPerShareTtm", "f", "marketCap", "g", "priceToEarningsRatio", "h", "priceToEarningsRatioTtm", "", "i", "Ljava/lang/Long;", "()Ljava/lang/Long;", "unitAverageVolume", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("averageVolume")
    private final jo3.b averageVolume;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("beta")
    private final Double beta;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("dividendYield")
    private final Double dividendYield;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("earningsPerShare")
    private final jo3.b earningsPerShare;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("earningsPerShareTtm")
    private final jo3.b earningsPerShareTtm;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("marketCap")
    private final jo3.b marketCap;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("priceToEarningsRatio")
    private final Double priceToEarningsRatio;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("priceToEarningsRatioTtm")
    private final Double priceToEarningsRatioTtm;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("unitAverageVolume")
    private final Long unitAverageVolume;

    public o0(jo3.b bVar, Double d, Double d5, jo3.b bVar2, jo3.b bVar3, jo3.b bVar4, Double d6, Double d10, Long l2) {
        this.averageVolume = bVar;
        this.beta = d;
        this.dividendYield = d5;
        this.earningsPerShare = bVar2;
        this.earningsPerShareTtm = bVar3;
        this.marketCap = bVar4;
        this.priceToEarningsRatio = d6;
        this.priceToEarningsRatioTtm = d10;
        this.unitAverageVolume = l2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final jo3.b getAverageVolume() {
        return this.averageVolume;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Double getBeta() {
        return this.beta;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Double getDividendYield() {
        return this.dividendYield;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final jo3.b getEarningsPerShare() {
        return this.earningsPerShare;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final jo3.b getEarningsPerShareTtm() {
        return this.earningsPerShareTtm;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj2;
        return Intrinsics.f(this.averageVolume, o0Var.averageVolume) && Intrinsics.f(this.beta, o0Var.beta) && Intrinsics.f(this.dividendYield, o0Var.dividendYield) && Intrinsics.f(this.earningsPerShare, o0Var.earningsPerShare) && Intrinsics.f(this.earningsPerShareTtm, o0Var.earningsPerShareTtm) && Intrinsics.f(this.marketCap, o0Var.marketCap) && Intrinsics.f(this.priceToEarningsRatio, o0Var.priceToEarningsRatio) && Intrinsics.f(this.priceToEarningsRatioTtm, o0Var.priceToEarningsRatioTtm) && Intrinsics.f(this.unitAverageVolume, o0Var.unitAverageVolume);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final jo3.b getMarketCap() {
        return this.marketCap;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Double getPriceToEarningsRatio() {
        return this.priceToEarningsRatio;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final Double getPriceToEarningsRatioTtm() {
        return this.priceToEarningsRatioTtm;
    }

    public final int hashCode() {
        jo3.b bVar = this.averageVolume;
        int iHashCode = (bVar == null ? 0 : bVar.hashCode()) * 31;
        Double d = this.beta;
        int iHashCode2 = (iHashCode + (d == null ? 0 : d.hashCode())) * 31;
        Double d5 = this.dividendYield;
        int iHashCode3 = (iHashCode2 + (d5 == null ? 0 : d5.hashCode())) * 31;
        jo3.b bVar2 = this.earningsPerShare;
        int iHashCode4 = (iHashCode3 + (bVar2 == null ? 0 : bVar2.hashCode())) * 31;
        jo3.b bVar3 = this.earningsPerShareTtm;
        int iHashCode5 = (iHashCode4 + (bVar3 == null ? 0 : bVar3.hashCode())) * 31;
        jo3.b bVar4 = this.marketCap;
        int iHashCode6 = (iHashCode5 + (bVar4 == null ? 0 : bVar4.hashCode())) * 31;
        Double d6 = this.priceToEarningsRatio;
        int iHashCode7 = (iHashCode6 + (d6 == null ? 0 : d6.hashCode())) * 31;
        Double d10 = this.priceToEarningsRatioTtm;
        int iHashCode8 = (iHashCode7 + (d10 == null ? 0 : d10.hashCode())) * 31;
        Long l2 = this.unitAverageVolume;
        return iHashCode8 + (l2 != null ? l2.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final Long getUnitAverageVolume() {
        return this.unitAverageVolume;
    }
}
