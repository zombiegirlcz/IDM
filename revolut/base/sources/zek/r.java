package zek;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\"\u0010\f\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\u000b\u0010\b¨\u0006\r"}, d2 = {"Lzek/r;", "", "", "toString", "()Ljava/lang/String;", "", "a", "Ljava/util/List;", "()Ljava/util/List;", "benefits", "Lzek/s;", "b", "plans", "feature_retail_pricing_plans_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("benefits")
    @NotNull
    private final List<String> benefits;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("plans")
    private final List<s> plans;

    public r(ArrayList benefits, ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(benefits, "benefits");
        this.benefits = benefits;
        this.plans = arrayList;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getBenefits() {
        return this.benefits;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getPlans() {
        return this.plans;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.benefits, rVar.benefits) && Intrinsics.f(this.plans, rVar.plans);
    }

    public final int hashCode() {
        int iHashCode = this.benefits.hashCode() * 31;
        List<s> list = this.plans;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }
}
