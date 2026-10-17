package hcl;

import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\u0004¨\u0006\r"}, d2 = {"Lhcl/o2;", "", "", "toString", "()Ljava/lang/String;", "Ljava/math/BigDecimal;", "a", "Ljava/math/BigDecimal;", "()Ljava/math/BigDecimal;", "expectedReturn", "b", "Ljava/lang/String;", "fullName", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class o2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("expected_return")
    @NotNull
    private final BigDecimal expectedReturn;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("full_name")
    @NotNull
    private final String fullName;

    public o2(String fullName, BigDecimal expectedReturn) {
        Intrinsics.checkNotNullParameter(expectedReturn, "expectedReturn");
        Intrinsics.checkNotNullParameter(fullName, "fullName");
        this.expectedReturn = expectedReturn;
        this.fullName = fullName;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final BigDecimal getExpectedReturn() {
        return this.expectedReturn;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getFullName() {
        return this.fullName;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o2)) {
            return false;
        }
        o2 o2Var = (o2) obj2;
        return Intrinsics.f(this.expectedReturn, o2Var.expectedReturn) && Intrinsics.f(this.fullName, o2Var.fullName);
    }

    public final int hashCode() {
        return this.fullName.hashCode() + (this.expectedReturn.hashCode() * 31);
    }
}
