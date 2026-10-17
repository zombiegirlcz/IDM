package fdl;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010$\u001a\u0004\u0018\u00010 8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010#R\u001c\u0010*\u001a\u0004\u0018\u00010%8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001c\u0010.\u001a\u0004\u0018\u00010+8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010,\u001a\u0004\b&\u0010-R\u001c\u00102\u001a\u0004\u0018\u00010/8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u00100\u001a\u0004\b\u001b\u00101¨\u00063"}, d2 = {"Lfdl/e0;", "Lfdl/g;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "n", "instrument", "b", "i", "ref", "c", "d", "stockExchangeCode", "Lfdl/h0;", "Lfdl/h0;", "j", "()Lfdl/h0;", "fundHouse", "Lfdl/j0;", "e", "Lfdl/j0;", "k", "()Lfdl/j0;", "fundManager", "Lfdl/k0;", "f", "Lfdl/k0;", "m", "()Lfdl/k0;", "performance", "Lfdl/f0;", "g", "Lfdl/f0;", "()Lfdl/f0;", "documents", "Lfdl/i0;", "h", "Lfdl/i0;", "l", "()Lfdl/i0;", "keyDetails", "Lfdl/g0;", "Lfdl/g0;", "()Lfdl/g0;", "exposure", "Lfdl/d0;", "Lfdl/d0;", "()Lfdl/d0;", "concentration", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class e0 implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("instrument")
    @NotNull
    private final String instrument;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("ref")
    @NotNull
    private final String ref;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("exchange")
    @NotNull
    private final String stockExchangeCode;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("fundHouse")
    private final h0 fundHouse;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("fundManager")
    private final j0 fundManager;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("performance")
    private final k0 performance;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("documents")
    private final f0 documents;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("keyDetails")
    private final i0 keyDetails;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("exposure")
    private final g0 exposure;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("concentration")
    private final d0 concentration;

    @Override // fdl.g
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getStockExchangeCode() {
        return this.stockExchangeCode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj2;
        return Intrinsics.f(this.instrument, e0Var.instrument) && Intrinsics.f(this.ref, e0Var.ref) && Intrinsics.f(this.stockExchangeCode, e0Var.stockExchangeCode) && Intrinsics.f(this.fundHouse, e0Var.fundHouse) && Intrinsics.f(this.fundManager, e0Var.fundManager) && Intrinsics.f(this.performance, e0Var.performance) && Intrinsics.f(this.documents, e0Var.documents) && Intrinsics.f(this.keyDetails, e0Var.keyDetails) && Intrinsics.f(this.exposure, e0Var.exposure) && Intrinsics.f(this.concentration, e0Var.concentration);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final d0 getConcentration() {
        return this.concentration;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final f0 getDocuments() {
        return this.documents;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final g0 getExposure() {
        return this.exposure;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.instrument.hashCode() * 31, 31, this.ref), 31, this.stockExchangeCode);
        h0 h0Var = this.fundHouse;
        int iHashCode = (iC + (h0Var == null ? 0 : h0Var.hashCode())) * 31;
        j0 j0Var = this.fundManager;
        int iHashCode2 = (iHashCode + (j0Var == null ? 0 : j0Var.hashCode())) * 31;
        k0 k0Var = this.performance;
        int iHashCode3 = (iHashCode2 + (k0Var == null ? 0 : k0Var.hashCode())) * 31;
        f0 f0Var = this.documents;
        int iHashCode4 = (iHashCode3 + (f0Var == null ? 0 : f0Var.hashCode())) * 31;
        i0 i0Var = this.keyDetails;
        int iHashCode5 = (iHashCode4 + (i0Var == null ? 0 : i0Var.hashCode())) * 31;
        g0 g0Var = this.exposure;
        int iHashCode6 = (iHashCode5 + (g0Var == null ? 0 : g0Var.hashCode())) * 31;
        d0 d0Var = this.concentration;
        return iHashCode6 + (d0Var != null ? d0Var.hashCode() : 0);
    }

    @Override // fdl.g
    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getRef() {
        return this.ref;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final h0 getFundHouse() {
        return this.fundHouse;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final j0 getFundManager() {
        return this.fundManager;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final i0 getKeyDetails() {
        return this.keyDetails;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final k0 getPerformance() {
        return this.performance;
    }

    @Override // fdl.g
    /* JADX INFO: renamed from: n, reason: from getter */
    public final String getInstrument() {
        return this.instrument;
    }
}
