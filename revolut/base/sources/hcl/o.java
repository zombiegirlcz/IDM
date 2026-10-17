package hcl;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\tR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u000f\u001a\u0004\b\u000b\u0010\u0011R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000f\u001a\u0004\b\u0006\u0010\u0011R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011¨\u0006\u0017"}, d2 = {"Lhcl/o;", "", "", "toString", "()Ljava/lang/String;", "Ljo3/b;", "a", "Ljo3/b;", "e", "()Ljo3/b;", "totalAssets", "b", "c", "nav", "", "Ljava/lang/Double;", "d", "()Ljava/lang/Double;", "netExpenseRatio", "dividendYield", "beta", "f", "totalExpenseRatio", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("totalAssets")
    private final jo3.b totalAssets;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("nav")
    private final jo3.b nav;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("netExpenseRatio")
    private final Double netExpenseRatio;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("dividendYield")
    private final Double dividendYield;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("beta")
    private final Double beta;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("totalExpenseRatio")
    private final Double totalExpenseRatio;

    public o(jo3.b bVar, jo3.b bVar2, Double d, Double d5, Double d6, Double d10) {
        this.totalAssets = bVar;
        this.nav = bVar2;
        this.netExpenseRatio = d;
        this.dividendYield = d5;
        this.beta = d6;
        this.totalExpenseRatio = d10;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Double getBeta() {
        return this.beta;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Double getDividendYield() {
        return this.dividendYield;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final jo3.b getNav() {
        return this.nav;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Double getNetExpenseRatio() {
        return this.netExpenseRatio;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final jo3.b getTotalAssets() {
        return this.totalAssets;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.totalAssets, oVar.totalAssets) && Intrinsics.f(this.nav, oVar.nav) && Intrinsics.f(this.netExpenseRatio, oVar.netExpenseRatio) && Intrinsics.f(this.dividendYield, oVar.dividendYield) && Intrinsics.f(this.beta, oVar.beta) && Intrinsics.f(this.totalExpenseRatio, oVar.totalExpenseRatio);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Double getTotalExpenseRatio() {
        return this.totalExpenseRatio;
    }

    public final int hashCode() {
        jo3.b bVar = this.totalAssets;
        int iHashCode = (bVar == null ? 0 : bVar.hashCode()) * 31;
        jo3.b bVar2 = this.nav;
        int iHashCode2 = (iHashCode + (bVar2 == null ? 0 : bVar2.hashCode())) * 31;
        Double d = this.netExpenseRatio;
        int iHashCode3 = (iHashCode2 + (d == null ? 0 : d.hashCode())) * 31;
        Double d5 = this.dividendYield;
        int iHashCode4 = (iHashCode3 + (d5 == null ? 0 : d5.hashCode())) * 31;
        Double d6 = this.beta;
        int iHashCode5 = (iHashCode4 + (d6 == null ? 0 : d6.hashCode())) * 31;
        Double d10 = this.totalExpenseRatio;
        return iHashCode5 + (d10 != null ? d10.hashCode() : 0);
    }
}
