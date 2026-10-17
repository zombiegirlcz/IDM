package alc;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BigDecimal f6199b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BigDecimal f6200c;
    public final BigDecimal d;

    public h(int i, BigDecimal returnPercentile25, BigDecimal returnPercentile50, BigDecimal returnPercentile75) {
        Intrinsics.checkNotNullParameter(returnPercentile25, "returnPercentile25");
        Intrinsics.checkNotNullParameter(returnPercentile50, "returnPercentile50");
        Intrinsics.checkNotNullParameter(returnPercentile75, "returnPercentile75");
        this.f6198a = i;
        this.f6199b = returnPercentile25;
        this.f6200c = returnPercentile50;
        this.d = returnPercentile75;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f6198a == hVar.f6198a && Intrinsics.f(this.f6199b, hVar.f6199b) && Intrinsics.f(this.f6200c, hVar.f6200c) && Intrinsics.f(this.d, hVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + t61.a.d(this.f6200c, t61.a.d(this.f6199b, Integer.hashCode(this.f6198a) * 31, 31), 31);
    }
}
