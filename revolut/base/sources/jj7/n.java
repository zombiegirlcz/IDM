package jj7;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001a\u0010\u000e\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000f"}, d2 = {"Ljj7/n;", "", "", "toString", "()Ljava/lang/String;", "Ljj7/u;", "a", "Ljj7/u;", "()Ljj7/u;", "amounts", "", "b", "I", "()I", "coveragePercentage", "feature_insurance_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("amounts")
    @NotNull
    private final u amounts;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("coveragePercentage")
    private final int coveragePercentage;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final u getAmounts() {
        return this.amounts;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getCoveragePercentage() {
        return this.coveragePercentage;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.amounts, nVar.amounts) && this.coveragePercentage == nVar.coveragePercentage;
    }

    public final int hashCode() {
        return Integer.hashCode(this.coveragePercentage) + (this.amounts.hashCode() * 31);
    }
}
