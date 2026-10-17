package k91;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\u000b\u0010\u0004R\u001a\u0010\u0010\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u000e\u001a\u0004\b\u0005\u0010\u000f¨\u0006\u0011"}, d2 = {"Lk91/p;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "createdDate", "d", "estimatedCompletionDate", "c", "estimatedClosureDate", "", "Z", "()Z", "canAddPayments", "retail_feature_account_switching_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("createdDate")
    @NotNull
    private final String createdDate;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("estimatedCompletionDate")
    @NotNull
    private final String estimatedCompletionDate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("estimatedClosureDate")
    @NotNull
    private final String estimatedClosureDate;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("canAddPayments")
    private final boolean canAddPayments;

    public p(String createdDate, String estimatedCompletionDate, String estimatedClosureDate, boolean z) {
        Intrinsics.checkNotNullParameter(createdDate, "createdDate");
        Intrinsics.checkNotNullParameter(estimatedCompletionDate, "estimatedCompletionDate");
        Intrinsics.checkNotNullParameter(estimatedClosureDate, "estimatedClosureDate");
        this.createdDate = createdDate;
        this.estimatedCompletionDate = estimatedCompletionDate;
        this.estimatedClosureDate = estimatedClosureDate;
        this.canAddPayments = z;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getCanAddPayments() {
        return this.canAddPayments;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCreatedDate() {
        return this.createdDate;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getEstimatedClosureDate() {
        return this.estimatedClosureDate;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getEstimatedCompletionDate() {
        return this.estimatedCompletionDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.createdDate, pVar.createdDate) && Intrinsics.f(this.estimatedCompletionDate, pVar.estimatedCompletionDate) && Intrinsics.f(this.estimatedClosureDate, pVar.estimatedClosureDate) && this.canAddPayments == pVar.canAddPayments;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.canAddPayments) + p.a.c(p.a.c(this.createdDate.hashCode() * 31, 31, this.estimatedCompletionDate), 31, this.estimatedClosureDate);
    }
}
