package k91;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001a\u0010\u000e\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000f"}, d2 = {"Lk91/e;", "", "", "toString", "()Ljava/lang/String;", "Lk91/h;", "a", "Lk91/h;", "()Lk91/h;", "incentiveBanner", "Ljo3/a;", "b", "Ljo3/a;", "()Ljo3/a;", "incomeThreshold", "retail_feature_account_switching_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("incentiveBanner")
    @NotNull
    private final h incentiveBanner;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("incomeThreshold")
    @NotNull
    private final jo3.a incomeThreshold;

    public e(h incentiveBanner, jo3.a incomeThreshold) {
        Intrinsics.checkNotNullParameter(incentiveBanner, "incentiveBanner");
        Intrinsics.checkNotNullParameter(incomeThreshold, "incomeThreshold");
        this.incentiveBanner = incentiveBanner;
        this.incomeThreshold = incomeThreshold;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final h getIncentiveBanner() {
        return this.incentiveBanner;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final jo3.a getIncomeThreshold() {
        return this.incomeThreshold;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.incentiveBanner, eVar.incentiveBanner) && Intrinsics.f(this.incomeThreshold, eVar.incomeThreshold);
    }

    public final int hashCode() {
        return this.incomeThreshold.hashCode() + (this.incentiveBanner.hashCode() * 31);
    }
}
