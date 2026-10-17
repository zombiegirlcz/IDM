package bjk;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\"\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\b\u001a\u0004\b\r\u0010\nR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0010\u001a\u0004\b\u0007\u0010\u0011R\"\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\b\u001a\u0004\b\u0014\u0010\nR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0016\u001a\u0004\b\f\u0010\u0004¨\u0006\u0018"}, d2 = {"Lbjk/r0;", "", "", "toString", "()Ljava/lang/String;", "", "Lbjk/s0;", "a", "Ljava/util/List;", "e", "()Ljava/util/List;", "sections", "b", "c", "cards", "Lbjk/q0;", "Lbjk/q0;", "()Lbjk/q0;", "benefitsLayout", "Lbjk/m0;", "d", "insuranceBenefits", "Ljava/lang/String;", "cardTerminationReason", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("sections")
    private final List<s0> sections;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("cards")
    private final List<String> cards;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("planBenefitsLayout")
    private final q0 benefitsLayout;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("insurance")
    private final List<m0> insuranceBenefits;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("cardTerminationReason")
    private final String cardTerminationReason;

    public r0(ArrayList arrayList, List list, q0 q0Var, ArrayList arrayList2, String str) {
        this.sections = arrayList;
        this.cards = list;
        this.benefitsLayout = q0Var;
        this.insuranceBenefits = arrayList2;
        this.cardTerminationReason = str;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final q0 getBenefitsLayout() {
        return this.benefitsLayout;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCardTerminationReason() {
        return this.cardTerminationReason;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final List getCards() {
        return this.cards;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final List getInsuranceBenefits() {
        return this.insuranceBenefits;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final List getSections() {
        return this.sections;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj2;
        return Intrinsics.f(this.sections, r0Var.sections) && Intrinsics.f(this.cards, r0Var.cards) && Intrinsics.f(this.benefitsLayout, r0Var.benefitsLayout) && Intrinsics.f(this.insuranceBenefits, r0Var.insuranceBenefits) && Intrinsics.f(this.cardTerminationReason, r0Var.cardTerminationReason);
    }

    public final int hashCode() {
        List<s0> list = this.sections;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<String> list2 = this.cards;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        q0 q0Var = this.benefitsLayout;
        int iHashCode3 = (iHashCode2 + (q0Var == null ? 0 : q0Var.hashCode())) * 31;
        List<m0> list3 = this.insuranceBenefits;
        int iHashCode4 = (iHashCode3 + (list3 == null ? 0 : list3.hashCode())) * 31;
        String str = this.cardTerminationReason;
        return iHashCode4 + (str != null ? str.hashCode() : 0);
    }
}
