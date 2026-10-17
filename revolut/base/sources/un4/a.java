package un4;

import ip0.v7;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;
import wp5.y;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001a\u0010\u000f\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0011\u0010\u000eR\u001a\u0010\u0016\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0014\u001a\u0004\b\u0010\u0010\u0015R\u001a\u0010\u0017\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0007\u001a\u0004\b\u000b\u0010\b¨\u0006\u0018"}, d2 = {"Lun4/a;", "", "", "toString", "()Ljava/lang/String;", "", "a", "Z", "()Z", "active", "Ljo3/a;", "b", "Ljo3/a;", "e", "()Ljo3/a;", "threshold", "c", "d", "spend", "Ljava/time/LocalDate;", "Ljava/time/LocalDate;", "()Ljava/time/LocalDate;", "periodEndDate", "eligible", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @b("active")
    private final boolean active;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @b("waiverThreshold")
    @NotNull
    private final jo3.a threshold;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @b("currentEligibleSpend")
    @NotNull
    private final jo3.a spend;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @b("periodEndDate")
    @NotNull
    private final LocalDate periodEndDate;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @b("eligible")
    private final boolean eligible;

    public a(boolean z, jo3.a threshold, jo3.a spend, LocalDate periodEndDate, boolean z3) {
        Intrinsics.checkNotNullParameter(threshold, "threshold");
        Intrinsics.checkNotNullParameter(spend, "spend");
        Intrinsics.checkNotNullParameter(periodEndDate, "periodEndDate");
        this.active = z;
        this.threshold = threshold;
        this.spend = spend;
        this.periodEndDate = periodEndDate;
        this.eligible = z3;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getActive() {
        return this.active;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getEligible() {
        return this.eligible;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final LocalDate getPeriodEndDate() {
        return this.periodEndDate;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final jo3.a getSpend() {
        return this.spend;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final jo3.a getThreshold() {
        return this.threshold;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.active == aVar.active && Intrinsics.f(this.threshold, aVar.threshold) && Intrinsics.f(this.spend, aVar.spend) && Intrinsics.f(this.periodEndDate, aVar.periodEndDate) && this.eligible == aVar.eligible;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.eligible) + y.a(v7.j(this.spend, v7.j(this.threshold, Boolean.hashCode(this.active) * 31, 31), 31), 31, this.periodEndDate);
    }
}
