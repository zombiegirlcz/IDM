package dj9;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u0006\u0010\u0004R\u001a\u0010\u0012\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0014\u001a\u0004\b\u000b\u0010\u0015¨\u0006\u0017"}, d2 = {"Ldj9/w;", "Ldj9/y;", "", "toString", "()Ljava/lang/String;", "", "a", "I", "c", "()I", "term", "b", "Ljava/lang/String;", "blockReason", "Ldj9/v;", "Ldj9/v;", "d", "()Ldj9/v;", "termDetails", "Ldj9/r;", "Ldj9/r;", "()Ldj9/r;", "purchaseSimulation", "feature_pay_later_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class w implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("term")
    private final int term;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("blockReason")
    private final String blockReason;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("termDetails")
    @NotNull
    private final v termDetails;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("purchaseSimulation")
    private final r purchaseSimulation;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getBlockReason() {
        return this.blockReason;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final r getPurchaseSimulation() {
        return this.purchaseSimulation;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getTerm() {
        return this.term;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final v getTermDetails() {
        return this.termDetails;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w)) {
            return false;
        }
        w wVar = (w) obj2;
        return this.term == wVar.term && Intrinsics.f(this.blockReason, wVar.blockReason) && Intrinsics.f(this.termDetails, wVar.termDetails) && Intrinsics.f(this.purchaseSimulation, wVar.purchaseSimulation);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.term) * 31;
        String str = this.blockReason;
        int iHashCode2 = (this.termDetails.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        r rVar = this.purchaseSimulation;
        return iHashCode2 + (rVar != null ? rVar.hashCode() : 0);
    }
}
