package fdl;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004R\u001a\u0010\u0013\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u000f\u0010\u0004R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0006\u001a\u0004\b\u001e\u0010\u0004R\"\u0010%\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010 8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\"\u001a\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lfdl/t0;", "Lfdl/g;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "n", "instrument", "b", "i", "ref", "c", "g", "sector", "d", "getDescription", "description", "e", "stockExchangeCode", "Lfdl/d;", "f", "Lfdl/d;", "()Lfdl/d;", "analystsSummary", "Lfdl/y0;", "Lfdl/y0;", "h", "()Lfdl/y0;", "stats", "j", "type", "", "Lfdl/a1;", "Ljava/util/List;", "p", "()Ljava/util/List;", "tags", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class t0 implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("instrument")
    @NotNull
    private final String instrument;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("ref")
    @NotNull
    private final String ref;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("sector")
    private final String sector;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("description")
    private final String description;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("exchange")
    @NotNull
    private final String stockExchangeCode;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("analystsSummary")
    private final d analystsSummary;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("stats")
    private final y0 stats;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("type")
    private final String type;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("tags")
    private final List<a1> tags;

    @Override // fdl.g
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getStockExchangeCode() {
        return this.stockExchangeCode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj2;
        return Intrinsics.f(this.instrument, t0Var.instrument) && Intrinsics.f(this.ref, t0Var.ref) && Intrinsics.f(this.sector, t0Var.sector) && Intrinsics.f(this.description, t0Var.description) && Intrinsics.f(this.stockExchangeCode, t0Var.stockExchangeCode) && Intrinsics.f(this.analystsSummary, t0Var.analystsSummary) && Intrinsics.f(this.stats, t0Var.stats) && Intrinsics.f(this.type, t0Var.type) && Intrinsics.f(this.tags, t0Var.tags);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final d getAnalystsSummary() {
        return this.analystsSummary;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getSector() {
        return this.sector;
    }

    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final y0 getStats() {
        return this.stats;
    }

    public final int hashCode() {
        int iC = p.a.c(this.instrument.hashCode() * 31, 31, this.ref);
        String str = this.sector;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.description;
        int iC2 = p.a.c((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.stockExchangeCode);
        d dVar = this.analystsSummary;
        int iHashCode2 = (iC2 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        y0 y0Var = this.stats;
        int iHashCode3 = (iHashCode2 + (y0Var == null ? 0 : y0Var.hashCode())) * 31;
        String str3 = this.type;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<a1> list = this.tags;
        return iHashCode4 + (list != null ? list.hashCode() : 0);
    }

    @Override // fdl.g
    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getRef() {
        return this.ref;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @Override // fdl.g
    /* JADX INFO: renamed from: n, reason: from getter */
    public final String getInstrument() {
        return this.instrument;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final List getTags() {
        return this.tags;
    }
}
