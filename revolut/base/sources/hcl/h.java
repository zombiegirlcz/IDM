package hcl;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\f\u001a\u0004\b\u0006\u0010\rR\u001a\u0010\u0013\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0014"}, d2 = {"Lhcl/h;", "", "", "toString", "()Ljava/lang/String;", "", "a", "I", "b", "()I", "version", "Lmcl/a;", "Lmcl/a;", "()Lmcl/a;", "fitch", "", "c", "Z", "()Z", "isHighYield", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("version")
    private final int version;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("fitch")
    private final mcl.a fitch;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("isHighYield")
    private final boolean isHighYield;

    public h(int i, mcl.a aVar, boolean z) {
        this.version = i;
        this.fitch = aVar;
        this.isHighYield = z;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final mcl.a getFitch() {
        return this.fitch;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getVersion() {
        return this.version;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getIsHighYield() {
        return this.isHighYield;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.version == hVar.version && Intrinsics.f(this.fitch, hVar.fitch) && this.isHighYield == hVar.isHighYield;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.version) * 31;
        mcl.a aVar = this.fitch;
        return Boolean.hashCode(this.isHighYield) + ((iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31);
    }
}
