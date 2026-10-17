package uh6;

import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0007\u001a\u0004\b\n\u0010\bR\u001a\u0010\r\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0007\u001a\u0004\b\f\u0010\b¨\u0006\u000e"}, d2 = {"Luh6/c;", "", "", "toString", "()Ljava/lang/String;", "Ljo3/a;", "a", "Ljo3/a;", "()Ljo3/a;", "maximumIndividualLimit", "b", "maximumMonthlyLimit", "c", "usedMonthlyLimit", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("maximum_individual_limit")
    @NotNull
    private final jo3.a maximumIndividualLimit;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("maximum_monthly_limit")
    @NotNull
    private final jo3.a maximumMonthlyLimit;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("used_monthly_limit")
    @NotNull
    private final jo3.a usedMonthlyLimit;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final jo3.a getMaximumIndividualLimit() {
        return this.maximumIndividualLimit;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final jo3.a getMaximumMonthlyLimit() {
        return this.maximumMonthlyLimit;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final jo3.a getUsedMonthlyLimit() {
        return this.usedMonthlyLimit;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.maximumIndividualLimit, cVar.maximumIndividualLimit) && Intrinsics.f(this.maximumMonthlyLimit, cVar.maximumMonthlyLimit) && Intrinsics.f(this.usedMonthlyLimit, cVar.usedMonthlyLimit);
    }

    public final int hashCode() {
        return this.usedMonthlyLimit.hashCode() + v7.j(this.maximumMonthlyLimit, this.maximumIndividualLimit.hashCode() * 31, 31);
    }
}
