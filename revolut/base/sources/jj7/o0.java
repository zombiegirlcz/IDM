package jj7;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000b¨\u0006\r"}, d2 = {"Ljj7/o0;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "claimId", "", "b", "Ljava/util/List;", "()Ljava/util/List;", "expenseIds", "feature_insurance_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("claimId")
    @NotNull
    private final String claimId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("expenseIds")
    @NotNull
    private final List<String> expenseIds;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getClaimId() {
        return this.claimId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getExpenseIds() {
        return this.expenseIds;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj2;
        return Intrinsics.f(this.claimId, o0Var.claimId) && Intrinsics.f(this.expenseIds, o0Var.expenseIds);
    }

    public final int hashCode() {
        return this.expenseIds.hashCode() + (this.claimId.hashCode() * 31);
    }
}
