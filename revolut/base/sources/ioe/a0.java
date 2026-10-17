package ioe;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u0006\u0010\u000eR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\f\u0010\u0012¨\u0006\u0014"}, d2 = {"Lioe/a0;", "", "", "toString", "()Ljava/lang/String;", "Lioe/g;", "a", "Lioe/g;", "c", "()Lioe/g;", "fatca", "Lioe/c;", "b", "Lioe/c;", "()Lioe/c;", "crs", "Lioe/e;", "Lioe/e;", "()Lioe/e;", "directTin", "feature_tax_residency_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("fatca")
    private final g fatca;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("crs")
    private final c crs;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("directTin")
    private final e directTin;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final c getCrs() {
        return this.crs;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final e getDirectTin() {
        return this.directTin;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final g getFatca() {
        return this.fatca;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj2;
        return Intrinsics.f(this.fatca, a0Var.fatca) && Intrinsics.f(this.crs, a0Var.crs) && Intrinsics.f(this.directTin, a0Var.directTin);
    }

    public final int hashCode() {
        g gVar = this.fatca;
        int iHashCode = (gVar == null ? 0 : gVar.hashCode()) * 31;
        c cVar = this.crs;
        int iHashCode2 = (iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31;
        e eVar = this.directTin;
        return iHashCode2 + (eVar != null ? eVar.hashCode() : 0);
    }
}
