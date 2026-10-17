package hcl;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u000b\u0010\u0014¨\u0006\u0016"}, d2 = {"Lhcl/s2;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "e", "ref", "b", "fullName", "c", "description", "Ljo3/b;", "d", "Ljo3/b;", "()Ljo3/b;", "priceTargetMean", "Lko3/b;", "Lko3/b;", "()Lko3/b;", "initialBuyPrice", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class s2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("ref")
    @NotNull
    private final String ref;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("full_name")
    @NotNull
    private final String fullName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("description")
    private final String description;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("price_target_mean")
    private final jo3.b priceTargetMean;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("initial_buy_price")
    private final ko3.b initialBuyPrice;

    public s2(String ref2, String fullName, String str, jo3.b bVar, ko3.b bVar2) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(fullName, "fullName");
        this.ref = ref2;
        this.fullName = fullName;
        this.description = str;
        this.priceTargetMean = bVar;
        this.initialBuyPrice = bVar2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getFullName() {
        return this.fullName;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final ko3.b getInitialBuyPrice() {
        return this.initialBuyPrice;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final jo3.b getPriceTargetMean() {
        return this.priceTargetMean;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getRef() {
        return this.ref;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s2)) {
            return false;
        }
        s2 s2Var = (s2) obj2;
        return Intrinsics.f(this.ref, s2Var.ref) && Intrinsics.f(this.fullName, s2Var.fullName) && Intrinsics.f(this.description, s2Var.description) && Intrinsics.f(this.priceTargetMean, s2Var.priceTargetMean) && Intrinsics.f(this.initialBuyPrice, s2Var.initialBuyPrice);
    }

    public final int hashCode() {
        int iC = p.a.c(this.ref.hashCode() * 31, 31, this.fullName);
        String str = this.description;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        jo3.b bVar = this.priceTargetMean;
        int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        ko3.b bVar2 = this.initialBuyPrice;
        return iHashCode2 + (bVar2 != null ? bVar2.hashCode() : 0);
    }
}
