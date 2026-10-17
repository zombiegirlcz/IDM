package iwi;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\f\u001a\u0004\b\u0005\u0010\r¨\u0006\u000f"}, d2 = {"Liwi/i;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "planId", "b", "passType", "Ljo3/b;", "Ljo3/b;", "()Ljo3/b;", "passPrice", "feature_retail_airport_lounges_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("planId")
    @NotNull
    private final String planId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("passType")
    @NotNull
    private final String passType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("passPrice")
    @NotNull
    private final jo3.b passPrice;

    public i(String planId, String passType, jo3.b passPrice) {
        Intrinsics.checkNotNullParameter(planId, "planId");
        Intrinsics.checkNotNullParameter(passType, "passType");
        Intrinsics.checkNotNullParameter(passPrice, "passPrice");
        this.planId = planId;
        this.passType = passType;
        this.passPrice = passPrice;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final jo3.b getPassPrice() {
        return this.passPrice;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getPassType() {
        return this.passType;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getPlanId() {
        return this.planId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.planId, iVar.planId) && Intrinsics.f(this.passType, iVar.passType) && Intrinsics.f(this.passPrice, iVar.passPrice);
    }

    public final int hashCode() {
        return this.passPrice.hashCode() + p.a.c(this.planId.hashCode() * 31, 31, this.passType);
    }
}
