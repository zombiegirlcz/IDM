package fdl;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lfdl/p2;", "Lfdl/g;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "n", "instrument", "b", "i", "ref", "c", "d", "stockExchangeCode", "Lfdl/q2;", "Lfdl/q2;", "f", "()Lfdl/q2;", "documents", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class p2 implements g {

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
    @lg.b("documents")
    private final q2 documents;

    @Override // fdl.g
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getStockExchangeCode() {
        return this.stockExchangeCode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p2)) {
            return false;
        }
        p2 p2Var = (p2) obj2;
        return Intrinsics.f(this.instrument, p2Var.instrument) && Intrinsics.f(this.ref, p2Var.ref) && Intrinsics.f(this.stockExchangeCode, p2Var.stockExchangeCode) && Intrinsics.f(this.documents, p2Var.documents);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final q2 getDocuments() {
        return this.documents;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.instrument.hashCode() * 31, 31, this.ref), 31, this.stockExchangeCode);
        q2 q2Var = this.documents;
        return iC + (q2Var == null ? 0 : q2Var.hashCode());
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
}
