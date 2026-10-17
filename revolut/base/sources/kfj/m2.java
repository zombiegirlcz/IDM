package kfj;

import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0014\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lkfj/m2;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getToken", "token", "Ljo3/a;", "b", "Ljo3/a;", "getOriginalPrice", "()Ljo3/a;", "originalPrice", "Lkfj/t0;", "c", "Lkfj/t0;", "getPointsOption", "()Lkfj/t0;", "pointsOption", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class m2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("token")
    @NotNull
    private final String token;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("originalPrice")
    @NotNull
    private final jo3.a originalPrice;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("pointsOption")
    @NotNull
    private final t0 pointsOption;

    public m2(String token, jo3.a originalPrice, t0 pointsOption) {
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(originalPrice, "originalPrice");
        Intrinsics.checkNotNullParameter(pointsOption, "pointsOption");
        this.token = token;
        this.originalPrice = originalPrice;
        this.pointsOption = pointsOption;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m2)) {
            return false;
        }
        m2 m2Var = (m2) obj2;
        return Intrinsics.f(this.token, m2Var.token) && Intrinsics.f(this.originalPrice, m2Var.originalPrice) && Intrinsics.f(this.pointsOption, m2Var.pointsOption);
    }

    public final int hashCode() {
        return this.pointsOption.hashCode() + v7.j(this.originalPrice, this.token.hashCode() * 31, 31);
    }
}
