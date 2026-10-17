package bjk;

import bjk.g2;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\"\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\r\u001a\u0004\b\u0006\u0010\u000eR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0015"}, d2 = {"Lbjk/q0;", "", "", "toString", "()Ljava/lang/String;", "Lbjk/g2$d$s;", "a", "Lbjk/g2$d$s;", "b", "()Lbjk/g2$d$s;", "highlightedBenefits", "", "Lbjk/g2$d$c;", "Ljava/util/List;", "()Ljava/util/List;", "benefitCategories", "Lbjk/g2$d$u;", "c", "Lbjk/g2$d$u;", "()Lbjk/g2$d$u;", "perks", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("highlightedBenefits")
    private final g2.d.s highlightedBenefits;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("benefitCategories")
    private final List<g2.d.c> benefitCategories;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("perks")
    private final g2.d.u perks;

    public q0(g2.d.s sVar, ArrayList arrayList, g2.d.u uVar) {
        this.highlightedBenefits = sVar;
        this.benefitCategories = arrayList;
        this.perks = uVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getBenefitCategories() {
        return this.benefitCategories;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final g2.d.s getHighlightedBenefits() {
        return this.highlightedBenefits;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final g2.d.u getPerks() {
        return this.perks;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj2;
        return Intrinsics.f(this.highlightedBenefits, q0Var.highlightedBenefits) && Intrinsics.f(this.benefitCategories, q0Var.benefitCategories) && Intrinsics.f(this.perks, q0Var.perks);
    }

    public final int hashCode() {
        g2.d.s sVar = this.highlightedBenefits;
        int iHashCode = (sVar == null ? 0 : sVar.hashCode()) * 31;
        List<g2.d.c> list = this.benefitCategories;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        g2.d.u uVar = this.perks;
        return iHashCode2 + (uVar != null ? uVar.hashCode() : 0);
    }
}
