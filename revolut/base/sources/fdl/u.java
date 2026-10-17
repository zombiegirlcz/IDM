package fdl;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001a\u0010\u0010\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u000f\u0010\u0004R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00118\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00168\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0005\u0010\u0019R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\"\u0010$\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001f8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\n\u0010!\u001a\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lfdl/u;", "Lfdl/z;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "n", "instrument", "b", "i", "ref", "c", "getDescription", "description", "d", "stockExchangeCode", "Lfdl/x;", "e", "Lfdl/x;", "()Lfdl/x;", "stats", "Lfdl/w;", "f", "Lfdl/w;", "()Lfdl/w;", "exposure", "g", "prospectusUrl", "h", "kidUrl", "", "Lfdl/a1;", "Ljava/util/List;", "p", "()Ljava/util/List;", "tags", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class u implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("instrument")
    @NotNull
    private final String instrument;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("ref")
    @NotNull
    private final String ref;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("description")
    private final String description;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("exchange")
    @NotNull
    private final String stockExchangeCode;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("stats")
    private final x stats;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("exposure")
    private final w exposure;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("prospectusUrl")
    private final String prospectusUrl;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("kidUrl")
    private final String kidUrl;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("tags")
    private final List<a1> tags;

    @Override // fdl.z
    /* JADX INFO: renamed from: a, reason: from getter */
    public final w getExposure() {
        return this.exposure;
    }

    @Override // fdl.z
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getProspectusUrl() {
        return this.prospectusUrl;
    }

    @Override // fdl.z
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getKidUrl() {
        return this.kidUrl;
    }

    @Override // fdl.g
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getStockExchangeCode() {
        return this.stockExchangeCode;
    }

    @Override // fdl.z
    /* JADX INFO: renamed from: e, reason: from getter */
    public final x getStats() {
        return this.stats;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return Intrinsics.f(this.instrument, uVar.instrument) && Intrinsics.f(this.ref, uVar.ref) && Intrinsics.f(this.description, uVar.description) && Intrinsics.f(this.stockExchangeCode, uVar.stockExchangeCode) && Intrinsics.f(this.stats, uVar.stats) && Intrinsics.f(this.exposure, uVar.exposure) && Intrinsics.f(this.prospectusUrl, uVar.prospectusUrl) && Intrinsics.f(this.kidUrl, uVar.kidUrl) && Intrinsics.f(this.tags, uVar.tags);
    }

    @Override // fdl.z
    public final String getDescription() {
        return this.description;
    }

    public final int hashCode() {
        int iC = p.a.c(this.instrument.hashCode() * 31, 31, this.ref);
        String str = this.description;
        int iC2 = p.a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.stockExchangeCode);
        x xVar = this.stats;
        int iHashCode = (iC2 + (xVar == null ? 0 : xVar.hashCode())) * 31;
        w wVar = this.exposure;
        int iHashCode2 = (iHashCode + (wVar == null ? 0 : wVar.hashCode())) * 31;
        String str2 = this.prospectusUrl;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.kidUrl;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<a1> list = this.tags;
        return iHashCode4 + (list != null ? list.hashCode() : 0);
    }

    @Override // fdl.g
    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getRef() {
        return this.ref;
    }

    @Override // fdl.g
    /* JADX INFO: renamed from: n, reason: from getter */
    public final String getInstrument() {
        return this.instrument;
    }

    @Override // fdl.z
    /* JADX INFO: renamed from: p, reason: from getter */
    public final List getTags() {
        return this.tags;
    }
}
