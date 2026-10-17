package vlc;

import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u0006\u0010\u000eR\u001a\u0010\u0011\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\f\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\r\u001a\u0004\b\u0010\u0010\u000e¨\u0006\u0013"}, d2 = {"Lvlc/c;", "", "", "toString", "()Ljava/lang/String;", "", "a", "I", "d", "()I", "simulatedYears", "Ljava/math/BigDecimal;", "b", "Ljava/math/BigDecimal;", "()Ljava/math/BigDecimal;", "returnPercentile25", "c", "returnPercentile50", "returnPercentile75", "feature_robo_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("simulatedYears")
    private final int simulatedYears;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("returnPercentile25")
    @NotNull
    private final BigDecimal returnPercentile25;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("returnPercentile50")
    @NotNull
    private final BigDecimal returnPercentile50;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("returnPercentile75")
    @NotNull
    private final BigDecimal returnPercentile75;

    public c(int i, BigDecimal returnPercentile25, BigDecimal returnPercentile50, BigDecimal returnPercentile75) {
        Intrinsics.checkNotNullParameter(returnPercentile25, "returnPercentile25");
        Intrinsics.checkNotNullParameter(returnPercentile50, "returnPercentile50");
        Intrinsics.checkNotNullParameter(returnPercentile75, "returnPercentile75");
        this.simulatedYears = i;
        this.returnPercentile25 = returnPercentile25;
        this.returnPercentile50 = returnPercentile50;
        this.returnPercentile75 = returnPercentile75;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final BigDecimal getReturnPercentile25() {
        return this.returnPercentile25;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final BigDecimal getReturnPercentile50() {
        return this.returnPercentile50;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final BigDecimal getReturnPercentile75() {
        return this.returnPercentile75;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getSimulatedYears() {
        return this.simulatedYears;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.simulatedYears == cVar.simulatedYears && Intrinsics.f(this.returnPercentile25, cVar.returnPercentile25) && Intrinsics.f(this.returnPercentile50, cVar.returnPercentile50) && Intrinsics.f(this.returnPercentile75, cVar.returnPercentile75);
    }

    public final int hashCode() {
        return this.returnPercentile75.hashCode() + t61.a.d(this.returnPercentile50, t61.a.d(this.returnPercentile25, Integer.hashCode(this.simulatedYears) * 31, 31), 31);
    }
}
