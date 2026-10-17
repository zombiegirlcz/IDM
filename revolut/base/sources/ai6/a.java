package ai6;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wp5.y;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0007\u001a\u0004\b\n\u0010\bR\u001a\u0010\r\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0007\u001a\u0004\b\f\u0010\b¨\u0006\u000e"}, d2 = {"Lai6/a;", "", "", "toString", "()Ljava/lang/String;", "Ljo3/b;", "a", "Ljo3/b;", "()Ljo3/b;", "maximumIndividualLimit", "b", "maximumMonthlyLimit", "c", "usedMonthlyLimit", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("maximum_individual_limit")
    @NotNull
    private final jo3.b maximumIndividualLimit;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("maximum_monthly_limit")
    @NotNull
    private final jo3.b maximumMonthlyLimit;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("used_monthly_limit")
    @NotNull
    private final jo3.b usedMonthlyLimit;

    public a(jo3.b maximumIndividualLimit, jo3.b maximumMonthlyLimit, jo3.b usedMonthlyLimit) {
        Intrinsics.checkNotNullParameter(maximumIndividualLimit, "maximumIndividualLimit");
        Intrinsics.checkNotNullParameter(maximumMonthlyLimit, "maximumMonthlyLimit");
        Intrinsics.checkNotNullParameter(usedMonthlyLimit, "usedMonthlyLimit");
        this.maximumIndividualLimit = maximumIndividualLimit;
        this.maximumMonthlyLimit = maximumMonthlyLimit;
        this.usedMonthlyLimit = usedMonthlyLimit;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final jo3.b getMaximumIndividualLimit() {
        return this.maximumIndividualLimit;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final jo3.b getMaximumMonthlyLimit() {
        return this.maximumMonthlyLimit;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final jo3.b getUsedMonthlyLimit() {
        return this.usedMonthlyLimit;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.maximumIndividualLimit, aVar.maximumIndividualLimit) && Intrinsics.f(this.maximumMonthlyLimit, aVar.maximumMonthlyLimit) && Intrinsics.f(this.usedMonthlyLimit, aVar.usedMonthlyLimit);
    }

    public final int hashCode() {
        return this.usedMonthlyLimit.hashCode() + y.e(this.maximumMonthlyLimit, this.maximumIndividualLimit.hashCode() * 31, 31);
    }
}
