package bjk;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\f\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u0005\u0010\u000b¨\u0006\r"}, d2 = {"Lbjk/k3;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "token", "Lbjk/j3;", "Lbjk/j3;", "()Lbjk/j3;", "planDiscount", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class k3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("token")
    @NotNull
    private final String token;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("planDiscount")
    private final j3 planDiscount;

    public k3(String token, j3 j3Var) {
        Intrinsics.checkNotNullParameter(token, "token");
        this.token = token;
        this.planDiscount = j3Var;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final j3 getPlanDiscount() {
        return this.planDiscount;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k3)) {
            return false;
        }
        k3 k3Var = (k3) obj2;
        return Intrinsics.f(this.token, k3Var.token) && Intrinsics.f(this.planDiscount, k3Var.planDiscount);
    }

    public final int hashCode() {
        int iHashCode = this.token.hashCode() * 31;
        j3 j3Var = this.planDiscount;
        return iHashCode + (j3Var == null ? 0 : j3Var.hashCode());
    }
}
